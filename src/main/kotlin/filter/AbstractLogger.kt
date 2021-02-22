package filter


const val debug = 0
const val info = 1
const val warn = 2
const val error = 3

abstract class AbstractLogger(private val level: Int, private val nextLogger: AbstractLogger? = null) {


    abstract fun write(message: String)

    fun logMessage(message: String) {
        this.write(message)
        this.nextLogger?.logMessage(message)
    }


}