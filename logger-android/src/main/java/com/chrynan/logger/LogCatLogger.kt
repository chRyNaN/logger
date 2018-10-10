package com.chrynan.logger

import android.util.Log

@Suppress("unused")
open class LogCatLogger : LogInitializer,
        Loggable {

    companion object {

        private const val TAG_ERROR = "Error"
        private const val TAG_WARNING = "Warning"
        private const val TAG_DEBUG = "Debug"
        private const val TAG_INFO = "Info"
        private const val TAG_VERBOSE = "Verbose"
        private const val TAG_WTF = "Wtf"
    }

    override fun init() {
        Log.i(TAG_INFO, "Initializing ${this.javaClass.simpleName}.")
    }

    override fun logError(throwable: Throwable, message: String) {
        Log.e(TAG_ERROR, message, throwable)
    }

    override fun logError(throwable: Throwable) {
        Log.e(TAG_ERROR, throwable.localizedMessage, throwable)
    }

    override fun logError(message: String) {
        Log.e(TAG_ERROR, message)
    }

    override fun logDebug(throwable: Throwable, message: String) {
        Log.d(TAG_DEBUG, message, throwable)
    }

    override fun logDebug(throwable: Throwable) {
        Log.d(TAG_DEBUG, throwable.localizedMessage, throwable)
    }

    override fun logDebug(message: String) {
        Log.d(TAG_DEBUG, message)
    }

    override fun logWarning(throwable: Throwable, message: String) {
        Log.w(TAG_WARNING, message, throwable)
    }

    override fun logWarning(throwable: Throwable) {
        Log.d(TAG_WARNING, throwable.localizedMessage, throwable)
    }

    override fun logWarning(message: String) {
        Log.d(TAG_WARNING, message)
    }

    override fun logInfo(throwable: Throwable, message: String) {
        Log.i(TAG_INFO, message, throwable)
    }

    override fun logInfo(throwable: Throwable) {
        Log.i(TAG_INFO, throwable.localizedMessage, throwable)
    }

    override fun logInfo(message: String) {
        Log.i(TAG_INFO, message)
    }

    override fun logVerbose(throwable: Throwable, message: String) {
        Log.v(TAG_VERBOSE, message, throwable)
    }

    override fun logVerbose(throwable: Throwable) {
        Log.v(TAG_VERBOSE, throwable.localizedMessage, throwable)
    }

    override fun logVerbose(message: String) {
        Log.v(TAG_VERBOSE, message)
    }

    override fun logWtf(throwable: Throwable, message: String) {
        Log.wtf(TAG_WTF, message, throwable)
    }

    override fun logWtf(throwable: Throwable) {
        Log.wtf(TAG_WTF, throwable.localizedMessage, throwable)
    }

    override fun logWtf(message: String) {
        Log.wtf(TAG_WTF, message)
    }
}