@file:Suppress("unused")

package com.chrynan.logger

open class ConsoleLogger : LogInitializer,
    Logger {

    override var isEnabled: Boolean = false

    override fun init() = console.info("Initializing ConsoleLogger")

    override fun log(logType: LogType, tag: String, message: String?, throwable: Throwable?) {
        if (isEnabled) {
            when (logType) {
                LogType.INFO -> console.info(tag, message, throwable)
                LogType.DEBUG -> console.log(tag, message, throwable)
                LogType.ERROR -> console.error(tag, message, throwable)
                LogType.VERBOSE -> console.log(tag, message, throwable)
                LogType.WARNING -> console.warn(tag, message, throwable)
                LogType.WTF -> console.error(tag, message, throwable)
            }
        }
    }
}
