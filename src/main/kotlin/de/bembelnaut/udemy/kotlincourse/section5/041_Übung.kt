package de.bembelnaut.udemy.kotlincourse.section5

fun main() {

    val abs = {a: Int -> if (a < 0) a * -1 else a}

    println(abs(4))
    println(abs(-4))
    println(abs(0))
}
