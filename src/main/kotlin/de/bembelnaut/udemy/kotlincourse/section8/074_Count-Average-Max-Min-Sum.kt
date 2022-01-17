package de.bembelnaut.udemy.kotlincourse.section8

fun main() {

    var mListe2 = listOf(0,4,1,2,3,4,5)
    println("mListe2: $mListe2")
    println("size: ${mListe2.size}")
    println("count: ${mListe2.count()}")
    println("average: ${mListe2.average()}")
    println("min: ${mListe2.minOf { it }}")
    println("sum: ${mListe2.sum()}")
}