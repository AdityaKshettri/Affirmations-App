package com.aditya.project

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class AffirmationsTest {

    @get:Rule
    val activity = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun scroll_to_item() {
        // Given
        // When
        onView(withId(R.id.recycler_view)).perform(
            RecyclerViewActions
                .scrollToPosition<RecyclerView.ViewHolder>(9)
        )
        // Then
        onView(withText(R.string.affirmation10))
            .check(matches(isDisplayed()))
    }
}