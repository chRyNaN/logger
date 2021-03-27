# logger

A simple Kotlin multi-platform logging abstraction.

This library provides simple interfaces to wrap any logging utility and use them in an implementation independent and
Kotlin syntactic manner.

## Using the Library

* Provide the logging implementation extending from the `Loggable` and `LogInitializer` interfaces:

```kotlin
object MyLogger : LogInitializer,
    Loggable {

    ...
}
```

* Initialize the logger implementation before calling any of the logging functions:

```kotlin
MyLogger.init()
```

* Use the logger:

### Object Delegation

```kotlin
// Delegation through the Kotlin Singleton Object implementation
class MainActivity : Loggable by MyLogger {

    ...

    // Using the logging functions
    logError(someThrowable, "Error doing something.")
}
```

### Constructor Parameter Delegation

```kotlin
// Delegation through a constructor parameter
class MainPresenter @Inject constructor(private val logger: Loggable) : Loggable by logger {

    ...

    // Using the logging functions
    logError(someThrowable, "Error doing something.")
}
```

### Directly using the object

```kotlin
class MainPresenter {

    fun example() {
        MyLogger.logDebug(message = "Some Message")
    }
}
```

### Directly using the property

```kotlin
class MainPresenter constructor(private val loggable: Loggable) {

    fun example() {
        loggable.logDebug(message = "Some Message")
    }
}
```

### Using the included Logger object

The library provides a  `Logger` Kotlin Object that can be assigned a `Loggable`. All `Logger` function calls are then
delegated to it's `Loggable` property.

```kotlin
// First Create and initialize an instance of the Loggable and LogInitializer interface
val loggable = SimplePrintLineLogger().apply { init() }

// Then set the Loggable instance to the Logger.loggable field
Logger.logggable = loggable

// Then use the Logger object functions wherever you'd like
Logger.logError(message = "Something went wrong")
```

**Convenience functions:**

If the `Logger` object is assigned a `Loggable`, then logging convenience functions can be used. These functions are
exactly like the functions on the `Loggable` interface but can be used anywhere. The functions delegate to the `Logger`
object functions.

```kotlin
logError(tag = "MyTag", throwable = myThrowable, message = "Something went wrong")
```

**Invalid use of the Logger object:**

If the `Logger` object was not assigned a `Loggable`, then any calls to functions on the `Logger` object or the
convenience functions will throw an exception. This is because the `Logger.loggable` property is a `lateinit` property.

## Platform Specific Implementations

The library provides multiple platform specific `Loggable` and `LogInitializer` implementations that could be used or
extended. For instance:

```kotlin
// Common
SimplePrintLineLogger() // Calls the println() Kotlin function
NoActionLogger() // Has no operation default functions

// JavaScript
ConsoleLogger() // Uses the console

// Java - JVM Logger
JavaLogger() // Uses the JVM Logger class

// Java
JavaAnnotationProcessorMessagerLogger() // Uses the JVM Messager class used in Annotation Processors

// Android 
LogCatLogger() // Uses the Android Log functions

// Android
AndroidLogger // An Object that just delegates to the LogCatLogger

// Android Timber
TimberLogger() // Uses the Android Timber Library
```

## Building the library

The library is provided through [repsy.io](https://repsy.io). Refer to
the [releases](https://github.com/chRyNaN/logger/releases) page for the latest version.

### Repository

```kotlin
repositories {
    maven { url = "https://repo.repsy.io/mvn/chrynan/public" }
}
```

### Dependencies

**Core Module:**

```kotlin
implementation("com.chrynan.logger:logger-core:$VERSION")
```

**Android Module:**

```kotlin
implementation("com.chrynan.logger:logger-android:$VERSION")
```

**Android Timber Module:**

```kotlin
implementation("com.chrynan.logger:logger-android-timber:$VERSION")
```

## Documentation

More detailed documentation is available in the [docs](docs) folder. The entry point to the documentation can be
found [here](docs/index.md).

## License

```
Copyright 2021 chRyNaN

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
