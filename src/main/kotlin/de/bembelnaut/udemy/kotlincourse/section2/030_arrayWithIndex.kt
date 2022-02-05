package de.bembelnaut.udemy.kotlincourse.section2

/**
 *
 */
fun main() {

    val mArray = arrayOf(23,2323,123,42,234,121,4121,412,4112,1)

    // withIndex liefert ein Pair(?) zurück
    for ((index, number) in mArray.withIndex()) {
        println("index: $index / number: $number")
    }
}