package de.bembelnaut.udemy.kotlincourse.section4

fun main() {
    println(add(3, 4))
    println(add(4))
    println(add(m = 4))

    println(add2(2, m = 4))

    println(somethingWithArrays(arrayOf(1,2,3)))
}

// nutze die Werte aus einem gesetzen Paramenter; nur als Beispiel...
fun somethingWithArrays(a: Array<Int>, b: Int = a.size) {
    println("Länge des Arrays: $b")
}

fun add(n: Int = 0, m: Int = 0): Int {
    return n + m
}

fun add2(n: Int, foo: Int = 4, m: Int = 0): Int {
    return n + m + foo
}
