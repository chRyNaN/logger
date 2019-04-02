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

    override fun init() = log(logType = LogType.INFO, tag = TAG_INFO, message = "Initializing SimplePrintLineLogger.")

    @Suppress("MemberVisibilityCanPrivate")
    override fun log(logType: LogType, tag: String, message: String?, throwable: Throwable?) {
        var sb = "$tag: "
        message?.let { sb += "$MESSAGE: $it: " }
        throwable?.let {
            sb += "$THROWABLE_MESSAGE: ${it.message}: $it"
        }
        println(sb)
    }
}