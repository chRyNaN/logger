@file:Suppress("unused")

package com.chrynan.logger

fun log(logType: LogType, tag: String, message: String? = null, throwable: Throwable? = null) =
    Logger.log(logType = logType, tag = tag, throwable = throwable, message = message)

fun logError(tag: String? = null, throwable: Throwable? = null, message: String? = null) =
    Logger.logError(tag = tag ?: DefaultTags.TAG_ERROR, message = message, throwable = throwable)

fun logDebug(tag: String? = null, throwable: Throwable? = null, message: String? = null) =
    Logger.logDebug(tag = tag ?: DefaultTags.TAG_DEBUG, message = message, throwable = throwable)

fun logWarning(tag: String? = null, throwable: Throwable? = null, message: String? = null) =
    Logger.logWarning(tag = tag ?: DefaultTags.TAG_WARNING, message = message, throwable = throwable)

fun logInfo(tag: String? = null, throwable: Throwable? = null, message: String? = null) =
    Logger.logInfo(tag = tag ?: DefaultTags.TAG_INFO, message = message, throwable = throwable)

fun logVerbose(tag: String? = null, throwable: Throwable? = null, message: String? = null) =
    Logger.logVerbose(tag = tag ?: DefaultTags.TAG_VERBOSE, message = message, throwable = throwable)

fun logWtf(tag: String? = null, throwable: Throwable? = null, message: String? = null) =
    Logger.logWtf(tag = tag ?: DefaultTags.TAG_WTF, message = message, throwable = throwable)
