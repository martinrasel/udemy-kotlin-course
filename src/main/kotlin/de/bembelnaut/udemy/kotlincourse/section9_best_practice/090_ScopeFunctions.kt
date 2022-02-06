package de.bembelnaut.udemy.kotlincourse.section9_best_practice

/**
 * Scoped Functions: run, with, let, also und apply
 */
fun main() {
    println("----------run------------")
    // run ist eine inline Function
    var mString = "Hello world!"
    var runResult = run {
        // run hat seinen eigenen Scope. Das var mString wird von dem val mString überschrieben.
        val mString = "Hiho"
        println(mString)
        // Das Lambda kann eine Rückgabe erzeugen.
        12
    }
    println(mString)
    println("Result von run $runResult")

    println("----------T.run------------")
    // Hier ist run eine Extension Function. In dem Lambda kann mit this auf das Objekt zugegriffen werden.
    var user = User("hans", "wurst")
    runResult = user.run {
        // this == user-Objekt
        println("Username: $name")
        println("Password: $password")

        // Auch hier kann das Lambda eine Rückgabe liefern
        42
    }

    println("----------with------------")
    // with ist ähnlich wie run. Es ist aber kein Extension Function. Das Objekt und das Lambda werden
    // als Parameter übergeben.
    runResult = with(user) {
        // auch hier ist this == user-Objekt
        println("Username: $name")
        println("Password: $password")

        // Auch hier kann ein Rückgabe erzeugt werden
        23
    }

    // Laut Kotlin-Doku liegt der Unterschied zwischen with und run in der Definition. Das eine ist eine
    // Extension Function, das andere nicht.
    // Sie empfehlen aber deren Einsatz wie folgt:
    // run: is useful when your lambda contains both the object initialization and the computation of the return value.
    // with: for calling functions on the context object without providing the lambda result. "with this object, do the following."

    println("----------let------------")
    // Let ist eine weitere Extension Function. Sie ähnelt sehr run mit dem Unterschied, dass dem Lambda das this-Objekt
    // als Parameter übergeben wird. Daher ist der Zugriff hier mit it und nicht mit this.
    user.let {
        println("Username: ${it.name}")
        println("Password: ${it.password}")

        // Auch hier kann ein Rückgabe erzeugt werden
        23
    }

    println("----------apply------------")
    // Apply ist eine Extension Function, die dafür genutzt wird, um ein Objekt zu initialisieren. Der Rückgabewert
    // ist wieder das Objekt.
    var user2 = User().apply {
        name = "Hase"
        password = "FooBar"
    }.also {
        it.printName()
    }

    println("----------also------------")
    // Also führt einen Lambda Block mit dem Objekt aus. Der Rückgabewert ist das Objekt selbst
    mString = "Hello World!"
    var innerResult = ""
    var resultString = mString.also {
        println(it)
        innerResult = it.reversed()
    }
    println("Return of also: $resultString")
    println("Assignment in also: $innerResult")
}

class User() {
    var name = ""
    var password = ""

    constructor(name: String, password: String): this() {
        this.name = name
        this.password = password
    }

    fun printName() {
        println("Pssst... $name")
    }
}