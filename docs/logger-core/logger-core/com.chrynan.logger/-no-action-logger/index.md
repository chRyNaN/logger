//[logger-core](../../../index.md)/[com.chrynan.logger](../index.md)/[NoActionLogger](index.md)

# NoActionLogger

[common]\
open class [NoActionLogger](index.md) : [LogInitializer](../-log-initializer/index.md), [Loggable](../-loggable/index.md)

A simple implementation of [Loggable](../-loggable/index.md) that performs no action and prints no log when a function is called. This class could be useful to extend if only some functions have to be overridden.

## Constructors

| | |
|---|---|
| [NoActionLogger](-no-action-logger.md) | [common]<br>fun [NoActionLogger](-no-action-logger.md)() |

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
