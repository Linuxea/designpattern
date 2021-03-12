package filter

class DebugLogger(private val level: Int, private val nextLogger: AbstractLogger? = null) :
    AbstractLogger(level, nextLogger) {


    override fun write(message: String) {
        println("debug : $message")
    }
}