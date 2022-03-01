package de.bembelnaut.udemy.kotlincourse.section13_oop_erweitert


/**
 * Exkurs
 */
fun main() {

    // Auch eine Compainion Objekt kann mit einer Extension Function erweitert werden.
    MyObject.doSomething()

    // Host wurde innerhalb der Klasse Connection erweitert.
    Connection(Host("kotl.in"), 443).connect()
    //Host("kotl.in").printConnectionString()  // error, the extension function is unavailable outside Connection

    AdvCon(Host("kotl.in"), 443).connect()
}

class MyObject {
    companion object {
        var int: Int = 42
    }
}

fun MyObject.Companion.doSomething() {
    println("Hello int, $int!")
}

// Extenstions können auch nur innerhalb einer Klasse als member definiert werden. Sie sind dann nicht von ausserhalb
// erreichbar.
class Host(val hostname: String) {
    fun printHostname() { print(hostname) }
}

open class Connection(val host: Host, val port: Int) {
    fun printPort() { print(port) }

    fun Host.printConnectionString() {
        printHostname()   // calls Host.printHostname()
        print(":")
        printPort()   // calls Connection.printPort()
    }

    // Die Extension kann auch in Subklassen erweitert werden.
    open fun Host.printAdvancedConnectionString() {
        // Bei einem Namenskonflikt, kann der Qualifier this benutzt werden.

        // calls Host.toString()
        toString()

        // calls Connection.toString()
        this@Connection.toString()
    }

    fun connect() {
        /*...*/
        host.printConnectionString()   // calls the extension function
    }
}

class AdvCon(host: Host, port: Int): Connection(host, port) {
    override fun Host.printAdvancedConnectionString() {
        println("Bääm!")
    }

}