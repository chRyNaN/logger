//[logger-core](../../../index.md)/[com.chrynan.logger](../index.md)/[DelegatingLogger](index.md)

# DelegatingLogger

[common]\
class [DelegatingLogger](index.md)(loggers: [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)&lt;[Logger](../-logger/index.md)&gt;, delegateIsEnabledChanges: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) : [Logger](../-logger/index.md), [LogInitializer](../-log-initializer/index.md)

A [Logger](../-logger/index.md) implementation that delegates to the provided [loggers](../../../../logger-core/com.chrynan.logger/-delegating-logger/loggers.md). This allows for using multiple [Logger](../-logger/index.md)s.

## Constructors

| | |
|---|---|
| [DelegatingLogger](-delegating-logger.md) | [common]<br>fun [DelegatingLogger](-delegating-logger.md)(loggers: [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)&lt;[Logger](../-logger/index.md)&gt;, delegateIsEnabledChanges: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false) |

## Functions

| Name | Summary |
|---|---|
| [debug](../-logger/debug.md) | [common]<br>open fun [debug](../-logger/debug.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null) |
| [error](../-logger/error.md) | [common]<br>open fun [error](../-logger/error.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null) |
| [info](../-logger/info.md) | [common]<br>open fun [info](../-logger/info.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null) |
| [init](init.md) | [common]<br>open override fun [init](init.md)() |
| [log](log.md) | [common]<br>open override fun [log](log.md)(logType: [LogType](../-log-type/index.md), tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)?) |
| [verbose](../-logger/verbose.md) | [common]<br>open fun [verbose](../-logger/verbose.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null) |
| [warning](../-logger/warning.md) | [common]<br>open fun [warning](../-logger/warning.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null) |
| [wtf](../-logger/wtf.md) | [common]<br>open fun [wtf](../-logger/wtf.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null) |

## Properties

| Name | Summary |
|---|---|
| [isEnabled](is-enabled.md) | [common]<br>open override var [isEnabled](is-enabled.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true<br>Determines whether this [Logger](../-logger/index.md) instance should be used to output logs. This value should default to true. |
