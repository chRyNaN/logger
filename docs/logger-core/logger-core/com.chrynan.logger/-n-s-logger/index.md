//[logger-core](../../../index.md)/[com.chrynan.logger](../index.md)/[NSLogger](index.md)

# NSLogger

[ios]\
open class [NSLogger](index.md) : [Logger](../../../../logger-core/logger-core/com.chrynan.logger/-logger/index.md), [LogInitializer](../../../../logger-core/logger-core/com.chrynan.logger/-log-initializer/index.md)

## Functions

| Name | Summary |
|---|---|
| [debug](index.md#528699424%2FFunctions%2F684560480) | [ios]<br>open fun [debug](index.md#528699424%2FFunctions%2F684560480)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null) |
| [error](index.md#-1522606379%2FFunctions%2F684560480) | [ios]<br>open fun [error](index.md#-1522606379%2FFunctions%2F684560480)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null) |
| [info](index.md#1308495187%2FFunctions%2F684560480) | [ios]<br>open fun [info](index.md#1308495187%2FFunctions%2F684560480)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null) |
| [init](init.md) | [ios]<br>open override fun [init](init.md)() |
| [log](log.md) | [ios]<br>open override fun [log](log.md)(logType: [LogType](../../../../logger-core/logger-core/com.chrynan.logger/-log-type/index.md), tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)?) |
| [verbose](index.md#-736659633%2FFunctions%2F684560480) | [ios]<br>open fun [verbose](index.md#-736659633%2FFunctions%2F684560480)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null) |
| [warning](index.md#1679762281%2FFunctions%2F684560480) | [ios]<br>open fun [warning](index.md#1679762281%2FFunctions%2F684560480)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null) |
| [wtf](index.md#-1842084362%2FFunctions%2F684560480) | [ios]<br>open fun [wtf](index.md#-1842084362%2FFunctions%2F684560480)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null) |

## Properties

| Name | Summary |
|---|---|
| [isEnabled](is-enabled.md) | [ios]<br>open override var [isEnabled](is-enabled.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true<br>Determines whether this [Logger](../../../../logger-core/logger-core/com.chrynan.logger/-logger/index.md) instance should be used to output logs. This value should default to true. |
