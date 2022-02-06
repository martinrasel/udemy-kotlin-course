package de.bembelnaut.udemy.kotlincourse.section13_oop_erweitert

/**
 * Generische Funktion erstellen
 */
fun main() {

    var liste = listIt(1,3)
    println(liste)

}

fun <T> listIt(a: T, b: T): List<T> {
    return listOf<T>(a, b)
}