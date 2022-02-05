package de.bembelnaut.udemy.kotlincourse.section5_funktionale_übungen

/**
 * Übung
 */
fun main() {
    println(replace("Das ist ein String", ' ', ""))
}

fun replace(origin: String, ch: Char, replace: String): String {
    var result: String = ""
    for(char: Char in origin) {
        result += if (char == ch) {
            replace
        } else {
            char
        }
    }

    return result
}

