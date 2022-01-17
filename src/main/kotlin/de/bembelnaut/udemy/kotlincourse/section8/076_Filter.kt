package de.bembelnaut.udemy.kotlincourse.section8

fun main() {

    var mListe2 = listOf(0,4,1,2,3,4,5)
    println("mListe2: $mListe2")
    println("filter it > 3: ${mListe2.filter { it > 3 || it < 1}}")

}