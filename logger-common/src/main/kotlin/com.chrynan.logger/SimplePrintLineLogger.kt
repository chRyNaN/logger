package com.chrynan.logger

import com.chrynan.logger.DefaultTags.TAG_DEBUG
import com.chrynan.logger.DefaultTags.TAG_ERROR
import com.chrynan.logger.DefaultTags.TAG_INFO
import com.chrynan.logger.DefaultTags.TAG_VERBOSE
import com.chrynan.logger.DefaultTags.TAG_WARNING
import com.chrynan.logger.DefaultTags.TAG_WTF

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

    override fun init() = log(tag = TAG_INFO, message = "Initializing SimplePrintLineLogger.")

    override fun logError(tag: String?, throwable: Throwable, message: String) =
            log(tag = tag ?: TAG_ERROR, message = message, throwable = throwable)

    override fun logError(tag: String?, throwable: Throwable) =
            log(tag = tag ?: TAG_ERROR, throwable = throwable)

    override fun logError(tag: String?, message: String) =
            log(tag = tag ?: TAG_ERROR, message = message)

    override fun logDebug(tag: String?, throwable: Throwable, message: String) =
            log(tag = tag ?: TAG_DEBUG, message = message, throwable = throwable)

    override fun logDebug(tag: String?, throwable: Throwable) =
            log(tag = tag ?: TAG_DEBUG, throwable = throwable)

    override fun logDebug(tag: String?, message: String) =
            log(tag = tag ?: TAG_DEBUG, message = message)

    override fun logWarning(tag: String?, throwable: Throwable, message: String) =
            log(tag = tag ?: TAG_WARNING, message = message, throwable = throwable)

    override fun logWarning(tag: String?, throwable: Throwable) =
            log(tag = tag ?: TAG_WARNING, throwable = throwable)

    override fun logWarning(tag: String?, message: String) =
            log(tag = tag ?: TAG_WARNING, message = message)

    override fun logInfo(tag: String?, throwable: Throwable, message: String) =
            log(tag = tag ?: TAG_INFO, message = message, throwable = throwable)

    override fun logInfo(tag: String?, throwable: Throwable) =
            log(tag = tag ?: TAG_INFO, throwable = throwable)

    override fun logInfo(tag: String?, message: String) =
            log(tag = tag ?: TAG_INFO, message = message)

    override fun logVerbose(tag: String?, throwable: Throwable, message: String) =
            log(tag = tag ?: TAG_VERBOSE, message = message, throwable = throwable)

    override fun logVerbose(tag: String?, throwable: Throwable) =
            log(tag = tag ?: TAG_VERBOSE, throwable = throwable)

    override fun logVerbose(tag: String?, message: String) =
            log(tag = tag ?: TAG_VERBOSE, message = message)

    override fun logWtf(tag: String?, throwable: Throwable, message: String) =
            log(tag = tag ?: TAG_WTF, message = message, throwable = throwable)

    override fun logWtf(tag: String?, throwable: Throwable) =
            log(tag = tag ?: TAG_WTF, throwable = throwable)

    override fun logWtf(tag: String?, message: String) =
            log(tag = tag ?: TAG_WTF, message = message)

    @Suppress("MemberVisibilityCanPrivate")
    protected fun log(tag: String, message: String? = null, throwable: Throwable? = null) {
        var sb = "$tag: "
        message?.let { sb += "$MESSAGE: $it: " }
        throwable?.let {
            sb += "$THROWABLE_MESSAGE: ${it.message}: $it"
        }
        println(sb)
    }
}