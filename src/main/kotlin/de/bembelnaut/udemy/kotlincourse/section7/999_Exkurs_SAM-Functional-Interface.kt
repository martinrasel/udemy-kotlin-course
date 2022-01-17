package de.bembelnaut.udemy.kotlincourse.section7

// SAM-Interface ist ein funktionales Interface (Single Abstract Method)
fun interface LongTransformer {
  fun accept(l: Long): Boolean
}

// Oder als Klasse, die ein SAM-Interface implementiert
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

fun main() {

    // mit dem SAM kann nun gearbeitet werden
    val longTransformer = LongTransformer { it > 0 }
    println("Hello World ${longTransformer.accept(7)}")

    val intTransformer = IntTransformer()
    println("IntTransformer ${intTransformer.invoke(3)}")
    println("IntTransformer ${intTransformer.invoke(5)}")
}