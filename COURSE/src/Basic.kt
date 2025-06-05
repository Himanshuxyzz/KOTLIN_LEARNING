// fun main() {
//     println("Learning Variables")
//     println("I'm a var and I can be changed")
//     var a = 10
//     println("a = $a")
//     a = 12
//     println("a = $a")

//     val b = "I'm a immutable variable cannot be changed like var"
//     println(b)

//     println("--------------------------------")

//     println("Type Inference")
//     var c = "I'm a string and I'm not defined with type"
//     println(c)

//     var test: String = "I'm a string and I'm defined with type"
//     println(test)

//     println("--------------------------------")

//     println("Type Casting")
//     val d: Int = 10
//     val e: Long = d.toLong()
//     println("I'm a int and I'm converted to long")

//     println("--------------------------------")
// }

// Global Variables
//  const val is used to declare a constant value that is known at compile time
//   what will happen if i dont use const ? -> it will be a runtime constant  in which the value
// will be get by getter function
//   What will happen if i use const ? -> it will be a compile time constant so it will be inlined
// directly in the code so it will be faster

// const val PI: Double = 3.14

// // Functions

// fun swap(param1: Int, param2: Int):Int {
//     var a = param1
//     var b = param2
//     if (a == b) {
//         println("Both are same please try with diffrent numbers.")
//         return
//     }
//     var c = a
//     a = b
//     b = c
//     println("The value of a = $a and the value of b = $b")
// }

// fun dayOfTheWeek(input: Int):String {
//     val dayName: String =
//             when (input) {
//                 1 -> "Monday"
//                 2 -> "Tuesday"
//                 3 -> "Wednesday"
//                 4 -> "Thursday"
//                 5 -> "Friday"
//                 6 -> "Saturday"
//                 7 -> "Sunday"
//                 else -> {
//                     println("Please enter valid number between 1 - 7")
//                     return
//                 }
//             }
//     println("The day name is $dayName")
// }

// fun main() {
//     // println("PI = $PI")

//     // DATA TYPES IN KOTLIN

//     // Literals are the values that has some purpose in the code best example is value of 3.14
// even
//     // we define this but it's value will not change or var PI = 3.14 , in which 3.14 is a
// literal
//     // and PI is the named storage in which the PI literal is stored.

//     // var a: Int = 10
//     // var b: Double = 10.0
//     // var c: Long = 10L
//     // var d: Short = 10
//     // var f: Float = 10.0F
//     // var g: Char = 'A'
//     // var h: Boolean = true
//     // var i: String = "Hello"

//     var stringLiterals: String = "Hello, my name is himanshu trying to learn kotlin!"
//     // println("stringLiteral value = $stringLiterals")

//     // Functions

//     var a = 4
//     var b = 4

//     var result = swap(a, b)
//     // println("RESULT = $result")

//     // operators

//     val andOperation = true && false
//     // why the result is false ? -> because in and operator both values needs to be true
//     // println("AND OPERATION = $andOperation")

//     var isMyAgeIs24: Boolean = true
//     isMyAgeIs24 = !(isMyAgeIs24)

//     // println("isMyAgeIs24 = $isMyAgeIs24")

//     // Switch Case

//     var day: Int = 2

//     val result1 = dayOfTheWeek(day)

//     println("$result1")
// }

// fun main() {
//     // Loops
//     // // For loop
//     // for (i in 1..5) {
//     //     println("$i")
//     // }

//     // // with step for loop

//     // for (i in 1..10 step 2) {
//     //     println("$i")
//     // }

//     // // with downTo also with step which is optional
//     // for (i in 5 downTo (1) step (2)) {
//     //     println("$i")
//     // }

//     // While loop

//     var counter = 0

//     while (counter < 5) {
//         println("Counter value is $counter")
//         counter = counter + 1
//     }

//     // Break

//     for (i in 1..10) {
//         if (i == 6) {
//             println("break")
//             break
//         }
//         println("$i")
//     }

//     //  Continue
//     var a = 0
//     for (i in 1..20) {
//         if (i % 2 == 0) {
//             println("Caught a even number $i")
//             continue
//         }
//         a = a + 1
//         println("Not caught even number!")
//     }
//     println("the sum of the all odd number is $a")

//     // Lambda function
//     // Lambda operations
//     var addition: (Int, Int) -> Int = { x, y -> x + y }

//     println(addition(2, 4))

//     // classes
// }

// Classes

// we dont need to create a new instance of the class when using the class in code this is very
// different approach from other oops languages where we needed to create the instance of class
// using the new ClassName() kotlin has removed this hassle

class Person(val name: String, var age: Int) {
    fun introduce() {
        println("Hi i am $name and my age is $age")
    }
}

class Rectangle(val width: Double, val height: Double) {

    //

    val area: Double
        // AUTO INVOKE
        get() = width * height

    fun perimater(): Double {
        return 2 * (width + height)
    }
}

class Cylinder(val radius: Double, val height: Double) {
    // this will define if height is not passed then default 1.0 will be set as the height
    // this represent the properties of the individual class
    constructor(radius: Double) : this(radius, 1.0)

    fun volume(): Double {
        return Math.PI * radius * radius * height
    }
}

// CLASSES ADVANCED TOPICS

// # INHERITENCE

// Base class
open class Animal(val name: String) {
    open fun makeSound() {
        println("$name makes a sound")
    }
}

// Derived class

class Dog(name: String) : Animal(name) {
    override fun makeSound() {
        println("$name Barks!!!")
    }
}

// # INTERFACES

// in my understanding it's kinda blueprint which we can make and then apply in class to follow the
// blueprint in my understanding

interface Shape {
    // i'm only declaring but not defining and what will be it's purpose
    // we are abstracting this function and later use this function in other classes by over riding
    // the function
    fun draw()
}

class Triangle : Shape {
    override fun draw() {
        println("Drawing A Triangle!")
    }
}

// # DATA CLASSES

// in my understanding it kinda worked like a normal object in which we cann access the keys of the
// object but here we are passing the values at the time of using the class

data class User(val username: String, val email: String) {
    fun displayInfo() {
        println("username = $username")
    }
}

// # object

// A singleton - only one instance ever exists
// Instantiated immediately when loaded, not when called

object DatabaseConfig {
    fun connect() {
        println("Database is connected!")
    }
}

// # Access Modifiers

class PublicClass {
    val publicInfo: String = "Public info" // this will be publicly available
    private val privateInfo: String =
            "Private info" // this is private and will not be available outside the class

    // the private values are only accessible if we expose them from the function just like in below
    fun showPrivateInfo(): String {
        return privateInfo
    }
}

// # INTERNAL CLASS

// acc to my understanding this will be only accsessible inside this particulat module or file in
// other file i cant access the values

internal class InternalClass {
    internal val internalInfo: String = "Internal Info"
}

// # PROTECTED
// in my understanding the protected values are only accessible inside the extended or derived class
// it will not accessible outside the class
open class Himanshu {
    val name: String = "Himanshu"
    val age: Int = 25
    val weight: Int = 70
    protected val wallet_balance: Double = 100.00
}

class personalInfo : Himanshu() {
    fun show() {
        println("Name:- $name")
        println("Age:- $age")
        println("Weight:- $weight")
    }
}

fun main() {
    // # Classes
    // val result = Person("Himanshu", 24)
    // result.introduce()
    // println("$result")

    // val rectangle = Rectangle(2.4, 4.8)
    // println(rectangle.area)
    // println(rectangle.perimater())

    // val cylinder = Cylinder(5.0)

    // println(cylinder.volume())

    // val dog = Dog("Tommy")
    // dog.makeSound()

    // val cat = Animal("Pussy")

    // cat.makeSound()

    // # Interfaces

    // val triangle = Triangle()
    // triangle.draw()

    //  # Data Classes

    // val user = User("Himanshu", "Himanshuxyzz@gmail.com")
    // user.displayInfo()
    // println(user.username)

    // # Object

    // DatabaseConfig.connect()

    // # Access Modifiers

    // val publicObj = PublicClass()
    // println(publicObj.showPrivateInfo())

    // # Internal

    // val internalObject = InternalClass()
    // println(internalObject.internalInfo)

    // val personal_info = personalInfo()
    // personal_info.show()
    // println( personal_info.wallet_balance)
    // this will throw error -> Cannot access
    // 'wallet_balance': it is protected in
    // 'personalInfo'

    //  # COLLECTIONS

    // listof are immutables
    // mutableListOf lists are mutable

    // val list1 = listOf("Apple", "Banana", "Water Me Alien", "Kiwi", 1, 2, 3, 4, true, false)
    // println(list1[list1.size - 1])

    // val list2 = mutableListOf("Dog", "Cat", 1, 2)
    // list2.add("Elephant")
    // list2.remove("Dog")
    // list2.add(4)
    // println(list2)

    //  # SET

    // val uniqueAnimals = setOf("Cat", "Cat") // non editable
    // println(uniqueAnimals)

    // val editableAnimals = mutableSetOf("Cat", "Cat") // editable
    // editableAnimals.add("Dog")
    // println(editableAnimals)

    //  # MAPS

    // val map = mapOf(1 to "One", 2 to "Two") // immutable
    // println(map)

    // val editableMap = mutableMapOf("Cat" to "Animal")
    // editableMap["Dog"] = "Animal"
    // editableMap["Cat"] = "Evil"
    // println(editableMap)

    // Loops

    // val mutableList = mutableListOf("red", "green", "blue")

    // for (item in mutableList) {
    //     println(item)
    // }

    // val mutableMap = mutableMapOf("cat" to "Meow", "dog" to "Bhowwww")
    // for (item in mutableMap) {
    //     println(item.value)
    // }

    // for ((key, valye) in mutableMap) {
    //     println("{key:$key,value:$valye}")
    // }

    //  # GENERICS

    fun <T> printElements(elements: List<T>) {
        for (element in elements) {
            println(element)
        }
    }

    printElements(listOf("red", "dog", "blue", "cat")) // string
    printElements(listOf(1, 2, 3, 4, 5))

    class Box<T>(private var content: T) {
        fun getContent(): T {
            return content
        }
    }

    val box1 = Box(123)
    val box2 = Box("hello!")

    // println(box1.getContent())
    // println(box2.getContent())
    //  # NULL SAFETY

    var name: String? = "John wick"
    // name = null // will throw error that Null can not be a value of a non - null type String
    // println(name)

    //  # SAFE CALLLS

    var length: Int? = name?.length
    // println(length)

    //  # ELVIS operator

    val lengthExists: Int = name?.length ?: 0
    // println(lengthExists)

    //  # SAFE CAST

    val ob: Any = "I'm a string"
    // val obj2: String? = ob // this will throw error

    val obj2: String? = ob as? String // this will throw error

    // println(obj2)

    //  # EXCEPTION HANDLING

    // try {
    //     // val result = 10 / 0 // Arithmetic error

    //     val result = "String".toInt()
    // } catch (e: Exception) { // we can also use the Exception type if we dont know
    //     // what type of error can come , also you use can Any
    //     println("Caught an error: ${e.message}")
    // } catch (e: NumberFormatException) {
    //     // println("Caught an error: ${e.message}")
    //     throw NumberFormatException("Something wrong happend")
    // } finally {
    //     println("I will run everytime!")
    // }

    //  # EXTENSION FUNCTIONS -> can be used to extend the default functions methods

    fun String.isPalindrome(): String {
        return this.reversed()
    }

    // println("naman".isPalindrome())

    //  # LAMBDA function - these are expressions which can be assigned to variables

    // void is equivalent of Unit in kotlin
    val greet: (String) -> Unit = { name -> println("Hello $name") }
    // greet("Himanshu")

    // type safe lambda

    val greet2: (String) -> String = { name -> "Hello $name" }

    // println(greet2("Himanshu"))

    // high order function
    val numbers = listOf(1, 2, 3, 4, 5)
    val doubled = numbers.map { it * 2 }

    // println(doubled)

    // # FILE IO METHODS
}
