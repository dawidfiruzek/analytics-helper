package pl.dawidfiruzek.analyticshelper

class AnalyticsHelperImpl(
        private val analyticsList: List<Analytics>
) : AnalyticsHelper {

    override fun logEvent(eventName: String, properties: List<UserProperty>?) {
        analyticsList.forEach {
            it.logEvent(eventName, properties)
        }
    }

    override fun logUserProperties(properties: List<UserProperty>) {
        analyticsList.forEach {
           it.logUserProperties(properties)
        }
    }
}
