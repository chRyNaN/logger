# logger

A simple Kotlin multi-platform logging abstraction. <br/>
<img alt="GitHub tag (latest by date)" src="https://img.shields.io/github/v/tag/chRyNaN/logger">

This library provides simple interfaces to wrap any logging utility and use them in Kotlin Multiplatform code.

```kotlin
Log.error("Error message.")
```

## Using the Library

* Assign the `Logger` implementation to the `Log.logger` property (defaults to `DefaultLogger`):

```kotlin
Log.logger = DefaultLogger()
```

* Optionally, call the `LogInitializer.init`:

```kotlin
Log.init()
```

* Log anything:

```kotlin
Log.error(message = "Error Message", throwable = someException)
```

### Platform Specific Implementations

The library provides multiple platform specific `Logger` implementations that could be used or extended. For instance:

#### Common

* `DefaultLogger` - Platform default logging.
    * **Android:** `LogCatLogger`
    * **JVM:** `JavaLogger`
    * **JS:** `ConsoleLogger`
    * **iOS:** `NSLogger`
* `DelegatingLogger` - Delegates to one or more `Loggers`.
* `SimplePrintLineLogger` - Uses the `println()` Kotlin function.
* `NoActionLogger` - No operation Logger.

#### JavaScript

* `ConsoleLogger` - Uses the browser console.

#### Java

* `JavaLogger` - Uses the JVM Logger class.
* `JavaAnnotationProcessorMessagerLogger` - Uses the JVM Messager class used in Annotation Processors.

#### Android

* `LogCatLogger` - Uses the Android Log functions.

#### Android Timber

* `TimberLogger` - Uses the Android Timber Library.

#### iOS

* `NSLogger` - Uses `NSLog`.

## Building the library

The library is provided through [repsy.io](https://repsy.io). Refer to
the [releases](https://github.com/chRyNaN/logger/releases) page for the latest version. <br/>
<img alt="GitHub tag (latest by date)" src="https://img.shields.io/github/v/tag/chRyNaN/logger">

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

**Android Timber Module:**

```kotlin
implementation("com.chrynan.logger:logger-android-timber:$VERSION-release")
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
