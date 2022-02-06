package de.bembelnaut.udemy.kotlincourse.section9_best_practice

import java.io.File

/**
 * Mit sehr großen und binären Dateien arbeiten
 */
fun main() {

    // Holt den Pfad einer Datei aus dem Resource-Ordner
    var filePath = FileFile::class.java.classLoader.getResource("Hello-World.txt");
    println(filePath)

    // Mit einem Stream wird nur ein kleiner Teil der Datei ausgelesen
    val inputStream = File(filePath.toURI()).inputStream()

    // Größe die ausgelesen werden soll
    val inputByte = ByteArray(5)

    // read liefert -1 zurück wenn der Stream am Ende ist.
    var read = inputStream.read(inputByte)
    while (read != -1) {
        // Das byteArry muss noch interpretiert werden
        println(inputByte.toString(Charsets.UTF_8))
        read = inputStream.read(inputByte)
    }

    // Das Ergebnis lautet:
    //    Hello
    //    Worl
    //    d!orl
    // Das "orl" am Ende der dritten Zeile entsteht dadurch, dass das ByteArray wiederverwendet wird, es aber nicht
    // geleert wird. Dadurch können alte Daten enthalten sein.

    // close nicht vergessen!
    inputStream.close()
}
