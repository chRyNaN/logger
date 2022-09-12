@file:Suppress("unused")

package com.chrynan.logger

/**
 * Represents the type of log operation being performed.
 */
enum class LogType(val typeName: String) {

    DEBUG(typeName = "Debug"),
    WARNING(typeName = "Warning"),
    INFO(typeName = "Info"),
    VERBOSE(typeName = "Verbose"),
    WTF(typeName = "Wtf"),
    ERROR(typeName = "Error");

    companion object {

        fun getByTypeName(name: String, ignoreCase: Boolean = true): LogType? =
            values().firstOrNull { it.typeName.equals(name, ignoreCase) }
    }
}
