package de.bembelnaut.udemy.kotlincourse.section8_collections

/**
 * Pairs
 */
fun main() {

    var mBasicList = listOf(0,4,1,2,3,4,5)
    println("mBasicList: $mBasicList")

    // Ein Pair ist ein Tupel von zwei Werten
    val pair: Pair<Int, String> = Pair(1,"Glaskanone")
    println("pair: $pair")
    println("first: ${pair.first} / second: ${pair.second}")

    // Es kann zu einer Liste konvertiert werden
    println("pair.list: ${pair.toList()}")
}