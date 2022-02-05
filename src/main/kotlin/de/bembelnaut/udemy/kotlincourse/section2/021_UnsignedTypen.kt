package de.bembelnaut.udemy.kotlincourse.section2

/**
 * Unsinged-Type
 */
fun main() {

    var mByte: Byte = 12 // -2^4 bis 2^4 -1 (-16 bis 15)
    var mUByte: UByte = 12U // 0 bis 2^8 -1 (0 bis 31)

    var mShor: Short = 12 // -2^8 bis 2^8 -1 (-128 bis 127)
    var mUShort: UShort = 12U // 0 bis 2^16 -1 (0 bis 255)

    var mInt: Int = 12 // -2^16 bis 2^16 -1 (-... bis ...)
    var mUInt: UInt = 12U // 0 bis 2^32 -1 (0 bis ...)

    var mLong: Long = 12 // -2^32 bis 2^32 -1 (-... bis ...)
    var mULong: ULong = 12U // 0 bis 2^64 -1 (0 bis ...)
    
    var mUCalc: UInt = 12U + 12U
    println(mUCalc)
}