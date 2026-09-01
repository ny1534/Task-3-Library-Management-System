Code
# Task-3 - Library Management System (Using OOP)

A simple and clean Library Management System built using Java OOP concepts. This project manages Books and Users with Issue and Return functionality.

## Features
- Add new Books to Library
- View all Books with Status (Available / Issued)
- Add new Users / Members
- View all Users
- Issue a Book to a User
- Return a Book

## OOP Concepts Used
1.  **Encapsulation:** All data members in `Book.java` and `User.java` are private and accessed via getters/methods.
2.  **Abstraction:** `Library.java` hides internal searching logic from the user.
3.  **HAS-A Relationship:** Library HAS-A list of Books and Users (Composition).
4.  **Class & Object:** Separate classes for Book, User, Library, and Main.

## Project Structure
- `Book.java` - Model class for Book (ID, Title, Author, Status)
- `User.java` - Model class for User (ID, Name)
- `Library.java` - Core logic class containing ArrayList of Books & Users
- `Main.java` - Menu-driven main class to interact with user

## How to Run
1.  Compile all files: