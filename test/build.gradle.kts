plugins {
    id("app")
}

application {
    mainClassName = "com.github.dsvensson.test.Test"
}

tasks {
    shadowJar {
    }
}

dependencies {
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:_")
}