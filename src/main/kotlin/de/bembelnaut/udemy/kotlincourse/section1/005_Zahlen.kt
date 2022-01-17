package de.bembelnaut.udemy.kotlincourse.section1

/**
 * Verschiedene Zahlentypen und deren Bit-Groesse
 */
fun main(array: Array<String>) {
    // Byte: 8 Bit, Short: 16 Bit; Int: 32 Bit, Long: 64 Bit
    val byte: Byte = 127

    // Compile-Fehler...
    // val byte: Byte = 128

    val x: Int = 2

    // 32 Bit
    val pi: Float = 3.14f

    // 64 Bit
    val double: Double = 3.14

    val maxFloat: Float = 3.1231237f
    // maxFloat wird am Ende auf 3.1231236 gerundet
    println(maxFloat)

    val maxDouble: Double = 3.123177777777777777777
    // maxDouble wird am Ende auf 3.123177777777778 gerundet
    println(maxDouble)
}
