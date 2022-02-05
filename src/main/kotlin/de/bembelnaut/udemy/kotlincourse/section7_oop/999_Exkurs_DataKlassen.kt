package de.bembelnaut.udemy.kotlincourse.section7_oop

/**
 * Exkurs: Data-Klassen
 */
fun main() {

    var tupel = MyDataClassTupel(1,2, 9)

    println("Tupel n = ${tupel.n}, m = ${tupel.m} und o = ${tupel.o}")

    tupel.m = 23
    // Compile-Fehler weil o eine Konstante ist
    // tupel.o = 23

    println("Tupel n = ${tupel.n}, m = ${tupel.m} und o = ${tupel.o}")
}

// Data-Klassen sind einfach Pojo-Klassen
data class MyDataClassTupel(var n: Int, var m: Int, val o: Int)
