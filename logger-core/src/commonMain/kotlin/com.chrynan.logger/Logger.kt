@file:Suppress("unused")

package com.chrynan.logger

/**
 * The base [Loggable] implementation that can be used globally once the [loggable] property is set.
 */
object Logger : Loggable {

    lateinit var loggable: Loggable

    override fun log(logType: LogType, tag: String, message: String?, throwable: Throwable?) =
        loggable.log(logType = logType, tag = tag, message = message, throwable = throwable)
}
