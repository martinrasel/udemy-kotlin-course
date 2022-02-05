package de.bembelnaut.udemy.kotlincourse.section8_collections

/**
 * Filter Operation für Listen
 */
fun main() {

    var mBasicList = listOf(0,4,1,2,3,4,5)
    println("mBasicList: $mBasicList")
    println("mBasicList filter it > 3: ${mBasicList.filter { it > 3 || it < 1}}")

}