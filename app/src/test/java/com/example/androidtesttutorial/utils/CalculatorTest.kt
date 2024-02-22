package com.example.androidtesttutorial.utils

import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test

/**
 * Created by eBayraktar on 22.02.2024.
 */
class CalculatorTest {
    private lateinit var calculator: Calculator

    @Before
    fun setUp() {
        calculator = Calculator()
    }

    @Test
    fun sum() {
        val result = calculator.sum(1.0, 2.0)
        assertThat(result).isEqualTo(3)
    }

    @Test
    fun sub() {
        val result = calculator.sub(1.0, 2.0)
        assertThat(result).isEqualTo(-1)
    }
}
