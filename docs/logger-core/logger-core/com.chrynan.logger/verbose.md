//[logger-core](../../index.md)/[com.chrynan.logger](index.md)/[verbose](verbose.md)

# verbose

[common]\
inline fun [Logger](-logger/index.md).[verbose](verbose.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null)

inline fun [Logger](-logger/index.md).[verbose](verbose.md)(tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null, messageBuilder: () -&gt; [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?)

Invokes the [Logger.log](-logger/log.md) function for [LogType.VERBOSE](-log-type/-v-e-r-b-o-s-e/index.md).
