package de.bembelnaut.udemy.kotlincourse.section5_funktionale_übungen

/**
 * Übung
 */
fun main() {

    val mArray = arrayOf(1,2,4,234,24,52,5)

    println(calArray(mArray))
}

fun calArray(mArray: Array<Int>): Int {
    var result = 0
    for (p in mArray) {
        result += p
    }
    return result
}
