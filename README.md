# logger
## A simple Kotlin logging abstraction.

This library provides simple interfaces to wrap any logging utility and use them in an implementation independent and Kotlin syntatic manner.

## Using the library

[![](https://jitpack.io/v/chRyNaN/logger.svg)](https://jitpack.io/#chRyNaN/logger)

**Kotlin Common Project:**
```
implementation 'com.github.chRyNaN.logger:logger-common:VERSION'
```
**Jvm Project:**
```
implementation 'com.github.chRyNaN.logger:logger-jvm:VERSION'
```
**JS Project:**
```
implementation 'com.github.chRyNaN.logger:logger-js:VERSION'
```

* Provide the logging implementation extending from the `Loggable` and `LogInitializer` interfaces:
```kotlin
object Logger : LogInitializer,
        Loggable {
    
    ...
}
```

* Initialize the logger implementation before calling any of the logging functions:
```kotlin
Logger.init()
```

* Have any class that requires logging delegate to the `Loggable` interface from the implementation, either from a constructor parameter or as a Kotlin singleton object.
```kotlin
// Delegation through the Kotlin Singleton Object implementation
class MainActivity : Loggable by Logger { ... }
```
```kotlin
// Delegation through a constructor parameter
class MainPresenter @Inject constructor(private val logger: Loggable) : Loggable by logger { ... }
```

* Use the logging functions
```kotlin
logError(someThrowable, "Error doing something.")
```
