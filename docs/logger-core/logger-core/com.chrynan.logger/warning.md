//[logger-core](../../index.md)/[com.chrynan.logger](index.md)/[warning](warning.md)

# warning

[common]\
inline fun [Logger](-logger/index.md).[warning](warning.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null)

inline fun [Logger](-logger/index.md).[warning](warning.md)(tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null, messageBuilder: () -&gt; [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?)

Invokes the [Logger.log](-logger/log.md) function for [LogType.WARNING](-log-type/-w-a-r-n-i-n-g/index.md).
