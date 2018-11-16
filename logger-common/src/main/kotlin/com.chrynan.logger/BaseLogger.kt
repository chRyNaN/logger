package com.chrynan.logger

@Suppress("unused")
abstract class BaseLogger : LogInitializer,
        Loggable {

    override fun logError(tag: String?, throwable: Throwable, message: String) =
            log(logType = LogType.ERROR, tag = tag ?: DefaultTags.TAG_ERROR, message = message, throwable = throwable)

    override fun logError(tag: String?, throwable: Throwable) =
            log(logType = LogType.ERROR, tag = tag ?: DefaultTags.TAG_ERROR, throwable = throwable)

    override fun logError(tag: String?, message: String) =
            log(logType = LogType.ERROR, tag = tag ?: DefaultTags.TAG_ERROR, message = message)

    override fun logDebug(tag: String?, throwable: Throwable, message: String) =
            log(logType = LogType.DEBUG, tag = tag ?: DefaultTags.TAG_DEBUG, message = message, throwable = throwable)

    override fun logDebug(tag: String?, throwable: Throwable) =
            log(logType = LogType.DEBUG, tag = tag ?: DefaultTags.TAG_DEBUG, throwable = throwable)

    override fun logDebug(tag: String?, message: String) =
            log(logType = LogType.DEBUG, tag = tag ?: DefaultTags.TAG_DEBUG, message = message)

    override fun logWarning(tag: String?, throwable: Throwable, message: String) =
            log(logType = LogType.WARNING, tag = tag
                    ?: DefaultTags.TAG_WARNING, message = message, throwable = throwable)

    override fun logWarning(tag: String?, throwable: Throwable) =
            log(logType = LogType.WARNING, tag = tag ?: DefaultTags.TAG_WARNING, throwable = throwable)

    override fun logWarning(tag: String?, message: String) =
            log(logType = LogType.WARNING, tag = tag ?: DefaultTags.TAG_WARNING, message = message)

    override fun logInfo(tag: String?, throwable: Throwable, message: String) =
            log(logType = LogType.INFO, tag = tag ?: DefaultTags.TAG_INFO, message = message, throwable = throwable)

    override fun logInfo(tag: String?, throwable: Throwable) =
            log(logType = LogType.INFO, tag = tag ?: DefaultTags.TAG_INFO, throwable = throwable)

    override fun logInfo(tag: String?, message: String) =
            log(logType = LogType.INFO, tag = tag ?: DefaultTags.TAG_INFO, message = message)

    override fun logVerbose(tag: String?, throwable: Throwable, message: String) =
            log(logType = LogType.VERBOSE, tag = tag
                    ?: DefaultTags.TAG_VERBOSE, message = message, throwable = throwable)

    override fun logVerbose(tag: String?, throwable: Throwable) =
            log(logType = LogType.VERBOSE, tag = tag ?: DefaultTags.TAG_VERBOSE, throwable = throwable)

    override fun logVerbose(tag: String?, message: String) =
            log(logType = LogType.VERBOSE, tag = tag ?: DefaultTags.TAG_VERBOSE, message = message)

    override fun logWtf(tag: String?, throwable: Throwable, message: String) =
            log(logType = LogType.WTF, tag = tag ?: DefaultTags.TAG_WTF, message = message, throwable = throwable)

    override fun logWtf(tag: String?, throwable: Throwable) =
            log(logType = LogType.WTF, tag = tag ?: DefaultTags.TAG_WTF, throwable = throwable)

    override fun logWtf(tag: String?, message: String) =
            log(logType = LogType.WTF, tag = tag ?: DefaultTags.TAG_WTF, message = message)

    abstract fun log(logType: LogType, tag: String, message: String? = null, throwable: Throwable? = null)

    enum class LogType {

        DEBUG,
        WARNING,
        INFO,
        VERBOSE,
        WTF,
        ERROR
    }
}