# Kotlin Compiler Script Documentation

This Node.js script automates the process of compiling and running Kotlin files, with automatic cleanup.

## Table of Contents

- [Module Imports](#module-imports)
- [File Configuration](#file-configuration)
- [Main Execution Block](#main-execution-block)
- [Usage](#usage)

## Module Imports

### Child Process Module

```javascript
const { execSync } = require("child_process");
```

- Imports `execSync` from Node's built-in `child_process` module
- Used to execute shell commands synchronously from Node.js
- "Synchronous" means it waits for command completion before moving on

### Path Module

```javascript
const path = require("path");
```

- Imports Node's `path` module
- Handles file paths consistently across different operating systems
- Helps avoid path-related issues between Windows/Mac/Linux

### File System Module

```javascript
const fs = require("fs");
```

- Imports Node's `fs` (File System) module
- Provides functions for file operations
- Used for checking if files exist and deleting files

## File Configuration

### Command Line Argument Handling

```javascript
const file = process.argv[2] || "Main.kt";
```

- `process.argv` is an array containing:
  - Index 0: Node executable path
  - Index 1: Current script path
  - Index 2: First user-provided argument
- Falls back to "Main.kt" if no argument provided

### Path Resolution

```javascript
const kotlinFile = path.resolve("src/", file);
```

- Creates absolute path to Kotlin file
- Looks in `src/` directory
- Handles path separators automatically

### Output File Configuration

```javascript
const jarFile = "Main.jar";
```

- Defines name for the compiled JAR file

### Path Formatting

```javascript
const quotedKotlinFile = `"${kotlinFile}.kt"`;
const quotedJarFile = `"${jarFile}.jar"`;
```

- Adds proper file extensions
- Wraps paths in quotes to handle spaces
- Prepares paths for command-line usage

## Main Execution Block

### Try Block

```javascript
try {
  execSync(`kotlinc ${quotedKotlinFile} -include-runtime -d ${quotedJarFile}`, {
    stdio: "inherit",
  });
  execSync(`java -jar ${quotedJarFile}`, {
    stdio: "inherit",
  });
}
```

- Compiles Kotlin file:
  - Uses `kotlinc` compiler
  - `-include-runtime`: Bundles Kotlin runtime
  - `-d`: Specifies output JAR
- Runs compiled JAR using Java
- `stdio: "inherit"`: Shows output in terminal

### Error Handling

```javascript
catch (error) {
  console.log(error);
}
```

- Catches any errors during compilation or execution
- Logs errors to console
- Prevents script from crashing

### Cleanup

```javascript
finally {
  if (fs.existsSync(jarFile)) {
    fs.unlinkSync(jarFile);
  }
}
```

- Always runs, regardless of success/failure
- Checks if JAR file exists
- Deletes JAR file if found
- Keeps workspace clean

## Usage

Run the script using either:

```bash
node compile-run-clean.js              # Uses default Main.kt
node compile-run-clean.js YourFile     # Uses YourFile.kt
```

The script performs three main operations in sequence:

1. Compiles Kotlin source to JAR
2. Executes the JAR file
3. Cleans up by removing the JAR

This automation simplifies the Kotlin development workflow by combining compile, run, and cleanup steps into a single command.

## Requirements

- Node.js installed
- Kotlin compiler (`kotlinc`) installed and available in PATH
- Java Runtime Environment (JRE) installed

## Directory Structure

```
project/
├── src/
│   └── Main.kt (or your Kotlin files)
└── compile-run-clean.js
```

## Note

Make sure your Kotlin files are placed in the `src` directory relative to where the script is run.
