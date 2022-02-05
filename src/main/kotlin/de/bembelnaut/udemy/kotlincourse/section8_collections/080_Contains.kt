package de.bembelnaut.udemy.kotlincourse.section8_collections

/**
 * Contains
 */
fun main() {

    var mBasicList = listOf(0,4,1,2,3,4,5)
    println("mBasicList: $mBasicList")

    // Muss nicht so gemacht werden. Es gibt eine andere Schreibweise.
    println("mBasicList.contains(): ${mBasicList.contains(3)}")

    // n in liste wird intern dann zu contains umgewandelt
    println("n in mBasicList: ${3 in mBasicList}")

    // ContainsAll prüft alle Liste einer Liste ob enthalten sind. Aber nicht wie oft!
    println("mBasicList.containsAll(): ${mBasicList.containsAll(listOf(1,2,3))}")

}