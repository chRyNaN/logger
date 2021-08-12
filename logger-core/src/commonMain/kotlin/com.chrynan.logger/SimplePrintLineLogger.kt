package com.chrynan.logger

import com.chrynan.logger.DefaultTags.TAG_INFO

/**
 * A simple implementation of [Loggable] that calls [println] when a log function is called.
 */
@Suppress("unused")
open class SimplePrintLineLogger : LogInitializer,
    Loggable {

    companion object {

        private const val MESSAGE = "Message"
        private const val THROWABLE_MESSAGE = "Throwable Message"
    }

    override fun init() =
        log(logType = LogType.INFO, tag = TAG_INFO, message = "Initializing SimplePrintLineLogger.")

    @Suppress("MemberVisibilityCanPrivate")
    override fun log(logType: LogType, tag: String, message: String?, throwable: Throwable?) {
        val outputMessage = if (message != null) {
            "$tag: $MESSAGE: $message"
        } else {
            "$tag:"
        }

        val throwableMessage =
            throwable?.let { "$THROWABLE_MESSAGE: ${it.message}:\n${it.stackTraceToString()}" }
                ?: ""

        val output =
            """
                |$outputMessage
                |$throwableMessage
            """.trimMargin()

        println(output)
    }
}
