package de.bembelnaut.udemy.kotlincourse.section2

/**
 * If-Zuweisung (Ternary Conditional Operator)
 */
fun main() {

    var a = 42
    var b = 1233

    // Ternary Conditional erlaubt eine vorherige Auswertung der Bedingung mit anschließender Zuweisung
    var max = if (a > b) a else b
    println(max)

    // In einer TC können noch andere Funktionen etc aufgerufen weden
    max = if (a > b) {
        println("Hello a")
        a
    } else {
        println("Hello b")
        var bb: Int = b * b
        println("Zwischenergebnis " + bb)
        bb
    }

    println(max)
}