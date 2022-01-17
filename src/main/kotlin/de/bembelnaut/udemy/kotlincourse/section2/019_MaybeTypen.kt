package de.bembelnaut.udemy.kotlincourse.section2

fun main() {

    // maybe null
    var mString: String? = null

    // führe aus wenn nicht null ist
    println(mString?.length)
    // Ausgabe "null"

    // das gleiche wie "?."
    if (mString != null) {
        // dann wird der "?." nicht mehr benötigt
        println(mString.length)
    }

    // compiler warning
    // println(mString.length)

    // null pointer!
    // println(mString!!.length)
}