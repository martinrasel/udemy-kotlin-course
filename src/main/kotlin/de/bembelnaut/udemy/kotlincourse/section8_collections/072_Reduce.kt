package de.bembelnaut.udemy.kotlincourse.section8_collections

/**
 * Listen-Operation: reduce
 */
fun main() {

    var mBasicList = listOf(0,4,1,2,3,4,5)
    println("mBasicList: $mBasicList")

    // Der "accu(mulator)" wird mit dem ersten Element der Liste initialiesiert.
    // Danach wird der neue Wert im Lambda berechnet und dem accu wieder zugewiesen.
    val reduced = mBasicList.reduce {
            acc, value -> acc + value
    }
    println("reduced: $reduced")

    // Hier startet das reduce von rechts nach links.
    // Achtung! Die Parameter im Lambda sind gedreht
    val reducedRight = mBasicList.reduceRight {
            value, acc -> acc - value
    }
    println("reducedRight: $reducedRight")
}