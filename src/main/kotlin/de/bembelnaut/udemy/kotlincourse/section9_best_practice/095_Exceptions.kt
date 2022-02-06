package de.bembelnaut.udemy.kotlincourse.section9_best_practice

/**
 * Exception verarbeiten
 */
fun main() {

    try {
        val x = 42 / 1
        println(x)

        val array = arrayOf(1,233,)
        println(array[12])
    } catch(e: ArithmeticException) {
        println(e)
    } catch(e: ArrayIndexOutOfBoundsException) {
        println(e)
    } finally {
        println("Wie in Java...")
    }

}