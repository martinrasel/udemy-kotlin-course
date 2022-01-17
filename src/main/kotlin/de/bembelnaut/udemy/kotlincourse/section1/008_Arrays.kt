package de.bembelnaut.udemy.kotlincourse.section1

/**
 * Arrays
 */
fun main() {

    // Ein Array kann so erstellt werden...
    var array = arrayOf(1,2,3,"23")
    println(array[2])

    // Arrays sind immutable
//    array[2] = "geht nicht mehr..."
//    println(array[2])

    // ... oder über einen Konstruktor
    array = Array(3) {1;23;4}
    println(array[2])

    array = Array(10) {it -> it}
    println(array[2])

    // Ein String ist ein Array von Chars
    val mString = "Hallo Welt"
    println(mString[1])
}