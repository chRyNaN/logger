@file:Suppress("unused")

package com.chrynan.logger

import javax.annotation.processing.Messager
import javax.tools.Diagnostic

open class JavaAnnotationProcessorMessagerLogger(private val messager: Messager) : Logger,
    LogInitializer {

    override var isEnabled: Boolean = false

    override fun init() = info(message = "Initializing ${javaClass.simpleName}")

    override fun log(logType: LogType, tag: String, message: String?, throwable: Throwable?) {
        if (isEnabled) {
            val kind = when (logType) {
                LogType.DEBUG -> Diagnostic.Kind.NOTE
                LogType.INFO -> Diagnostic.Kind.NOTE
                LogType.VERBOSE -> Diagnostic.Kind.OTHER
                LogType.WARNING -> Diagnostic.Kind.WARNING
                LogType.ERROR -> Diagnostic.Kind.ERROR
                LogType.WTF -> Diagnostic.Kind.MANDATORY_WARNING
            }

            messager.printMessage(kind, "Tag: $tag; Message: $message; Throwable: $throwable")
        }
    }
}

typealias JavaMessageLogger = JavaAnnotationProcessorMessagerLogger
