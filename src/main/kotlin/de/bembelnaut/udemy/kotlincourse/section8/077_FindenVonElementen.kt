package de.bembelnaut.udemy.kotlincourse.section8

fun main() {

    var mListe2 = listOf(0,4,1,2,3,4,5)
    println("mListe2: $mListe2")

    // find gibt das erste element zurück, auf das der matcher passt
    println("find: ${mListe2.find { it < 4 }}")

    // indexOf sucht das element in der liste; suche geht von links nach rechts
    println("indexOf: ${mListe2.indexOf(4)}")

    // sucht auch von links nach rechts
    println("indexOf: ${mListe2.indexOfFirst { it == 4}} ")

    // sucht von rechts nach links
    println("indexOf: ${mListe2.indexOfLast { it == 4}} ")
}