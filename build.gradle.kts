buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath(Build.kotlinGradlePlugin)
        classpath(Build.buildTools)
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
