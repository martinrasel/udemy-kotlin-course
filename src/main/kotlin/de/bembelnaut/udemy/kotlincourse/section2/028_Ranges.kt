package de.bembelnaut.udemy.kotlincourse.section2

/**
 *
 */
fun main() {

    // Range Variable werden mit ".." definiert
    var x = 0..3

    // Sie können dann für Schleifen benutzt werden
    for (y in x) {
        print(y)
    }

    println()

    // oder...
    for (y in 3..6) {
        print(y)
    }

    println()

    // Oder die Range wird von oben nach unten durchlaufen. Hierfür wird anstelle ".." dann "downTo" benötigt
    for (y in 7 downTo 0) {
        print(y)
    }

    println()

    // Die Schrittgröße kann auch mit "step" bestimmt werden
    for (y in 0..30 step 3) {
        print(y)
    }
}