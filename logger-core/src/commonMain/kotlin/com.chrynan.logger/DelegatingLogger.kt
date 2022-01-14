@file:Suppress("unused")

package com.chrynan.logger

/**
 * A [Logger] implementation that delegates to the provided [loggers]. This allows for using multiple [Logger]s.
 */
class DelegatingLogger(private val loggers: Set<Logger>) : Logger,
    LogInitializer {

    override fun init() {
        loggers.forEach {
            (it as? LogInitializer)?.init()
        }
    }

    override var isEnabled: Boolean = true
        set(value) {
            field = value

            loggers.forEach { it.isEnabled = value }
        }

    override fun log(logType: LogType, tag: String, message: String?, throwable: Throwable?) {
        loggers.forEach { it.log(logType = logType, tag = tag, message = message, throwable = throwable) }
    }
}
