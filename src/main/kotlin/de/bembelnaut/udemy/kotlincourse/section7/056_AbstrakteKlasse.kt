package de.bembelnaut.udemy.kotlincourse.section7

fun main() {

    var laptop = Laptop3("Intel i7", 64, 2000, "SuperDuperDVD")

    laptop.open()
    laptop.close()

    var desptopPc = DesptopPc3("AMD Plenty", 128, 1000, true)

    desptopPc.powerPressed()
    desptopPc.switchColor(DesptopPc3.Color.RED)

    println()
    println("My computers...")
    val mArray = arrayOf(laptop, desptopPc)
    mArray.forEach {
        it.printSysSpec()
        it.mooep()
        println("-----------------")
    }
}

abstract class Computer3(
    // open funktioniert auf class, attribute und methoden
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

    open fun printSysSpec() {
        println("...Found $cpu")
        println("...Found $ram")
        println("...Found $storage")
    }

    abstract fun mooep()
}

class Laptop3(cpu: String, ram: Int, storage: Int, externalDVDModel: String) : Computer3(cpu, ram, storage) {

    // override muss bei allen überschriebenen deklarationen benutzt werden
    override var cpu: String = "Hammer SUPER CPU"
// diese attribute können dann auch weiter aufgedröselt werden...
//        get() = super.cpu
//        set(value) {}

    private var closed: Boolean = true

    var externalDVDModel: String = externalDVDModel
        private set

    override fun printSysSpec() {
        super.printSysSpec() // ruft parent methode auf
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

    // methode ist abstrakt und muss überschrieben werden. daher "override"
    override fun mooep() {
        println("Laptop MÖÖÖÖÖP")
    }
}

class DesptopPc3(cpu: String, ram: Int, storage: Int, withCoolLedLight: Boolean) : Computer3(cpu, ram, storage) {

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

    override fun mooep() {
        println("DesktopPC MÖÖÖÖP")
    }
}