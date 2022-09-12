//[logger-core](../../../index.md)/[com.chrynan.logger](../index.md)/[Log](index.md)/[logValues](log-values.md)

# logValues

[common]\
val [logValues](log-values.md): Flow&lt;[LogValues](../-log-values/index.md)&gt;

Retrieves a Flow of [LogValues](../-log-values/index.md) that are emitted after every successful invocation of the [log](log.md) on this [Log](index.md) object.

**Note:** If the [Log.isEnabled](is-enabled.md) property is `false` and the [Log.log](log.md) function is invoked, no [LogValues](../-log-values/index.md) will be emitted.

**Note:**[LogValues](../-log-values/index.md) are emitted after the internal [Log.log](log.md) function is successfully invoked.

**Note:** There is no guarantee that a value emitted from this Flow is actually logged, as it is up to the [Logger](../-logger/index.md) implementation set as the [Log.logger](logger.md) to decide how and whether to log.
