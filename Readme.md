# University Java Labs

Lab1 and Lab2 have variable names and classes in Polish. This is incorrect, but I was given this assignment in a class at university. The other labs are in English.

---

## Lab 1: Geometric Shapes System

**Task:**
Implement a class hierarchy representing geometric shapes. The system should include:
* **`Figura` class**: A base class for all shapes implementing the `toString()` method.
* **Derived classes**: Representing specific shapes: `Koło` (Circle), `Prostokąt` (Rectangle), `Trójkąt` (Triangle).
* **Static fields**: To count the number of instances created for each shape type.
* **Methods**: To calculate the area and perimeter for each shape.

---

## Lab 2: Music Store Management System

**Task:**
Implement a management system for a music store's inventory. The project demonstrates the use of:
* Inheritance and Polymorphism.
* Abstract classes and Interfaces.

---

## Lab 3: Document Manager

**Task:**
Develop a document manager using the following components:

### Inheritance & Polymorphism:
* **Interface:** `Document`
* **Abstract Class:** `BaseDocument`
* **Child Class:** `TextDocument`

### Design Patterns:
* **Singleton:** `DocumentManager` class with a `getInstance()` method.
* **Adapter:** `FileDocumentAdapter` for reading documents from files.
    * *Note:* The constructor must declare throwing an `IOException`.

### File I/O & Exception Handling:
* Use of `java.io.FileReader` and `java.util.Scanner` for parsing.
* Implementation of `try-catch` blocks and custom `IOException` handling.

**Input:** Data is processed using the `document.txt` file.

---

## Lab 4: Stream API and Collections

**Task:**
Read data from a `products.txt` file and generate reports using functional programming:
* Collections and Lambda expressions.
* **Stream API** and method references.
* **Constraint:** All operations must use Stream API. The use of `if` statements is strictly prohibited.

---

## Lab 5: Generics and Iterators

**Task:**
Implement a class structure based on a provided diagram using Java Generics to achieve a specific console output.
* **Interface `LibraryItem`** and `Book` class.
* **Generic Class `Container<T extends LibraryItem>`**: Implementing the `Iterable` interface.
* **Custom Iterator**: Implementation of the `LibraryItemIterator` class.
* **Sorting**: Implementing custom comparators (`TitleComparator`, `YearComparator`, `AuthorComparator`).
* **Wildcards**: Using `? extends LibraryItem` in the `LibraryUtils` utility class.

---

## Lab X: Comparison and Management System

**Task:**
Create a set of classes and static methods demonstrating core Java Object operations:
* Object cloning and `String` class methods.
* Overriding `equals()` and `hashCode()` (inherited from the `Object` class).
* Practical application of the **Reflection API**.