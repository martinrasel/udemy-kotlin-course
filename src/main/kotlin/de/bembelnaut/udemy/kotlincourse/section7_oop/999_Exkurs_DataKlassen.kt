package de.bembelnaut.udemy.kotlincourse.section7_oop

/**
 * Exkurs: Data-Klassen
 */
fun main() {

    var tupel = MyDataClassTupel(1,2, 9, "abc")
    var tupel2 = MyDataClassTupel(1,2, 9, "foo")
    var tupel3 = MyDataClassTupel(2,2, 9, "bar")

    println("Tupel n = ${tupel.n}, m = ${tupel.m} und o = ${tupel.o}")
    // toString() wird von Datenklassen überschrieben
    println(tupel2)

    tupel3.m = 23
    // Compile-Fehler weil o eine Konstante ist
    // tupel.o = 23

    println(tupel3)

    // Equals wird auch unterstützt
    println("Tupel und Tupel2 sind gleich? ${tupel == tupel2}")
    println("Tupel2 und Tupel3 sind gleich? ${tupel2 == tupel3}")

    // Man kann auch Daten einfach an weitere Variablen zuweisen
    val (a, b) = tupel
    println(tupel)
    println("Var schnell übergeben: $a und $b" )

    val (e, f, o, text) = tupel
    println(tupel)
    println("Var schnell übergeben: $o und $text" )

}

// Data-Klassen sind einfach Pojo-Klassen
data class MyDataClassTupel(var n: Int, var m: Int, val o: Int, val text: String)
