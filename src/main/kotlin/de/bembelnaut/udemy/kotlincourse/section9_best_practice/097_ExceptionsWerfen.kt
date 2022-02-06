package de.bembelnaut.udemy.kotlincourse.section9_best_practice

/**
 * Exceptions werfen
 */
fun main() {
    try {
        println(myWrongFunction())
    } catch (e: Exception) {
        println(e)
    }


}

fun myWrongFunction(): Int {
    throw Exception("Hello Exception!")
    // ... Code ...
}