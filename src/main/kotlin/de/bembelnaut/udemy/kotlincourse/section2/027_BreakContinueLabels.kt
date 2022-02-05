package de.bembelnaut.udemy.kotlincourse.section2

/**
 * Labels für Schleifen und den Schleifen-Funktionen break und continue
 */
fun main() {

    var mString: String = "Hello World!"

    var x = mString.length

    // Schleifen können ein Lable erhalten. Damit sind sie von verschachtelten Scheifen erreichbar
    myFirstLoopLabel@while (x >= 0) {
        x--

        blabla@for (char: Char in mString) {
            if(char == ' ') {
                // Ein continue würde normalerweise auf die äußere for-Schleife wirken.
                continue@myFirstLoopLabel
            }
            print(char)

            break@myFirstLoopLabel
        }
    }

}