package de.bembelnaut.udemy.kotlincourse.section2

import de.bembelnaut.udemy.kotlincourse.section1.facultaet

fun main() {

    var a = 42
    var b = 1233

    var max = if (a > b) a else b
    println(max)

    // tenerer operator
    max = if (a > b) {
        println("Hello a")
        a
    } else {
        println("Hello b")
        var bb: Int = b * b
        println("Zwischenergebnis " + bb)
        bb
    }

    println(max)


}