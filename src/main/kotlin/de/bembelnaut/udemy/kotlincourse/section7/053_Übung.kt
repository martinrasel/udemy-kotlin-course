package de.bembelnaut.udemy.kotlincourse.section7

fun main() {

    var laptop = Laptop("Intel i7", 64, 2000, "SuperDuperDVD")

    laptop.open()
    laptop.close()

    var desptopPc = DesptopPc("AMD Plenty", 128, 1000, true)

    desptopPc.powerPressed()
    desptopPc.switchColor(DesptopPc.Color.RED)
}

open class Computer(
    private var cpu: String,
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
                println("...Found $cpu")
                println("...Found $ram")
                println("...Found $storage")
                println("...")
                println("...starting DOS 6.2...")
            }
            !power -> println("...turn off")
        }
    }
}

class Laptop(cpu: String, ram: Int, storage: Int, externalDVDModel: String) : Computer(cpu, ram, storage) {

    private var closed: Boolean = true

    var externalDVDModel: String = externalDVDModel
        private set

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

class DesptopPc(cpu: String, ram: Int, storage: Int, withCoolLedLight: Boolean) : Computer(cpu, ram, storage) {

    enum class Color { NONE, RED, GREEN, BLUE }

    private var actualColor: Color = Color.NONE

    private var withCoolLedLight: Boolean = withCoolLedLight
        private set

    fun switchColor(color: Color) {
        if (withCoolLedLight) {
            println("Switch color to ${color.name}")
        }
    }
}