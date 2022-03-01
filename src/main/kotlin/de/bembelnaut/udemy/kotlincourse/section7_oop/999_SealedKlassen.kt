package de.bembelnaut.udemy.kotlincourse.section7_oop

import java.io.File
import javax.sql.DataSource


/**
 * Sealed classes and interfaces represent restricted class hierarchies that provide
 * more control over inheritance. All direct subclasses of a sealed class are known
 * at compile time.
 *
 * No other subclasses may appear after a **module** with the sealed class is compiled.
 *
 */
sealed interface Error

sealed class IOError: Error {

    // Ein Konstruktor einer Sealed Klasse ist entweder per default protected
    constructor() {
        /* */
    }

    // oder private
    private constructor(s: String): this() {
        /* */
    }

    open val message : String = "IO Error"
}

// Kann von Error erben
interface SubError: Error {
    fun print()
}

// Direkte SubKlassen müssen im gleichen Package sein
// Eine sealed Klasse ist abstrakt und kann nicht direkt instanziert werden.
class FileReadError(val f: File): IOError() {
    override val message: String = "Mööp: " + super.message


}

open class StringError(val string: String): IOError()

// Die Einschränkung der Vererbung geht bei indirekten SubKlassen verloren.
class MyStringError(string: String): StringError(string)

class DatabaseError: IOError()

object RuntimeError : Error

