package filter

fun main() {

    // 从链最后端开始构建
    val errorLogger = ErrorLogger(error, null)
    val warnLogger = WarnLogger(warn, errorLogger)
    val infoLogger = InfoLogger(info, warnLogger)
    val debugLogger = DebugLogger(debug, infoLogger)

    debugLogger.logMessage("hello filter pattern")

}