//[logger-ktor-client](../../../index.md)/[com.chrynan.logger.ktor.client](../index.md)/[KtorLogger](index.md)

# KtorLogger

[common]\
class [KtorLogger](index.md)(logger: [Logger](../../../../logger-core/logger-core/com.chrynan.logger/-logger/index.md) = Log, defaultLogType: [LogType](../../../../logger-core/logger-core/com.chrynan.logger/-log-type/index.md) = LogType.VERBOSE, defaultTag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null) : [Logger](../../../../logger-core/logger-core/com.chrynan.logger/-logger/index.md), Logger

A [com.chrynan.logger.Logger](../../../../logger-core/logger-core/com.chrynan.logger/-logger/index.md) and io.ktor.client.plugins.logging.Logger implementation that delegates to the provided [logger](../../../../logger-ktor-client/com.chrynan.logger.ktor.client/-ktor-logger/logger.md) for all the log calls. This class is meant to create a bridge between this logging library and the Ktor Client Logging plugin.

Example usage:

```kotlin
val client = HttpClient(CIO) {
    install(Logging) {
        logger = KtorLogger(defaultLogType = LogType.INFO)
        level = LogLevel.HEADERS
    }
}
```

## Constructors

| | |
|---|---|
| [KtorLogger](-ktor-logger.md) | [common]<br>fun [KtorLogger](-ktor-logger.md)(logger: [Logger](../../../../logger-core/logger-core/com.chrynan.logger/-logger/index.md) = Log, defaultLogType: [LogType](../../../../logger-core/logger-core/com.chrynan.logger/-log-type/index.md) = LogType.VERBOSE, defaultTag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null) |

## Functions

| Name | Summary |
|---|---|
| [equals](equals.md) | [common]<br>open operator override fun [equals](equals.md)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [hashCode](hash-code.md) | [common]<br>open override fun [hashCode](hash-code.md)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [log](log.md) | [common]<br>open override fun [log](log.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))<br>open override fun [log](index.md#-1060515817%2FFunctions%2F-1679481623)(logType: [LogType](../../../../logger-core/logger-core/com.chrynan.logger/-log-type/index.md), tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)?) |
| [toString](to-string.md) | [common]<br>open override fun [toString](to-string.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

## Properties

| Name | Summary |
|---|---|
| [isEnabled](index.md#636237714%2FProperties%2F-1679481623) | [common]<br>open override var [isEnabled](index.md#636237714%2FProperties%2F-1679481623): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
