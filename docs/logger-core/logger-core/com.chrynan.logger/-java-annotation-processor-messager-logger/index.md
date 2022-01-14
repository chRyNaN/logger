//[logger-core](../../../index.md)/[com.chrynan.logger](../index.md)/[JavaAnnotationProcessorMessagerLogger](index.md)

# JavaAnnotationProcessorMessagerLogger

[jvm]\
open class [JavaAnnotationProcessorMessagerLogger](index.md)(messager: [Messager](https://docs.oracle.com/javase/8/docs/api/javax/annotation/processing/Messager.html)) : [Logger](../../../../logger-core/logger-core/com.chrynan.logger/-logger/index.md), [LogInitializer](../../../../logger-core/logger-core/com.chrynan.logger/-log-initializer/index.md)

## Functions

| Name | Summary |
|---|---|
| [debug](../-java-logger/index.md#528699424%2FFunctions%2F1038150354) | [jvm]<br>open fun [debug](../-java-logger/index.md#528699424%2FFunctions%2F1038150354)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null) |
| [error](../-java-logger/index.md#-1522606379%2FFunctions%2F1038150354) | [jvm]<br>open fun [error](../-java-logger/index.md#-1522606379%2FFunctions%2F1038150354)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null) |
| [info](../-java-logger/index.md#1308495187%2FFunctions%2F1038150354) | [jvm]<br>open fun [info](../-java-logger/index.md#1308495187%2FFunctions%2F1038150354)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null) |
| [init](init.md) | [jvm]<br>open override fun [init](init.md)() |
| [log](log.md) | [jvm]<br>open override fun [log](log.md)(logType: [LogType](../../../../logger-core/logger-core/com.chrynan.logger/-log-type/index.md), tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)?) |
| [verbose](../-java-logger/index.md#-736659633%2FFunctions%2F1038150354) | [jvm]<br>open fun [verbose](../-java-logger/index.md#-736659633%2FFunctions%2F1038150354)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null) |
| [warning](../-java-logger/index.md#1679762281%2FFunctions%2F1038150354) | [jvm]<br>open fun [warning](../-java-logger/index.md#1679762281%2FFunctions%2F1038150354)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null) |
| [wtf](../-java-logger/index.md#-1842084362%2FFunctions%2F1038150354) | [jvm]<br>open fun [wtf](../-java-logger/index.md#-1842084362%2FFunctions%2F1038150354)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null) |

## Properties

| Name | Summary |
|---|---|
| [isEnabled](is-enabled.md) | [jvm]<br>open override var [isEnabled](is-enabled.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true<br>Determines whether this [Logger](../../../../logger-core/logger-core/com.chrynan.logger/-logger/index.md) instance should be used to output logs. This value should default to true. |
