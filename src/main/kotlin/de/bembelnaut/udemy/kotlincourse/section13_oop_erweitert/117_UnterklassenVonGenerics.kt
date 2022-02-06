package de.bembelnaut.udemy.kotlincourse.section13_oop_erweitert

/**
 * Unterklassen von Generics
 */
fun main() {

    var soup: Soup<Mushroom> = Soup(BigChampignon())
    // Wird aufgrund der Einschränkung, dass es Mushrooms sein müssen, nicht klappen.
    //add(soup, Onion())
    //soup.add(Onion())
    soup.run {
        prepare()
        eat()
    }

    var mixedSoup: Soup<Cuttable> = Soup(BigChampignon())
    // Bei mixedSoup wird es kein Problem geben, da die Soup Cuttables erlaubt
    add(mixedSoup, Onion())
    mixedSoup.add(Garic())
    with(mixedSoup) {
        prepare()
        eat()
    }
}

interface Cuttable {

    fun cut() {
        println("Cut something...")
    }
}

open class Mushroom: Cuttable {

    override fun cut() {
        println("Cut a mushroom...")
    }
}

class Onion: Cuttable {

    override fun cut() {
        println("Cut a onion...")
    }
}

class Garic: Cuttable {

    override fun cut() {
        println("Cut garlic...")
    }
}


class BigChampignon: Mushroom() {

    override fun cut() {
        println("Cut a big champignon...")
    }
}

class Soup<T: Cuttable>(ingredient: T) {
    val ingredients = mutableListOf<T>()
    var prepared = false

    init {
        ingredients.add(ingredient)
    }

    fun prepare() {
        ingredients.forEach {it.cut()}
        prepared = true
    }

    fun eat() {
        if (prepared) println("Yummi")
    }

    fun add(ingredient: T) {
        ingredients.add(ingredient)
    }
}

fun add(soup: Soup<Cuttable>, ingredient: Cuttable) = soup.ingredients.add(ingredient)
