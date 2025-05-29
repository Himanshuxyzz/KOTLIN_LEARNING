// to execute the system commands which are generally not possible with node js
const { execSync } = require("child_process");
const path = require("path");
const fs = require("fs");

// console.log(process.argv);

const file = process.argv[2] || "Main.kt";

const kotlinFile = path.resolve("src/", file);

const jarFile = "Main.jar";

const quotedKotlinFile = `"${kotlinFile}.kt"`;
const quotedJarFile = `"${jarFile}.jar"`;

try {
  console.log("compiling...🔥");
  execSync(`kotlinc ${quotedKotlinFile} -include-runtime -d ${quotedJarFile}`, {
    stdio: "inherit",
  });
  console.log("running...🚀");
  console.log("--------------------------------");
  execSync(`java -jar ${quotedJarFile}`, {
    stdio: "inherit",
  });
  console.log("--------------------------------");
  console.log("done...✅");
} catch (error) {
  console.log("--------------------------------");
  console.log(error);
  console.log("--------------------------------");
} finally {
  if (fs.existsSync(jarFile)) {
    fs.unlinkSync(jarFile);
  }
}
