package de.bembelnaut.udemy.kotlincourse.section2

/**
 * Maybe-Typen können einen null enthalten.
 */
fun main() {

    // maybe null
    var mString: String? = null

    // Es wird keine NullPointerException geworfen, da die Methode lenght nicht ausgeführt wirde
    println(mString?.length)
    // Ausgabe ist dann "null"

    // Dieser Block entspricht der Prüfung wie oben das "?."
    if (mString != null) {
        // Kotlin weiß ab hier, dass mString nicht mehr null sein kann und der "?." wird nicht mehr benötigt
        println(mString.length)
    }

    // Bei dieser Anweisung wird der Compiler ein Warning anzeigen
    // println(mString.length)

    // Mit den "!!" erzwingt man die Ausführung und es kommt zu einer NPE
    // println(mString!!.length)
}