//[logger-core](../../../index.md)/[com.chrynan.logger](../index.md)/[Log](index.md)

# Log

[common]\
object [Log](index.md) : [Loggable](../-loggable/index.md), [LogInitializer](../-log-initializer/index.md)

An implementation of [Loggable](../-loggable/index.md) and [LogInitializer](../-log-initializer/index.md) that can be used as a singleton base to log throughout the application. Before calling one of [log](log.md) functions, a [Loggable](../-loggable/index.md) has to be assigned to the [loggable](loggable.md) property. Optionally, the [init](init.md) function can be called next, which just delegates to the [loggable](loggable.md) init function if it is a [LogInitializer](../-log-initializer/index.md) implementation.

Note: This object is annotated with [ThreadLocal](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.native.concurrent/-thread-local/index.html) which means that a new instance will be created for each Thread in Kotlin Native.

## Functions

| Name | Summary |
|---|---|
| [init](init.md) | [common]<br>open override fun [init](init.md)() |
| [log](log.md) | [common]<br>open override fun [log](log.md)(logType: [LogType](../-log-type/index.md), tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)?) |
| [logDebug](../-loggable/log-debug.md) | [common]<br>open fun [logDebug](../-loggable/log-debug.md)(tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null, message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null) |
| [logError](../-loggable/log-error.md) | [common]<br>open fun [logError](../-loggable/log-error.md)(tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null, message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null) |
| [logInfo](../-loggable/log-info.md) | [common]<br>open fun [logInfo](../-loggable/log-info.md)(tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null, message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null) |
| [logVerbose](../-loggable/log-verbose.md) | [common]<br>open fun [logVerbose](../-loggable/log-verbose.md)(tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null, message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null) |
| [logWarning](../-loggable/log-warning.md) | [common]<br>open fun [logWarning](../-loggable/log-warning.md)(tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null, message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null) |
| [logWtf](../-loggable/log-wtf.md) | [common]<br>open fun [logWtf](../-loggable/log-wtf.md)(tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null, message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null) |

## Properties

| Name | Summary |
|---|---|
| [loggable](loggable.md) | [common]<br>lateinit var [loggable](loggable.md): [Loggable](../-loggable/index.md) |
