/**
    https://www.hackerearth.com/practice/codemonk/
**/


import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.io.InputStreamReader

fun getBufferedReader(): BufferedReader {
    val br : BufferedReader
    val file = File("../../in.txt")
    val existsFile = file.exists()

    br = if( existsFile ) BufferedReader(FileReader(file, Charsets.UTF_8))
    else BufferedReader(InputStreamReader(System.`in`))

    if(existsFile) println("------- Start Local Execution -------")

    return br
}

fun main(){  
    val br : BufferedReader = getBufferedReader()
    lateinit var line: String
    while (!(br.readLine().also { line = it }).equals("#")) {
        println(line)
    }   
}
