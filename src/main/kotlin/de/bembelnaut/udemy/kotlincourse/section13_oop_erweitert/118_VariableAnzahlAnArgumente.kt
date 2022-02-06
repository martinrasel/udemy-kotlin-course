package de.bembelnaut.udemy.kotlincourse.section13_oop_erweitert

/**
 * Variable Anzahl von Argumenten in einer Funktion
 */
fun main() {

    val anyList: List<Any> = asList(1, 24, 2, 4, 21123, "12", 2332)
    println(anyList)

    val intList: List<Int> = asList(1, 24, 2, 4, 21123, 2332)
    println(intList)

}

fun <T> asList(vararg ts: T): List<T> {
    val result = mutableListOf<T>()

    for (t in ts) {
        result.add(t)
    }

    return result
}