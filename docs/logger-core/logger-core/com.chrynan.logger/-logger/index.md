//[logger-core](../../../index.md)/[com.chrynan.logger](../index.md)/[Logger](index.md)

# Logger

[common]\
interface [Logger](index.md)

A platform-agnostic Kotlin Multiplatform Logging interface inspired by Android's Log class.

## Functions

| Name | Summary |
|---|---|
| [debug](debug.md) | [common]<br>open fun [debug](debug.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null) |
| [error](error.md) | [common]<br>open fun [error](error.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null) |
| [info](info.md) | [common]<br>open fun [info](info.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null) |
| [log](log.md) | [common]<br>abstract fun [log](log.md)(logType: [LogType](../-log-type/index.md), tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null) |
| [verbose](verbose.md) | [common]<br>open fun [verbose](verbose.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null) |
| [warning](warning.md) | [common]<br>open fun [warning](warning.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null) |
| [wtf](wtf.md) | [common]<br>open fun [wtf](wtf.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null) |

## Properties

| Name | Summary |
|---|---|
| [isEnabled](is-enabled.md) | [common]<br>abstract var [isEnabled](is-enabled.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Determines whether this [Logger](index.md) instance should be used to output logs. This value should default to true. |

## Inheritors

| Name |
|---|
| [LogCatLogger](../-log-cat-logger/index.md) |
| [DelegatingLogger](../-delegating-logger/index.md) |
| [Log](../-log/index.md) |
| [NoActionLogger](../-no-action-logger/index.md) |
| [SimplePrintLineLogger](../-simple-print-line-logger/index.md) |
| [NSLogger](../-n-s-logger/index.md) |
| [ConsoleLogger](../-console-logger/index.md) |
| [JavaAnnotationProcessorMessagerLogger](../-java-annotation-processor-messager-logger/index.md) |
| [JavaLogger](../-java-logger/index.md) |

## Extensions

| Name | Summary |
|---|---|
| [log](../log.md) | [common]<br>fun [Logger](index.md).[log](../log.md)(logValues: [LogValues](../-log-values/index.md))<br>fun [Logger](index.md).[log](../log.md)(loggable: [Loggable](../-loggable/index.md)) |
