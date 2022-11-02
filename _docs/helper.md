### Reader Kotlin

```
import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.io.InputStreamReader

fun getBufferedReader(): BufferedReader {
val br: BufferedReader
val file = File("in.txt")
val existsFile = file.exists()

    if (existsFile) br = BufferedReader(FileReader(file, Charsets.UTF_8))
    else br = BufferedReader(InputStreamReader(System.`in`))

    if (existsFile) println("------- Start Local Execution -------")

    return br

}
```

### Scanner Kotlin

```

import java.io.File
import java.io.FileReader
import java.util.*

var sc: Scanner
val archivo = File("entrada.txt")

sc = if (archivo.exists()) {
    Scanner(FileReader(archivo))
} else {
    Scanner(System.`in`)
}
```

### Default main Kotlin

```
// default main
fun main(){
 val br : BufferedReader = getBufferedReader()

    lateinit var line: String
    while (!(br.readLine().also { line = it }).equals("#")) {
        println(line)
    }

}

```

### Tokenizer Kotlin

```
import java.util.*

val st = StringTokenizer(input)
val m = st.nextToken().toInt()
val n = st.nextToken().toInt()

// Array from line
val array = emptyArray<Int>()

val st = StringTokenizer(br.readLine())
for (i in 0 until n) {
    val k = st.nextToken().toInt()
    v.set(i) = k
}
```

### for range Kotlin

```
for(i in 1..n){

}

for(i in 1 until n){

}
```

compilar with kotlin console
kotlinc hello.kt -include-runtime -d hello.jar

java -jar xxx
