package de.bembelnaut.udemy.kotlincourse.section13_oop_erweitert

/**
 * Enum Klassen
 */
fun main() {

    println(Color.GREEN)

    var color = Color.YELLOW
    when(color) {
        Color.GREEN -> println("Grün")
        Color.YELLOW -> println("Gelb")
        Color.RED -> println("Rot")
    }

    println(ColorRGB.RED)
    println(ColorRGB.RED.rgb)
}

enum class Color {GREEN, RED, YELLOW}

enum class ColorRGB(val rgb: Int) {
    GREEN(0x00FF00),
    RED(0xFF0000),
    YELLOW(0x0000FF)
}