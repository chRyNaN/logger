package com.chrynan.logger.android.timber

import com.chrynan.logger.LogInitializer
import com.chrynan.logger.LogType
import com.chrynan.logger.Logger
import timber.log.Timber

@Suppress("unused")
abstract class TimberLogger : LogInitializer,
    Logger {

    override fun log(logType: LogType, tag: String, message: String?, throwable: Throwable?) {
        when (logType) {
            LogType.INFO -> Timber.i(throwable, messageWithTag(tag = tag, message = message))
            LogType.DEBUG -> Timber.d(throwable, messageWithTag(tag = tag, message = message))
            LogType.ERROR -> Timber.e(throwable, messageWithTag(tag = tag, message = message))
            LogType.VERBOSE -> Timber.v(throwable, messageWithTag(tag = tag, message = message))
            LogType.WARNING -> Timber.w(throwable, messageWithTag(tag = tag, message = message))
            LogType.WTF -> Timber.wtf(throwable, messageWithTag(tag = tag, message = message))
        }
    }

    private fun messageWithTag(tag: String, message: String?) = "Tag: $tag, message: $message"
}
