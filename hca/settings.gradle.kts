pluginManagement.repositories {
    gradlePluginPortal()
    mavenCentral()
    google()
}
dependencyResolutionManagement.repositories {
    mavenCentral()
    google()
    maven("https://s01.oss.sonatype.org/content/repositories/snapshots/")
}

rootProject.name = "homeworkcalendarapp"

include("app")
