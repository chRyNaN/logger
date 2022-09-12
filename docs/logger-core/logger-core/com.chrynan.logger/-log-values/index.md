//[logger-core](../../../index.md)/[com.chrynan.logger](../index.md)/[LogValues](index.md)

# LogValues

[common]\
data class [LogValues](index.md)(val logType: [LogType](../-log-type/index.md), val tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, val message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, val throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null)

Represents values required to invoke the [Logger.log](../-logger/log.md) function.

## Constructors

| | |
|---|---|
| [LogValues](-log-values.md) | [common]<br>fun [LogValues](-log-values.md)(logType: [LogType](../-log-type/index.md), tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null) |

## Properties

| Name | Summary |
|---|---|
| [logType](log-type.md) | [common]<br>val [logType](log-type.md): [LogType](../-log-type/index.md) |
| [message](message.md) | [common]<br>val [message](message.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null |
| [tag](tag.md) | [common]<br>val [tag](tag.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null |
| [throwable](throwable.md) | [common]<br>val [throwable](throwable.md): [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null |
