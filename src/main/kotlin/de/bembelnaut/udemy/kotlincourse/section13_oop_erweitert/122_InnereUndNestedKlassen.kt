package de.bembelnaut.udemy.kotlincourse.section13_oop_erweitert

/**
 * Innere und Nested Klassen
 */
fun main() {

    // Die Nested Klasse kann man über die äussere Klasse erreichen
    println(Outside.Nested().bar())

    val out = Outside(42)
    // Aber nicht über eine Referenz der äusseren Klasse
    // println(out.Nested())

    // Der Zugriff auf die innere Klasse muss über die Instanz laufen
    println(out.Inner().bar())

    // Wann wird welche Klasse benutzt?
    // Nested: Um logische Struktierung vorzunehmen, die von einander unabhängig existieren können
    // Innere: Wenn es sich um Strukturen handelt, die eine äussere instanzierte Hülle benötigen
    // Beispiel für innere: Eine Klasse PC, die z.b. eine SubSysteme (Grafikkarte, Festplatte, Mainboard,...) haben.
}


class Outside(myFoo: Int) {

    private val foo: Int = myFoo

    // Nested Klassen sind unabhängige Klassen
    class Nested {
        // Zugriff auf Outside.foo ist nicht möglich
        // fun bar() = foo

        fun bar() = 1234
    }

    // Innere Klassen benötigen die Instanz der äusseren Klasse und können dann auch
    // auf Attribute zugreifen.
    inner class Inner {
        // Bei inneren Klassen ist der Zugriff auf foo möglich
        fun bar() = foo
    }
}
