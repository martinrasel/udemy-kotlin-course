package de.bembelnaut.udemy.kotlincourse.section1_grundlagen

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