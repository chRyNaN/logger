package com.chrynan.logger

/**
 * A platform agnostic Kotlin Logging interface inspired by Android's Log class.
 */
interface Loggable {

    fun logError(tag: String? = null, throwable: Throwable, message: String)

    fun logError(tag: String? = null, throwable: Throwable)

    fun logError(tag: String? = null, message: String)

    fun logDebug(tag: String? = null, throwable: Throwable, message: String)

    fun logDebug(tag: String? = null, throwable: Throwable)

    fun logDebug(tag: String? = null, message: String)

    fun logWarning(tag: String? = null, throwable: Throwable, message: String)

    fun logWarning(tag: String? = null, throwable: Throwable)

    fun logWarning(tag: String? = null, message: String)

    fun logInfo(tag: String? = null, throwable: Throwable, message: String)

    fun logInfo(tag: String? = null, throwable: Throwable)

    fun logInfo(tag: String? = null, message: String)

    fun logVerbose(tag: String? = null, throwable: Throwable, message: String)

    fun logVerbose(tag: String? = null, throwable: Throwable)

    fun logVerbose(tag: String? = null, message: String)

    fun logWtf(tag: String? = null, throwable: Throwable, message: String)

    fun logWtf(tag: String? = null, throwable: Throwable)

    fun logWtf(tag: String? = null, message: String)
}