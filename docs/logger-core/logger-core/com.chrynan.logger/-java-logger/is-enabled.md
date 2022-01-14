//[logger-core](../../../index.md)/[com.chrynan.logger](../index.md)/[JavaLogger](index.md)/[isEnabled](is-enabled.md)

# isEnabled

[jvm]\
open override var [isEnabled](is-enabled.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true

Determines whether this [Logger](https://developer.android.com/reference/kotlin/java/util/logging/Logger.html) instance should be used to output logs. This value should default to true.

**Note:** that it is up to the call-site to prevent logging if this value returns false.
