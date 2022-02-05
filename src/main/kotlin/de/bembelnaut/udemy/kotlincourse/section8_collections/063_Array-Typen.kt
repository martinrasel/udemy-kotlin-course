package de.bembelnaut.udemy.kotlincourse.section8_collections

/**
 * Verschiedene Array-Typen
 */
fun main() {

    var basicArray = arrayOf(1,2,4,5,3)

    // Char-Array kann für einen String Konstruktor benutzt werden
    var charArray = charArrayOf('h', 'i')
    var hiString = String(charArray)
    println(hiString)

    // Aber nicht ein Array mit Chars
    var charArray2 : Array<Char> = arrayOf('h', 'e')
    // geht nicht... compilefehler
    //var heString = String(charArray2)

    var intArray = intArrayOf(1,23,2,1)
}