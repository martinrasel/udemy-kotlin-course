package de.bembelnaut.udemy.kotlincourse.section7

interface BeforeAll {
    fun printName() {
        println("Am Anfang war...")
    }
}

interface A: BeforeAll {
    val mA: Int
    val mShared: Int

    fun printIt() {
        println("Interface A: $mA")
    }

    override fun printName() {
        // hier hat man noch Zugriff auf die Oberklasse
        super<BeforeAll>.printName()
        println("Hello A, $mA")
    }
}

interface B: BeforeAll {
    val mB: String
    val mShared: Int

    // wird später von abstrakter klasse C indirekt implementiert
    var mSharedIt: Int

    fun printIt()

    override fun printName() {
        // methode printName() von BeforeAll wird hier einfach nicht mehr benutzt
        println("Hello B, $mB")
    }
}

abstract class C {
    val mC: Int = 42

    // muss open sein, da sie in AB überschrieben wird
    open var mSharedIt: Int = 23
}

class AB: C(), A, B {
    override val mA: Int = 23
    override val mB: String = "Hello"

    // wird von abstrakter klasse C indirekt implementiert
    override var mSharedIt: Int = 12

    // auch bei variablen muss ein Konflikt der Oberklassen aufgelöst werden.
    override val mShared: Int = super<A>.hashCode()

    // printIt des Interface B ist abstrakt und es gibt keine Implentierung. Daher referenziert
    // "super" auf das Interface A und es gibt keinen Konflikt
    override fun printIt() {
        super.printIt()
    }

    // printName hat in beiden Interfaces eine Implementierung und muss daher mit "super<Interface>"
    // referenziert werden
    override fun printName() {
        // hier hat man noch Zugriff auf die Oberklasse
        // super<BeforeAll>.printName()
        // nur auf die direkte oberklasse
        super<A>.printName()
        super<B>.printName()
    }

    fun doIt() {
        printIt()
    }
}


fun main() {


    var mAB = AB()
    mAB.printIt()
    mAB.printName()
}