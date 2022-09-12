@file:Suppress("unused")

package com.chrynan.logger

import kotlinx.coroutines.flow.*

/**
 * An implementation of [Logger] and [LogInitializer] that can be used as a singleton base to log
 * throughout the application. Before calling one of [log] functions, a [Logger] has to be
 * assigned to the [logger] property, this defaults to the [DefaultLogger]. Optionally, the [init] function can be
 * called next, which just delegates to the [logger] init function if it is a [LogInitializer] implementation.
 */
object Log : Logger,
    LogInitializer {

    override var isEnabled: Boolean
        get() = logger.isEnabled
        set(value) {
            logger.isEnabled = value
        }

    @Suppress("VARIABLE_IN_SINGLETON_WITHOUT_THREAD_LOCAL") // Use new Kotlin Native memory model.
    var logger: Logger = DefaultLogger()

    /**
     * Retrieves a [Flow] of [LogValues] that are emitted after every successful invocation of the [log] on this [Log]
     * object.
     *
     * **Note:** If the [Log.isEnabled] property is `false` and the [Log.log] function is invoked, no [LogValues] will
     * be emitted.
     *
     * **Note:** [LogValues] are emitted after the internal [Log.log] function is successfully invoked.
     *
     * **Note:** There is no guarantee that a value emitted from this [Flow] is actually logged, as it is up to the
     * [Logger] implementation set as the [Log.logger] to decide how and whether to log.
     */
    val logValues: Flow<LogValues>
        get() = values.asStateFlow().filterNotNull()

    private val values = MutableStateFlow<LogValues?>(null)

    override fun init() {
        (logger as? LogInitializer)?.init()
    }

    override fun log(logType: LogType, tag: String, message: String?, throwable: Throwable?) {
        if (logger.isEnabled) {
            logger.log(logType = logType, tag = tag, message = message, throwable = throwable)

            values.value = LogValues(
                logType = logType,
                tag = tag,
                message = message,
                throwable = throwable
            )
        }
    }
}
