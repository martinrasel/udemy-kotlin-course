package de.bembelnaut.udemy.kotlincourse.section12_funktionale_erweitert

/**
 * Funktionen höhrerer Ordnung
 */
fun main() {

    // Eine high order function erhält als Paramenter ein Lambda.
    higherOrderFunc( { a: Double, b:Double -> (a + b).toInt() }, 42)

    // Hat das Lambda keinen Rückgabewert hat, dann muss es Unit sein
    var noReturn: (a: Int, b: Int) -> Unit = { a, b ->
        println("Hello $a und $b")
    }
    noReturn(23, 42)

    // Hat das Lambda keine Paramenter, dann muss es () sein
    var noParam: () -> Unit = {
        println("Hello")
    }
    noParam()

    // Man kann auch eine Funtion zurückgeben
    var funcResult: () -> ((a: Int, b: Int) -> Unit) = {
        {a, b -> println("Hi $a und $b") }
    }
    funcResult()(12,23)
}

// Die Funktion definiert die Signatur des Lambdas.
fun higherOrderFunc(func: (a: Double, b: Double) -> Int, c: Int) {

    // Innerhalb kann das Lambda einfach ausgeführt werden.
    val res = func(100.0, 23.0) + c

    println("Result $res")
}