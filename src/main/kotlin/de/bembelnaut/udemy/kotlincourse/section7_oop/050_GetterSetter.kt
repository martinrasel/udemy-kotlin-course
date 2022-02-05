package de.bembelnaut.udemy.kotlincourse.section7_oop

import kotlin.math.*

/**
 * Getter und Setter
 */
fun main() {
    val circle = Circle(2.5)

    circle.radius = -1.0

    println(circle.area)
    println(circle.durchmesser)
}

class Circle(radius: Double) {
    // Das nicht sichtbare "field" speicher eigentliche das Attribut;
    // Bei einer Zuweisung über "radius" wird auf den getter/setter zugegriffen.
    // Mit dem Überschreiben der getter und setter kann man eigene Funktionen oder Berechnungen einbauen
    // Ausserdem können über die Zugriffsmodis auch Einschränkungen gemacht werden
    var radius: Double = radius
        get() = field
        set(value) {
            if (value >= 0.0) {
                // Wichtig! Es muss "field" sein und NICHT "radiue", da sonste eine Endloseschleife entsteht
                field = value
            }
        }

    // Durchmesser benötigt keine Initialisierung wie isValidCirle oder area, weil ein expliziter setter vorhanden ist.
    var durchmesser: Double
        get() = 2 * radius
        private set(value) {}

    // Das Attribut bei Zugriff auf den Getter berechnet
    var isValidCircle: Boolean = false
        get() = radius >= 0

    // Bewirkt das gleich...
    // fun area(): Double = radius * radius * PI
    var area: Double = 0.0
        get() = radius * radius * PI
}

