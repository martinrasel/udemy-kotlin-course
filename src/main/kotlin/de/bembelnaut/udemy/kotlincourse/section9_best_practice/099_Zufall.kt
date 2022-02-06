package de.bembelnaut.udemy.kotlincourse.section9_best_practice

/**
 * Zufallsgenerator
 */
fun main() {

    val range = 1..100
    println(range.random())

    val randomNumber = (42..1447).random()
    println(randomNumber)

    val mArray = arrayOf(23..100)
    println(mArray.random())

}