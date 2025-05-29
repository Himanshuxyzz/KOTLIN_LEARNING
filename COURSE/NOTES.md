# HOW DOES KOTLIN RUN WITH JAVA CODEBASE

-> since the Kotlin code compiles in the classes jar (java archive) by kotlin compiler which later converts into byte code which is later executed using JVM this all represents how does kotlin work together with the java codebase.

# COMMANDS

## for java -> java main.java

## for kotlin -> kotlinc main.kt -include-runtime -d main.jar

1. -include-runtime -> this command line argument is required in order to convert the kotlin file into jar file.
2. -d -> this argument will define the name of the file or folder in which jar file will be generated.

e.g -> kotlinc main.kt -include-runtime -d testing/test.jar -> the output will be a folder named teseting which consist of the test.jar file inside it.

## in order to run the jar files simply we have to run the following command

e.g -> java -jar main.jar -> the output will be "Hello World"

# TRICK TO AVOID WRITING THE LENGTHY COMMANDS TO COMPILE AND FILES

1. init a blank node project -> npm init -y
2. then write custom script in the package.json for compiling and running the files.
3. run the command npm run compile-run -- main

### for more information about the node script refer to the readme.md

# lESSONS

1. It's mandatory to write the main kotlin code inside the fun main(){....}
2. In kotlin type inferecing happens it means we can define type of the value to be assigned , and if we dont then kotlin is smart enough to understand and self assign the type of the value on it.

# VARIABLES

(var are mutable)
(val are immutable)

1. In kotlin the values are defined followed by the var variable_name = value

VIDEO LINK - LINK[https://www.youtube.com/watch?v=mlEkJShasI0] at time [1:33:20]
