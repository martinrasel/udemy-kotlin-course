package de.bembelnaut.udemy.kotlincourse.section6

/**
 * Konstruktoren
 */
fun main() {

    var mMaus: ConstructorMaus = ConstructorMaus("Daisy", 23.1)
    var mMini = ConstructorMaus()

    mMaus.print()
    mMini.print()

    var time = 60
    println("${mMini.namen} läuft ${mMini.calcDistance(time)}m in $time sec")
}

// Die Parameter des Konstruktors werden automatisch zu Klassen-Attribute, wenn ein var oder val
// davor steht. Ohne var und val werden dieser Parameter nach der Initialisierung verworfen.
class ConstructorMaus(var namen: String = "Micky",
                      var velocity: Double = 23.42,
                      foo: String = "Bar!") {

    // Wenn Parameter fou nicht benutzt wird, verfällt er, da er weder "var" noch "val" ist.
    var dou: String = foo

    fun print() {
        println("Name $namen und Velocity $velocity")

        // Compile-Fehler, weil Parameter foo verworfen wurde
        //println("Foo $foo")

        // Dou wurde mit foo initialisiert
        println("Dou $dou")
    }

    fun calcDistance(seconds: Int): Double = seconds * velocity
}