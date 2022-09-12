//[logger-core](../../../index.md)/[com.chrynan.logger](../index.md)/[JavaLogger](index.md)/[isEnabled](is-enabled.md)

# isEnabled

[jvm]\
open override var [isEnabled](is-enabled.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false

Determines whether this [Logger](https://developer.android.com/reference/kotlin/java/util/logging/Logger.html) instance should be used to output logs. The default value is up to the implementation and platform, but generally should be `false` to prevent accidental logging in a production environment. Explicitly set the value to be certain whether logging is enabled or not.

**Note:** that it is up to the [Logger](https://developer.android.com/reference/kotlin/java/util/logging/Logger.html) implementation to prevent logging if this value returns `false`.
