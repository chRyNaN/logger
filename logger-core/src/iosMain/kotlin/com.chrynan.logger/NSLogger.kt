@file:Suppress("unused")

package com.chrynan.logger

import platform.Foundation.NSLog

open class NSLogger : Logger,
    LogInitializer {

    override var isEnabled: Boolean = false

    override fun init() {}

    override fun log(logType: LogType, tag: String, message: String?, throwable: Throwable?) {
        if (isEnabled) {
            NSLog("%s: (%s) %s", logType.typeName, tag, message)

            throwable?.let {
                NSLog("%s", it.stackTraceToString())
            }
        }
    }
}
