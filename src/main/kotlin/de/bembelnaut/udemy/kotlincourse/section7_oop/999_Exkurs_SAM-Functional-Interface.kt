package de.bembelnaut.udemy.kotlincourse.section7_oop

/**
 * Exkurs: SAM
 */
fun main() {

    // mit dem SAM kann nun gearbeitet werden
    val longTransformer = LongTransformer { it > 0 }
    println("Hello World ${longTransformer.accept(7)}")

    val intTransformer = IntTransformer()
    println("IntTransformer ${intTransformer.invoke(3)}")
    println("IntTransformer ${intTransformer(5)}")

    // SAMs können als Parameter übergeben werden.
    val myMathUtil = MyMathUtil(5)
    myMathUtil.printMe(longTransformer)
    myMathUtil.printMe { it > 4 }

    myMathUtil.printMe(intTransformer)
}

class MyMathUtil(var n: Int) {

    fun printMe(longTransformer: LongTransformer) {
        println("Hello World ${longTransformer.accept(n.toLong())}")
    }

    fun printMe(intTransformer: IntTransformer) {
        println("IntTransformer ${intTransformer(n)}")
    }
}

// SAM-Interface ist ein funktionales Interface (Single Abstract Method) mit nur einer abstrakten Methode
fun interface LongTransformer {
  fun accept(l: Long): Boolean
}

// Eine Klasse kann auch eine Lambda Funktion implementieren. Diese muss dann die invoke-Funktion überschreiben.
class IntTransformer: (Int) -> Int {
    // Die Klasse kann dann auch einen Zustand haben
    var lastValue: Int? = null

    // die Methode invoke() muss dann überschrieben werden.
    override fun invoke(p1: Int): Int {
        println("Input $p1")
        println("Last value ${lastValue ?: lastValue}")
        println("-------------")
        lastValue = p1
        return p1 * 2
    }
}

