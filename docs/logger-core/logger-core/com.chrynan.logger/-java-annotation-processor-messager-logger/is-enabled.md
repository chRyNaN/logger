//[logger-core](../../../index.md)/[com.chrynan.logger](../index.md)/[JavaAnnotationProcessorMessagerLogger](index.md)/[isEnabled](is-enabled.md)

# isEnabled

[jvm]\
open override var [isEnabled](is-enabled.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true

Determines whether this [Logger](../../../../logger-core/logger-core/com.chrynan.logger/-logger/index.md) instance should be used to output logs. This value should default to true.

**Note:** that it is up to the call-site to prevent logging if this value returns false.
