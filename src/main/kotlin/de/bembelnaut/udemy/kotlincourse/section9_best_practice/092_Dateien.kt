package de.bembelnaut.udemy.kotlincourse.section9_best_practice

import java.io.File

/**
 * Dateien lesen und schreiben
 */
fun main() {

    // Holt den Pfad einer Datei aus dem Resource-Ordner
    var filePath = FileFile::class.java.classLoader.getResource("Hello-World.txt");
    println(filePath)

    println("Liest Datei in UTF-8 aus")
    File(filePath.toURI()).forEachLine {
        println(it)
    }

    println("Liest Datei in UTF-16 aus")
    File(filePath.toURI()).forEachLine(Charsets.UTF_16) {
        println(it)
    }

    // Datei schreiben
    // Die Datei liegt im Projekt Root...
    var newFile = File("Temp.txt")
    // WriteText löscht alles in der Datei
    newFile.writeText("Hello")
    // Ergänzt etwas am Ender der Datei
    newFile.appendText(" World!")

    File(newFile.toURI()).forEachLine(Charsets.US_ASCII) {
        println(it)
    }

    // Löschen
    newFile.delete()
}

class FileFile