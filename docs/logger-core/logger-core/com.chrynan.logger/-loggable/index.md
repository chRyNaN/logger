//[logger-core](../../../index.md)/[com.chrynan.logger](../index.md)/[Loggable](index.md)



# Loggable  
 [common] interface [Loggable](index.md)

A platform agnostic Kotlin Logging interface inspired by Android's Log class.

   


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.logger/Loggable/log/#com.chrynan.logger.LogType#kotlin.String#kotlin.String?#kotlin.Throwable?/PointingToDeclaration/"></a>[log](log.md)| <a name="com.chrynan.logger/Loggable/log/#com.chrynan.logger.LogType#kotlin.String#kotlin.String?#kotlin.Throwable?/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract fun [log](log.md)(logType: [LogType](../-log-type/index.md), tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null)  <br><br><br>|
| <a name="com.chrynan.logger/Loggable/logDebug/#kotlin.String?#kotlin.Throwable?#kotlin.String?/PointingToDeclaration/"></a>[logDebug](log-debug.md)| <a name="com.chrynan.logger/Loggable/logDebug/#kotlin.String?#kotlin.Throwable?#kotlin.String?/PointingToDeclaration/"></a>[common]  <br>Content  <br>open fun [logDebug](log-debug.md)(tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null, message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null)  <br><br><br>|
| <a name="com.chrynan.logger/Loggable/logError/#kotlin.String?#kotlin.Throwable?#kotlin.String?/PointingToDeclaration/"></a>[logError](log-error.md)| <a name="com.chrynan.logger/Loggable/logError/#kotlin.String?#kotlin.Throwable?#kotlin.String?/PointingToDeclaration/"></a>[common]  <br>Content  <br>open fun [logError](log-error.md)(tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null, message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null)  <br><br><br>|
| <a name="com.chrynan.logger/Loggable/logInfo/#kotlin.String?#kotlin.Throwable?#kotlin.String?/PointingToDeclaration/"></a>[logInfo](log-info.md)| <a name="com.chrynan.logger/Loggable/logInfo/#kotlin.String?#kotlin.Throwable?#kotlin.String?/PointingToDeclaration/"></a>[common]  <br>Content  <br>open fun [logInfo](log-info.md)(tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null, message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null)  <br><br><br>|
| <a name="com.chrynan.logger/Loggable/logVerbose/#kotlin.String?#kotlin.Throwable?#kotlin.String?/PointingToDeclaration/"></a>[logVerbose](log-verbose.md)| <a name="com.chrynan.logger/Loggable/logVerbose/#kotlin.String?#kotlin.Throwable?#kotlin.String?/PointingToDeclaration/"></a>[common]  <br>Content  <br>open fun [logVerbose](log-verbose.md)(tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null, message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null)  <br><br><br>|
| <a name="com.chrynan.logger/Loggable/logWarning/#kotlin.String?#kotlin.Throwable?#kotlin.String?/PointingToDeclaration/"></a>[logWarning](log-warning.md)| <a name="com.chrynan.logger/Loggable/logWarning/#kotlin.String?#kotlin.Throwable?#kotlin.String?/PointingToDeclaration/"></a>[common]  <br>Content  <br>open fun [logWarning](log-warning.md)(tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null, message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null)  <br><br><br>|
| <a name="com.chrynan.logger/Loggable/logWtf/#kotlin.String?#kotlin.Throwable?#kotlin.String?/PointingToDeclaration/"></a>[logWtf](log-wtf.md)| <a name="com.chrynan.logger/Loggable/logWtf/#kotlin.String?#kotlin.Throwable?#kotlin.String?/PointingToDeclaration/"></a>[common]  <br>Content  <br>open fun [logWtf](log-wtf.md)(tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null, message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null)  <br><br><br>|


## Inheritors  
  
|  Name | 
|---|
| <a name="com.chrynan.logger/Logger///PointingToDeclaration/"></a>[Logger](../-logger/index.md)|
| <a name="com.chrynan.logger/NoActionLogger///PointingToDeclaration/"></a>[NoActionLogger](../-no-action-logger/index.md)|
| <a name="com.chrynan.logger/SimplePrintLineLogger///PointingToDeclaration/"></a>[SimplePrintLineLogger](../-simple-print-line-logger/index.md)|
| <a name="com.chrynan.logger/ConsoleLogger///PointingToDeclaration/"></a>[ConsoleLogger](../-console-logger/index.md)|
| <a name="com.chrynan.logger/JavaAnnotationProcessorMessagerLogger///PointingToDeclaration/"></a>[JavaAnnotationProcessorMessagerLogger](../-java-annotation-processor-messager-logger/index.md)|
| <a name="com.chrynan.logger/JavaLogger///PointingToDeclaration/"></a>[JavaLogger](../-java-logger/index.md)|

