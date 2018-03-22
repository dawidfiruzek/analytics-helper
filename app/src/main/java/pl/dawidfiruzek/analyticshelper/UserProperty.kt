package pl.dawidfiruzek.analyticshelper

import android.os.Bundle
import android.os.Parcelable
import java.io.Serializable

class UserProperty private constructor(
        val name: String,
        val value: Any
) {
    constructor(name: String, value: Boolean) : this(name, value as Any)
    constructor(name: String, value: BooleanArray) : this(name, value as Any)
    constructor(name: String, value: Bundle) : this(name, value as Any)
    constructor(name: String, value: Byte) : this(name, value as Any)
    constructor(name: String, value: ByteArray) : this(name, value as Any)
    constructor(name: String, value: Char) : this(name, value as Any)
    constructor(name: String, value: CharArray) : this(name, value as Any)
    constructor(name: String, value: CharSequence) : this(name, value as Any)
    constructor(name: String, value: Double) : this(name, value as Any)
    constructor(name: String, value: DoubleArray) : this(name, value as Any)
    constructor(name: String, value: Float) : this(name, value as Any)
    constructor(name: String, value: FloatArray) : this(name, value as Any)
    constructor(name: String, value: Int) : this(name, value as Any)
    constructor(name: String, value: IntArray) : this(name, value as Any)
    constructor(name: String, value: Long) : this(name, value as Any)
    constructor(name: String, value: LongArray) : this(name, value as Any)
    constructor(name: String, value: Parcelable) : this(name, value as Any)
    constructor(name: String, value: Serializable) : this(name, value as Any)
    constructor(name: String, value: Short) : this(name, value as Any)
    constructor(name: String, value: ShortArray) : this(name, value as Any)
    constructor(name: String, value: String) : this(name, value as Any)
}
