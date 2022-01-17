package de.bembelnaut.udemy.kotlincourse.section1

/**
 * Unterschied zwischen Variablen und Konstanten
 */
fun main(args: Array<String>) {
    val width : Int = 12
    val height = 23

    println(width * height)

    // Compile-Fehler...
    // width = 201;

    var mWidth = 201

    print("Bla bla: ")
    println(mWidth * height)
}