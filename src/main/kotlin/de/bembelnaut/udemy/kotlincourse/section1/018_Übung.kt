package de.bembelnaut.udemy.kotlincourse.section1

/**
 * Übung
 */
fun main() {
    var maxInt: Int = 0

    // suche die höchste Int Zahl
    while (maxInt < maxInt + 1) {
        maxInt++
    }

    println(maxInt)
    println(maxInt + 1) // overflow

    // suche die kleinste Int Zahl
    while (maxInt > maxInt - 1) {
        maxInt--
    }

    println(maxInt)
    println(maxInt - 1) // overflow
}