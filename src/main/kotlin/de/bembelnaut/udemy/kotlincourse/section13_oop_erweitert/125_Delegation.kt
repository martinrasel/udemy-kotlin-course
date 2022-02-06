package de.bembelnaut.udemy.kotlincourse.section13_oop_erweitert

/**
 * Delegation Pattern wird von Kotlin nativ unterstützt. Es muss dabei kein Boilerplate Code erstellt.
 */
fun main() {

    val interImpl = InterImpl(42)
    val interStringImpl = InterStringImpl("Hello World!")

    val interList: List<Inter> = listOf(interImpl, interStringImpl)

    for (i in interList) {
        println("------------------------------")
        val delegate = Delegato(i)
        delegate.print()
        delegate.display()
    }

}

// Das Delegate erhält alle Attribute und Funktionen von dem übergebenen Interface bzw. von dessen Implementierung
// Das by zeigt dem Compiler an, dass das übergebene Objekt intern als ein Delegate-Objekt gespeichert werden.
class Delegato(private val ins: Inter): Inter by ins {

    // Man kann auch die Attribute und Methoden des übergebenen Interface überschreiben
    override var y: Int = 42

    override fun display() {
        println("Delegato Preprocessing...")
        ins.display()
        println("Delegato Postprocessing...")
    }
}

interface Inter {
    var y: Int

    fun display()
    fun print()
}

class InterStringImpl(val x: String): Inter {
    override var y: Int = 10

    override fun display() {
        println("InterStringImpl: $x")
    }

    override fun print() {
        println("Print $x")
    }
}

class InterImpl(val x: Int): Inter {
    override var y: Int = 12

    override fun display() {
        println("InterImpl: $x")
    }

    override fun print() {
        println("Print $x")
    }
}