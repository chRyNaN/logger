//[logger-core](../../../index.md)/[com.chrynan.logger](../index.md)/[Logger](index.md)

# Logger

[common]\
interface [Logger](index.md)

A platform-agnostic Kotlin Multiplatform Logging interface inspired by Android's Log class.

## Functions

| Name | Summary |
|---|---|
| [log](log.md) | [common]<br>abstract fun [log](log.md)(logType: [LogType](../-log-type/index.md), tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null)<br>Performs the action to log the provided details. |

## Properties

| Name | Summary |
|---|---|
| [isEnabled](is-enabled.md) | [common]<br>abstract var [isEnabled](is-enabled.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Determines whether this [Logger](index.md) instance should be used to output logs. The default value is up to the implementation and platform, but generally should be `false` to prevent accidental logging in a production environment. Explicitly set the value to be certain whether logging is enabled or not. |

## Inheritors

| Name |
|---|
| [LogCatLogger](../-log-cat-logger/index.md) |
| [AsyncLogger](../-async-logger/index.md) |
| [DelegatingLogger](../-delegating-logger/index.md) |
| [Log](../-log/index.md) |
| [NoActionLogger](../-no-action-logger/index.md) |
| [PrintLineLogger](../-print-line-logger/index.md) |
| [NSLogger](../-n-s-logger/index.md) |
| [ConsoleLogger](../-console-logger/index.md) |
| [JavaAnnotationProcessorMessagerLogger](../-java-annotation-processor-messager-logger/index.md) |
| [JavaLogger](../-java-logger/index.md) |

## Extensions

| Name | Summary |
|---|---|
| [debug](../debug.md) | [common]<br>inline fun [Logger](index.md).[debug](../debug.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null)<br>inline fun [Logger](index.md).[debug](../debug.md)(tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null, messageBuilder: () -&gt; [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?)<br>Invokes the [Logger.log](log.md) function for [LogType.DEBUG](../-log-type/-d-e-b-u-g/index.md). |
| [error](../error.md) | [common]<br>inline fun [Logger](index.md).[error](../error.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null)<br>inline fun [Logger](index.md).[error](../error.md)(tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null, messageBuilder: () -&gt; [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?)<br>Invokes the [Logger.log](log.md) function for [LogType.ERROR](../-log-type/-e-r-r-o-r/index.md). |
| [info](../info.md) | [common]<br>inline fun [Logger](index.md).[info](../info.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null)<br>inline fun [Logger](index.md).[info](../info.md)(tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null, messageBuilder: () -&gt; [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?)<br>Invokes the [Logger.log](log.md) function for [LogType.INFO](../-log-type/-i-n-f-o/index.md). |
| [log](../log.md) | [common]<br>inline fun [Logger](index.md).[log](../log.md)(logValues: [LogValues](../-log-values/index.md))<br>Invokes the [Logger.log](log.md) function using the provided [logValues](../log.md).<br>[common]<br>inline fun [Logger](index.md).[log](../log.md)(loggable: [Loggable](../-loggable/index.md))<br>Invokes the [Logger.log](log.md) function using the [Loggable.logValues](../-loggable/log-values.md) obtained from the provided [loggable](../log.md) instance. |
| [verbose](../verbose.md) | [common]<br>inline fun [Logger](index.md).[verbose](../verbose.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null)<br>inline fun [Logger](index.md).[verbose](../verbose.md)(tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null, messageBuilder: () -&gt; [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?)<br>Invokes the [Logger.log](log.md) function for [LogType.VERBOSE](../-log-type/-v-e-r-b-o-s-e/index.md). |
| [warning](../warning.md) | [common]<br>inline fun [Logger](index.md).[warning](../warning.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null)<br>inline fun [Logger](index.md).[warning](../warning.md)(tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null, messageBuilder: () -&gt; [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?)<br>Invokes the [Logger.log](log.md) function for [LogType.WARNING](../-log-type/-w-a-r-n-i-n-g/index.md). |
| [wtf](../wtf.md) | [common]<br>inline fun [Logger](index.md).[wtf](../wtf.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null)<br>inline fun [Logger](index.md).[wtf](../wtf.md)(tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null, messageBuilder: () -&gt; [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?)<br>Invokes the [Logger.log](log.md) function for [LogType.WTF](../-log-type/-w-t-f/index.md). |
