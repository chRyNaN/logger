package com.chrynan.logger

/**
 * A platform agnostic Kotlin Logging interface inspired by Android's Log class.
 */
interface Loggable {

    fun log(logType: LogType, tag: String, message: String? = null, throwable: Throwable? = null)

    fun logError(tag: String? = null, throwable: Throwable? = null, message: String? = null) =
            log(logType = LogType.ERROR, tag = tag ?: DefaultTags.TAG_ERROR, message = message, throwable = throwable)

    fun logDebug(tag: String? = null, throwable: Throwable? = null, message: String? = null) =
            log(logType = LogType.DEBUG, tag = tag ?: DefaultTags.TAG_DEBUG, message = message, throwable = throwable)

    fun logWarning(tag: String? = null, throwable: Throwable? = null, message: String? = null) =
            log(logType = LogType.WARNING, tag = tag
                    ?: DefaultTags.TAG_WARNING, message = message, throwable = throwable)

    fun logInfo(tag: String? = null, throwable: Throwable? = null, message: String? = null) =
            log(logType = LogType.INFO, tag = tag ?: DefaultTags.TAG_INFO, message = message, throwable = throwable)

    fun logVerbose(tag: String? = null, throwable: Throwable? = null, message: String? = null) =
            log(logType = LogType.VERBOSE, tag = tag
                    ?: DefaultTags.TAG_VERBOSE, message = message, throwable = throwable)

    fun logWtf(tag: String? = null, throwable: Throwable? = null, message: String? = null) =
            log(logType = LogType.WTF, tag = tag ?: DefaultTags.TAG_WTF, message = message, throwable = throwable)
}