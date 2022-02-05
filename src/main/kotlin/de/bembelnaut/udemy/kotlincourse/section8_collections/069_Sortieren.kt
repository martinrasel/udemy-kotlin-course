package de.bembelnaut.udemy.kotlincourse.section8_collections

/**
 * Listen Sortierung
 */
fun main() {

    var mBasicList = listOf(0,4,1,2,3,4,5)
    println("mBasicList: $mBasicList")

    // Sortierung...
    println("mBasicList sortiert: ${mBasicList.sorted()}")
    println("mBasicList customized sortiert: ${mBasicList.sortedBy { it * 2 }}")
    println("mBasicList absteigend sortiert: ${mBasicList.sortedDescending()}")
    println("mBasicList customized absteigend sortiert: ${mBasicList.sortedByDescending { it * 2 }}")

    println("mBasicList customized sortiert: ${mBasicList.sortedWith { a, b ->
        when {
            a == 4 -> 1
            b == 4 -> -1
            else -> a - b
        }
    }}")
}