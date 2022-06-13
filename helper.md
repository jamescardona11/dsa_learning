import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.io.InputStreamReader

fun getBufferedReader(): BufferedReader {
val br : BufferedReader
val file = File("in.txt")
br = if( file.exists() ) BufferedReader(FileReader(file, Charsets.UTF_8))
else BufferedReader(InputStreamReader(System.`in`))

    return br

}

kotlinc hello.kt -include-runtime -d hello.jar
