@file:Suppress("unused")

package com.chrynan.logger

/**
 * Represents an object than can be logged with a [Logger].
 */
fun interface Loggable {

    /**
     * Obtains the [LogValues] that can be used to invoke the [Logger.log] function.
     */
    fun logValues(): LogValues
}
