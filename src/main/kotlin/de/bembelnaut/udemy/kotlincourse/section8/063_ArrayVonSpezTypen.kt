package de.bembelnaut.udemy.kotlincourse.section8

fun main() {

    var basicArray = arrayOf(1,2,4,5,3)
    var charArray = charArrayOf('h', 'i')
    var hiString = String(charArray)
    println(hiString)

    var charArray2 : Array<Char> = arrayOf('h', 'e')
    // geht nicht... compilefehler
    //var heString = String(charArray2)

    var intArray = intArrayOf(1,23,2,1)

}