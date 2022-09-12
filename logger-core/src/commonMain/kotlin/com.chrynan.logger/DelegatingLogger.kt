@file:Suppress("unused")

package com.chrynan.logger

/**
 * A [Logger] implementation that delegates to the provided [loggers]. This allows for using multiple [Logger]s.
 */
class DelegatingLogger(
    private val loggers: Set<Logger>,
    private val delegateIsEnabledChanges: Boolean = false
) : Logger,
    LogInitializer {

    override fun init() {
        loggers.forEach {
            (it as? LogInitializer)?.init()
        }
    }

    override var isEnabled: Boolean = false
        set(value) {
            field = value

            if (delegateIsEnabledChanges) {
                loggers.forEach { it.isEnabled = value }
            }
        }

    override fun log(logType: LogType, tag: String, message: String?, throwable: Throwable?) {
        loggers.forEach {
            if (it.isEnabled) {
                it.log(logType = logType, tag = tag, message = message, throwable = throwable)
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DelegatingLogger) return false

        if (loggers != other.loggers) return false
        if (delegateIsEnabledChanges != other.delegateIsEnabledChanges) return false
        if (isEnabled != other.isEnabled) return false

        return true
    }

    override fun hashCode(): Int {
        var result = loggers.hashCode()

        result = 31 * result + delegateIsEnabledChanges.hashCode()
        result = 31 * result + isEnabled.hashCode()

        return result
    }

    override fun toString(): String =
        "DelegatingLogger(" +
                "loggers=$loggers, " +
                "delegateIsEnabledChanges=$delegateIsEnabledChanges, " +
                "isEnabled=$isEnabled)"
}
