package com.chrynan.logger

data class LogValues(
    val logType: LogType,
    val tag: String? = null,
    val message: String? = null,
    val throwable: Throwable? = null
)

fun Logger.log(logValues: LogValues) =
    log(
        logType = logValues.logType,
        tag = logValues.tag ?: logValues.logType.typeName,
        message = logValues.message,
        throwable = logValues.throwable
    )
