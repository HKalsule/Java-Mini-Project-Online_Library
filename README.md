# 📚 Java Library Management System

Welcome to the **Java Library Management System** repository!  
This project consists of two Java programs designed to simulate a simple library system.  

---

## 🔧 Project Structure

### 1. `OnlineLibrary.java`  
📌 **Approach:** Functional programming using `static` methods.

#### 📋 Features:
- 🟩 Add a book to the library  
- 📕 Issue (borrow) a book  
- 📗 Return a book  
- 📘 Display list of currently available books  

#### 🧠 How It Works:
- An array `availableBooks` stores the names of books currently in the library.
- Adding a book creates a new array with one additional slot.
- Issuing a book removes it from the array using a shifting mechanism.
- Returning a book adds it back using a resizing strategy similar to adding.
- The program runs in a loop allowing multiple user choices using a simple menu.

#### 💡 Concepts Demonstrated:
- Static method design
- Manual array resizing and manipulation
- Input/output with `Scanner`
- Control flow using loops and conditionals

---

### 2. `OnlineLibrary2.java`  
📌 **Approach:** Object-Oriented Programming using a custom `Library` class.

#### 📋 Features:
- ➕ Add multiple books at once
- 🔄 Issue multiple books in one go
- 🔁 Return multiple books
- 📚 Show all available books

#### 🧠 How It Works:
- A class `Library` is defined with:
  - `books[]`: A string array to store book names.
  - `no_of_books`: An integer to track the number of books added.
- Books are added to the array by incrementing the index.
- Issuing a book is handled by searching the array and replacing the value with `null`.
- Returning a book uses the `addBooks()` method to insert it back.
- The `main()` method presents a menu-based interface allowing user interaction through the console.

#### 💡 Concepts Demonstrated:
- Encapsulation and object creation
- Method-based data manipulation
- Dynamic user input for multiple operations
- `null` handling in arrays to simulate removal

---

## 🧠 Key OOP and Java Concepts Covered

| Concept | Description |
|--------|-------------|
| 🧱 Class & Object | Models real-world library behavior |
| 🔐 Encapsulation | Book data is manipulated through methods |
| 🧮 Arrays | Core data structure to hold book entries |
| 🔄 Loops & Conditionals | Menu navigation and book processing |
| 🖋️ Scanner | Used for user input |
| 📦 Method Overloading | Demonstrated via repeated book handling methods (return/add) |

---
