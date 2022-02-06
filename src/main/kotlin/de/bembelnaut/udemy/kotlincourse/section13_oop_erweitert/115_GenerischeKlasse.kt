package de.bembelnaut.udemy.kotlincourse.section13_oop_erweitert

/**
 * Generische Klasse
 */
fun main() {

    var container = Container<Int>()
    container.add(23)

    println("Inhalt von Containter: ${container.list}")

    var stringContainer = Container<String>()
    stringContainer.add("Bla")

    println("Inhalt von String Containter: ${stringContainer.list}")
}

class Container<T> {
    var list: List<T> = listOf()

    fun add(a: T) {
        list += a
    }
}