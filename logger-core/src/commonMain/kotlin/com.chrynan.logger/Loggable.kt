@file:Suppress("unused")

package com.chrynan.logger

/**
 * Represents an object than can be logged with a [Logger].
 */
interface Loggable {

    val logValues: LogValues
}

fun Logger.log(loggable: Loggable) = log(logValues = loggable.logValues)
