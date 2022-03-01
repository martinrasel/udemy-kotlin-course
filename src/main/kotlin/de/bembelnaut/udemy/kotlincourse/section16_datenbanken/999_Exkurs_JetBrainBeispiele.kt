package de.bembelnaut.udemy.kotlincourse.section16_datenbanken

import org.jetbrains.exposed.sql.*
import org.jetbrains.exposed.sql.transactions.transaction

/**
 * Beispiel von https://github.com/JetBrains/Exposed
 */
fun main() {
    Database.connect("jdbc:h2:mem:test", driver = "org.h2.Driver", user = "root", password = "")

    transaction {
        addLogger(StdOutSqlLogger)

        SchemaUtils.create (Cities, Users)

        // Über die Infix Funktion get liefert aus dem Insert-Ergebnis die Spalte zurück
        // Die City Id wird für den FK in er Users Tabelle benötigt.
        val saintPetersburgId = Cities.insert {
            it[name] = "St. Petersburg"
        } get Cities.id

        val munichId = Cities.insert {
            it[name] = "Munich"
        } get Cities.id

        // Es kann auch direkt auf das Ergebnis zugegriffen werden. Bei get wird vor dem Zugriff das Ergebnis zusätzlich geprüft
        val pragueId = Cities.insert {
            // Das Update führt eine zusätzliche Operation im Insert-Statement aus.
            it.update(name, stringLiteral("   Prague   ").trim().substring(1, 2))
        }[Cities.id]

        // single liefert genau ein Ergebnis. Sollte es leer sein, oder mehr als ein Ergebnis kommen, wird eine Exception geworfen.
        val pragueName = Cities.select { Cities.id eq pragueId }.single()[Cities.name]
        println("pragueName: $pragueName")

        Users.insert {
            it[id] = "andrey"
            it[name] = "Andrey"
            it[Users.cityId] = saintPetersburgId
        }

        Users.insert {
            it[id] = "sergey"
            it[name] = "Sergey"
            it[Users.cityId] = munichId
        }

        Users.insert {
            it[id] = "eugene"
            it[name] = "Eugene"
            it[Users.cityId] = munichId
        }

        Users.insert {
            it[id] = "alex"
            it[name] = "Alex"
            it[Users.cityId] = null
        }

        Users.insert {
            it[id] = "smth"
            it[name] = "Something"
            it[Users.cityId] = null
        }

        Users.update({ Users.id eq "alex"}) {
            it[name] = "Alexey"
        }

        Users.deleteWhere{ Users.name like "%thing"}

        println("All cities:")

        for (city in Cities.selectAll()) {
            println("${city[Cities.id]}: ${city[Cities.name]}")
        }

        println("Manual join:")

        // innerJoin ist eine Infix Funktion auf der Klasse Table. Über den Join kann mit slice das Ergebnis
        // bestimmt werden. Das Select verknüpft Expressions und liefert eine Liste von ResultRows zurück.
        (Users innerJoin Cities).slice(Users.name, Cities.name).
        select {(Users.id.eq("andrey") or Users.name.eq("Sergey")) and
                Users.id.eq("sergey") and Users.cityId.eq(Cities.id)}.forEach {
            println("${it[Users.name]} lives in ${it[Cities.name]}")
        }

        println("Join with foreign key:")

        (Users innerJoin Cities).slice(Users.name, Users.cityId, Cities.name).
        select { Cities.name.eq("St. Petersburg") or Users.cityId.isNull()}.forEach {
            if (it[Users.cityId] != null) {
                println("${it[Users.name]} lives in ${it[Cities.name]}")
            }
            else {
                println("${it[Users.name]} lives nowhere")
            }
        }

        println("Functions and group by:")

        ((Cities innerJoin Users).slice(Cities.name, Users.id.count()).selectAll().groupBy(Cities.name)).forEach {
            val cityName = it[Cities.name]
            val userCount = it[Users.id.count()]

            if (userCount > 0) {
                println("$userCount user(s) live(s) in $cityName")
            } else {
                println("Nobody lives in $cityName")
            }
        }

        SchemaUtils.drop (Users, Cities)
    }
}

object Users : Table() {
    val id = varchar("id", 10) // Column<String>
    val name = varchar("name", length = 50) // Column<String>
    val cityId = (integer("city_id") references Cities.id).nullable() // Column<Int?>

    override val primaryKey = PrimaryKey(id, name = "PK_User_ID") // name is optional here
}

object Cities : Table() {
    val id = integer("id").autoIncrement() // Column<Int>
    val name = varchar("name", 50) // Column<String>

    override val primaryKey = PrimaryKey(id, name = "PK_Cities_ID")
}
