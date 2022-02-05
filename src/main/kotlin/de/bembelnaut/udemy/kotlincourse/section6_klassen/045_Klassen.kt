package de.bembelnaut.udemy.kotlincourse.section6_klassen

/**
 * Klassen
 */
fun main() {

    var mMaus: Maus = Maus()
    mMaus.namen = "Daisy"
    mMaus.velocity = 23.1

    var mMini = Maus()
    mMini.namen = "Foooo"
    mMini.velocity = 23.13

    println(mMaus.namen)
    println(mMini.namen)
}

class Maus {
    // getter und setter werden automatisch erstellt
    var namen: String = "Micky"
    var velocity: Double = 23.42
}