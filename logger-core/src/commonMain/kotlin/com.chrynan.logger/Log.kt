@file:Suppress("unused")

package com.chrynan.logger

import kotlin.native.concurrent.ThreadLocal

/**
 * An implementation of [Logger] and [LogInitializer] that can be used as a singleton base to log
 * throughout the application. Before calling one of [log] functions, a [Logger] has to be
 * assigned to the [logger] property, this defaults to the [DefaultLogger]. Optionally, the [init] function can be
 * called next, which just delegates to the [logger] init function if it is a [LogInitializer] implementation.
 *
 * Note: This object is annotated with [ThreadLocal] which means that a new instance will be
 * created for each Thread in Kotlin Native.
 */
@ThreadLocal
object Log : Logger,
    LogInitializer {

    override var isEnabled: Boolean
        get() = logger.isEnabled
        set(value) {
            logger.isEnabled = value
        }

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
