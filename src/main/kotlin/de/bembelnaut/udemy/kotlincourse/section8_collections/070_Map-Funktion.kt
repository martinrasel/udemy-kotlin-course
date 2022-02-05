package de.bembelnaut.udemy.kotlincourse.section8_collections

/**
 * Map
 */
fun main() {

    var mBasicList = listOf(0,4,1,2,3,4,5)
    println("mBasicList: $mBasicList")

    // Führt auf allen Elementen das Lambda aus. Der Rückgabewert ist beliebig
    var mMapListe = mBasicList.map { it + 10 }
    println("mMapListe: $mMapListe")

    // Hier kommt aus einer Liste von Zahlen, eine Liste von Listen als Ergebnis
    var mMapListe2 = mBasicList.map { listOf<Int>(it * it, it * it * it, it * it * it * it) }
    println("mMapListe2: $mMapListe2")
}