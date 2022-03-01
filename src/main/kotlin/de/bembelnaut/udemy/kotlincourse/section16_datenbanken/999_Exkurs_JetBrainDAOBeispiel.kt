package de.bembelnaut.udemy.kotlincourse.section16_datenbanken

import org.jetbrains.exposed.dao.*
import org.jetbrains.exposed.dao.id.EntityID
import org.jetbrains.exposed.dao.id.IntIdTable
import org.jetbrains.exposed.sql.*
import org.jetbrains.exposed.sql.transactions.transaction

/**
 * Beispiel von https://github.com/JetBrains/Exposed
 */
fun main() {
    Database.connect("jdbc:h2:mem:test", driver = "org.h2.Driver", user = "root", password = "")

    transaction {
        addLogger(StdOutSqlLogger)

        SchemaUtils.create (MyCities, MyUsers)

        val stPete = MyCity.new {
            name = "St. Petersburg"
        }

        val munich = MyCity.new {
            name = "Munich"
        }

        MyUser.new {
            name = "a"
            city = stPete
            age = 5
        }

        MyUser.new {
            name = "b"
            city = stPete
            age = 27
        }

        MyUser.new {
            name = "c"
            city = munich
            age = 42
        }

        println("Cities: ${MyCity.all().joinToString {it.name}}")
        println("Users in ${stPete.name}: ${stPete.users.joinToString {it.name}}")
        println("Adults: ${MyUser.find { MyUsers.age greaterEq 18 }.joinToString {it.name}}")
    }
}

// Tabellen Definition
// IntIdTable hat eine bereits definierte autoinkr. Spalte. Sie kann im Konstruktor übergeben werden.
object MyUsers : IntIdTable() {
    val name = varchar("name", 50).index()
    val city = reference("city", MyCities)
    val age = integer("age")
}

object MyCities: IntIdTable() {
    val name = varchar("name", 50)
}

class MyUser(id: EntityID<Int>) : IntEntity(id) {
    companion object : IntEntityClass<MyUser>(MyUsers)

    // Die Getter und Setter von name, city und age werden über den Qualifier by an die Attribute von
    // der Tabellen geleitet
    var name by MyUsers.name
    var city by MyCity referencedOn MyUsers.city
    var age by MyUsers.age
}

class MyCity(id: EntityID<Int>) : IntEntity(id) {
    companion object : IntEntityClass<MyCity>(MyCities)

    var name by MyCities.name
    val users by MyUser referrersOn MyUsers.city
}