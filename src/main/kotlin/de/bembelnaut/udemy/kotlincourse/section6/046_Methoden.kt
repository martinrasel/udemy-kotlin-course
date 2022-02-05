package de.bembelnaut.udemy.kotlincourse.section6

/**
 * Methoden in Klassen
 */
fun main() {

    var mMaus: AdvancedMaus = AdvancedMaus()
    mMaus.namen = "Daisy"
    mMaus.velocity = 23.1

    var mMini = AdvancedMaus()
    mMini.namen = "Foooo"
    mMini.velocity = 23.13

    mMaus.print()
    mMini.print()

    var time = 60
    println("${mMini.namen} läuft ${mMini.calcDistance(time)}m in $time sec")
}

class AdvancedMaus {
    var namen: String = "Micky"
    var velocity: Double = 23.42

    fun print() {
        println("Name $namen und Velocity $velocity")
    }

    fun calcDistance(seconds: Int): Double = seconds * velocity
}