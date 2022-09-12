//[logger-core](../../../index.md)/[com.chrynan.logger](../index.md)/[JavaAnnotationProcessorMessagerLogger](index.md)

# JavaAnnotationProcessorMessagerLogger

[jvm]\
open class [JavaAnnotationProcessorMessagerLogger](index.md)(messager: [Messager](https://docs.oracle.com/javase/8/docs/api/javax/annotation/processing/Messager.html)) : [Logger](../../../../logger-core/logger-core/com.chrynan.logger/-logger/index.md), [LogInitializer](../../../../logger-core/logger-core/com.chrynan.logger/-log-initializer/index.md)

## Constructors

| | |
|---|---|
| [JavaAnnotationProcessorMessagerLogger](-java-annotation-processor-messager-logger.md) | [jvm]<br>fun [JavaAnnotationProcessorMessagerLogger](-java-annotation-processor-messager-logger.md)(messager: [Messager](https://docs.oracle.com/javase/8/docs/api/javax/annotation/processing/Messager.html)) |

## Functions

| Name | Summary |
|---|---|
| [init](init.md) | [jvm]<br>open override fun [init](init.md)() |
| [log](log.md) | [jvm]<br>open override fun [log](log.md)(logType: [LogType](../../../../logger-core/logger-core/com.chrynan.logger/-log-type/index.md), tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)?)<br>Performs the action to log the provided details. |

## Properties

| Name | Summary |
|---|---|
| [isEnabled](is-enabled.md) | [jvm]<br>open override var [isEnabled](is-enabled.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false<br>Determines whether this [Logger](../../../../logger-core/logger-core/com.chrynan.logger/-logger/index.md) instance should be used to output logs. The default value is up to the implementation and platform, but generally should be `false` to prevent accidental logging in a production environment. Explicitly set the value to be certain whether logging is enabled or not. |
