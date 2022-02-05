package de.bembelnaut.udemy.kotlincourse.section8_collections

/**
 * Find
 */
fun main() {

    var mBasicList = listOf(0,4,1,2,3,4,5)
    println("mBasicList: $mBasicList")

    // find gibt das erste Element zurück, auf das der Matcher passt
    println("find: ${mBasicList.find { it < 4 }}")

    // indexOf sucht das Element in der Liste und gibt den Index in der Liste zurück;
    // Die Suche geht dabei von links nach rechts
    println("indexOf: ${mBasicList.indexOf(4)}")

    // Sucht auch von links nach rechts
    println("indexOf: ${mBasicList.indexOfFirst { it == 4}} ")

    // Sucht von rechts nach links
    println("indexOf: ${mBasicList.indexOfLast { it == 4}} ")
}