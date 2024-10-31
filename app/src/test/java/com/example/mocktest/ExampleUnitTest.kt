package com.example.mocktest

import android.app.Application
import io.mockk.clearAllMocks
import io.mockk.mockk
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(RobolectricTestRunner::class)
@Config(instrumentedPackages = ["androidx.loader.content"], application = Application::class)
class ExampleUnitTest {
    @Test
    fun `test 1`() {
        val onFeedBackCardClicked = mockk<() -> Unit>(relaxed = true)
    }

    @Test
    @GraphicsMode(GraphicsMode.Mode.NATIVE)
    fun `test 2`() {
        val onSubmitFeedback: () -> Unit = mockk(relaxed = true)
    }
}