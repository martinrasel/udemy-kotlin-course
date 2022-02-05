package de.bembelnaut.udemy.kotlincourse.section1_grundlagen

/**
 * Do-While und While-Schleife
 */
fun main() {

    var couter = 10

    // Schleife wird solange ausgeführt bis Bedingung false ist; aber mindestens ein mal
    do {
        println(couter)
        couter--
    } while (couter > 0)

    // Schleife wird solange ausgeführt bis Bedingung false ist
    while (couter < 10) {
        println(couter)
        couter++
    }
}