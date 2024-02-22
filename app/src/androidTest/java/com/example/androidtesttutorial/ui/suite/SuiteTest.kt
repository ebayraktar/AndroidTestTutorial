package com.example.androidtesttutorial.ui.suite

import com.example.androidtesttutorial.ui.home.HomeFragmentTest
import com.example.androidtesttutorial.ui.notifications.NotificationsFragmentTest
import org.junit.runner.RunWith
import org.junit.runners.Suite
import org.junit.runners.Suite.SuiteClasses

/**
 * Created by eBayraktar on 22.02.2024.
 */
@RunWith(Suite::class)
@SuiteClasses(
    NotificationsFragmentTest::class,
    HomeFragmentTest::class,
)
class SuiteTest
