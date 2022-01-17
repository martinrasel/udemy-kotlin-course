package de.bembelnaut.udemy.kotlincourse.section8

fun main() {

    var mListe2 = listOf(0,4,1,2,3,4,5)
    println("mListe2: $mListe2")

    val pair: Pair<Int, String> = Pair(1,"Glaskanone")
    println("pair: $pair")
    println("first: ${pair.first} / second: ${pair.second}")
    println("pair.list: ${pair.toList()}")
}