plugins {
    id(Plugins.androidApplication)
    kotlin(KotlinPlugins.android)
    kotlin(KotlinPlugins.kapt)
    id(Plugins.hilt) version Hilt.DaggerVersion
    kotlin(KotlinPlugins.serialization) version Kotlin.Version
}

android {
    namespace = Application.AppId
    compileSdk = Application.CompileSdkVersion
    defaultConfig {
        applicationId = Application.AppId
        minSdk = Application.MinSdkVersion
        targetSdk = Application.TargetSdkVersion
        versionCode = Application.VersionCode
        versionName = Application.VersionName
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Compose.CompilerVersion
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(project(":shared"))
    val composeBOM = platform(Compose.composeBOM)
    implementation(composeBOM)
    androidTestImplementation(composeBOM)
    implementation(Compose.material)
    implementation(Compose.toolingPreview)
    debugImplementation(Compose.tooling)
    androidTestImplementation(Compose.junit)
    debugImplementation(Compose.testManifest)
    implementation(Compose.iconExtended)
    implementation(Compose.activity)
    implementation(Compose.viewModels)
    implementation(Compose.runtime)
    implementation(Compose.compiler)
    implementation(Compose.navigation)
    implementation(Compose.constraintLayout)

    implementation(Google.material)

    implementation(Kotlinx.datetime)

    debugImplementation(SquareUp.leakCanary)

    implementation(Hilt.hiltAndroid)
    kapt(Hilt.hiltCompiler)
    kapt(Hilt.daggerCompiler)
    implementation(Hilt.hiltComposeNavigation)

    implementation(Coil.core)
    implementation(Coil.compose)
}







