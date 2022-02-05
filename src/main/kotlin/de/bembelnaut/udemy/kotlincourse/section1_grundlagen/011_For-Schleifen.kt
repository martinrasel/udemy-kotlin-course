package de.bembelnaut.udemy.kotlincourse.section1_grundlagen

/**
 * For-Schleife
 */
fun main() {
    val mArray: String = "Hello World"

    // Einfaches Durchlaufen
    for (letter in mArray) {
        println(letter)
    }
    println("---------------")

    // Cesear Cipher
    for (letter in mArray) {
        print(letter + 3)
    }
    println("---------------")

    // indices liefert index/pos im array zurück
    for (index in mArray.indices) {
        print(index)
        print(mArray[index])
    }


}