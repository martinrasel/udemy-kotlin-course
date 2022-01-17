package de.bembelnaut.udemy.kotlincourse.section3

fun main() {

    val x = 5

    println( facultaeSchleife(x) )
    println( facultaet(x) )
}

fun facultaeSchleife(n: Int): Int {
    var result: Int = 1
    for (pos in 1..n) {
        result *= pos
    }
    return result
}

fun facultaet(x: Int) : Int {
    if (x <= 1) {
        return 1
    } else {
        return x * facultaet(x - 1)
    }
}