object Build {
    private const val agpVersion = "7.4.0"
    val buildTools by lazy { "com.android.tools.build:gradle:${agpVersion}"}
    val kotlinGradlePlugin by lazy { "org.jetbrains.kotlin:kotlin-gradle-plugin:${Kotlin.Version}"}
    val sqlDelightGradlePlugin by lazy { "com.squareup.sqldelight:gradle-plugin:${SqlDelight.SqlDelightVersion}"}
    val hiltGradlePlugin by lazy { "com.google.dagger:hilt-android-gradle-plugin:${Hilt.DaggerVersion}"}
}