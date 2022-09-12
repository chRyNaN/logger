//[logger-core](../../../index.md)/[com.chrynan.logger](../index.md)/[Log](index.md)

# Log

[common]\
object [Log](index.md) : [Logger](../-logger/index.md), [LogInitializer](../-log-initializer/index.md)

An implementation of [Logger](../-logger/index.md) and [LogInitializer](../-log-initializer/index.md) that can be used as a singleton base to log throughout the application. Before calling one of [log](log.md) functions, a [Logger](../-logger/index.md) has to be assigned to the [logger](logger.md) property, this defaults to the [DefaultLogger](../-default-logger.md). Optionally, the [init](init.md) function can be called next, which just delegates to the [logger](logger.md) init function if it is a [LogInitializer](../-log-initializer/index.md) implementation.

## Functions

| Name | Summary |
|---|---|
| [init](init.md) | [common]<br>open override fun [init](init.md)() |
| [log](log.md) | [common]<br>open override fun [log](log.md)(logType: [LogType](../-log-type/index.md), tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)?)<br>Performs the action to log the provided details. |

## Properties

| Name | Summary |
|---|---|
| [isEnabled](is-enabled.md) | [common]<br>open override var [isEnabled](is-enabled.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Determines whether this [Logger](../-logger/index.md) instance should be used to output logs. The default value is up to the implementation and platform, but generally should be `false` to prevent accidental logging in a production environment. Explicitly set the value to be certain whether logging is enabled or not. |
| [logger](logger.md) | [common]<br>var [logger](logger.md): [Logger](../-logger/index.md) |
| [logValues](log-values.md) | [common]<br>val [logValues](log-values.md): Flow&lt;[LogValues](../-log-values/index.md)&gt;<br>Retrieves a Flow of [LogValues](../-log-values/index.md) that are emitted after every successful invocation of the [log](log.md) on this [Log](index.md) object. |
