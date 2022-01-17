package de.bembelnaut.udemy.kotlincourse.section8

fun main() {

    var mListe2 = listOf(0,4,1,2,3,4,5)
    println("mListe2: $mListe2")

    // accu wird mit dem ersten element der liste initialiesiert. danach wird der neue wert berechnet und accu wieder assigned
    val reduced = mListe2.reduce {
            acc, value -> acc + value
    }
    println("reduced: $reduced")

    // achtung! parameter in lambda gedreht
    val reducedRight = mListe2.reduceRight {
            value, acc -> acc - value
    }
    println("reducedRight: $reducedRight")
}