@file:Suppress("unused")

package com.chrynan.logger

import platform.Foundation.NSLog

class NSLogger : Loggable,
    LogInitializer {

    override fun init() {}

    override fun log(logType: LogType, tag: String, message: String?, throwable: Throwable?) {
        NSLog("%s: (%s) %s", logType.typeName, tag, message)

        throwable?.let {
            NSLog("%s", it.stackTraceToString())
        }
    }
}
