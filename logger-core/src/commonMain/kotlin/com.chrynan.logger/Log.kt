@file:Suppress("unused")

package com.chrynan.logger

/**
 * An implementation of [Logger] and [LogInitializer] that can be used as a singleton base to log
 * throughout the application. Before calling one of [log] functions, a [Logger] has to be
 * assigned to the [logger] property, this defaults to the [DefaultLogger]. Optionally, the [init] function can be
 * called next, which just delegates to the [logger] init function if it is a [LogInitializer] implementation.
 */
object Log : Logger,
    LogInitializer {

    override var isEnabled: Boolean
        get() = logger.isEnabled
        set(value) {
            logger.isEnabled = value
        }

    @Suppress("VARIABLE_IN_SINGLETON_WITHOUT_THREAD_LOCAL") // Use new Kotlin Native memory model.
    var logger: Logger = DefaultLogger()

    override fun init() {
        (logger as? LogInitializer)?.init()
    }

    override fun log(logType: LogType, tag: String, message: String?, throwable: Throwable?) {
        if (logger.isEnabled) {
            logger.log(logType = logType, tag = tag, message = message, throwable = throwable)
        }
    }
}
