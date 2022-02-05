package de.bembelnaut.udemy.kotlincourse.section6

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

open class Visisbility() {

    private fun showPrivateHello() {
        println("private Hello")
    }

    protected fun showProtectedHello() {
        println("protected Hello")
    }

    public fun showPublicPrivateHello() {
        showPrivateHello()
    }
}
