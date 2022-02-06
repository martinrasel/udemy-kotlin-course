package de.bembelnaut.udemy.kotlincourse.section9_best_practice

/**
 * Eigene Exceptions erstellen
 */
fun main() {
    try {
        println(throwMyExcepion())
    } catch (e: MyException) {
        println(e)
        println(e.error)
    }
}

fun throwMyExcepion(): Int {
    throw MyException("Oh nooo")
    // ... Code ...
}

class MyException(message: String): Exception(message) {
    val error = "Hello, my Exception"
}