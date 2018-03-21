package pl.dawidfiruzek.analyticshelper

interface Analytics {
    fun logEvent(eventName: String, properties: List<UserProperty>? = null)
    fun logUserProperties(properties: List<UserProperty>)
}
