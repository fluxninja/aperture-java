pluginManagement {
    plugins {
        id("com.google.protobuf") version "0.8.17"
    }
}
dependencyResolutionManagement {
    repositories {
        mavenCentral()
        mavenLocal()
        gradlePluginPortal()
    }
}

rootProject.name = "aperture-java"
