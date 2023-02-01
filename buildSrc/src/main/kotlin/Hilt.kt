object Hilt {
    const val DaggerVersion = "2.44"
    const val HiltVersion = "1.0.0"
    val hiltAndroid by lazy { "com.google.dagger:hilt-android:$DaggerVersion" }
    val daggerCompiler by lazy { "com.google.dagger:hilt-compiler:$DaggerVersion" }
    val hiltCompiler by lazy { "androidx.hilt:hilt-compiler:$HiltVersion" }
    val hiltComposeNavigation by lazy { "androidx.hilt:hilt-navigation-compose:$HiltVersion" }
}