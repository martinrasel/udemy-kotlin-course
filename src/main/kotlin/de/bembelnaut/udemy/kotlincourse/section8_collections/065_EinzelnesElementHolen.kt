package de.bembelnaut.udemy.kotlincourse.section8_collections

/**
 * Einzelne Elemente aus einer Liste holen
 */
fun main() {
    var mArray = arrayOf(1,2,5)
    var mListOfString = listOf<String>("hi", "he", "bla", "blub")

    // Es gibt verschiedene Möglichkeiten Elemente zu holen
    println(mListOfString[0])
    println(mListOfString.get(0))

    // Beim Zugriff auf eine ausserhalb liegendes Element: ArrayOutOFBoundsException...
    // println(mListOfString.get(5))

    println(mListOfString.size)

    println(mListOfString.getOrElse(4) { println("möööüp"); null })

    // Für die ersten fünf Elemente gibt es sogar eigene Methoden
    println(mListOfString.component1())
    // ...
    println(mListOfString.component4())
}