package com.chrynan.loggertimber

import com.chrynan.logger.LogInitializer
import com.chrynan.logger.Loggable
import timber.log.Timber

@Suppress("unused")
abstract class TimberLogger : LogInitializer,
        Loggable {

    override fun logError(throwable: Throwable, message: String) {
        Timber.e(throwable, message)
    }

    override fun logError(throwable: Throwable) {
        Timber.e(throwable)
    }

    override fun logError(message: String) {
        Timber.e(message)
    }

    override fun logDebug(throwable: Throwable, message: String) {
        Timber.d(throwable, message)
    }

    override fun logDebug(throwable: Throwable) {
        Timber.d(throwable)
    }

    override fun logDebug(message: String) {
        Timber.d(message)
    }

    override fun logWarning(throwable: Throwable, message: String) {
        Timber.w(throwable, message)
    }

    override fun logWarning(throwable: Throwable) {
        Timber.w(throwable)
    }

    override fun logWarning(message: String) {
        Timber.w(message)
    }

    override fun logInfo(throwable: Throwable, message: String) {
        Timber.i(throwable, message)
    }

    override fun logInfo(throwable: Throwable) {
        Timber.i(throwable)
    }

    override fun logInfo(message: String) {
        Timber.i(message)
    }

    override fun logVerbose(throwable: Throwable, message: String) {
        Timber.v(throwable, message)
    }

    override fun logVerbose(throwable: Throwable) {
        Timber.v(throwable)
    }

    override fun logVerbose(message: String) {
        Timber.v(message)
    }

    override fun logWtf(throwable: Throwable, message: String) {
        Timber.wtf(throwable, message)
    }

    override fun logWtf(throwable: Throwable) {
        Timber.wtf(throwable)
    }

    override fun logWtf(message: String) {
        Timber.wtf(message)
    }
}