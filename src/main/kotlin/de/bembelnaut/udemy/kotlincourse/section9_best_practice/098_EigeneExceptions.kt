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

    try {
        fail("Hello Exception!")

        // Wird nie ausgeführt
        println("Nothing")
    } catch (e: MyException) {
        println("Nothing")
    }
}

fun throwMyExcepion(): Int {
    throw MyException("Oh nooo")
    // ... Code ...
}

class MyException(message: String): Exception(message) {
    val error = "Hello, my Exception"
}

// Nothing ist der Rückgabewert einer Exception. Es sigalisiert, dass eine Funktion den regulären Ablauf immer unterbricht.
fun fail(message: String): Nothing {
    throw MyException(message)
}