
object SqlDelight {
    const val SqlDelightVersion = "1.5.4"
    val runtime by lazy { "com.squareup.sqldelight:runtime:${SqlDelightVersion}" }
    val androidDriver by lazy { "com.squareup.sqldelight:android-driver:${SqlDelightVersion}" }
    val nativeDriver by lazy { "com.squareup.sqldelight:native-driver:${SqlDelightVersion}" }
    val coroutineExt by lazy { "com.squareup.sqldelight:coroutines-extensions-jvm:${SqlDelightVersion}" }
}