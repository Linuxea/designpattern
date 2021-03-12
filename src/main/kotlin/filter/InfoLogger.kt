package filter

class InfoLogger(private val level: Int, private val nextLogger: AbstractLogger? = null) :
    AbstractLogger(level, nextLogger) {


    override fun write(message: String) {
        println("info : $message")
    }
}