import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("library")

    application
    id("com.github.johnrengelman.shadow")
}

tasks {
            withType<KotlinCompile> {
                sourceCompatibility = JavaVersion.VERSION_1_8.toString()
                targetCompatibility = JavaVersion.VERSION_1_8.toString()
            }
        }


dependencies {
}