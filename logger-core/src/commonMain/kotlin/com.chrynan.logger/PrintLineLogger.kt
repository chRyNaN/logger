package com.chrynan.logger

/**
 * A simple implementation of [Logger] that calls [println] when a log function is called.
 */
@Suppress("unused")
open class PrintLineLogger : LogInitializer,
    Logger {

    override var isEnabled: Boolean = true

    override fun init() =
        log(
            logType = LogType.INFO,
            tag = LogType.INFO.typeName,
            message = "Initializing SimplePrintLineLogger."
        )

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

    companion object {

        private const val MESSAGE = "Message"
        private const val THROWABLE_MESSAGE = "Throwable Message"
    }
}
