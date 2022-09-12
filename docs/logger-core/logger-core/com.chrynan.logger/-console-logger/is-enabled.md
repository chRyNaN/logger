//[logger-core](../../../index.md)/[com.chrynan.logger](../index.md)/[ConsoleLogger](index.md)/[isEnabled](is-enabled.md)

# isEnabled

[js]\
open override var [isEnabled](is-enabled.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false

Determines whether this [Logger](../../../../logger-core/logger-core/com.chrynan.logger/-logger/index.md) instance should be used to output logs. The default value is up to the implementation and platform, but generally should be `false` to prevent accidental logging in a production environment. Explicitly set the value to be certain whether logging is enabled or not.

**Note:** that it is up to the [Logger](../../../../logger-core/logger-core/com.chrynan.logger/-logger/index.md) implementation to prevent logging if this value returns `false`.
