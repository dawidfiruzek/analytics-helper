package pl.dawidfiruzek.analyticshelper

import org.junit.After
import org.junit.Before
import org.mockito.MockitoAnnotations

abstract class BaseTest {

    @Before
    open fun setup() {
        MockitoAnnotations.initMocks(this)
    }

    @After
    open fun tearDown() = Unit
}