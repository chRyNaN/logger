//[logger-core](../../../index.md)/[com.chrynan.logger](../index.md)/[DelegatingLogger](index.md)/[isEnabled](is-enabled.md)

# isEnabled

[common]\
open override var [isEnabled](is-enabled.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true

Determines whether this [Logger](../-logger/index.md) instance should be used to output logs. This value should default to true.

**Note:** that it is up to the call-site to prevent logging if this value returns false.
