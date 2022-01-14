package com.chrynan.logger

import java.util.logging.Level
import java.util.logging.Logger

@Suppress("unused")
open class JavaLogger(private val logger: Logger) : LogInitializer,
    com.chrynan.logger.Logger {

    override fun init() = logger.info("Initializing ${javaClass.simpleName}")

    override fun log(logType: LogType, tag: String, message: String?, throwable: Throwable?) {
        val level = when (logType) {
            LogType.INFO -> Level.INFO
            LogType.DEBUG -> Level.FINE
            LogType.ERROR -> Level.SEVERE
            LogType.VERBOSE -> Level.FINEST
            LogType.WARNING -> Level.WARNING
            LogType.WTF -> Level.SEVERE
        }

        log(level = level, tag = tag, message = message, throwable = throwable)
    }

    private fun log(
        level: Level,
        tag: String,
        message: String? = null,
        throwable: Throwable? = null
    ) =
        when (level) {
            Level.SEVERE -> logger.severe("Tag: $tag; message: $message; throwable: $throwable")
            Level.WARNING -> logger.warning("Tag: $tag; message: $message; throwable: $throwable")
            Level.INFO -> logger.info("Tag: $tag; message: $message; throwable: $throwable")
            else -> logger.log(level, message, throwable)
        }
}
