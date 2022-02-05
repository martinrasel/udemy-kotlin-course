package de.bembelnaut.udemy.kotlincourse.section8_collections

/**
 * Listen-Operationen: All, Any und None
 */
fun main() {

    var mBasicList = listOf(0,4,1,2,3,4,5)
    println("mBasicList: $mBasicList")

    // all: Bedingung muss für alle eintreten
    println("all >= 0: ${mBasicList.all { it >= 0 }}")

    // none: Bedingung darf für kein Element eintreten
    println("none >= 0: ${mBasicList.none { it >= 0 }}")

    // none() ist wie isEmpty(); besser ist es isEmpty() zu nutzen
    println("none: ${mBasicList.none()}")
    println("isEmpty: ${mBasicList.isEmpty()}")

    // any: Bedingung muss für mindestens ein Element eintreten
    println("any > 4: ${mBasicList.any { it > 4 }}")

    // schnelle Prüfung ob ein Element der Liste null ist
    var mNullableList: List<Int?> = listOf<Int?>(1,2,null,4)
    println("mNullableList enthält kein null: ${mNullableList.none { it == null }}")

    mNullableList = listOf<Int?>(1,2,3,4)
    println("mNullableList enthält kein null: ${mNullableList.none { it == null }}")
}