package de.bembelnaut.udemy.kotlincourse.section8_collections

/**
 * Listen
 */
fun main() {

    var mArray = arrayOf(1,2,5)
    var mListOfString = listOf<String>("hi", "he")

    // Bei der Ausgabe gibt es Unterschiede
    println(mArray)
    println(mListOfString)

    // Unterschiede: Array vs. Listen
    // 1. Ein Array hat feste Größe (bei vergrößern muss das array gelöscht und vergrößert werden).
    // Listen benutzen Zeiger und können daher wachsen
    // 2. Der Zugriff auf ein Array ist schneller bei einer Liste.
    // Je nach dem was wichtig ist empfiehlt es sich das eine oder das andere zu nutzen

    // In Kotlin sind Listen standard mäßig immutable.
    // Hier wird nach dem Einfügen eine neue Liste erstellt und der Variable zugewiesen
    mListOfString += "Bla"
    println(mListOfString)

    println("Speicherpos1: $mArray")
    mArray += 3
    println("Speicherpos2: $mArray")
}