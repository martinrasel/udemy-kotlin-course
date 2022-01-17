package de.bembelnaut.udemy.kotlincourse.section8

fun main() {

    var mListe2 = listOf(0,4,1,2,3,4,5)
    println("mListe2: $mListe2")

    // Sortierung...
    println("mListe2 sortiert: ${mListe2.sorted()}")
    println("mListe2 customized sortiert: ${mListe2.sortedBy { it * 2 }}")
    println("mListe2 absteigend sortiert: ${mListe2.sortedDescending()}")
    println("mListe2 customized absteigend sortiert: ${mListe2.sortedByDescending { it * 2 }}")

    println("mListe2 customized sortiert: ${mListe2.sortedWith { a, b ->
        when {
            a == 4 -> 1
            b == 4 -> -1
            else -> a - b
        }
    }}")
}