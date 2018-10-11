package com.chrynan.logger

/**
 * A simple implementation of [Loggable] that performs no action and prints no log when a function is called. This class
 * could be useful to extend if only some functions have to be overridden.
 */
@Suppress("unused")
open class NoActionLogger : LogInitializer,
        Loggable {

    override fun init() {}

    override fun logError(tag: String?, throwable: Throwable, message: String) {}

    override fun logError(tag: String?, throwable: Throwable) {}

    override fun logError(tag: String?, message: String) {}

    override fun logDebug(tag: String?, throwable: Throwable, message: String) {}

    override fun logDebug(tag: String?, throwable: Throwable) {}

    override fun logDebug(tag: String?, message: String) {}

    override fun logWarning(tag: String?, throwable: Throwable, message: String) {}

    override fun logWarning(tag: String?, throwable: Throwable) {}

    override fun logWarning(tag: String?, message: String) {}

    override fun logInfo(tag: String?, throwable: Throwable, message: String) {}

    override fun logInfo(tag: String?, throwable: Throwable) {}

    override fun logInfo(tag: String?, message: String) {}

    override fun logVerbose(tag: String?, throwable: Throwable, message: String) {}

    override fun logVerbose(tag: String?, throwable: Throwable) {}

    override fun logVerbose(tag: String?, message: String) {}

    override fun logWtf(tag: String?, throwable: Throwable, message: String) {}

    override fun logWtf(tag: String?, throwable: Throwable) {}

    override fun logWtf(tag: String?, message: String) {}
}