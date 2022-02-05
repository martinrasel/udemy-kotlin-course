package de.bembelnaut.udemy.kotlincourse.section8_collections

/**
 * Collection of Nullables
 */
fun main() {

    var mNullableList: List<Int?> = listOf<Int?>(1,2,null,4)

    println("mNullableList enthält kein null: ${mNullableList.none { it == null }}")

    // Entfernt alle nulls
    println(mNullableList.filterNotNull())

}