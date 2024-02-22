package com.example.androidtesttutorial.ui.home

import androidx.fragment.app.testing.FragmentScenario
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.androidtesttutorial.R
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Created by eBayraktar on 22.02.2024.
 */
@RunWith(AndroidJUnit4::class)
class HomeFragmentTest {
    private lateinit var scenario: FragmentScenario<HomeFragment>

    @Before
    fun setUp() {
        scenario = launchFragmentInContainer<HomeFragment>()
    }

    @Test
    fun testUIElementsAreDisplayed() {
        onView(withId(R.id.firstET)).check(matches(isDisplayed()))
        onView(withId(R.id.secondET)).check(matches(isDisplayed()))
        onView(withId(R.id.resultTV)).check(matches(isDisplayed()))
        onView(withId(R.id.calculateBtn)).check(matches(isDisplayed()))
    }

    @Test
    fun testEditTextWorksProperly() {
        onView(withId(R.id.firstET)).perform(typeText("1"))
        onView(withId(R.id.secondET)).perform(typeText("2"))

        onView(withId(R.id.firstET)).check(matches(withText("1")))
        onView(withId(R.id.secondET)).check(matches(withText("2")))
    }

    // todo: testResultIsCorrect
    // todo: testInvalidDataEntry
    // todo: testInvalidInput
}
