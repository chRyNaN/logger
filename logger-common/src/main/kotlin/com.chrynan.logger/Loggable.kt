package com.chrynan.logger

/**
 * A platform agnostic Kotlin Logging interface inspired by Android's Log class.
 */
interface Loggable {

    fun logError(throwable: Throwable, message: String)

    fun logError(throwable: Throwable)

    fun logError(message: String)

    fun logDebug(throwable: Throwable, message: String)

    fun logDebug(throwable: Throwable)

    fun logDebug(message: String)

    fun logWarning(throwable: Throwable, message: String)

    fun logWarning(throwable: Throwable)

    fun logWarning(message: String)

    fun logInfo(throwable: Throwable, message: String)

    fun logInfo(throwable: Throwable)

    fun logInfo(message: String)

    fun logVerbose(throwable: Throwable, message: String)

    fun logVerbose(throwable: Throwable)

    fun logVerbose(message: String)

    fun logWtf(throwable: Throwable, message: String)

    fun logWtf(throwable: Throwable)

    fun logWtf(message: String)
}