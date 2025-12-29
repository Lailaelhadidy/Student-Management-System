# Student Grade Management System (Java)

## 📌 Overview
The **Student Grade Management System** is a console-based Java application developed as a university project for the **Object-Oriented Programming (OOP)** course.  
The system manages student records, grades, and academic performance using core OOP principles.

---

## 🎯 Core Idea
The system stores up to 100 students in a fixed-size array.  
Each student has:
- A unique ID
- A name
- A dynamic array of grades based on the number of subjects

---

## ⚙️ Features
- Add new students
- Assign a dynamic number of subjects per student
- Enter grades for each subject
- Calculate average scores
- Determine letter grades
- Display all students
- Search for a student by ID
- Menu-driven console interface

---

## 🧱 System Design

### Main Classes
- **Student**
- **StudentManager**
- **Main Program**

---

## 📘 Class Descriptions

### Student
**Fields:**
- `id`
- `name`
- `double[] grades`

**Methods:**
- Constructor
- `setGrades()`
- `calculateAverageScore()`
- `getLetterGrade()`
- `displayInfo()`

---

### StudentManager
**Fields:**
- `Student[] students`
- `int count`

**Methods:**
- `addStudent()`
- `findStudentByID()`
- `enterGrades()`
- `calculateAverages()`
- `displayStudents()`

---

## 🧠 OOP Concepts Demonstrated
- Classes and Objects
- Encapsulation
- Arrays
- Constructors
- Loops
- Basic Searching
- Modular Design
