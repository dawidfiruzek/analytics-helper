package pl.dawidfiruzek.analyticshelper.defaults

import com.google.firebase.analytics.FirebaseAnalytics
import pl.dawidfiruzek.analyticshelper.Analytics
import pl.dawidfiruzek.analyticshelper.UserProperty
import pl.dawidfiruzek.analyticshelper.toBundle

class FirebaseAnalytics(
        private val firebaseAnalytics: FirebaseAnalytics
) : Analytics {

    override fun logEvent(eventName: String, properties: List<UserProperty>?) {
        firebaseAnalytics.logEvent(eventName, properties?.toBundle())
    }

    override fun logUserProperties(properties: List<UserProperty>) {
        properties.forEach {
            firebaseAnalytics.setUserProperty(it.name, it.value.toString())
        }
    }
}
