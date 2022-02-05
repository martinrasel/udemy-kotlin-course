package de.bembelnaut.udemy.kotlincourse.section2

/**
 * Übung
 */
fun main() {

    val row: Int = 7

    for (index in 1..100) {
        if (index.mod(row) == 0) {
            println("$index")
        }
    }
}