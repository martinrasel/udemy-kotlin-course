package de.bembelnaut.udemy.kotlincourse.section2

/**
 * Type-Casts
 */
fun main() {

    var mInt: Int = 128
    // type cast
    var mByte: Byte = mInt.toByte()
    var mLong: Long = mInt.toLong()

    println("int value: $mInt")
    println("cast from int to byte: $mByte") // overflow
    println("cast from int to long: $mLong")

    var mDividend: Int = 42
    var mDivisor: Int = 5

    var mQuotientInt: Int = mDividend / mDivisor
    var mQuotientDoubleWrong: Double = (mDividend / mDivisor).toDouble()
    var mQuotientDoubleRight: Double = mDividend.toDouble() / mDivisor

    println("mQuotientInt: $mQuotientInt")
    println("mQuotientDoubleWrong: $mQuotientDoubleWrong")
    println("mQuotientDoubleRight: $mQuotientDoubleRight")

    var mAsciiPos: UByte = 75U
    var mChar: Char = mAsciiPos.toInt().toChar()
    println("Ascii Pos: $mAsciiPos")
    println("Char: $mChar")
}