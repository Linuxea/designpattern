package decorator.io

import java.io.FilterInputStream
import java.io.InputStream

class LowerCaseInputStream(private val inputStream: InputStream) : FilterInputStream(inputStream) {

    override fun read(): Int {
        val read = super.read()
//        println("读取出来的 $read")
        // -1 表示读取到最后了
        return if (read == -1) read else Character.toLowerCase(read)
    }

    override fun read(b: ByteArray, off: Int, len: Int): Int {
        val read = super.read(b, off, len)
        for (i in off..(off + read)) {
            b[i] = Character.toLowerCase(b[i].toChar()).toByte()
        }
        return read
    }
}