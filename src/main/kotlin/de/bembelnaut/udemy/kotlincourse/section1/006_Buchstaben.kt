package de.bembelnaut.udemy.kotlincourse.section1

/**
 * Buchstaben und Maskierungen
 */
fun main() {
    // Wichtig! Chars nur mit '' initialiesieren
    var char: Char = 'F'
    println(char)

    // Sonderzeichen
    // Tab
    char = '\t'
    println("haha" + char + "buh")

    // New line
    char = '\n'
    println("haha" + char + "buh")

    // Hochkamma, Backslash,.... wird maskiert
    char = '\''
    println("haha" + char + "buh")

    char = '\u0a09' // Unicode
    println("haha" + char + "buh")
}