package de.bembelnaut.udemy.kotlincourse.section1_grundlagen

/**
 * Übung
 */
fun main() {
    var maxInt: Int = 0

    // suche die höchste Int Zahl
    while (maxInt < maxInt + 1) {
        maxInt++
    }

    println("Höchster Int-Wert: $maxInt")
    // Produziert einen Overflow
    println("Overflow von Int: ${maxInt + 1}")

    // suche die kleinste Int Zahl
    while (maxInt > maxInt - 1) {
        maxInt--
    }

    println("Niedrigster Int-Wert: $maxInt")
    // Produziert einen Overflow
    println("Overflow von Int: ${maxInt - 1}")
}