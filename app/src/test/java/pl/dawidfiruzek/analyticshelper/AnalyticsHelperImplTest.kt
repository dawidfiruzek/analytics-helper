package pl.dawidfiruzek.analyticshelper

import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.times
import org.mockito.Mockito.verify
import org.mockito.Mockito.verifyNoMoreInteractions

class AnalyticsHelperImplTest : BaseTest() {

    @Mock
    private lateinit var analytics: Analytics

    @Mock
    private lateinit var userProperty: UserProperty

    private lateinit var helper: AnalyticsHelper

    override fun setup() {
        super.setup()
        helper = AnalyticsHelperImpl(listOf(analytics))
    }

    override fun tearDown() {
        super.tearDown()
        verifyNoMoreInteractions(
                analytics,
                userProperty
        )
    }

    @Test
    fun `should call logEvent for each analytics when logEvent is called`() {
        val eventName = "eventName"

        helper.logEvent(eventName)

        verify(analytics, times(1)).logEvent(eventName)
    }

    @Test
    fun `should call logEvent with properties for each analytics when logEvent is called`() {
        val eventName = "eventName"
        val properties = listOf(userProperty)

        helper.logEvent(eventName, properties)

        verify(analytics, times(1)).logEvent(eventName, properties)
    }

    @Test
    fun `should call logUserProperties for each analytics when logUserProperties is called`() {
        val properties = listOf(userProperty)

        helper.logUserProperties(properties)

        verify(analytics, times(1)).logUserProperties(properties)
    }
}