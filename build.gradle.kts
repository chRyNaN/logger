import com.chrynan.logger.buildSrc.LibraryConstants

group = LibraryConstants.group
version = LibraryConstants.versionName

buildscript {
    repositories {
        mavenCentral()
        google()
        maven { url = uri("https://repo.repsy.io/mvn/chrynan/public") }
    }

    dependencies {
        classpath("com.android.tools.build:gradle:4.2.2")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.10")
        classpath("org.jetbrains.dokka:dokka-gradle-plugin:1.7.10")
    }
}

apply(plugin = "org.jetbrains.dokka")

allprojects {
    repositories {
        mavenCentral()
        google()
        maven { url = uri("https://repo.repsy.io/mvn/chrynan/public") }
    }
}

// Documentation
tasks.named<org.jetbrains.dokka.gradle.DokkaMultiModuleTask>("dokkaGfmMultiModule").configure {
    outputDirectory.set(file("${projectDir.path}/docs"))
}
