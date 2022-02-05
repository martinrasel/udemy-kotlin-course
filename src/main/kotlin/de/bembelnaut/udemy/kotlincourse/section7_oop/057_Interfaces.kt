package de.bembelnaut.udemy.kotlincourse.section7_oop

/**
 * Interfaces
 */
fun main() {

    var laptop = Laptop4("Intel i7", 64, 2000, "SuperDuperDVD")

    laptop.open()
    laptop.close()

    var desptopPc = DesptopPc4("AMD Plenty", 128, 1000, true)

    desptopPc.powerPressed()
    desptopPc.switchColor(DesptopPc4.Color.RED)

    println()
    println("My computers...")
    val mArray = arrayOf(laptop, desptopPc)
    mArray.forEach {
        it.printSysSpec()
        it.mooep()
        println("-----------------")
    }

    println()
    println("My Wifi Devices...")
    var mySensor = SmartSensor()
    var myWifiDevices: Array<Wifi> = arrayOf(laptop, mySensor)

    for (dev in myWifiDevices) {
        dev.connect()
    }
}

interface Wifi {
    // Attribute dürfen deklariert, aber nicht initialisiert sein
    var connected: Boolean
    var cardname: String

    // Leer Methoden müssen in Unterklassen implementiert werden
    fun connect()

    // Methoden mit einem Rumpf darf es geben. Alle Zugriffe auf Attribute und Methoden sind erlaubt.
    fun printConnectedStatus() {
        println("connected with $cardname?: $connected")
    }
}

class SmartSensor: Wifi {
    // Auch hier wieder override benutzen
    override var cardname: String = "Cheep Wifi"
    override var connected: Boolean = true
    override fun connect() {}
}

abstract class Computer4(
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

// Interfaces müssen nach Ober- oder abstrakten Klassen angegeben werden.
class Laptop4(cpu: String, ram: Int, storage: Int, externalDVDModel: String) : Computer4(cpu, ram, storage), Wifi {

    override var connected: Boolean = true
    override var cardname: String = "BooAbdas"
    override var cpu: String = "Hammer SUPER CPU"

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
            connect()
            printConnectedStatus()
        }
    }

    // Methode muss für Interface implementiert werden.
    override fun connect() {
        println("...............biiib.biiip...booop.........")
    }

    override fun mooep() {
        println("Laptop MÖÖÖÖÖP")
    }
}

class DesptopPc4(cpu: String, ram: Int, storage: Int, withCoolLedLight: Boolean) : Computer4(cpu, ram, storage) {

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