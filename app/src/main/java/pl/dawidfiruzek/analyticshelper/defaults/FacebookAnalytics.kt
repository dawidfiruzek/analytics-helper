package pl.dawidfiruzek.analyticshelper.defaults

import com.facebook.appevents.AppEventsLogger
import pl.dawidfiruzek.analyticshelper.Analytics
import pl.dawidfiruzek.analyticshelper.UserProperty
import pl.dawidfiruzek.analyticshelper.toBundle

class FacebookAnalytics(
        private val appEventsLogger: AppEventsLogger
) : Analytics {

    override fun logEvent(eventName: String, properties: List<UserProperty>?) {
        properties?.let {
            appEventsLogger.logEvent(eventName, properties.toBundle())
        } ?: appEventsLogger.logEvent(eventName)
    }

    override fun logUserProperties(properties: List<UserProperty>) {
        AppEventsLogger.updateUserProperties(properties.toBundle(), null)
    }
}
