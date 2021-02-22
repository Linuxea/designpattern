package filter

class WarnLogger(private val level: Int, private val nextLogger: AbstractLogger? = null) :
    AbstractLogger(level, nextLogger) {


    override fun write(message: String) {
        println("warn : $message")
    }
}