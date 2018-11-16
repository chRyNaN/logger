package com.chrynan.logger

import javax.annotation.processing.Messager
import javax.tools.Diagnostic

@Suppress("unused")
abstract class JavaAnnotationProcessorMessagerLogger : BaseLogger() {

    protected abstract val messager: Messager

    override fun init() = logInfo(message = "Initializing ${javaClass.simpleName}")

    override fun log(logType: LogType, tag: String, message: String?, throwable: Throwable?) {
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