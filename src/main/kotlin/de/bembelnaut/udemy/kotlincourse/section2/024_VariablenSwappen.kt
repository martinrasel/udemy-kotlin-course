package de.bembelnaut.udemy.kotlincourse.section2

fun main() {
    var a: Int = 32
    var b: Int = 123

    println("a= " + a)
    println("b= " + b)

    println("also...")

    // das lambda wird mit den alten werten ausgeführt. die zuweisung von b zu a sind wird auch mit den alten werden ausgeführt
    a = b.also { b = a }

    println("a= " + a)
    println("b= " + b)
}