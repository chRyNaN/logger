package com.chrynan.logger

import com.chrynan.logger.DefaultTags.TAG_DEBUG
import com.chrynan.logger.DefaultTags.TAG_ERROR
import com.chrynan.logger.DefaultTags.TAG_INFO
import com.chrynan.logger.DefaultTags.TAG_VERBOSE
import com.chrynan.logger.DefaultTags.TAG_WARNING
import com.chrynan.logger.DefaultTags.TAG_WTF

open class ConsoleLogger : LogInitializer,
        Loggable {

    override fun init() = console.info("Initializing ConsoleLogger")

    override fun logError(tag: String?, throwable: Throwable, message: String) =
            console.error(tag ?: TAG_ERROR, message, throwable)

    override fun logError(tag: String?, throwable: Throwable) = console.error(tag ?: TAG_ERROR, throwable)

    override fun logError(tag: String?, message: String) = console.error(tag ?: TAG_ERROR, message)

    override fun logDebug(tag: String?, throwable: Throwable, message: String) =
            console.log(tag ?: TAG_DEBUG, message, throwable)

    override fun logDebug(tag: String?, throwable: Throwable) = console.log(tag ?: TAG_DEBUG, throwable)

    override fun logDebug(tag: String?, message: String) = console.log(tag ?: TAG_DEBUG, message)

    override fun logWarning(tag: String?, throwable: Throwable, message: String) =
            console.warn(tag ?: TAG_WARNING, message, throwable)

    override fun logWarning(tag: String?, throwable: Throwable) = console.warn(tag ?: TAG_WARNING, throwable)

    override fun logWarning(tag: String?, message: String) = console.warn(tag ?: TAG_WARNING, message)

    override fun logInfo(tag: String?, throwable: Throwable, message: String) =
            console.info(tag ?: TAG_INFO, message, throwable)

    override fun logInfo(tag: String?, throwable: Throwable) = console.info(tag ?: TAG_INFO, throwable)

    override fun logInfo(tag: String?, message: String) = console.info(tag ?: TAG_INFO, message)

    override fun logVerbose(tag: String?, throwable: Throwable, message: String) =
            console.log(tag ?: TAG_VERBOSE, message, throwable)

    override fun logVerbose(tag: String?, throwable: Throwable) = console.log(tag ?: TAG_VERBOSE, throwable)

    override fun logVerbose(tag: String?, message: String) = console.log(tag ?: TAG_VERBOSE, message)

    override fun logWtf(tag: String?, throwable: Throwable, message: String) =
            console.error(tag ?: TAG_WTF, message, throwable)

    override fun logWtf(tag: String?, throwable: Throwable) = console.error(tag ?: TAG_WTF, throwable)

    override fun logWtf(tag: String?, message: String) = console.error(tag ?: TAG_WTF, message)
}