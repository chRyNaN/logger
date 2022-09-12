@file:Suppress("unused")

package com.chrynan.logger

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

/**
 * An abstract class implementation of the [Logger] interface allowing for use of kotlin coroutines and suspend
 * functions. This effectively allows for asynchronous logging of messages.
 *
 * Example usage:
 * ```kotlin
 * class MyAsyncLogger(
 *     override val coroutineScope: CoroutineScope,
 *     private val api: Api
 * ) : AsyncLogger() {
 *
 *     override suspend fun logAsync(logType: LogType, tag: String, message: String?, throwable: Throwable?) {
 *         api.logMessage(message).await()
 *     }
 * }
 * ```
 */
abstract class AsyncLogger : Logger {

    override var isEnabled: Boolean = false

    protected abstract val coroutineScope: CoroutineScope

    protected abstract suspend fun logAsync(logType: LogType, tag: String, message: String?, throwable: Throwable?)

    final override fun log(logType: LogType, tag: String, message: String?, throwable: Throwable?) {
        if (isEnabled) {
            coroutineScope.launch { logAsync(logType = logType, tag = tag, message = message, throwable = throwable) }
        }
    }
}
