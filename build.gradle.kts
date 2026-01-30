plugins {
    id("com.android.application") version "8.2.0"
    id("org.jetbrains.kotlin.android") version "1.9.21"
}

android {
    namespace = "com.buildguard.app"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.buildguard.app"
        minSdk = 28
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }
}
