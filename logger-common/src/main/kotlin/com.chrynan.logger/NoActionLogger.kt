package com.chrynan.logger

/**
 * A simple implementation of [Loggable] that performs no action and prints no log when a function is called. This class
 * could be useful to extend if only some functions have to be overridden.
 */
@Suppress("unused")
open class NoActionLogger : LogInitializer,
        Loggable {

    override fun init() {}

    override fun log(logType: LogType, tag: String, message: String?, throwable: Throwable?) {}
}