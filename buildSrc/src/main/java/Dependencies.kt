object Versions {

    const val CORE = "1.0-SNAPSHOT"
    const val KOTLIN = "1.2.10"
    const val JDK_COMPATIBILITY = "1.8"
    const val JDK_SOURCE_COMPATIBILITY = 1.6
}

object Libraries {

    const val KOTLIN_JDK = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.KOTLIN}"
}

object ClassPath {

    const val KOTLIN = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.KOTLIN}"
}