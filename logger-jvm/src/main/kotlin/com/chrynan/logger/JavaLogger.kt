package com.chrynan.logger

import com.chrynan.logger.DefaultTags.TAG_DEBUG
import com.chrynan.logger.DefaultTags.TAG_ERROR
import com.chrynan.logger.DefaultTags.TAG_INFO
import com.chrynan.logger.DefaultTags.TAG_VERBOSE
import com.chrynan.logger.DefaultTags.TAG_WARNING
import com.chrynan.logger.DefaultTags.TAG_WTF
import java.util.logging.Level
import java.util.logging.Logger

@Suppress("unused")
open class JavaLogger(private val logger: Logger) : LogInitializer,
        Loggable {

    override fun init() = logger.info("Initializing ${javaClass.simpleName}")

    override fun logError(tag: String?, throwable: Throwable, message: String) =
            log(level = Level.SEVERE, tag = tag ?: TAG_ERROR, message = message, throwable = throwable)

    override fun logError(tag: String?, throwable: Throwable) =
            log(level = Level.SEVERE, tag = tag ?: TAG_ERROR, throwable = throwable)

    override fun logError(tag: String?, message: String) =
            log(level = Level.SEVERE, tag = tag ?: TAG_ERROR, message = message)

    override fun logDebug(tag: String?, throwable: Throwable, message: String) =
            log(level = Level.FINE, tag = tag ?: TAG_DEBUG, message = message, throwable = throwable)

    override fun logDebug(tag: String?, throwable: Throwable) =
            log(level = Level.FINE, tag = tag ?: TAG_DEBUG, throwable = throwable)

    override fun logDebug(tag: String?, message: String) =
            log(level = Level.FINE, tag = tag ?: TAG_DEBUG, message = message)

    override fun logWarning(tag: String?, throwable: Throwable, message: String) =
            log(level = Level.WARNING, tag = tag ?: TAG_WARNING, message = message, throwable = throwable)

    override fun logWarning(tag: String?, throwable: Throwable) =
            log(level = Level.WARNING, tag = tag ?: TAG_WARNING, throwable = throwable)

    override fun logWarning(tag: String?, message: String) =
            log(level = Level.WARNING, tag = tag ?: TAG_WARNING, message = message)

    override fun logInfo(tag: String?, throwable: Throwable, message: String) =
            log(level = Level.INFO, tag = tag ?: TAG_INFO, message = message, throwable = throwable)

    override fun logInfo(tag: String?, throwable: Throwable) =
            log(level = Level.INFO, tag = tag ?: TAG_INFO, throwable = throwable)

    override fun logInfo(tag: String?, message: String) =
            log(level = Level.INFO, tag = tag ?: TAG_INFO, message = message)

    override fun logVerbose(tag: String?, throwable: Throwable, message: String) =
            log(level = Level.FINEST, tag = tag ?: TAG_VERBOSE, message = message, throwable = throwable)

    override fun logVerbose(tag: String?, throwable: Throwable) =
            log(level = Level.FINEST, tag = tag ?: TAG_VERBOSE, throwable = throwable)

    override fun logVerbose(tag: String?, message: String) =
            log(level = Level.FINEST, tag = tag ?: TAG_VERBOSE, message = message)

    override fun logWtf(tag: String?, throwable: Throwable, message: String) =
            log(level = Level.SEVERE, tag = tag ?: TAG_WTF, message = message, throwable = throwable)

    override fun logWtf(tag: String?, throwable: Throwable) =
            log(level = Level.SEVERE, tag = tag ?: TAG_WTF, throwable = throwable)

    override fun logWtf(tag: String?, message: String) =
            log(level = Level.SEVERE, tag = tag ?: TAG_WTF, message = message)

    private fun log(level: Level, tag: String, message: String? = null, throwable: Throwable? = null) =
            when (level) {
                Level.SEVERE -> logger.severe("Tag: $tag; message: $message; throwable: $throwable")
                Level.WARNING -> logger.warning("Tag: $tag; message: $message; throwable: $throwable")
                Level.INFO -> logger.info("Tag: $tag; message: $message; throwable: $throwable")
                else -> logger.log(level, message, throwable)
            }
}