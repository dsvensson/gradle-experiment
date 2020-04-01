import de.fayard.dependencies.bootstrapRefreshVersionsAndDependencies

buildscript {
    repositories {
        gradlePluginPortal()
    }
    dependencies {
        classpath("de.fayard:dependencies:0.5.7")
        classpath(kotlin("gradle-plugin", version = "1.3.61"))
    }
}

bootstrapRefreshVersionsAndDependencies()

include(
        "test"
)