package de.bembelnaut.udemy.kotlincourse.section3

/**
 * Übung
 */
fun main() {

    println( fibonacci(7) )

}

fun fibonacci(n: Int): Int {
    return when {
        n <= 0 -> 0
        n == 1 -> 1
        else -> fibonacci(n - 1) + fibonacci(n - 2)
    }
}