object Versions {
    const val compileSdk = 27
    const val minSdk = 16
    const val targetSdk = 27
    const val versionCode = 1
    const val versionName = "1.0"
    const val gradle = "3.0.1"
    const val kotlin = "1.2.30"
    const val bintray = "1.7.3"
    const val crashlytics = "2.6.8"
    const val amplitude = "2.13.4"
    const val facebook = "4.26.0"
    const val firebase = "11.8.0"
    const val junit = "4.12"
    const val mockito = "2.16.0"
    const val powerMock = "1.7.4"
}

object ClassPaths {
    const val gradle = "com.android.tools.build:gradle:${Versions.gradle}"
    const val kotlinGradle = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val bintray = "com.jfrog.bintray.gradle:gradle-bintray-plugin:${Versions.bintray}"
}

object Libs {
    const val kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib-jre7:${Versions.kotlin}"
    const val crashlytics = "com.crashlytics.sdk.android:crashlytics:${Versions.crashlytics}@aar"
    const val amplitude = "com.amplitude:android-sdk:${Versions.amplitude}"
    const val facebook = "com.facebook.android:facebook-android-sdk:${Versions.facebook}"
    const val firebaseAnalytics = "com.google.firebase:firebase-core:${Versions.firebase}"
    const val junit = "junit:junit:${Versions.junit}"
    const val mockito = "org.mockito:mockito-core:${Versions.mockito}"
    const val powerMockJunit = "org.powermock:powermock-module-junit4:${Versions.powerMock}"
    const val powerMockMockito = "org.powermock:powermock-api-mockito2:${Versions.powerMock}"
}
