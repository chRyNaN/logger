package com.chrynan.logger

/**
 * Represents values required to invoke the [Logger.log] function.
 */
data class LogValues(
    val logType: LogType,
    val tag: String? = null,
    val message: String? = null,
    val throwable: Throwable? = null
)
