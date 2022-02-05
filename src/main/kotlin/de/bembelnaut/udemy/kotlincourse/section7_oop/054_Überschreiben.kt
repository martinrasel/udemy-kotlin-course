package de.bembelnaut.udemy.kotlincourse.section7_oop

/**
 * Überschreiben von Methoden der Oberklasse
 */
fun main() {

    var laptop = Laptop2("Intel i7", 64, 2000, "SuperDuperDVD")

    laptop.open()
    laptop.close()

    var desptopPc = DesptopPc2("AMD Plenty", 128, 1000, true)

    desptopPc.powerPressed()
    desptopPc.switchColor(DesptopPc2.Color.RED)

    println()
    println("My computers...")
    val mArray = arrayOf(laptop, desptopPc)
    mArray.forEach {
        it.printSysSpec()
        println("-----------------")
    }
}

// Damit die Klasse erweitert werden kann, muss sie mit open deklariert werden
open class Computer2(

    // Auch wenn Attribute in Unterklassen überschrieben werden dürfen, muss es mit
    // open deklariert sein
    open var cpu: String,

    private var ram: Int,
    private var storage: Int) {

    private var power: Boolean = false

    fun powerPressed() {
        power = !power
        println("Power button pressed...")
        when {
            power -> {
                println("...turn on")
                println("...")
                println("AMI BOIS")
                // ruft erst überschriebene methode auf, wenn vorhanden
                printSysSpec()
                println("...")
                println("...starting DOS 6.2...")
            }
            !power -> println("...turn off")
        }
    }

    // Auch Methoden die überschrieben werden dürfen, müssen mit open markiert sein
    open fun printSysSpec() {
        println("...Found $cpu")
        println("...Found $ram")
        println("...Found $storage")
    }
}

class Laptop2(cpu: String, ram: Int, storage: Int, externalDVDModel: String) : Computer2(cpu, ram, storage) {

    // override muss bei allen überschriebenen Variablen benutzt werden
    override var cpu: String = "Hammer SUPER CPU"
    // diese attribute können dann auch weiter aufgedröselt werden...
    //   get() = super.cpu
    //   set(value) {}

    private var closed: Boolean = true

    // Soll ein Attribut nur lesend sein, dann muss der setter auf private gesetzt werden
    var externalDVDModel: String = externalDVDModel
        private set

    // override muss bei allen überschriebenen Methoden benutzt werden
    override fun printSysSpec() {
        // Damit die Methode der Oberklasse benutzt werden kann, muss vor der Methode ein super gesetzt werden
        super.printSysSpec()
        println("...Found $externalDVDModel")
    }

    fun close() {
        if (!closed) {
            closed = true
            println("Close laptop")
            powerPressed()
        }
    }

    fun open() {
        if (closed) {
            closed = false
            println("Open laptop")
            powerPressed()
        }
    }
}

class DesptopPc2(cpu: String, ram: Int, storage: Int, withCoolLedLight: Boolean) : Computer2(cpu, ram, storage) {

    enum class Color { NONE, RED, GREEN, BLUE }

    private var actualColor: Color = Color.NONE

    private var withCoolLedLight: Boolean = withCoolLedLight
        private set

    override fun printSysSpec() {
        super.printSysSpec()
        println("...Found lights = $withCoolLedLight")
    }

    fun switchColor(color: Color) {
        if (withCoolLedLight) {
            println("Switch color to ${color.name}")
        }
    }
}