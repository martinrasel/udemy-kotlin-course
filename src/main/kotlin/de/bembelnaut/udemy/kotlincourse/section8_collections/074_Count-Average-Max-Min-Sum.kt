package de.bembelnaut.udemy.kotlincourse.section8_collections

/**
 * Listen-Operationen: Size, Count, Average, MinOf und Sum
 */
fun main() {

    var mBasicList = listOf(0,4,1,2,3,4,5)
    println("mBasicList: $mBasicList")
    println("mBasicList size: ${mBasicList.size}")
    println("mBasicList count: ${mBasicList.count()}")
    println("mBasicList average: ${mBasicList.average()}")
    println("mBasicList min: ${mBasicList.minOf { it }}")
    println("mBasicList sum: ${mBasicList.sum()}")
}