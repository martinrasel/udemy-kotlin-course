package de.bembelnaut.udemy.kotlincourse.section8

fun main() {
    var mArray = arrayOf(1,2,5)
    var mListOfString = listOf<String>("hi", "he", "bla", "blub")

    println(mListOfString[0])
    println(mListOfString.get(0))

    // ArrayOutOFBoundsException...
    // println(mListOfString.get(5))

    println(mListOfString.size)

    println(mListOfString.getOrElse(4) { println("möööüp"); null })

    println(mListOfString.component1())
    // ...
    println(mListOfString.component4())
}