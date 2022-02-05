package de.bembelnaut.udemy.kotlincourse.section8_collections

/**
 * Elemente hinzufügen oder entfernen
 */
fun main() {

    var mBasicList = listOf<Int>(1,2,3,4,5)
    println(mBasicList)

    // Hinzufügen eines Elements erzeugt eine neue Liste
    var mBasicList2 = mBasicList + 6
    println(mBasicList2)
    println("Listen gleich? ${mBasicList===mBasicList2}")

    // Hinzufügen einer Liste von Elementen
    mBasicList2 += listOf<Int>(6,7,8,9)
    println(mBasicList2)

    // Entfernt das erste(!) Element (Zahl 6) aus der liste
    mBasicList2 -= 6
    println(mBasicList2)

    // Entfernt alle(!) Elemente aus der Liste
    mBasicList2 -= listOf<Int>(1,3,5,7,9)
    println(mBasicList2)
}