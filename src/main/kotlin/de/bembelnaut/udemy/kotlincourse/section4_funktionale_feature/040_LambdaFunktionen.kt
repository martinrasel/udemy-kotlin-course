package de.bembelnaut.udemy.kotlincourse.section4_funktionale_feature

/**
 * Lambda-Funktionen
 */
fun main() {

    // a und b sind Lambda-Variablen
    // Under-The-Hood wird hier eine Klasse Function erstellt, initialiesiert und aufgerufen
    // Diese hat eine Methode "invoke()", mit der der Inhalt aufgerufen wird.
    val lambdaMe = {a: Int, b: Int -> a+b}
    println(lambdaMe(2, 3))

    // Das Lambda kann auch keine Parameter haben
    val lambda2: () -> Unit = {  println("Hello") }
    lambda2.invoke()
    // oder...
    lambda2()

    // Ist der letzte Parameter einer Funktion ein Lambda, kann das Lambda rausgezogen werden.
    println(addMe(2) {1+2})

    println(5.foo(10) { a, b -> a * b })
}

//fun addMe(n: Int, b: () -> Int): Int = (n + b.invoke())
// invoke() ist die Methode der Klasse Function
fun addMe(n: Int, b: () -> Int): Int = (n + b())

fun Int.foo(n: Int, function: (a: Int, b: Int) -> Int): Int {
    return function(this, n)
}
