package de.bembelnaut.udemy.kotlincourse.section2

fun main() {

    var xArray = arrayOf(42, 1, 50, 113, 999, 7)

    for (x in xArray) {
        when (x) {
            42 -> println("x ist 42")
            0, 1, 2, 3, 4, 5 -> println("x ist zwischen 0 und 5")
            in 43..100 -> println("x ist zwischen 43 und 100")
            in 101..150 step 2 -> println("x ist jede zweite Zahl zwischen 101 und 150")
            in 1000 downTo 900 -> println("x ist zwischen 1000 und ***900***")
            else -> println("x ist sonst was...")
        }
    }

    // when zuweisung geht auch
    val yVonX = xArray[1]
    var y = when(yVonX) {
        yVonX -> 1
        else -> 0
    }
    println("$y")

    // oder ohne Klammer
    when {
        yVonX > 1 -> println("yVonX ist 1")
        else -> println("Sonst...")
    }

}