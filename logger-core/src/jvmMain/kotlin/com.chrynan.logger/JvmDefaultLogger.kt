@file:Suppress("unused")

package com.chrynan.logger

import java.util.logging.Logger

@Suppress("FunctionName")
actual fun DefaultLogger(): Loggable = JavaLogger(Logger.getGlobal())
