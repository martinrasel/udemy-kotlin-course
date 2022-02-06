package de.bembelnaut.udemy.kotlincourse.section12_functionale_erweitert

/**
 * Infix Funktionen
 */
fun main() {

    println("Hello " addIt "World!" )

    val mInfix = InfixClass()
    println(mInfix printMe "World!")

    val mInfix2 = InfixClass()
    println((mInfix.add(mInfix2)) printMe " Foo?")
}

// Infix Funktionen sind wie Operatoren
infix fun String.addIt(a: String): String {
    return this + a
}

class InfixClass() {
    var b = "Hello "
    var a = " World!"

    constructor(a: String, b: String): this() {
        var a = a
        this.b = b
    }

    // Können auch hier stehen. Dann gelten sie für die jeweilige Klasse
    infix fun printMe(a: String): String = this.b + a

    // Diese Funktionsoperatoren können auch eigene Klassen zurück geben
    infix fun add(a: InfixClass): InfixClass = InfixClass(a.a, this.a)
}