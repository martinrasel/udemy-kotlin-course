package de.bembelnaut.udemy.kotlincourse.section8_collections

/**
 * Listen-Operationen: Reversed, Partition, Slice und Chunked
 */
fun main() {

    var mBasicList = listOf(0,4,1,2,3,4,5)
    println("mBasicList: $mBasicList")

    // Liste wird gedreht, aber nicht auf der Liste, auf der die Methode aufgerufen wird.
    val reversed = mBasicList.reversed()
    println("mBasicList: $mBasicList")
    println("revered: $reversed")

    // Partionieren in zwei Listen nach bestimmten Kriterien
    var partitionList = mBasicList.partition { it > 1 }
    println("mBasicList: $mBasicList")
    println("partitionList: $partitionList")

    // Slice schneidet einen bestimmten Bereich aus einer Liste aus und gibt ihn zurück
    // Dabei ist Index 0 das erste Element
    var sliced = mBasicList.slice(1..3)
    println("sliced: $sliced")

    // Übung: Einfügen mit slice
    var part1 = mBasicList.slice(0..4)
    val lastElement = mBasicList.size - 1
    var part2 = mBasicList.slice(5..lastElement)
    var resultList = part1 + 1 + part2
    println("mBasicList: $mBasicList")
    println("resultList: $resultList")

    // chunked teilt eine liste in gleich große listen
    var chunkedList = mBasicList.chunked(2)
    println("chunkedList: $chunkedList")

}