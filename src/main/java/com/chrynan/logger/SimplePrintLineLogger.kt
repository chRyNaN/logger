package com.chrynan.logger

/**
 * A simple implementation of [Loggable] that calls [println] when a log function is called.
 */
@Suppress("unused")
open class SimplePrintLineLogger : LogInitializer,
        Loggable {

    companion object {

        private const val TAG_ERROR = "Error"
        private const val TAG_WARNING = "Warning"
        private const val TAG_DEBUG = "Debug"
        private const val TAG_INFO = "Info"
        private const val TAG_VERBOSE = "Verbose"
        private const val TAG_WTF = "Wtf"
        private const val MESSAGE = "Message"
        private const val THROWABLE_MESSAGE = "Throwable Message"
    }

    override fun init() = log(tag = TAG_INFO, message = "Initializing ${this::class.java.name}.")

    override fun logError(throwable: Throwable, message: String) = log(tag = TAG_ERROR, message = message, throwable = throwable)

    override fun logError(throwable: Throwable) = log(tag = TAG_ERROR, throwable = throwable)

    override fun logError(message: String) = log(tag = TAG_ERROR, message = message)

    override fun logDebug(throwable: Throwable, message: String) = log(tag = TAG_DEBUG, message = message, throwable = throwable)

    override fun logDebug(throwable: Throwable) = log(tag = TAG_DEBUG, throwable = throwable)

    override fun logDebug(message: String) = log(tag = TAG_DEBUG, message = message)

    override fun logWarning(throwable: Throwable, message: String) = log(tag = TAG_WARNING, message = message, throwable = throwable)

    override fun logWarning(throwable: Throwable) = log(tag = TAG_WARNING, throwable = throwable)

    override fun logWarning(message: String) = log(tag = TAG_WARNING, message = message)

    override fun logInfo(throwable: Throwable, message: String) = log(tag = TAG_INFO, message = message, throwable = throwable)

    override fun logInfo(throwable: Throwable) = log(tag = TAG_INFO, throwable = throwable)

    override fun logInfo(message: String) = log(tag = TAG_INFO, message = message)

    override fun logVerbose(throwable: Throwable, message: String) = log(tag = TAG_VERBOSE, message = message, throwable = throwable)

    override fun logVerbose(throwable: Throwable) = log(tag = TAG_VERBOSE, throwable = throwable)

    override fun logVerbose(message: String) = log(tag = TAG_VERBOSE, message = message)

    override fun logWtf(throwable: Throwable, message: String) = log(tag = TAG_WTF, message = message, throwable = throwable)

    override fun logWtf(throwable: Throwable) = log(tag = TAG_WTF, throwable = throwable)

    override fun logWtf(message: String) = log(tag = TAG_WTF, message = message)

    @Suppress("MemberVisibilityCanPrivate")
    protected fun log(tag: String, message: String? = null, throwable: Throwable? = null) {
        val sb = StringBuilder()
        sb.append("$tag: ")
        message?.let { sb.append("$MESSAGE: $it: ") }
        throwable?.let {
            sb.append("$THROWABLE_MESSAGE: ${it.message}: ")
            sb.append(it)
        }
        println(sb.toString())
    }
}