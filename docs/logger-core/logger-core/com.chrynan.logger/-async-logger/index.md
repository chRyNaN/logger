//[logger-core](../../../index.md)/[com.chrynan.logger](../index.md)/[AsyncLogger](index.md)

# AsyncLogger

[common]\
abstract class [AsyncLogger](index.md) : [Logger](../-logger/index.md)

An abstract class implementation of the [Logger](../-logger/index.md) interface allowing for use of kotlin coroutines and suspend functions. This effectively allows for asynchronous logging of messages.

Example usage:

```kotlin
class MyAsyncLogger(
    override val coroutineScope: CoroutineScope,
    private val api: Api
) : AsyncLogger() {

    override suspend fun logAsync(logType: LogType, tag: String, message: String?, throwable: Throwable?) {
        api.logMessage(message).await()
    }
}
```

## Constructors

| | |
|---|---|
| [AsyncLogger](-async-logger.md) | [common]<br>fun [AsyncLogger](-async-logger.md)() |

## Functions

| Name | Summary |
|---|---|
| [log](log.md) | [common]<br>override fun [log](log.md)(logType: [LogType](../-log-type/index.md), tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)?)<br>Performs the action to log the provided details. |

## Properties

| Name | Summary |
|---|---|
| [isEnabled](is-enabled.md) | [common]<br>open override var [isEnabled](is-enabled.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false<br>Determines whether this [Logger](../-logger/index.md) instance should be used to output logs. The default value is up to the implementation and platform, but generally should be `false` to prevent accidental logging in a production environment. Explicitly set the value to be certain whether logging is enabled or not. |
