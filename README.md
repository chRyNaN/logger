# logger
## A simple Kotlin multi-platform logging abstraction.

This library provides simple interfaces to wrap any logging utility and use them in an implementation independent and Kotlin syntactic manner.

## Building the library

The library is provided by [Github Packages](https://github.com/chRyNaN/logger/packages). Refer to the [releases](https://github.com/chRyNaN/logger/releases) for the latest version.

### Repository
```kotlin
maven {
    url = uri("https://maven.pkg.github.com/chRyNaN/logger")
    credentials {
        // "gpr.user" is your Github username stored in your LOCAL git properties file
        // "gpr.key" is your Github personal access token stored in your LOCAL git properties file
        // Note that these may not be required since the project is public
        username = project.findProperty("gpr.user") as? String?
        password = project.findProperty("gpr.key") as? String?
    }
}
```

### Dependencies
**Kotlin Common Core Module:**
```kotlin
implementation("com.chrynan.logger:logger-core:VERSION")
```
**Kotlin JVM Core Module:**
```kotlin
implementation("com.chrynan.logger:logger-jvm:$VERSION")
```
**Kotlin JS Core Module:**
```kotlin
implementation("com.chrynan.logger:logger-js:$VERSION")
```
**Android Module:**
```kotlin
implementation("com.chrynan.logger:logger-android:$VERSION")
```
**Android Timber Module:**
```kotlin
implementation("com.chrynan.logger:logger-android-timber:$VERSION")
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

* Have any class that requires logging delegate to the `Loggable` interface from the implementation, either from a constructor parameter or as a Kotlin singleton object.
```kotlin
// Delegation through the Kotlin Singleton Object implementation
class MainActivity : Loggable by MyLogger { ... }
```
```kotlin
// Delegation through a constructor parameter
class MainPresenter @Inject constructor(private val logger: Loggable) : Loggable by logger { ... }
```

* Use the logging functions
```kotlin
logError(someThrowable, "Error doing something.")
```

Alternatively, you could use the `Loggable` object explicitly:
```kotlin
class MainPresenter constructor(private val loggable: Loggable) {
    
    fun example() {
        loggable.logDebug(message = "Some Message")
    }
}
```

Or you could use the provided `Logger` Kotlin Object and it's associated convenience functions:
```kotlin
// First Create and initialize an instance of the Loggable and LogInitializer interface
val loggable = SimplePrintLineLogger().apply { init() }

// Then set the Loggable instance to the Logger.loggable field
Logger.logggable = loggable

// Then use the convenience functions wherever you'd like
logError(message = "Something went wrong")
```

## Platform Specific Implementations

The library provides multiple platform specific `Loggable` and `LogInitializer` implementations that could be used or extended. For instance:
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