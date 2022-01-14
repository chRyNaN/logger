package com.chrynan.logger

import android.util.Log

@Suppress("unused", "LogNotTimber")
open class LogCatLogger : LogInitializer,
    Loggable {

    override fun init() = info(message = "Initializing ${this::class.simpleName}.")

    override fun log(logType: LogType, tag: String, message: String?, throwable: Throwable?) {
        when (logType) {
            LogType.INFO -> Log.i(tag, message, throwable)
            LogType.DEBUG -> Log.d(tag, message, throwable)
            LogType.ERROR -> Log.e(tag, message, throwable)
            LogType.VERBOSE -> Log.v(tag, message, throwable)
            LogType.WARNING -> Log.w(tag, message, throwable)
            LogType.WTF -> Log.wtf(tag, message, throwable)
        }
    }
}
