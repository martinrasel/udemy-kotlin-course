package de.bembelnaut.udemy.kotlincourse.section6

fun main() {

    var mMaus: ConstructorMaus = ConstructorMaus("Daisy", 23.1)
    var mMini = ConstructorMaus()

    mMaus.print()
    mMini.print()

    var time = 60
    println("${mMini.namen} läuft ${mMini.calcDistance(time)}m in $time sec")
}

class ConstructorMaus(var namen: String = "Micky",
                      var velocity: Double = 23.42,
                      foo: String = "Bar!") {

    // wenn Parameter fou nicht benutzt wird, verfällt er, da er weder "var" noch "val" ist
    // dou ist von aussen erreichbar
    var dou: String = foo

    fun print() {
        println("Name $namen und Velocity $velocity")
    }

    fun calcDistance(seconds: Int): Double = seconds * velocity
}