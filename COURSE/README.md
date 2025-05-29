# Kotlin Learning Project

This repository contains Kotlin code examples for learning the language basics.

## Table of Contents

- [Running Kotlin Files](#running-kotlin-files)
- [Code Structure](#code-structure)
- [Key Concepts](#key-concepts)
- [Kotlin vs JavaScript Comparison](#kotlin-vs-javascript-comparison)

## Running Kotlin Files

### Option 1: Using Kotlin Compiler Directly

```bash
# Compile a Kotlin file
kotlinc src/Basic.kt -include-runtime -d Basic.jar

# Run the compiled JAR
java -jar Basic.jar
```

### Option 2: Using the Included Script

```bash
# Run the default file (Main.kt)
node compile-run-clean.js

# Run a specific file (e.g., Basic.kt)
node compile-run-clean.js Basic
```

## Code Structure

The `src/Basic.kt` file contains examples of:

- Variables and data types
- Functions
- Loops and control flow
- Classes and OOP concepts
- Interfaces
- Data classes
- Object declarations (singletons)
- Access modifiers

## Key Concepts

### Data Classes

```kotlin
data class User(val username: String, val email: String) {
    fun displayInfo() {
        println("username = $username")
    }
}
```

- Purpose: Store and operate on data
- Automatically generated: toString(), equals(), hashCode(), copy()
- Similar to JavaScript classes used as data containers

### Object Declarations

```kotlin
object DatabaseConfig {
    fun connect() {
        println("Database is connected!")
    }
}
```

- Purpose: Create singletons (single instances)
- Instantiated automatically when loaded
- Accessed directly without instantiation: `DatabaseConfig.connect()`
- Similar to a JavaScript object literal, but with guaranteed single instance

### Access Modifiers

- `public`: Default, accessible everywhere
- `private`: Only within the class
- `protected`: Within the class and subclasses
- `internal`: Within the same module

## Kotlin vs JavaScript Comparison

| Kotlin Concept | JavaScript Equivalent                   |
| -------------- | --------------------------------------- |
| data class     | Class with manually implemented methods |
| object         | Singleton pattern or object literal     |
| val            | const                                   |
| var            | let/var                                 |
| Fun interfaces | Function types                          |
| Null safety    | Optional chaining (?.)                  |

## Requirements

- Kotlin compiler (`kotlinc`) installed and available in PATH
- Java Runtime Environment (JRE) installed
- Node.js (for running the compile script)
