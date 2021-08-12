@file:Suppress("unused")

package com.chrynan.logger

/**
 * A platform agnostic Kotlin Multiplatform Logging interface inspired by Android's Log class.
 */
interface Loggable {

    fun log(logType: LogType, tag: String, message: String? = null, throwable: Throwable? = null)

    fun logError(tag: String? = null, throwable: Throwable? = null, message: String? = null) =
        log(
            logType = LogType.ERROR,
            tag = tag ?: LogType.ERROR.typeName,
            message = message,
            throwable = throwable
        )

    fun logDebug(tag: String? = null, throwable: Throwable? = null, message: String? = null) =
        log(
            logType = LogType.DEBUG,
            tag = tag ?: LogType.DEBUG.typeName,
            message = message,
            throwable = throwable
        )

    fun logWarning(tag: String? = null, throwable: Throwable? = null, message: String? = null) =
        log(
            logType = LogType.WARNING,
            tag = tag ?: LogType.WARNING.typeName,
            message = message,
            throwable = throwable
        )

    fun logInfo(tag: String? = null, throwable: Throwable? = null, message: String? = null) =
        log(
            logType = LogType.INFO,
            tag = tag ?: LogType.INFO.typeName,
            message = message,
            throwable = throwable
        )

    fun logVerbose(tag: String? = null, throwable: Throwable? = null, message: String? = null) =
        log(
            logType = LogType.VERBOSE,
            tag = tag ?: LogType.VERBOSE.typeName,
            message = message,
            throwable = throwable
        )

    fun logWtf(tag: String? = null, throwable: Throwable? = null, message: String? = null) =
        log(
            logType = LogType.WTF,
            tag = tag ?: LogType.WTF.typeName,
            message = message,
            throwable = throwable
        )
}
