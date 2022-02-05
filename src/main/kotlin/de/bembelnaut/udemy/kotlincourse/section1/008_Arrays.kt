package de.bembelnaut.udemy.kotlincourse.section1

/**
 * Arrays
 */
fun main() {

    // Ein Array kann so erstellt werden...
    // Die Größe des Arrays kann aber nicht verändert werden.
    // Ein gemischt angelegtes mit arrayOf() angelegtes Array kann nicht verändert werden.
    var array = arrayOf(1,2,3,"23")
    println(array[2])

    // Compiler Fehler
    //array[3] = "geht nicht mehr..."
    //println(array[2])

    // ... oder über einen Konstruktor
    array = Array(3) {1;23;4}
    println(array[2])
    // Die Zuweiung geht, da es kein gemischtes Array war
    array[2] = 4

    // Vermischen geht hier auch nicht, da das Array typisiert ist.
    //array[2] = "geht nicht mehr..."

    // ... oder mit einem Konstruktor und einer Lamba-Funktion
    array = Array(10) {it -> it}
    println(array[2])

    // Ein String ist ein Array von Chars
    val mString = "Hallo Welt"
    println(mString[1])
}