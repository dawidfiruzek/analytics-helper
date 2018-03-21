package pl.dawidfiruzek.analyticshelper.defaults

import com.crashlytics.android.answers.Answers
import com.crashlytics.android.answers.CustomEvent
import pl.dawidfiruzek.analyticshelper.Analytics
import pl.dawidfiruzek.analyticshelper.UserProperty

class FabricAnalytics(
        private val answers: Answers
) : Analytics {

    override fun logEvent(eventName: String, properties: List<UserProperty>?) {
        val customEvent = CustomEvent(eventName)

        properties?.forEach {
            val key = it.name
            val value = it.value
            when (value) {
                is Number -> customEvent.putCustomAttribute(key, value)
                else -> customEvent.putCustomAttribute(key, value.toString())
            }
        }
        answers.logCustom(customEvent)
    }

    override fun logUserProperties(properties: List<UserProperty>) = Unit //not supported
}
