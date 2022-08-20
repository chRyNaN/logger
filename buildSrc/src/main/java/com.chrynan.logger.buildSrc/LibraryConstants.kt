@file:Suppress("MemberVisibilityCanBePrivate")

package com.chrynan.logger.buildSrc

object LibraryConstants {

    const val bintrayRepo = "chrynan"
    const val group = "com.chrynan.logger"
    const val owner = "chrynan"
    const val repoName = "logger"
    const val versionName = "1.6.0"
    const val versionCode = 5
    const val versionDescription = "Release $versionName ($versionCode)"
    const val license = "Apache-2.0"
    const val vcsUrl = "https://github.com/chRyNaN/logger.git"

    object Android {

        const val compileSdkVersion = 30
        const val minSdkVersion = 23
        const val targetSdkVersion = 30
    }
}
