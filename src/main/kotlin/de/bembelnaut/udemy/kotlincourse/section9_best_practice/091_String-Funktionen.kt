package de.bembelnaut.udemy.kotlincourse.section9_best_practice

/**
 * String Funktionen
 */
fun main() {

    var mString1 = "Hello World!"
    var mString2 = "Hello W"

    // compare vergleicht zwei Strings und gibt als Ergebnis eine Zahl zurück. Diese Zahl gibt nur an, wie die
    // beiden Strings sortiert werden würden. Zahlen größer als 0 steht der erste String vor dem anderen.
    println("String 1 vor 2: ${mString1.compareTo(mString2)}")

    // Inhaltlicher vergleich
    println("String 1 und 2 sind gleich: ${mString1.equals(mString2)}")
    println("String 1 und 1 sind gleich: ${mString1 == mString1}")

    // Objektvergleich
    println("String 1 und 2 sind gleiche Instanzen: ${mString1 === mString2}")
    println("String 1 und 1 sind gleiche Instanzen: ${mString1 === mString1}")

    // SubSequence
    println("SubSequence von $mString1 von Index 1 - 3: ${mString1.subSequence(1..3)}")

    // String als CharArray
    println("mString1 an der letzten Stelle: ${mString1[mString1.length-1]}")

    // Chunked
    println("mString1 als kleine Häppchen: ${mString1.chunked(3)}")

    // Capitalize ist deprecated
    // ReplaceFirstChar
    println("ReplaceFirstChar: ${mString1.replaceFirstChar { it.uppercase() }}")
    println("ReplaceFirstChar: ${mString1.replaceFirstChar { it.lowercase() }}")

    // Drop
    println("drop an Index 3: ${mString1.drop(3)}")

    // Take
    println("take an Index 3: ${mString1.take(3)}")

    // Replace
    println("Replace: ${mString1.replace(" ", "")}")

    // Split liefert eine Liste
    println("Split: ${mString1.split(" ")}")

    // trim, trimStart
    println("Trim: ${mString1.trim()}")
    println("Trim start: ${mString1.trimStart()}")
}