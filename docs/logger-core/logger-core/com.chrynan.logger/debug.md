//[logger-core](../../index.md)/[com.chrynan.logger](index.md)/[debug](debug.md)

# debug

[common]\
inline fun [Logger](-logger/index.md).[debug](debug.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null)

inline fun [Logger](-logger/index.md).[debug](debug.md)(tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null, messageBuilder: () -&gt; [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?)

Invokes the [Logger.log](-logger/log.md) function for [LogType.DEBUG](-log-type/-d-e-b-u-g/index.md).
