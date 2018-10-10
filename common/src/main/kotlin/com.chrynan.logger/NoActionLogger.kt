package com.chrynan.logger

/**
 * A simple implementation of [Loggable] that performs no action and prints no log when a function is called. This class
 * could be useful to extend if only some functions have to be overridden.
 */
@Suppress("unused")
open class NoActionLogger : LogInitializer,
        Loggable {

    override fun init() {}

    override fun logError(throwable: Throwable, message: String) {}

    override fun logError(throwable: Throwable) {}

    override fun logError(message: String) {}

    override fun logDebug(throwable: Throwable, message: String) {}

    override fun logDebug(throwable: Throwable) {}

    override fun logDebug(message: String) {}

    override fun logWarning(throwable: Throwable, message: String) {}

    override fun logWarning(throwable: Throwable) {}

    override fun logWarning(message: String) {}

    override fun logInfo(throwable: Throwable, message: String) {}

    override fun logInfo(throwable: Throwable) {}

    override fun logInfo(message: String) {}

    override fun logVerbose(throwable: Throwable, message: String) {}

    override fun logVerbose(throwable: Throwable) {}

    override fun logVerbose(message: String) {}

    override fun logWtf(throwable: Throwable, message: String) {}

    override fun logWtf(throwable: Throwable) {}

    override fun logWtf(message: String) {}
}