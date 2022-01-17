package de.bembelnaut.udemy.kotlincourse.section4

fun main() {

    // a und b sind Lambda-Variablen
    val lamdbaMe = {a: Int, b: Int -> a+b}

    println(lamdbaMe(2, 3))

    println(addMe(2) {1+2})

    println(5.foo(10) { a, b -> a * b })
}

//fun addMe(n: Int, b: () -> Int): Int = (n + b.invoke())
fun addMe(n: Int, b: () -> Int): Int = (n + b())

fun Int.foo(n: Int, function: (a: Int, b: Int) -> Int): Int {
    return function(this, n)
}
