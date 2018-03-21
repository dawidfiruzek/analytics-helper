package pl.dawidfiruzek.analyticshelper.defaults

import com.amplitude.api.AmplitudeClient
import pl.dawidfiruzek.analyticshelper.Analytics
import pl.dawidfiruzek.analyticshelper.UserProperty
import pl.dawidfiruzek.analyticshelper.toJsonObject

class AmplitudeAnalytics(
        private val amplitudeClient: AmplitudeClient
) : Analytics {

    override fun logEvent(eventName: String, properties: List<UserProperty>?) {
        properties?.let {
            amplitudeClient.logEvent(eventName, it.toJsonObject())
        } ?: amplitudeClient.logEvent(eventName)
    }

    override fun logUserProperties(properties: List<UserProperty>) {
        amplitudeClient.setUserProperties(properties.toJsonObject())
    }
}
