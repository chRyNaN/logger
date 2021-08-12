//[logger-core](../../index.md)/[com.chrynan.logger](index.md)

# Package com.chrynan.logger

## Types

| Name | Summary |
|---|---|
| [AndroidLogger](index.md#-591647867%2FClasslikes%2F-1911466570) | [android]<br>typealias [AndroidLogger](index.md#-591647867%2FClasslikes%2F-1911466570) = [LogCatLogger](-log-cat-logger/index.md) |
| [ConsoleLogger](-console-logger/index.md) | [js]<br>open class [ConsoleLogger](-console-logger/index.md) : [LogInitializer](-log-initializer/index.md), [Loggable](-loggable/index.md) |
| [JavaAnnotationProcessorMessagerLogger](-java-annotation-processor-messager-logger/index.md) | [jvm]<br>open class [JavaAnnotationProcessorMessagerLogger](-java-annotation-processor-messager-logger/index.md)(**messager**: [Messager](https://docs.oracle.com/javase/8/docs/api/javax/annotation/processing/Messager.html)) : [Loggable](-loggable/index.md), [LogInitializer](-log-initializer/index.md) |
| [JavaLogger](-java-logger/index.md) | [jvm]<br>open class [JavaLogger](-java-logger/index.md)(**logger**: [Logger](https://developer.android.com/reference/kotlin/java/util/logging/Logger.html)) : [LogInitializer](-log-initializer/index.md), [Loggable](-loggable/index.md) |
| [Log](-log/index.md) | [common]<br>object [Log](-log/index.md) : [Loggable](-loggable/index.md), [LogInitializer](-log-initializer/index.md)<br>An implementation of [Loggable](-loggable/index.md) and [LogInitializer](-log-initializer/index.md) that can be used as a singleton base to log throughout the application. |
| [LogCatLogger](-log-cat-logger/index.md) | [android]<br>open class [LogCatLogger](-log-cat-logger/index.md) : [LogInitializer](-log-initializer/index.md), [Loggable](-loggable/index.md) |
| [Loggable](-loggable/index.md) | [common]<br>interface [Loggable](-loggable/index.md)<br>A platform agnostic Kotlin Multiplatform Logging interface inspired by Android's Log class. |
| [LogInitializer](-log-initializer/index.md) | [common]<br>interface [LogInitializer](-log-initializer/index.md)<br>An interface that initializes an implementation of [Loggable](-loggable/index.md). |
| [LogType](-log-type/index.md) | [common]<br>enum [LogType](-log-type/index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)<[LogType](-log-type/index.md)> |
| [NoActionLogger](-no-action-logger/index.md) | [common]<br>open class [NoActionLogger](-no-action-logger/index.md) : [LogInitializer](-log-initializer/index.md), [Loggable](-loggable/index.md)<br>A simple implementation of [Loggable](-loggable/index.md) that performs no action and prints no log when a function is called. |
| [NSLogger](-n-s-logger/index.md) | [ios]<br>class [NSLogger](-n-s-logger/index.md) : [Loggable](-loggable/index.md), [LogInitializer](-log-initializer/index.md) |
| [SimplePrintLineLogger](-simple-print-line-logger/index.md) | [common]<br>open class [SimplePrintLineLogger](-simple-print-line-logger/index.md) : [LogInitializer](-log-initializer/index.md), [Loggable](-loggable/index.md)<br>A simple implementation of [Loggable](-loggable/index.md) that calls [println](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.io/index.html) when a log function is called. |

## Functions

| Name | Summary |
|---|---|
| [DefaultLogger](-default-logger.md) | [common, android, ios, js, jvm]<br>[common, android, ios, js, jvm]<br>fun [DefaultLogger](-default-logger.md)(): [Loggable](-loggable/index.md) |
