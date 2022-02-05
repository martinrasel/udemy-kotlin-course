package de.bembelnaut.udemy.kotlincourse.section1_grundlagen

/**
 * Strings
 */
fun main() {
    val myString: String = "Hello World"

    println(myString)

    /*
    Trippel-Quotet Strings
    TQS behalten erlauben einen formatierten mehrzeiligen String im Code zu erstellen.
    Mit trimIntent werden alle Leerzeichen vor den Strings entfernt.
    Dabei gibt das erste Zeichen an, wo die erste Spalte beginnt.
    Hier im Beispiel: 1. Zeile das ">"
    Zeile 2 und 3 orentieren sich nun an diesem Zeichen und entfernen alle Leerzeichen davor.
    */
    var mString: String = """
    > haha...
         > das ist wirklich
        > lustig!!
    """.trimIndent()

    println(mString)

    /*
    Mit trimMargin legt man das erste Zeichen fest, bis wo die Leerzeichen entfernt werden können.
     */
    mString = """
    > haha....
           > das ist wirklich
        >        lustig!! <-- Achtung: hier werden nur die Leerzeichen vor dem marginPrefix entfernt
    """.trimMargin(">")

    println(mString)
}