private const val kotlinVersion = "1.3.30"
private const val androidxAppcompatVersion = "1.4.0"
private const val materialVersion = "1.4.0"
private const val androidxCoreVersion = "1.7.0"

private const val jUnitVersion = "4.13.2"
private const val androidxTestVersion = "1.1.3"
private const val androidxTestEspressoVersion = "3.4.0"

object Config {

    object Plugins {
        const val androidApplication = "com.android.application"
        const val androidLibrary = "com.android.library"
        const val kotlinAndroid = "kotlin-android"
    }

    object Android {
        const val compileSdkVersion = 31
        const val minSdkVersion = 21
        const val targetSdkVersion = 31
        const val versionCode = 1
        const val versionName = "0.1"
        const val testRunner = "androidx.test.runner.AndroidJUnitRunner"
        const val buildTypeRelease = "release"
        const val defaultProguardFile = "proguard-android-optimize.txt"
        const val proguardRules = "proguard-rules.pro"
        const val minifyEnabled = false
    }

    object Libs {
        const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlinVersion"
        const val androidxCore = "androidx.core:core-ktx:$androidxCoreVersion"
        const val androidxAppcompat = "androidx.appcompat:appcompat:$androidxAppcompatVersion"
        const val material = "com.google.android.material:material:$materialVersion"
    }

    object TestLibs {
        const val junit = "junit:junit:$jUnitVersion"

        const val androidxTestJUnit = "androidx.test.ext:junit:$androidxTestVersion"
        const val androidxTestEspresso =
            "androidx.test.espresso:espresso-core:$androidxTestEspressoVersion"
    }

}