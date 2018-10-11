package com.chrynan.logger

import android.util.Log
import com.chrynan.logger.DefaultTags.TAG_DEBUG
import com.chrynan.logger.DefaultTags.TAG_ERROR
import com.chrynan.logger.DefaultTags.TAG_INFO
import com.chrynan.logger.DefaultTags.TAG_VERBOSE
import com.chrynan.logger.DefaultTags.TAG_WARNING
import com.chrynan.logger.DefaultTags.TAG_WTF

@Suppress("unused", "LogNotTimber")
open class LogCatLogger : LogInitializer,
        Loggable {

    override fun init() {
        Log.i(TAG_INFO, "Initializing ${this.javaClass.simpleName}.")
    }

    override fun logError(tag: String?, throwable: Throwable, message: String) {
        Log.e(tag ?: TAG_ERROR, message, throwable)
    }

    override fun logError(tag: String?, throwable: Throwable) {
        Log.e(tag ?: TAG_ERROR, throwable.localizedMessage, throwable)
    }

    override fun logError(tag: String?, message: String) {
        Log.e(tag ?: TAG_ERROR, message)
    }

    override fun logDebug(tag: String?, throwable: Throwable, message: String) {
        Log.d(tag ?: TAG_DEBUG, message, throwable)
    }

    override fun logDebug(tag: String?, throwable: Throwable) {
        Log.d(tag ?: TAG_DEBUG, throwable.localizedMessage, throwable)
    }

    override fun logDebug(tag: String?, message: String) {
        Log.d(tag ?: TAG_DEBUG, message)
    }

    override fun logWarning(tag: String?, throwable: Throwable, message: String) {
        Log.w(tag ?: TAG_WARNING, message, throwable)
    }

    override fun logWarning(tag: String?, throwable: Throwable) {
        Log.d(tag ?: TAG_WARNING, throwable.localizedMessage, throwable)
    }

    override fun logWarning(tag: String?, message: String) {
        Log.d(tag ?: TAG_WARNING, message)
    }

    override fun logInfo(tag: String?, throwable: Throwable, message: String) {
        Log.i(tag ?: TAG_INFO, message, throwable)
    }

    override fun logInfo(tag: String?, throwable: Throwable) {
        Log.i(tag ?: TAG_INFO, throwable.localizedMessage, throwable)
    }

    override fun logInfo(tag: String?, message: String) {
        Log.i(tag ?: TAG_INFO, message)
    }

    override fun logVerbose(tag: String?, throwable: Throwable, message: String) {
        Log.v(tag ?: TAG_VERBOSE, message, throwable)
    }

    override fun logVerbose(tag: String?, throwable: Throwable) {
        Log.v(tag ?: TAG_VERBOSE, throwable.localizedMessage, throwable)
    }

    override fun logVerbose(tag: String?, message: String) {
        Log.v(tag ?: TAG_VERBOSE, message)
    }

    override fun logWtf(tag: String?, throwable: Throwable, message: String) {
        Log.wtf(tag ?: TAG_WTF, message, throwable)
    }

    override fun logWtf(tag: String?, throwable: Throwable) {
        Log.wtf(tag ?: TAG_WTF, throwable.localizedMessage, throwable)
    }

    override fun logWtf(tag: String?, message: String) {
        Log.wtf(tag ?: TAG_WTF, message)
    }
}