package de.bembelnaut.udemy.kotlincourse.section7_oop

/**
 * Lateinit
 */
fun main() {

    var mAktenkoffer: Aktenkoffer = Aktenkoffer()

    mAktenkoffer.print()
    mAktenkoffer.mSpeicher = AAA()
    mAktenkoffer.print()
}

class AAA {
    val hello = "Hello"
}

class Aktenkoffer {
    // Eine Variable muss in einer Klasse immer initialisiert werden, aber ohne lateinit geht es nicht
    lateinit var mSpeicher: AAA

    fun print() {
        // Es gibt ein paar Methoden auf dem this-Objekt, die hier helfen können.
        // Die lateinit Variable _muss_ geprüft werden, da sonst eine kotlin.UninitializedPropertyAccessException fliegt
        if (this::mSpeicher.isInitialized) {
            println("Speicher: ${mSpeicher.hello}")
        }
    }
}
