const val kotlinVersion = "1.3.40"

object BuildPlugins {
    object Version {
        const val androidBuildToolsVersion = "3.6.0-alpha03"
    }

    const val androidGradlePlugin = "com.android.tools.build:gradle:${Version.androidBuildToolsVersion}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"

    const val detekt = "io.gitlab.arturbosch.detekt"
    const val ktlint = "org.jlleitschuh.gradle.ktlint"
    const val versions = "com.github.ben-manes.versions"
}

object AndroidSdk {
    const val min = 21
    const val compile = 28
    const val target = compile
}


object Libraries {
    private object Versions {
        const val appCompat = "1.1.0-beta01"
        const val ktx = "1.2.0-alpha02"
        const val material = "1.1.0-alpha07"
        const val constraintLayout = "2.0.0-beta2"
        const val lifecycle = "2.0.0"
        const val viewpager2 = "1.0.0-alpha05"
    }

    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlinVersion"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val ktxCore = "androidx.core:core-ktx:${Versions.ktx}"
    const val material = "com.google.android.material:material:${Versions.material}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val lifecycleExtensions = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
    const val lifecycleViewModelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
    const val viewpager2 = "androidx.viewpager2:viewpager2:${Versions.viewpager2}"
}
