package de.bembelnaut.udemy.kotlincourse.section9_best_practice

/**
 * Try als Expression
 */
fun main() {

    // Try / Catch kann einen Rückgabewert haben
    println("Wie alt bist Du?")
    var mString: Int? = try {
        readLine()!!.toInt()
    } catch (e: NumberFormatException) {
        null
    }

    println("Alter $mString")

}