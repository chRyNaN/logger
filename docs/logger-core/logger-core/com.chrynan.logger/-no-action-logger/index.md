//[logger-core](../../../index.md)/[com.chrynan.logger](../index.md)/[NoActionLogger](index.md)



# NoActionLogger  
 [common] open class [NoActionLogger](index.md) : [LogInitializer](../-log-initializer/index.md), [Loggable](../-loggable/index.md)

A simple implementation of [Loggable](../-loggable/index.md) that performs no action and prints no log when a function is called. This class could be useful to extend if only some functions have to be overridden.

   


## Constructors  
  
| | |
|---|---|
| <a name="com.chrynan.logger/NoActionLogger/NoActionLogger/#/PointingToDeclaration/"></a>[NoActionLogger](-no-action-logger.md)| <a name="com.chrynan.logger/NoActionLogger/NoActionLogger/#/PointingToDeclaration/"></a> [common] fun [NoActionLogger](-no-action-logger.md)()   <br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.logger/NoActionLogger/init/#/PointingToDeclaration/"></a>[init](init.md)| <a name="com.chrynan.logger/NoActionLogger/init/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open override fun [init](init.md)()  <br><br><br>|
| <a name="com.chrynan.logger/NoActionLogger/log/#com.chrynan.logger.LogType#kotlin.String#kotlin.String?#kotlin.Throwable?/PointingToDeclaration/"></a>[log](log.md)| <a name="com.chrynan.logger/NoActionLogger/log/#com.chrynan.logger.LogType#kotlin.String#kotlin.String?#kotlin.Throwable?/PointingToDeclaration/"></a>[common]  <br>Content  <br>open override fun [log](log.md)(logType: [LogType](../-log-type/index.md), tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)?)  <br><br><br>|
| <a name="com.chrynan.logger/Loggable/logDebug/#kotlin.String?#kotlin.Throwable?#kotlin.String?/PointingToDeclaration/"></a>[logDebug](../-loggable/log-debug.md)| <a name="com.chrynan.logger/Loggable/logDebug/#kotlin.String?#kotlin.Throwable?#kotlin.String?/PointingToDeclaration/"></a>[common]  <br>Content  <br>open fun [logDebug](../-loggable/log-debug.md)(tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null, message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null)  <br><br><br>|
| <a name="com.chrynan.logger/Loggable/logError/#kotlin.String?#kotlin.Throwable?#kotlin.String?/PointingToDeclaration/"></a>[logError](../-loggable/log-error.md)| <a name="com.chrynan.logger/Loggable/logError/#kotlin.String?#kotlin.Throwable?#kotlin.String?/PointingToDeclaration/"></a>[common]  <br>Content  <br>open fun [logError](../-loggable/log-error.md)(tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null, message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null)  <br><br><br>|
| <a name="com.chrynan.logger/Loggable/logInfo/#kotlin.String?#kotlin.Throwable?#kotlin.String?/PointingToDeclaration/"></a>[logInfo](../-loggable/log-info.md)| <a name="com.chrynan.logger/Loggable/logInfo/#kotlin.String?#kotlin.Throwable?#kotlin.String?/PointingToDeclaration/"></a>[common]  <br>Content  <br>open fun [logInfo](../-loggable/log-info.md)(tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null, message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null)  <br><br><br>|
| <a name="com.chrynan.logger/Loggable/logVerbose/#kotlin.String?#kotlin.Throwable?#kotlin.String?/PointingToDeclaration/"></a>[logVerbose](../-loggable/log-verbose.md)| <a name="com.chrynan.logger/Loggable/logVerbose/#kotlin.String?#kotlin.Throwable?#kotlin.String?/PointingToDeclaration/"></a>[common]  <br>Content  <br>open fun [logVerbose](../-loggable/log-verbose.md)(tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null, message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null)  <br><br><br>|
| <a name="com.chrynan.logger/Loggable/logWarning/#kotlin.String?#kotlin.Throwable?#kotlin.String?/PointingToDeclaration/"></a>[logWarning](../-loggable/log-warning.md)| <a name="com.chrynan.logger/Loggable/logWarning/#kotlin.String?#kotlin.Throwable?#kotlin.String?/PointingToDeclaration/"></a>[common]  <br>Content  <br>open fun [logWarning](../-loggable/log-warning.md)(tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null, message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null)  <br><br><br>|
| <a name="com.chrynan.logger/Loggable/logWtf/#kotlin.String?#kotlin.Throwable?#kotlin.String?/PointingToDeclaration/"></a>[logWtf](../-loggable/log-wtf.md)| <a name="com.chrynan.logger/Loggable/logWtf/#kotlin.String?#kotlin.Throwable?#kotlin.String?/PointingToDeclaration/"></a>[common]  <br>Content  <br>open fun [logWtf](../-loggable/log-wtf.md)(tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null, message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null)  <br><br><br>|

