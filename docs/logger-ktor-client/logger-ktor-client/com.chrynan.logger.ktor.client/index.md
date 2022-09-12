//[logger-ktor-client](../../index.md)/[com.chrynan.logger.ktor.client](index.md)

# Package com.chrynan.logger.ktor.client

## Types

| Name | Summary |
|---|---|
| [KtorLogger](-ktor-logger/index.md) | [common]<br>class [KtorLogger](-ktor-logger/index.md)(logger: [Logger](../../../logger-core/logger-core/com.chrynan.logger/-logger/index.md) = Log, defaultLogType: [LogType](../../../logger-core/logger-core/com.chrynan.logger/-log-type/index.md) = LogType.VERBOSE, defaultTag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null) : [Logger](../../../logger-core/logger-core/com.chrynan.logger/-logger/index.md), Logger<br>A [com.chrynan.logger.Logger](../../../logger-core/logger-core/com.chrynan.logger/-logger/index.md) and io.ktor.client.plugins.logging.Logger implementation that delegates to the provided [logger](../../../logger-ktor-client/com.chrynan.logger.ktor.client/-ktor-logger/logger.md) for all the log calls. This class is meant to create a bridge between this logging library and the Ktor Client Logging plugin. |
