package de.bembelnaut.udemy.kotlincourse.section8

fun main() {

    var mArray = arrayOf(1,2,5)
    var mListOfString = listOf<String>("hi", "he")

    println(mArray)
    println(mListOfString)

    // unterschied von array zu listen:
    // array hat feste größe (bei vergrößern muss das array gelöscht und vergrößert werden), liste benutzt zeiter (vergrößern ganz einfach)
    // array ist schneller im zugriff als liste
    // je nach benutzung empfiehlt der eine oder andere typ

    // listen sind immutable. hier wird nach dem einfügen eine neue liste erstellt und der variable zugewiesen
    mListOfString += "Bla"
    println(mListOfString)

    println("Speicherpos1: $mArray")
    mArray += 3
    println("Speicherpos2: $mArray")
}