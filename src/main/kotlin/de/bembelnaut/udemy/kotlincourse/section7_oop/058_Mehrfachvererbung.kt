package de.bembelnaut.udemy.kotlincourse.section7_oop


/**
 * Mehrfachvererbung
 */
fun main() {
    var mAB = AB()
    mAB.printIt()
    mAB.printName()
}

// "Ober"-Interface
interface BeforeAll {
    fun printName() {
        println("Am Anfang war...")
    }
}

// Ein Interface kann auch erben
interface A: BeforeAll {
    val mA: Int
    val mShared: Int

    fun printIt() {
        println("Interface A: $mA")
    }

    // Überschreibt die Methode aus BeforeAll
    override fun printName() {
        // Hier hat man noch Zugriff auf die Oberklasse
        super<BeforeAll>.printName()
        println("Hello A, $mA")
    }
}

interface B: BeforeAll {
    val mB: String
    val mShared: Int

    // Muss in implementierenden Klasse initialisiert werden. Wird später von abstrakter klasse C indirekt initialisiert.
    var mSharedIt: Int

    fun printIt()

    override fun printName() {
        // Methode printName() von BeforeAll wird hier einfach nicht mehr benutzt
        println("Hello B, $mB")
    }
}

abstract class C {
    val mC: Int = 42

    // Muss open sein, da sie in AB überschrieben wird
    open var mSharedIt: Int = 23
}

class AB: C(), A, B {
    override val mA: Int = 23
    override val mB: String = "Hello"

    // Muss aufgrund von Interface B eigentlich initialisiert werden.
    // Aber durch die abstrakter Klasse C, die mSharedIt initialisiert hat, wird dies hier eigentlich nicht
    // mehr benötigt.
    override var mSharedIt: Int = 12

    // Auch bei Variablen muss ein Konflikt der Oberklassen aufgelöst werden.
    // Das geschieht mit super<Oberklasse>
    override val mShared: Int = super<A>.hashCode()

    // printIt des Interfaces B ist abstrakt und es gibt keine Implentierung. Daher referenziert
    // "super" auf das Interface A und es gibt keinen Konflikt
    override fun printIt() {
        super.printIt()
    }

    // printName hat in beiden Interfaces eine Implementierung
    // Um auf die Implementierungen der Oberklasse zu kommen muss super<Oberklasse> benutzt werden.
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

