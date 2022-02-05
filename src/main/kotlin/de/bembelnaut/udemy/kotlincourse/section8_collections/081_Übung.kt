package de.bembelnaut.udemy.kotlincourse.section8_collections

/**
 * Übung
 */
fun main() {

    var mBasicList = listOf(0,4,1,2,3,4,5)
    println("mBasicList: $mBasicList")

    println("contains 4 2 times: ${mBasicList.containsXTimes(4, 2)}")

    println("contains 8 1 times: ${mBasicList.containsXTimes(8, 1)}")
}

fun List<Int>.containsXTimes(number: Int, times: Int): Boolean
    = this.filter { it == number }.count() == times