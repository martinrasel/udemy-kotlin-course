package de.bembelnaut.udemy.kotlincourse.section2

fun main() {

    var mString: String = "Hello World!"

    var x = mString.length

    myFirstLoopLabel@while (x >= 0) {
        x--

        for (char: Char in mString) {
            if(char == ' ') {
                 continue@myFirstLoopLabel
            }
            print(char)
        }
    }

}