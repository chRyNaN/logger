@file:Suppress("unused")

package com.chrynan.logger

/**
 * A platform-agnostic Kotlin Multiplatform Logging interface inspired by Android's Log class.
 */
interface Logger {

    /**
     * Determines whether this [Logger] instance should be used to output logs. This value should default to `true`.
     *
     * **Note:** that it is up to the [Logger] implementation to prevent logging if this value returns `false`.
     */
    var isEnabled: Boolean

    /**
     * Performs the action to log the provided details.
     */
    fun log(logType: LogType, tag: String, message: String? = null, throwable: Throwable? = null)
}
