# Analytics Helper
Analytics Helper is an Android library that helps log analytics' events and properties.

With library there are couple of default `Analytics` implementations, wchich are: `AmplitudeAnalytics`, `FabricAnalytics`, `FacebookAnalytics` and `FirebaseAnalytics`. 

You can also create your own implementation of `Analytics` class and pass it to `AnalyticsHelper`

Analytics Helper is written in Kotlin, so it can interop with Java. 

## Usage
### 1. Add gradle dependency
```
compile 'pl.dawidfiruzek:analytics-helper:1.0'
```

### 2. Use it in your project
To use Analytics Helper in your project you have to create `AnalyticsHelper` implementation object.
With library there is provided `AnalyticsHelperImpl`, which you can use to get default library behavior. 

To use it, you have to provide list of `Analytics` as a constructor's parameter. 

```Kotlin
val analyticsList: List<Analytics> = listOf(
    AmplitudeAnalytics(amplitudeClient),
    FabricAnalytics(answers),
    FacebookAnalytics(appEventsLogger),
    FirebaseAnalytics(firebaseAnalytics)
)
val analyticsHelper: AnalyticsHelper = AnalyticsHelperImpl(analyticsList)
```
After creating `AnalyticsHelper` object, you can use it in your code in couple of ways:
#### 1. Log event with it's name 
```Kotlin
analyticsHelper.logEvent("New event name")
```
#### 2. Log event with it's name and user properties
```Kotlin
val userProperties: List<UserProperty> = listOf(UserProperty("Property Name", "Property Value"))
analyticsHelper.logEvent("New event name", userProperties)
```
#### 3. Log user properties
```Kotlin
val userProperties: List<UserProperty> = listOf(UserProperty("Property Name", "Property Value"))
analyticsHelper.logUserProperties(userProperties)
```
After that, event or properties will be logged to all provided `Analytics` implementations.

Please notice that when creating new `UserProperty` as it's value you can pass one of the following types:
```
Boolean
BooleanArray
Bundle
Byte
ByteArray
Char
CharArray
CharSequence
Double
DoubleArray
Float
FloatArray
Int
IntArray
Long
LongArray
Parcelable
Serializable
Short
ShortArray
String
```

License
-------

    Copyright 2018 Dawid Firuzek

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
