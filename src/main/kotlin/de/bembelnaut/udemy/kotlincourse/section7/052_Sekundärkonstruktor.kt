package de.bembelnaut.udemy.kotlincourse.section7

import kotlin.math.*

fun main() {
    val circle = CircleMeTwice(2.5, "Hohoho")

}

// primärer konstruktor direkt an der klasse
class CircleMeTwice(radius: Double) {

    // init block wird nach dem constructor ausgeführt
    // er wird in der reihenfloge ausgelesen
    // member variablen sind evtl noch nicht initialisiert und funktionen sind evtl nicht abgesichert (weil sie auf member vars zugreifen,
    // die noch nicht init sind...
    init {
        // this.radius = 1.0 // FEHLER: muss initialisiert werden
        //println("'this.radius (member)' ${this.radius}") // FEHLER! nicht init
        println("'this.radius (member): nicht init'")
        println("'radius (constructor parameter)' $radius")
        println("'radius (method uses radius member)' ${area()}")
        println("------------------------")
    }

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

    // wird funktion vor der initialisierung von radius aufgerufen, erhalten die attibute default werte; Double = 0.0
    fun area(): Double = radius * radius * PI

    init {
        // this.radius = 1.0 // FEHLER: muss initialisiert werden
        println("'this.radius (member)' ${this.radius}") // member liefert pointer
        println("'radius (constructor parameter)' $radius")
        println("'radius (method uses radius member)' ${area()}")
    }

}

