package decorator.io

import java.io.BufferedInputStream
import java.io.FileInputStream
import java.io.InputStream

fun main() {
    val inputStream: InputStream =
        LowerCaseInputStream(BufferedInputStream(FileInputStream("src/main/kotlin/decorator/io/main.kt")))
    while (true) {
        val read = inputStream.read()
        if (read < 0) {
            break
        }
        print(read.toChar())
    }
    inputStream.close()
}