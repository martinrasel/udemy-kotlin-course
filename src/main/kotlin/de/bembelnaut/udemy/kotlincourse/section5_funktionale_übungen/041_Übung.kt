package de.bembelnaut.udemy.kotlincourse.section5_funktionale_übungen

/**
 * Übung
 */
fun main() {

    val abs = {a: Int -> if (a < 0) a * -1 else a}

    println(abs(4))
    println(abs(-4))
    println(abs(0))
}
