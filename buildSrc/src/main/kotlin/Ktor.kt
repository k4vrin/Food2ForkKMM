object Ktor {
    private const val KtorVersion = "2.2.2"
    val core by lazy {  "io.ktor:ktor-client-core:${KtorVersion}"}
    val android by lazy {  "io.ktor:ktor-client-android:${KtorVersion}"}
    val ios by lazy {  "io.ktor:ktor-client-ios:${KtorVersion}"}
    val contentNegotiation by lazy { "io.ktor:ktor-client-content-negotiation:${KtorVersion}" }
    val serialization by lazy { "io.ktor:ktor-serialization-kotlinx-json:${KtorVersion}" }
    val logging by lazy { "io.ktor:ktor-client-logging:${KtorVersion}" }
    private const val ChLogbackVersion = "1.4.5"
    val chLogback by lazy { "ch.qos.logback:logback-classic:$ChLogbackVersion" }
}