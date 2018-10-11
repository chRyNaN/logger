package com.chrynan.loggertimber

import com.chrynan.logger.DefaultTags.TAG_DEBUG
import com.chrynan.logger.DefaultTags.TAG_ERROR
import com.chrynan.logger.DefaultTags.TAG_INFO
import com.chrynan.logger.DefaultTags.TAG_VERBOSE
import com.chrynan.logger.DefaultTags.TAG_WARNING
import com.chrynan.logger.DefaultTags.TAG_WTF
import com.chrynan.logger.LogInitializer
import com.chrynan.logger.Loggable
import timber.log.Timber

@Suppress("unused")
abstract class TimberLogger : LogInitializer,
        Loggable {

    override fun logError(tag: String?, throwable: Throwable, message: String) =
            Timber.e(throwable, messageWithTag(tag = tag ?: TAG_ERROR, message = message))

    override fun logError(tag: String?, throwable: Throwable) =
            Timber.e(throwable, "Tag: ${tag ?: TAG_ERROR}")

    override fun logError(tag: String?, message: String) =
            Timber.e(messageWithTag(tag = tag ?: TAG_ERROR, message = message))

    override fun logDebug(tag: String?, throwable: Throwable, message: String) =
            Timber.d(throwable, messageWithTag(tag = tag ?: TAG_DEBUG, message = message))

    override fun logDebug(tag: String?, throwable: Throwable) =
            Timber.d(throwable, "Tag: ${tag ?: TAG_DEBUG}")

    override fun logDebug(tag: String?, message: String) =
            Timber.d(messageWithTag(tag = tag ?: TAG_DEBUG, message = message))

    override fun logWarning(tag: String?, throwable: Throwable, message: String) =
            Timber.w(throwable, messageWithTag(tag = tag ?: TAG_WARNING, message = message))

    override fun logWarning(tag: String?, throwable: Throwable) =
            Timber.w(throwable, "Tag: ${tag ?: TAG_WARNING}")

    override fun logWarning(tag: String?, message: String) =
            Timber.w(messageWithTag(tag = tag ?: TAG_WARNING, message = message))

    override fun logInfo(tag: String?, throwable: Throwable, message: String) =
            Timber.i(throwable, messageWithTag(tag = tag ?: TAG_INFO, message = message))

    override fun logInfo(tag: String?, throwable: Throwable) =
            Timber.i(throwable, "Tag: ${tag ?: TAG_INFO}")

    override fun logInfo(tag: String?, message: String) =
            Timber.i(messageWithTag(tag = tag ?: TAG_INFO, message = message))

    override fun logVerbose(tag: String?, throwable: Throwable, message: String) =
            Timber.v(throwable, messageWithTag(tag = tag ?: TAG_VERBOSE, message = message))

    override fun logVerbose(tag: String?, throwable: Throwable) =
            Timber.v(throwable, "Tag: ${tag ?: TAG_VERBOSE}")

    override fun logVerbose(tag: String?, message: String) =
            Timber.v(messageWithTag(tag = tag ?: TAG_VERBOSE, message = message))

    override fun logWtf(tag: String?, throwable: Throwable, message: String) =
            Timber.wtf(throwable, messageWithTag(tag = tag ?: TAG_WTF, message = message))

    override fun logWtf(tag: String?, throwable: Throwable) =
            Timber.wtf(throwable, "Tag: ${tag ?: TAG_WTF}")

    override fun logWtf(tag: String?, message: String) =
            Timber.wtf(messageWithTag(tag = tag ?: TAG_WTF, message = message))

    private fun messageWithTag(tag: String, message: String) = "Tag: $tag, message: $message"
}