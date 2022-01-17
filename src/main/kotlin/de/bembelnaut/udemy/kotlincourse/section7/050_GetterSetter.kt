package de.bembelnaut.udemy.kotlincourse.section7

import kotlin.math.*

fun main() {
    val circle = Circle(2.5)

    circle.radius = -1.0

    println(circle.area)
    println(circle.durchmesser)
}

class Circle(radius: Double) {
    // "field" speicher eigentliche attribut; "radius" ist greift auf den getter/setter zu
    // mit dem überschreiben der getter und setter kann man eigene funktionen oder berechnungen machen
    // ausserdem können über die zugriffsmodis auch einschränkungen gemacht werden
    var radius: Double = radius
        get() = field
        set(value) {
            if (value >= 0.0) {
                // wichtig! es muss field sein
                field = value
            }
        }

    // durchmesser benötigt keine initialisierung wie isValidCirle oder area, weil ein expliziter setter vorhanden ist.
    var durchmesser: Double
        get() = 2 * radius
        private set(value) {}

    // Attribut wird bei zugriff berechnet
    var isValidCircle: Boolean = false
        get() = radius >= 0

    //fun area(): Double = radius * radius * PI
    var area: Double = 0.0
        get() = radius * radius * PI
}

