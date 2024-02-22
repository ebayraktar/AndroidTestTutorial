package com.example.androidtesttutorial.ui.notifications

import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.swipeUp
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.example.androidtesttutorial.R
import org.junit.Test

/**
 * Created by eBayraktar on 22.02.2024.
 */
class NotificationsFragmentTest {
    @Test
    fun testNotificationTVisDisplayed() {
        val scenario = launchFragmentInContainer<NotificationsFragment>()
        onView(withId(R.id.scrollView)).perform(swipeUp())
        onView(withId(R.id.text_notifications)).check(matches(isDisplayed()))
    }
}
