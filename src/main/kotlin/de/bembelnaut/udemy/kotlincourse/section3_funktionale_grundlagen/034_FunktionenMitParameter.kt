package de.bembelnaut.udemy.kotlincourse.section3_funktionale_grundlagen

/**
 * Funktionen mit Parameter
 */
fun main() {

    istTeiler(7, 8)

}

fun istTeiler(base: Int, number: Int) {
    println("Ist $number ein Teiler von $base: " + (number.mod(base) == 0))
}