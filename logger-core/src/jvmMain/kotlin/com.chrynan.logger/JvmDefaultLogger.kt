@file:Suppress("unused")

package com.chrynan.logger

import java.util.logging.Logger

@Suppress("FunctionName")
actual fun DefaultLogger(): com.chrynan.logger.Logger = JavaLogger(Logger.getGlobal())
