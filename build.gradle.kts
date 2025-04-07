// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
}
buildscript {
    repositories {
        google()
        mavenCentral()  // Add Maven Central for HAPI FHIR dependencies
    }
    dependencies {
        classpath("com.android.tools.build:gradle:7.4.1")  // or your required version
        // Add other necessary dependencies
    }
}