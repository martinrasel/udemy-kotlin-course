package de.bembelnaut.udemy.kotlincourse.section16_datenbanken

import org.jetbrains.exposed.sql.*
import org.jetbrains.exposed.sql.transactions.transaction

/**
 * Exposed Datenbank
 */
fun main() {

    Database.connect("jdbc:h2:mem:test", driver = "org.h2.Driver", user = "root", password = "")

    transaction {
        // Schreibt alle Statements in die Konsole
        addLogger(StdOutSqlLogger)

        // Legt die Tabellen an. Es kann eine Liste von Tabellen übergeben werden.
        SchemaUtils.create(Essen)

        // Hinzufügen
        Essen.insert {
            it[name] = "Chili"
            it[zutat] = "Hackfleisch"
        } get Essen.id

        Essen.insert {
            it[name] = "Chili"
            it[zutat] = "Bohnen"
        } get Essen.id

        // Auslesen
        for (essen in Essen.selectAll()) {
            println("Gefunden: ${essen[Essen.id]} / ${essen[Essen.name]} / ${essen[Essen.zutat]} ")
        }
    }
}

// Tabellendefinition
object Essen: Table() {
    val id = integer("ID").autoIncrement()
    val name = varchar("NAME", 255 )
    val zutat = varchar("ZUTAT", 255)

    override val primaryKey = PrimaryKey(id, name = "PK_Essen_ID")
}
