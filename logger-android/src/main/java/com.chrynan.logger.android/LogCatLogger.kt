package com.chrynan.logger.android

import android.util.Log
import com.chrynan.logger.*

@Suppress("unused", "LogNotTimber")
open class LogCatLogger : LogInitializer,
    Loggable {

    override fun init() = logInfo(message = "Initializing ${this.javaClass.simpleName}.")

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
