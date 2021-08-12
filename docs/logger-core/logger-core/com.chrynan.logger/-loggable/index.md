//[logger-core](../../../index.md)/[com.chrynan.logger](../index.md)/[Loggable](index.md)

# Loggable

[common]\
interface [Loggable](index.md)

A platform agnostic Kotlin Multiplatform Logging interface inspired by Android's Log class.

## Functions

| Name | Summary |
|---|---|
| [log](log.md) | [common]<br>abstract fun [log](log.md)(logType: [LogType](../-log-type/index.md), tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null) |
| [logDebug](log-debug.md) | [common]<br>open fun [logDebug](log-debug.md)(tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null, message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null) |
| [logError](log-error.md) | [common]<br>open fun [logError](log-error.md)(tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null, message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null) |
| [logInfo](log-info.md) | [common]<br>open fun [logInfo](log-info.md)(tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null, message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null) |
| [logVerbose](log-verbose.md) | [common]<br>open fun [logVerbose](log-verbose.md)(tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null, message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null) |
| [logWarning](log-warning.md) | [common]<br>open fun [logWarning](log-warning.md)(tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null, message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null) |
| [logWtf](log-wtf.md) | [common]<br>open fun [logWtf](log-wtf.md)(tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null, message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null) |

## Inheritors

| Name |
|---|
| [LogCatLogger](../-log-cat-logger/index.md) |
| [Log](../-log/index.md) |
| [NoActionLogger](../-no-action-logger/index.md) |
| [SimplePrintLineLogger](../-simple-print-line-logger/index.md) |
| [NSLogger](../-n-s-logger/index.md) |
| [ConsoleLogger](../-console-logger/index.md) |
| [JavaAnnotationProcessorMessagerLogger](../-java-annotation-processor-messager-logger/index.md) |
| [JavaLogger](../-java-logger/index.md) |
