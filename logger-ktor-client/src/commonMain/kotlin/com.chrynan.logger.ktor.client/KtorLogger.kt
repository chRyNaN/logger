@file:Suppress("unused")

package com.chrynan.logger.ktor.client

import com.chrynan.logger.Log
import com.chrynan.logger.LogType
import io.ktor.client.plugins.logging.*

/**
 * A [com.chrynan.logger.Logger] and [io.ktor.client.plugins.logging.Logger] implementation that delegates to the
 * provided [logger] for all the log calls. This class is meant to create a bridge between this logging library and the
 * Ktor Client Logging plugin.
 *
 * Example usage:
 * ```kotlin
 * val client = HttpClient(CIO) {
 *     install(Logging) {
 *         logger = KtorLogger(defaultLogType = LogType.INFO)
 *         level = LogLevel.HEADERS
 *     }
 * }
 * ```
 *
 * @property [logger] The logger used to log messages. This [com.chrynan.logger.Logger] will be used when the
 * [io.ktor.client.plugins.logging.Logger.log] function is invoked, along with the [defaultLogType] and [defaultTag]
 * values. Also, for convenience, this class delegates to this [logger] so that this class can also be used directly as
 * a [com.chrynan.logger.Logger].
 * @property [defaultLogType] The default [LogType] to be used when the [io.ktor.client.plugins.logging.Logger.log]
 * function is invoked.
 * @property [defaultTag] The default optional [String] value to be used as a tag when the
 * [io.ktor.client.plugins.logging.Logger.log] function is invoked.
 */
class KtorLogger(
    private val logger: com.chrynan.logger.Logger = Log,
    private val defaultLogType: LogType = LogType.VERBOSE,
    private val defaultTag: String? = null
) : com.chrynan.logger.Logger by logger,
    Logger {

    override fun log(message: String) =
        logger.log(logType = defaultLogType, tag = defaultTag ?: defaultLogType.typeName, message = message)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KtorLogger) return false

        if (logger != other.logger) return false
        if (defaultLogType != other.defaultLogType) return false
        if (defaultTag != other.defaultTag) return false

        return true
    }

    override fun hashCode(): Int {
        var result = logger.hashCode()

        result = 31 * result + defaultLogType.hashCode()
        result = 31 * result + (defaultTag?.hashCode() ?: 0)

        return result
    }

    override fun toString(): String =
        "KtorLogger(" +
                "logger=$logger, " +
                "logType=$defaultLogType, " +
                "tag=$defaultTag)"
}
