package de.bembelnaut.udemy.kotlincourse.section7_oop_ausserhalb_sealed

import de.bembelnaut.udemy.kotlincourse.section7_oop.DatabaseError
import de.bembelnaut.udemy.kotlincourse.section7_oop.IOError
import de.bembelnaut.udemy.kotlincourse.section7_oop.StringError
import de.bembelnaut.udemy.kotlincourse.section7_oop.Error


fun main() {
    var error: Error = StringError("Hello Sealed Class")

    // Der else-Zweig wird bei Sealed Klassen nicht benötigt, wenn alle SubKlassen aufgelistet sind.
    when(error) {
        is StringError -> println("StringError")
        is DatabaseError -> println("DB Error")
        is IOError -> println("IOError")
        is Error -> println("Other Errors")
    }
}

// Fehler weil die Klasse nicht erweitert werden darf
// interface SubError: Error

// Fehler weil die Klasse nicht erweitert werden darf
// class MyOwnError: IOError()

// Die Einschränkung der Vererbung geht bei indirekten SubKlassen verloren.
class AnotherStringError(string: String): StringError(string)