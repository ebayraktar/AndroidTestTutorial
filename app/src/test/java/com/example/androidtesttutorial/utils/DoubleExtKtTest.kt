package com.example.androidtesttutorial.utils

import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Test
import java.util.Locale

/**
 * Created by eBayraktar on 22.02.2024.
 */
class DoubleExtKtTest {
    @Test
    fun `test 0 value is pretty`() {
        val result = 0.0.pretty()
        assertThat(result).isEqualTo("0.00")
    }

    @Test
    fun `test negative value is pretty`() {
        val result = (-1.0).pretty()
        assertThat(result).isEqualTo("-1.00")
    }

    @Test
    fun `test positive value is pretty`() {
        val result = 1.0.pretty()
        assertThat(result).isEqualTo("1.00")
    }

    @Test
    fun `test fractional value is pretty`() {
        val result = 0.01.pretty()
        assertThat(result).isEqualTo("0.01")
    }

    @Test
    fun `test arabic number is pretty`() {
        Locale.setDefault(Locale.forLanguageTag("ar"))
        val result = 1000.0.pretty()
        assertThat(result).isEqualTo("١٠٠٠٫٠٠")
    }

    @After
    fun tearDown() {
        Locale.setDefault(Locale.ENGLISH)
    }
}
