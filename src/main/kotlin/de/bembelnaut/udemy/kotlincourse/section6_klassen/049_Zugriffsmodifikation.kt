package de.bembelnaut.udemy.kotlincourse.section6_klassen

/**
 * Zugriffsmodifikatoren bei Vererbung
 */
fun main() {
    // private, protected und public
    var mMaus: ZugriffsMaus = ZugriffsMaus("Daisy", 23.1)

    var time = 60
    println("${mMaus.name} läuft ${mMaus.calcDistance(time)}m in $time sec")

    mMaus.print()
    mMaus.showPublicPrivateHello()
}

class ZugriffsMaus(name: String, private val velocity: Double) : Visisbility() {

    // public ist der Default und muss nicht angegeben werden
    public var name = name

    // public ist der Default und muss nicht angegeben werden
    fun print() {
        showProtectedHello()
        println("Name $name und Velocity $velocity")
    }

    fun calcDistance(seconds: Int): Double = seconds * velocity
}

// Die Klasse kann nicht einfach instanziert werden, da der Konstruktor nicht sichtbar ist
class NoConstructor private constructor() : Visisbility() {

    // Internal ist nur im Modul sichtbar
    // Der private Konstruktor ist für die eigene Klasse sichtbar
    internal constructor(string: String) : this() {
       println(string)
    }

    // Public Konstruktor ist auch sichtbar
    // Konstruktoren können sich gegenseitig aufrufen, egal welche Sichtbarkeit sie haben.
    constructor(string: String, string2: String) : this(string) {
        println("$string $string2")
    }
}

open class Visisbility() {

    private fun showPrivateHello() {
        println("private Hello")
    }

    // Sind sichtbar für alle Subklassen, ansonsten wie private
    protected fun showProtectedHello() {
        println("protected Hello")
    }

    public fun showPublicPrivateHello() {
        showPrivateHello()
    }

    internal fun showOnlyInModule() {
        println("Only visible the same module/package")
    }
}
