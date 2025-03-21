import org.jetbrains.compose.desktop.application.dsl.TargetFormat

plugins {
    kotlin("jvm")
    id("org.jetbrains.compose")
    id("org.jetbrains.kotlin.plugin.compose")
    id("maven-publish")
}

group = "at.leisner.lumen"
version = "1.0-SNAPSHOT"
val versionString = version as String

repositories {
    mavenLocal()
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    google()
}

dependencies {
    api("at.leisner:Composing:1.0-SNAPSHOT")
    api("at.leisner:K-Framework:1.0-SNAPSHOT")
    api(compose.desktop.currentOs)

    api("org.jetbrains.kotlin:kotlin-scripting-common")
    api("org.jetbrains.kotlin:kotlin-scripting-jvm")
    api("org.jetbrains.kotlin:kotlin-scripting-dependencies")
    api("org.jetbrains.kotlin:kotlin-scripting-dependencies-maven")
}

compose.desktop {
    application {
        mainClass = "MainKt"

        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "Lumen-API"
            packageVersion = "1.0.0"
        }
    }
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = group as String
            artifactId = "Lumen-API"
            version = versionString

            from(components["java"])
        }
    }

    repositories {
        mavenLocal()
    }
}
