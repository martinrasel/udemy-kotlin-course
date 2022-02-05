package de.bembelnaut.udemy.kotlincourse.section7_oop

import kotlin.math.*

/**
 * Sekundärer Konstruktor
 *
 * Wichtige Aufruf-Reihenfolge: Zuerst der primäre Konstruktoren, dann die init-Blöcke und als letztes der sekundäre
 * Konstruktor.
 */
fun main() {

    // Auch wenn ein sekundärer Konstruktor aufgerufen wird...
    val circle = CircleMeTwice2(2.5, "Hohoho")

}

class CircleMeTwice2(radius: Double,
                     function: ()->Unit={
                        println("Primärer Konstruktor")
                     }) {

    // "init"-Blöcke werden nach dem KonstruKtor ausgeführt
    // Sie werden in der Reihenfloge ausgeführt, von oben nach unten
    // Attribute sind dann aber evtl noch nicht initialisiert und Funktionen liefern dann evtl. falsche Werte, weil
    // sie auf nicht initialisierte Variablen zugreifen,
    init {
        // this.radius = 1.0 // FEHLER: muss initialisiert werden
        //println("'this.radius (member)' ${this.radius}") // FEHLER! nicht init
        println("'this.radius (member): nicht init'")
        println("'radius (constructor parameter)' $radius")
        println("'radius (method uses radius member)' ${area()}")
        println("function-parameter aufruf")
        function.invoke()
        println("------------------------")
    }

    // ... der sekundäre Konstruktor wird immer als letztes aufgerufen
    constructor(radius: Double, printMe: String ): this(radius) {
        var printMe = printMe

        println("secondary constructor: $printMe");

    }

    var radius: Double = radius
        get() = field
        set(value) {
            if (value >= 0.0) {
                // wichtig! es muss field sein
                field = value
            }
        }

    fun area(): Double = radius * radius * PI

    init {
        println("'this.radius (member)' ${this.radius}")
        println("'radius (constructor parameter)' $radius")
        println("'radius (method uses radius member)' ${area()}")
    }
}

