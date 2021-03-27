# logger

A simple Kotlin multi-platform logging abstraction.

This library provides simple interfaces to wrap any logging utility and use them in an implementation independent and
Kotlin syntactic manner.

```kotlin
logError(message = "Error message.", throwable = someException)
```

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

* Assign the `Loggable` implementation to the `Logger.loggable` property:

```kotlin
Logger.logggable = loggable
```

* Log anything:

```kotlin
logError(message = "Error Message", throwable = someException)
```

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
