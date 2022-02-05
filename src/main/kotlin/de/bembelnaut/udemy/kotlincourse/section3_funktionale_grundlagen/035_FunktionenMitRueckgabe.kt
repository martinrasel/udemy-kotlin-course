package de.bembelnaut.udemy.kotlincourse.section3_funktionale_grundlagen

/**
 * Funktionen mit Rückgabe
 */
fun main() {

    println( add(7, 8) )

}

fun add(base: Int, number: Int): Int {
    return base + number
}