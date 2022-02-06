package de.bembelnaut.udemy.kotlincourse.section9_best_practice

import java.time.LocalDate
import java.time.LocalTime
import java.time.LocalDateTime
import java.time.Month
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle

/**
 * Kotlin nutzt Java libs für Uhrzeit
 */
fun main() {

    val dateTime = LocalDateTime.now()
    println("DateTime $dateTime")

    val localDate = LocalDate.now()
    println("LocalDate $localDate")

    val time = LocalTime.now()
    println("LocalTime $time")

    val then = LocalDateTime.of(2022, Month.FEBRUARY, 3, 12,23, 45)
    println("then $then")

    println(then.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG, FormatStyle.SHORT)))
    println(then.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)))
    println(then.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)))
}