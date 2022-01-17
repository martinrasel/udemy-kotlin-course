package de.bembelnaut.udemy.kotlincourse.section1

/**
 * Standard IO von Tastatur
 */
fun main() {

    var mInput: String? = readLine()
    println(mInput)

    println("Zahl eingeben!")
    val mCounter = Integer.valueOf(readLine())
    println("Zahl + 3 = " + (mCounter + 3))
}