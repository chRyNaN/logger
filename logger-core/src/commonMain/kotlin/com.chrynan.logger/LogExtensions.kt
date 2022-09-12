@file:Suppress("unused")

package com.chrynan.logger

/**
 * Invokes the [Logger.log] function for [LogType.ERROR].
 */
fun Logger.error(message: String? = null, tag: String? = null, throwable: Throwable? = null) =
    log(
        logType = LogType.ERROR,
        tag = tag ?: LogType.ERROR.typeName,
        message = message,
        throwable = throwable
    )

/**
 * Invokes the [Logger.log] function for [LogType.DEBUG].
 */
fun Logger.debug(message: String? = null, tag: String? = null, throwable: Throwable? = null) =
    log(
        logType = LogType.DEBUG,
        tag = tag ?: LogType.DEBUG.typeName,
        message = message,
        throwable = throwable
    )

/**
 * Invokes the [Logger.log] function for [LogType.WARNING].
 */
fun Logger.warning(message: String? = null, tag: String? = null, throwable: Throwable? = null) =
    log(
        logType = LogType.WARNING,
        tag = tag ?: LogType.WARNING.typeName,
        message = message,
        throwable = throwable
    )

/**
 * Invokes the [Logger.log] function for [LogType.INFO].
 */
fun Logger.info(message: String? = null, tag: String? = null, throwable: Throwable? = null) =
    log(
        logType = LogType.INFO,
        tag = tag ?: LogType.INFO.typeName,
        message = message,
        throwable = throwable
    )

/**
 * Invokes the [Logger.log] function for [LogType.VERBOSE].
 */
fun Logger.verbose(message: String? = null, tag: String? = null, throwable: Throwable? = null) =
    log(
        logType = LogType.VERBOSE,
        tag = tag ?: LogType.VERBOSE.typeName,
        message = message,
        throwable = throwable
    )

/**
 * Invokes the [Logger.log] function for [LogType.WTF].
 */
fun Logger.wtf(message: String? = null, tag: String? = null, throwable: Throwable? = null) =
    log(
        logType = LogType.WTF,
        tag = tag ?: LogType.WTF.typeName,
        message = message,
        throwable = throwable
    )

/**
 * Invokes the [Logger.log] function using the provided [logValues].
 */
fun Logger.log(logValues: LogValues) =
    log(
        logType = logValues.logType,
        tag = logValues.tag ?: logValues.logType.typeName,
        message = logValues.message,
        throwable = logValues.throwable
    )

/**
 * Invokes the [Logger.log] function using the [Loggable.logValues] obtained from the provided [loggable] instance.
 */
fun Logger.log(loggable: Loggable) = log(logValues = loggable.logValues)
