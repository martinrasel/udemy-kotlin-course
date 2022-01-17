package de.bembelnaut.udemy.kotlincourse.section2

fun main() {

    // range variable mit ".."
    var x = 0..3

    for (y in x) {
        print(y)
    }

    println()

    // oder
    for (y in 3..6) {
        print(y)
    }

    println()

    // nach unten muss "downTo" genutzt werden
    for (y in 7 downTo 0) {
        print(y)
    }

    println()

    // schrittgröße geht auch mit "step"
    for (y in 0..30 step 3) {
        print(y)
    }
}