//[logger-core](../../../index.md)/[com.chrynan.logger](../index.md)/[LogCatLogger](index.md)

# LogCatLogger

[android]\
open class [LogCatLogger](index.md) : [LogInitializer](../../../../logger-core/logger-core/com.chrynan.logger/-log-initializer/index.md), [Logger](../../../../logger-core/logger-core/com.chrynan.logger/-logger/index.md)

## Constructors

| | |
|---|---|
| [LogCatLogger](-log-cat-logger.md) | [android]<br>fun [LogCatLogger](-log-cat-logger.md)() |

## Functions

| Name | Summary |
|---|---|
| [init](init.md) | [android]<br>open override fun [init](init.md)() |
| [log](log.md) | [android]<br>open override fun [log](log.md)(logType: [LogType](../../../../logger-core/logger-core/com.chrynan.logger/-log-type/index.md), tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)?)<br>Performs the action to log the provided details. |

## Properties

| Name | Summary |
|---|---|
| [isEnabled](is-enabled.md) | [android]<br>open override var [isEnabled](is-enabled.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Determines whether this [Logger](../../../../logger-core/logger-core/com.chrynan.logger/-logger/index.md) instance should be used to output logs. The default value is up to the implementation and platform, but generally should be `false` to prevent accidental logging in a production environment. Explicitly set the value to be certain whether logging is enabled or not. |
