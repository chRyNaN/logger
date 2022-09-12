@file:Suppress("unused")

package com.chrynan.logger

/**
 * A platform-agnostic Kotlin Multiplatform Logging interface inspired by Android's Log class.
 */
interface Logger {

    /**
     * Determines whether this [Logger] instance should be used to output logs. The default value is up to the
     * implementation and platform, but generally should be `false` to prevent accidental logging in a production
     * environment. Explicitly set the value to be certain whether logging is enabled or not.
     *
     * **Note:** that it is up to the [Logger] implementation to prevent logging if this value returns `false`.
     */
    var isEnabled: Boolean

    /**
     * Performs the action to log the provided details.
     */
    fun log(logType: LogType, tag: String, message: String? = null, throwable: Throwable? = null)
}
