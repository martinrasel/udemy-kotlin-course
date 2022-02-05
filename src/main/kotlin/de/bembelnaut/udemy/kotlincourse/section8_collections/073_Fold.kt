package de.bembelnaut.udemy.kotlincourse.section8_collections

/**
 * Listen-Operator: Flod
 */
fun main() {

    var mBasicList = listOf(0,4,1,2,3,4,5)
    println("mBasicList: $mBasicList")

    // fold ist wie reduce, aber der initiale Wert wird übergeben
    val folded = mBasicList.fold(42) {
        accu, value -> accu - value
    }
    println("folded: $folded")

    // Auch hier kann man von rechts nach links die Liste durchlaufen.
    // Achtung! Die Parameter im Lambda sind gedreht
    val foldedRight = mBasicList.foldRight(42) {
            value, accu -> accu - value
    }
    println("foldedRight: $foldedRight")

    // Falls man noch einen Index benötigt, gibt es die passende Mathode...
    val foldedIndexed = mBasicList.foldIndexed(42) {
            index, accu, value -> if (index % 2 == 0) accu - value else 100
    }
    println("foldedIndexed: $foldedIndexed")
}