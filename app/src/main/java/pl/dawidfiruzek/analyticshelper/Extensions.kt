package pl.dawidfiruzek.analyticshelper

import android.os.Bundle
import android.os.Parcelable
import org.json.JSONObject
import java.io.Serializable

internal fun List<UserProperty>.toJsonObject(): JSONObject =
        JSONObject(
                map {
                        it.name to it.value
                }.toMap()
        )

internal fun List<UserProperty>.toBundle(): Bundle {
    val bundle = Bundle()
    forEach {
        bundle.put(it.name, it.value)
    }
    return bundle
}

internal fun Bundle.put(key: String, value: Any) {
    when (value) {
        is Boolean -> putBoolean(key, value)
        is BooleanArray -> putBooleanArray(key, value)
        is Bundle -> putBundle(key, value)
        is Byte -> putByte(key, value)
        is ByteArray -> putByteArray(key, value)
        is Char -> putChar(key, value)
        is CharArray -> putCharArray(key, value)
        is CharSequence -> putCharSequence(key, value)
        is Double -> putDouble(key, value)
        is DoubleArray -> putDoubleArray(key, value)
        is Float -> putFloat(key, value)
        is FloatArray -> putFloatArray(key, value)
        is Int -> putInt(key, value)
        is IntArray -> putIntArray(key, value)
        is Long -> putLong(key, value)
        is LongArray -> putLongArray(key, value)
        is Parcelable -> putParcelable(key, value)
        is Serializable -> putSerializable(key, value)
        is Short -> putShort(key, value)
        is ShortArray -> putShortArray(key, value)
        is String -> putString(key, value)
        else -> throw IllegalArgumentException("Illegal type of value argument!")
    }
}
