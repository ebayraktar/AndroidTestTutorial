package com.example.androidtesttutorial.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.androidtesttutorial.utils.Calculator

class HomeViewModel : ViewModel() {
    private val _result = MutableLiveData<Double>()
    val result: LiveData<Double> = _result
    private val calculator by lazy { Calculator() }

    fun calculate(
        num1: Double,
        num2: Double,
    ) {
        val sum = calculator.sum(num1, num2)
        _result.postValue(sum)
    }

    fun isValid(
        text1: String,
        text2: String,
    ): Boolean {
        return text1.toDoubleOrNull() != null && text2.toDoubleOrNull() != null
    }
}
