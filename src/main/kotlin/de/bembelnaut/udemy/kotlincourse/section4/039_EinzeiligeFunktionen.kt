package de.bembelnaut.udemy.kotlincourse.section4

/**
 * Einzeilige Funktion
 */
fun main() {
    println(quadrat(3))
}

// Es braucht keine geschweifte Klammern
fun quadrat(n: Int): Int = n * n

// Achtung - es ist keine "Inline"-Funktion!
