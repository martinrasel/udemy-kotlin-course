package de.bembelnaut.udemy.kotlincourse.section13_oop_erweitert

/**
 * Enums mit anonymen Klassen
 */
fun main() {

    val operator = IntOperatoren.PLUS

    operator.print(1,32)
    println(operator.use(1, 32))

    val stringOperatoren = StringOperatoren.PRINT
    stringOperatoren.print("Foo Bar")
}

// Innerhalb des Enums kann man auch abstrakte Methoden definieren, die von den einzelnen Ausprägungen implementiert
// werden muss.
enum class IntOperatoren {
    // Am Ende der Aufzählung nicht das Semikolon vergessen!
    PLUS {
        override fun use(a: Int, b: Int): Int = a + b
        override fun print(a: Int, b: Int) {
            println("$a + $b = ${a+b}")
        }
    },
    MINUS {
        override fun use(a: Int, b: Int): Int = a - b
        override fun print(a: Int, b: Int) {
            println("$a - $b = ${a-b}")
        }
    };

    abstract fun use(a: Int, b: Int): Int
    abstract fun print(a: Int, b: Int)
}

// Man kann auch wie gehabt die Konstanten übergeben
enum class StringOperatoren(val string: String, val func: (String) -> String ) {
    PRINT("Hello World", { it.reversed() }) {
        override fun print(s: String) {
            println("Operator print: $string ${func(s)}")
        }
    };

    abstract fun print(s: String)
}