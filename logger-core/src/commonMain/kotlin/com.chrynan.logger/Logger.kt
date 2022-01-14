@file:Suppress("unused")

package com.chrynan.logger

/**
 * A platform-agnostic Kotlin Multiplatform Logging interface inspired by Android's Log class.
 */
interface Logger {

    /**
     * Determines whether this [Logger] instance should be used to output logs. This value should default to `true`.
     *
     * **Note:** that it is up to the call-site to prevent logging if this value returns false.
     */
    var isEnabled: Boolean

    fun log(logType: LogType, tag: String, message: String? = null, throwable: Throwable? = null)

    fun error(message: String? = null, tag: String? = null, throwable: Throwable? = null) =
        log(
            logType = LogType.ERROR,
            tag = tag ?: LogType.ERROR.typeName,
            message = message,
            throwable = throwable
        )

    fun debug(message: String? = null, tag: String? = null, throwable: Throwable? = null) =
        log(
            logType = LogType.DEBUG,
            tag = tag ?: LogType.DEBUG.typeName,
            message = message,
            throwable = throwable
        )

    fun warning(message: String? = null, tag: String? = null, throwable: Throwable? = null) =
        log(
            logType = LogType.WARNING,
            tag = tag ?: LogType.WARNING.typeName,
            message = message,
            throwable = throwable
        )

    fun info(message: String? = null, tag: String? = null, throwable: Throwable? = null) =
        log(
            logType = LogType.INFO,
            tag = tag ?: LogType.INFO.typeName,
            message = message,
            throwable = throwable
        )

    fun verbose(message: String? = null, tag: String? = null, throwable: Throwable? = null) =
        log(
            logType = LogType.VERBOSE,
            tag = tag ?: LogType.VERBOSE.typeName,
            message = message,
            throwable = throwable
        )

    fun wtf(message: String? = null, tag: String? = null, throwable: Throwable? = null) =
        log(
            logType = LogType.WTF,
            tag = tag ?: LogType.WTF.typeName,
            message = message,
            throwable = throwable
        )
}
