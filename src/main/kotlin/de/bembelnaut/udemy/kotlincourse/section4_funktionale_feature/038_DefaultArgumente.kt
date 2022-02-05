package de.bembelnaut.udemy.kotlincourse.section4_funktionale_feature

/**
 * Funktions-Parameter mit Standartwerten
 */
fun main() {
    println(add())
    println(add(3, 4))
    println(add(4))
    println(add(m = 4))

    println(add2(2, m = 4))

    // n hat einen Default
    println(add3(m = 4, foo = 2))

    println(somethingWithArrays(arrayOf(1,2,3)))
}

// Geht auch: Es wird ein Wert aus einem gesetzen Paramenter für einen anderen Paramenter als Default-Wert genutzt.
fun somethingWithArrays(a: Array<Int>, b: Int = a.size) {
    println("Länge des Arrays: $b")
}

// Alle Parameter haben einen Default; Sie kann ohne Parameter aufgerufen werden.
fun add(n: Int = 0, m: Int = 0): Int {
    return n + m
}

// Gemischte...
fun add2(n: Int, foo: Int = 4, m: Int = 0): Int {
    return n + m + foo
}

// Gemischte... Sonderlock
fun add3(n: Int = 0, foo: Int, m: Int): Int {
    return n + m + foo
}
