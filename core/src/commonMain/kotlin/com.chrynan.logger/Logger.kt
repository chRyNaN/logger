package com.chrynan.logger

object Logger : Loggable {

    lateinit var loggable: Loggable

    override fun log(logType: LogType, tag: String, message: String?, throwable: Throwable?) =
            loggable.log(logType = logType, tag = tag, message = message, throwable = throwable)
}