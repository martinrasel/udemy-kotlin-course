package de.bembelnaut.udemy.kotlincourse.section11_testen

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import kotlin.test.AfterTest
import kotlin.test.BeforeTest

/**
 *
 */
internal class UtlimateMathTest {
    lateinit var toTest : UtlimateMath

    @BeforeTest
    fun setup() {
        toTest = UtlimateMath()
    }

    @AfterTest
    fun tearDown() {
        println("Ende")
    }

    @Test
    fun add100() {
        assertEquals(101, toTest.add100(1))
    }
}