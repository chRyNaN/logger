@file:Suppress("unused")

package com.chrynan.logger

import kotlin.native.concurrent.ThreadLocal

/**
 * An implementation of [Loggable] and [LogInitializer] that can be used as a singleton base to log
 * throughout the application. Before calling one of [log] functions, a [Loggable] has to be
 * assigned to the [loggable] property. Optionally, the [init] function can be called next, which
 * just delegates to the [loggable] init function if it is a [LogInitializer] implementation.
 *
 * Note: This object is annotated with [ThreadLocal] which means that a new instance will be
 * created for each Thread in Kotlin Native.
 */
@ThreadLocal
object Log : Loggable,
    LogInitializer {

    lateinit var loggable: Loggable

    override fun init() {
        (loggable as? LogInitializer)?.init()
    }

    override fun log(logType: LogType, tag: String, message: String?, throwable: Throwable?) =
        loggable.log(logType = logType, tag = tag, message = message, throwable = throwable)
}
