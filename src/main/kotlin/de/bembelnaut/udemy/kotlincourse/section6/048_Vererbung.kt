package de.bembelnaut.udemy.kotlincourse.section6

/**
 * Vererbung
 */
fun main() {

    var mMaus: HierachieMaus = HierachieMaus("Daisy", 23.1)
    
    mMaus.print()

    var time = 60
    println("${mMaus.name} läuft ${mMaus.calcDistance(time)}m in $time sec")

    mMaus.dieHard()
}

// HierarchieMaus erbt alle Attribute und Methode von Lebewesen
class HierachieMaus(var name: String, var velocity: Double) : Lebewesen() {

    fun print() {
        println("Name $name und Velocity $velocity")
    }

    fun calcDistance(seconds: Int): Double = seconds * velocity
}

open class Lebewesen {
    var art: String = "Säuger"

    fun dieHard() {
        println("Kill -9 ... tot")
    }
}
