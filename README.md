# Assignment S105

## General info:

**Technologies**: Backend Java

**Installation and Execution**:
1. Clone repository: https://github.com/bmestres/tascaS105.git

2. Project structure:
```text
.
├── README.md
├── directoriesTree.txt
├── directory_tree.txt
├── order.ser
├── pom.xml
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── nivell01
│   │   │   │   ├── exercici01
│   │   │   │   │   ├── DirectoryContentManager.java
│   │   │   │   │   └── Main.java
│   │   │   │   ├── exercici02
│   │   │   │   │   ├── DirectoryContentManager.java
│   │   │   │   │   └── Main.java
│   │   │   │   ├── exercici03
│   │   │   │   │   ├── DirectoryContentManager.java
│   │   │   │   │   └── Main.java
│   │   │   │   ├── exercici04
│   │   │   │   │   ├── DirectoryContentManager.java
│   │   │   │   │   └── Main.java
│   │   │   │   └── exercici05
│   │   │   │       ├── DirectoryContentManager.java
│   │   │   │       ├── Main.java
│   │   │   │       ├── Order.java
│   │   │   │       └── Product.java
│   │   │   └── nivell02
│   │   │       └── exercici01
│   │   │           ├── DirectoryContentManager.java
│   │   │           └── Main.java
│   │   └── resources
│   │       ├── app.properties
│   │       └── catalog.properties
│   └── test
│       └── java
├── target
│   ├── classes
│   │   ├── app.properties
│   │   ├── catalog.properties
│   │   ├── nivell01
│   │   │   ├── exercici01
│   │   │   │   ├── DirectoryContentManager.class
│   │   │   │   └── Main.class
│   │   │   ├── exercici02
│   │   │   │   ├── DirectoryContentManager.class
│   │   │   │   └── Main.class
│   │   │   ├── exercici03
│   │   │   │   ├── DirectoryContentManager.class
│   │   │   │   └── Main.class
│   │   │   ├── exercici04
│   │   │   │   ├── DirectoryContentManager.class
│   │   │   │   └── Main.class
│   │   │   └── exercici05
│   │   │       ├── DirectoryContentManager.class
│   │   │       ├── Main.class
│   │   │       ├── Order.class
│   │   │       └── Product.class
│   │   └── nivell02
│   │       └── exercici01
│   │           ├── DirectoryContentManager.class
│   │           └── Main.class
│   └── generated-sources
│       └── annotations
└── testOutput.txt
```

## Level 1

### Exercise 1:
Create a class that lists alphanumerically the content received by parameter.

**Compilation:**
javac -d target/classes src/main/java/nivell01/exercici01/*.java

**Execution:**
java -cp target/classes nivell01.exercici01.Main

### Exercise 2:
Added to the previous exercise the functionality of listing the directories tree.

**Compilation:**
javac -d target/classes src/main/java/nivell01/exercici02/*.java

**Execution:**
java -cp target/classes nivell01.exercici02.Main

### Exercise 3:
Added the functionality to save the directories tree in a text file.

**Compilation:**
javac -d target/classes src/main/java/nivell01/exercici03/*.java

**Execution:**
java -cp target/classes nivell01.exercici03.Main

### Exercise 4:
Added the functionality of reading any text file and showing it to console.
**Compilation:**
javac -d target/classes src/main/java/nivell01/exercici04/*.java

**Execution:**
java -cp target/classes nivell01.exercici04.Main

### Exercise 5:
Added the functionality of serializing and deserializing any given object.
**Compilation:**
javac -d target/classes src/main/java/nivell01/exercici05/*.java

**Execution:**
java -cp target/classes nivell01.exercici05.Main

## Level 2

### Exercise 1:
Exercise 3 of Level 1 parametrizing all methods to a properties file.

**Compilation:**
javac -d target/classes src/main/java/nivell02/exercici01/*.java

**Execution:**
java -cp target/classes nivell02.exercici01.Main
