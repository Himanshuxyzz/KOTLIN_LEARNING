// File Io

import java.io.File
import java.io.IOException
import kotlin.io.println

fun main() {

    fun writeFile(fileName: String, content: String): Unit {
        // val fileName = "example-io.txt"
        // val contentToWrite = "Hello, Kotlin file I/0"
        try {
            File(fileName).writeText(content)
            println("Content Written to $fileName")
        } catch (e: IOException) {
            println("Caught an IoException error $e")
            throw IOException("Io write failed")
        }
    }

    fun readContent(fileName: String) {
        try {
            val content = File(fileName).readText()
            println("Reading Content from $fileName -> $content")
        } catch (e: IOException) {
            println("Caught an IoException error $e")
            throw IOException("Io read failed")
        }
    }

    // Absolute file path
    var filePath = File("Testing-IO.txt").absolutePath
    println(filePath)

    // Parent file path

    var parentPath = File("Testing-IO.txt").absoluteFile.parent
    println(parentPath)

    //  If file exists or not

    val ifFileExists = File("Testing-IO.txt")

    println(ifFileExists.exists())

    if (ifFileExists.exists()) {
        println(ifFileExists.length())
        println(ifFileExists.canRead())
        println(ifFileExists.canWrite())
        println(ifFileExists.canExecute())
    } else {
        println("File doesn't exists!")
    }

    writeFile("Testing-IO.txt", "Testing 1...2.....3.....")

    readContent("Testing-IO.txt")
}
