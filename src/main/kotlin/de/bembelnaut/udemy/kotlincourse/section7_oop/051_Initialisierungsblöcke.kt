package de.bembelnaut.udemy.kotlincourse.section7_oop

import kotlin.math.*

/**
 * Initialisierungsblöcke
 */
fun main() {

    val circle = CircleMe(2.5)

}

// Der primärere Konstruktor wird direkt an der Klasse angegeben.
class CircleMe(radius: Double) {

    // "init"-Blöcke werden nach dem KonstruKtor ausgeführt
    // Sie werden in der Reihenfloge ausgeführt, von oben nach unten
    // Attribute sind dann aber evtl noch nicht initialisiert und Funktionen liefern dann evtl. falsche Werte, weil
    // sie auf nicht initialisierte Variablen zugreifen,
    init {
        // Compile-Fehler: muss initialisiert werden
        // this.radius = 1.0
        //println("'this.radius (member)' ${this.radius}") // Compile-Fehler!
        println("'this.radius (member): nicht init'")
        println("'radius (constructor parameter)' $radius")
        println("'radius (method uses radius member)' ${area()}")
        println("------------------------")
    }

    // Attribut radius wird hier erst initialisiert
    var radius: Double = radius
        get() = field
        set(value) {
            if (value >= 0.0) {
                // wichtig! es muss field sein
                field = value
            }
        }

    // Wird Funktion vor der Initialisierung von this.radius aufgerufen, erhalten die Attibute default werte; Double = 0.0
    fun area(): Double = radius * radius * PI

    init {
        println("'this.radius (member)' ${this.radius}")
        println("'radius (constructor parameter)' $radius")
        println("'radius (method uses radius member)' ${area()}")
    }
}

