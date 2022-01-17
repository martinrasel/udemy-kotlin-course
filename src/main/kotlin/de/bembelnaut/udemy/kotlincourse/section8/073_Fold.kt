package de.bembelnaut.udemy.kotlincourse.section8

fun main() {

    var mListe2 = listOf(0,4,1,2,3,4,5)
    println("mListe2: $mListe2")

    // fold ist wie reduce, aber der initiale wert kann dem accu übergeben
    val folded = mListe2.fold(42) {
        accu, value -> accu - value
    }
    println("folded: $folded")

    // achtung! parameter in lambda gedreht
    val foldedRight = mListe2.foldRight(42) {
            value, accu -> accu - value
    }
    println("foldedRight: $foldedRight")

    // hier wäre ein beispiel gut...
    val foldedIndexed = mListe2.foldIndexed(42) {
            index, accu, value -> accu - value
    }
    println("foldedIndexed: $foldedIndexed")
}