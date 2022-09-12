//[logger-core](../../index.md)/[com.chrynan.logger](index.md)/[wtf](wtf.md)

# wtf

[common]\
inline fun [Logger](-logger/index.md).[wtf](wtf.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null)

inline fun [Logger](-logger/index.md).[wtf](wtf.md)(tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, throwable: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null, messageBuilder: () -&gt; [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?)

Invokes the [Logger.log](-logger/log.md) function for [LogType.WTF](-log-type/-w-t-f/index.md).
