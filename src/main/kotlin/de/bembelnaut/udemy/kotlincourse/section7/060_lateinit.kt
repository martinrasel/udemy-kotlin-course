package de.bembelnaut.udemy.kotlincourse.section7

class AAA {
    val hello = "Hello"
}

class Aktenkoffer {
    // eine variable muss initialisiert werden, aber ohne lateinit geht es nicht
    lateinit var mSpeicher: AAA

    fun print() {
        // die lateinit variable _muss_ geprüft werden, da sonst eine kotlin.UninitializedPropertyAccessException fliegt
        if (this::mSpeicher.isInitialized) {
            println("Speicher: ${mSpeicher.hello}")
        }
    }
}

fun main() {

    var mAktenkoffer: Aktenkoffer = Aktenkoffer()

    mAktenkoffer.print()
    mAktenkoffer.mSpeicher = AAA()
    mAktenkoffer.print()
}