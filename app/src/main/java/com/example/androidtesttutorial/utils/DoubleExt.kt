package com.example.androidtesttutorial.utils

import java.util.Locale

/**
 * Created by eBayraktar on 22.02.2024.
 */

fun Double.pretty(): String {
    return String.format(Locale.getDefault(), "%.2f", this)
}
