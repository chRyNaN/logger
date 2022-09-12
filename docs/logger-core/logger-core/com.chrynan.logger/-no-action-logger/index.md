//[logger-core](../../../index.md)/[com.chrynan.logger](../index.md)/[NoActionLogger](index.md)

# NoActionLogger

[common]\
open class [NoActionLogger](index.md) : [LogInitializer](../-log-initializer/index.md), [Logger](../-logger/index.md)

A simple implementation of [Logger](../-logger/index.md) that performs no action and prints no log when a function is called. This class could be useful to extend if only some functions have to be overridden.

## Constructors

| | |
|---|---|
| [NoActionLogger](-no-action-logger.md) | [common]<br>fun [NoActionLogger](-no-action-logger.md)() |

## Functions

| Name | Summary |
|---|---|
| [init](init.md) | [common]<br>open override fun [init](init.md)() |
| [log](log.md) | [common]<br>open override fun [log](log.md)(logType: [LogType](../-log-type/index.md), tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)?)<br>Performs the action to log the provided details. |

## Properties

| Name | Summary |
|---|---|
| [isEnabled](is-enabled.md) | [common]<br>open override var [isEnabled](is-enabled.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false<br>Determines whether this [Logger](../-logger/index.md) instance should be used to output logs. The default value is up to the implementation and platform, but generally should be `false` to prevent accidental logging in a production environment. Explicitly set the value to be certain whether logging is enabled or not. |
