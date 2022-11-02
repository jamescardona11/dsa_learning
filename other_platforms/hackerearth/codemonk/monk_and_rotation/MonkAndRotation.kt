/** https://www.hackerearth.com/practice/codemonk/ */
import java.io.*
import java.util.StringTokenizer

fun getBufferedReader(): BufferedReader {
    val br: BufferedReader
    val fileLocation = "../../in.txt"

    val file = File(fileLocation)
    val existsFile = file.exists()

    if (existsFile) br = BufferedReader(FileReader(fileLocation))
    else br = BufferedReader(InputStreamReader(System.`in`))

    if (existsFile) println("------- Start Local Execution -------")

    return br
}

fun main() {
    val br: BufferedReader = getBufferedReader()
    val t = br.readLine()!!.toInt()

    for (i in 0 until t) {
        val sb = StringBuilder()
        val st = StringTokenizer(br.readLine()!!, " ")
        val n = st.nextToken().toInt()
        var k = st.nextToken().toInt()

        val arr = Array(n) { 0 }
        val number = StringTokenizer(br.readLine())
        for (i in 0 until n) {
            val k = number.nextToken().toInt()
            arr[i] = k
        }

        val index = n - (k % n)

        for (i in index until n) {
            sb.append(arr[i]).append(" ")
        }

        for (i in 0 until index) {
            sb.append(arr[i])
            if (i != index - 1) {
                sb.append(" ")
            }
        }
        println(sb.toString())
    }
}
