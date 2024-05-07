package com.example.tamagochiapp

class My unit test {
        import androidx.test.core.app.ActivityScenario
            import androidx.test.espresso.Espresso.onView
            import androidx.test.espresso.action.ViewActions.click
            import androidx.test.espresso.assertion.ViewAssertions.matches
            import androidx.test.espresso.matcher.ViewMatchers.*
            import androidx.test.ext.junit.runners.AndroidJUnit4
            import org.junit.After
            import org.junit.Before
            import org.junit.Test
            import org.junit.runner.RunWith

            @RunWith(AndroidJUnit4::class)
            class TamagochiAppMainTest {

                @Before
                fun setUp() {
                    ActivityScenario.launch(TamagochiAppMain::class.java)
                }

                @After
                fun tearDown() {
                    // Clean up after each test if needed
                }

                @Test
                fun testResetMeterValues() {
                    // Click the feed button
                    onView(withId(R.id.feed)).perform(click())

                    // Verify that the food ImageView is visible
                    onView(withId(R.id.food)).check(matches(isDisplayed()))

                    // Click the dirt button
                    onView(withId(R.id.dirt)).perform(click())

                    // Verify that the soap ImageView is visible
                    onView(withId(R.id.soap)).check(matches(isDisplayed()))

                    // Click the pet button
                    onView(withId(R.id.pet)).perform(click())

                    // Verify that the hand ImageView is visible
                    onView(withId(R.id.hand)).check(matches(isDisplayed()))

                    // Wait for the countdown to finish (assuming it's running in a separate thread)
                    Thread.sleep(3000)

                    // Verify that the meters are reset to their initial values
                    onView(withId(R.id.hungerMeter)).check(matches(withText("10")))
                    onView(withId(R.id.happyMeter)).check(matches(withText("10")))
                    onView(withId(R.id.dirtMeter)).check(matches(withText("10")))
                }
            }
}