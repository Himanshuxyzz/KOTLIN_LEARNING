// Using function from another file
// import Utils.greet
package Utils // it's used for the same pathfile

import src.Utils.Math.Add // in case when we have sub folders setup

// To run these files together as single entry point we run:- kotlinc src/Utils/Util.kt
// src/Utils/Math.kt src/main.kt -include-runtime -d Main.jar

// Coroutines and serialisation and deserialisation are left to understand

fun main() {
    greet("Himanshu")
    println(Add(1, 2))
}
