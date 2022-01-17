package de.bembelnaut.udemy.kotlincourse.section8

fun main() {

    var mListe1 = listOf(1,2,3,4,5)
    println("mListe: $mListe1")

    // Liste wird gedreht, aber nicht auf der Liste, auf der die Methode aufgerufen wird.
    val reversed = mListe1.reversed()
    println("mListe: $mListe1")
    println("revered: $reversed")

    // Partionieren in zwei Listen nach bestimmten kriterien
    var mListe2 = listOf(0,4,1,2,3,4,5)
    var partitionList = mListe2.partition { it > 1 }
    println("mListe2: $mListe2")
    println("partitionList: $partitionList")

    // Slice schneidet einen bestimmten Bereich aus einer Liste aus und gibt ihn zurück
    var sliced = mListe2.slice(1..3)
    println("sliced: $sliced")

    // übung: einfügen
    var part1 = mListe2.slice(0..4)
    val lastElement = mListe2.size - 1
    var part2 = mListe2.slice(5..lastElement)
    var resultList = part1 + 1 + part2
    println("mListe2: $mListe2")
    println("resultList: $resultList")

    // chunked teilt eine liste in gleich große listen
    var chunkedList = mListe2.chunked(2)
    println("chunkedList: $chunkedList")

}