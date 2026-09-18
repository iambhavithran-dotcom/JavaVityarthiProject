# Student Academic Management System

**A comprehensive Java-based system for managing student records, courses, grades, and academic transcripts.**

---

## 📋 Table of Contents

- [Project Overview](#project-overview)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Installation & Setup](#installation--setup)
- [Usage Guide](#usage-guide)
- [Project Structure](#project-structure)
- [Testing Instructions](#testing-instructions)
- [Screenshots](#screenshots)
- [Contributing](#contributing)
- [Author](#author)

---

## 🎯 Project Overview

The **Student Academic Management System (SAMS)** is a robust, object-oriented application designed to streamline the management of student information, course enrollments, grade recording, and academic performance tracking in educational institutions.

**Key Problem Solved:** 
Educational institutions struggle with manual management of student data, leading to inefficiencies and errors. This system automates and digitizes the entire academic record management process.

**Target Users:**
- Administrative staff
- Faculty members
- Academic coordinators

---

## ✨ Features

### 1. **Student Management Module**
- ✅ Register new students with auto-generated Student ID
- ✅ Update student information (name, email, phone)
- ✅ Search and retrieve student records by ID
- ✅ Delete student records with cascade deletion
- ✅ View all students with detailed information
- ✅ Display student academic status

### 2. **Course Management Module**
- ✅ Create and manage courses with course codes
- ✅ Maintain course credits and instructor information
- ✅ Enroll students in courses
- ✅ Track enrolled students per course
- ✅ View course listings with enrollment statistics
- ✅ Update course information

### 3. **Grade Management & Academic Processing Module**
- ✅ Record grades (0-100 scale) for enrolled students
- ✅ Automatic GPA calculation (4.0 scale)
- ✅ Grade point determination (A/B/C/D/F)
- ✅ Input validation and error handling
- ✅ View grades by student or course
- ✅ Update grades if necessary

### 4. **Academic Reporting & Analytics**
- ✅ Generate student transcripts (all courses and grades)
- ✅ Calculate cumulative GPA
- ✅ Determine academic standing (Good Standing/Probation/Suspended)
- ✅ Generate performance reports
- ✅ List top performers by GPA
- ✅ Identify at-risk students
- ✅ Export reports to CSV format

### 5. **Data Persistence & Management**
- ✅ Persistent storage using CSV files
- ✅ Automatic data loading on startup
- ✅ Backup functionality
- ✅ Logging of all operations

---

## 🛠️ Technologies Used

| Technology | Purpose |
|-----------|---------|
| **Java 11+** | Core programming language |
| **OOP Principles** | Object-oriented design (Encapsulation, Inheritance, Polymorphism) |
| **Data Structures** | ArrayList, HashMap, TreeMap for efficient data management |
| **File I/O** | CSV files for data persistence |
| **Exception Handling** | Custom exceptions for robust error handling |
| **Design Patterns** | Singleton, Factory, MVC architecture |
| **JUnit** | Unit testing framework (Optional) |
| **Git/GitHub** | Version control and repository management |

---

## 📦 Installation & Setup

### Prerequisites
- Java 11 or higher installed
- Git installed
- IDE: IntelliJ IDEA, Eclipse, or VS Code (optional but recommended)

### Steps to Install & Run

1. **Clone the Repository**
   ```bash
   git clone https://github.com/yourusername/student-academic-management-system.git
   cd student-academic-management-system
   ```

2. **Compile the Project**
   ```bash
   javac -d bin src/com/sams/**/*.java
   ```

3. **Run the Application**
   ```bash
   java -cp bin com.sams.Main
   ```

   **Alternatively, using IDE:**
   - Open the project in your IDE
   - Navigate to `src/com/sams/Main.java`
   - Right-click and select "Run"

4. **Data Directory**
   - The system creates a `data/` directory automatically
   - CSV files (students.csv, courses.csv, etc.) are created on first run
   - Ensure write permissions for the application directory

---

## 💻 Usage Guide

### Main Menu Operations

Upon running the application, you'll see the main menu:

```
═════════════════════════════════════════════════════════
        STUDENT ACADEMIC MANAGEMENT SYSTEM
═════════════════════════════════════════════════════════

Main Menu:
1. Student Management
2. Course Management
3. Grade Management
4. View Transcripts
5. Generate Reports
6. Exit

Select an option: _
```

### 1. Student Management
```
Student Management:
  1.1 Add New Student
  1.2 Update Student Information
  1.3 Search Student
  1.4 Delete Student
  1.5 View All Students
  1.6 Back to Main Menu
```

**Example: Add Student**
```
Enter Student Name: John Doe
Enter Email: john.doe@university.edu
Enter Phone Number: 9876543210
✓ Student added successfully! ID: STU001
```

### 2. Course Management
```
Course Management:
  2.1 Create Course
  2.2 Enroll Student in Course
  2.3 View Courses
  2.4 View Enrolled Students
  2.5 Back to Main Menu
```

**Example: Create Course**
```
Enter Course Code: CS101
Enter Course Name: Introduction to Java Programming
Enter Credits: 4
Enter Instructor Name: Dr. Smith
✓ Course created successfully!
```

### 3. Grade Management
```
Grade Management:
  3.1 Record Grade
  3.2 View Grades
  3.3 Update Grade
  3.4 Back to Main Menu
```

**Example: Record Grade**
```
Enter Student ID: STU001
Enter Course Code: CS101
Enter Marks (0-100): 85
✓ Grade recorded successfully! Grade Point: 3.75 (A)
Student GPA updated: 3.75
```

### 4. View Transcripts
```
Academic Transcripts:
  4.1 View Student Transcript
  4.2 Export Transcript to CSV
  4.3 Back to Main Menu

Select an option: 1
Enter Student ID: STU001

═══════════════════════════════════════════════════════════
                   ACADEMIC TRANSCRIPT
═══════════════════════════════════════════════════════════
Student ID: STU001
Name: John Doe
Email: john.doe@university.edu

Course Details:
┌─────────┬───────────────────────────┬───────┬──────┬──────┐
│ Code    │ Course Name               │ Marks │ Grade│ GPA  │
├─────────┼───────────────────────────┼───────┼──────┼──────┤
│ CS101   │ Intro to Java             │ 85    │ A    │ 3.75 │
│ CS102   │ Data Structures           │ 90    │ A    │ 4.00 │
│ MATH101 │ Calculus I                │ 78    │ B+   │ 3.50 │
└─────────┴───────────────────────────┴───────┴──────┴──────┘

Cumulative GPA: 3.75
Academic Standing: Good Standing
═══════════════════════════════════════════════════════════
```

### 5. Generate Reports
```
Report Generation:
  5.1 Top Performers (by GPA)
  5.2 At-Risk Students (GPA < 2.0)
  5.3 Course Statistics
  5.4 Export Full Report
  5.5 Back to Main Menu
```

---

## 📂 Project Structure

```
StudentAcademicManagementSystem/
│
├── src/
│   └── com/sams/
│       ├── model/
│       │   ├── Student.java              # Student entity class
│       │   ├── Course.java               # Course entity class
│       │   ├── Grade.java                # Grade entity class
│       │   └── Transcript.java           # Transcript entity class
│       │
│       ├── controller/
│       │   ├── StudentManager.java       # Student business logic
│       │   ├── CourseManager.java        # Course business logic
│       │   ├── GradeProcessor.java       # Grade processing logic
│       │   └── TranscriptGenerator.java  # Transcript generation
│       │
│       ├── dao/
│       │   ├── StudentDAO.java           # Student data access
│       │   ├── CourseDAO.java            # Course data access
│       │   ├── GradeDAO.java             # Grade data access
│       │   └── FileManager.java          # CSV file operations
│       │
│       ├── ui/
│       │   └── MenuInterface.java        # Console UI and menu
│       │
│       ├── util/
│       │   ├── GradeCalculator.java      # GPA & grade calculations
│       │   ├── InputValidator.java       # Input validation
│       │   └── Logger.java               # Logging operations
│       │
│       ├── exception/
│       │   ├── StudentNotFoundException.java
│       │   ├── InvalidGradeException.java
│       │   └── CourseNotFoundException.java
│       │
│       └── Main.java                     # Application entry point
│
├── data/
│   ├── students.csv                      # Student records
│   ├── courses.csv                       # Course records
│   ├── enrollments.csv                   # Enrollment records
│   └── grades.csv                        # Grade records
│
├── logs/
│   └── application.log                   # Operation logs
│
├── docs/
│   ├── statement.md                      # Project statement
│   ├── diagrams/
│   │   ├── architecture_diagram.png
│   │   ├── class_diagram.png
│   │   ├── use_case_diagram.png
│   │   ├── sequence_diagram.png
│   │   └── er_diagram.png
│   └── Project_Report.pdf                # Detailed project report
│
├── test/
│   ├── StudentTest.java                  # Unit tests
│   ├── CourseTest.java
│   └── GradeProcessorTest.java
│
├── .gitignore
├── README.md                             # This file
└── statement.md                          # Project statement
```

---

## 🧪 Testing Instructions

### Running Unit Tests

1. **Using JUnit in IDE:**
   ```bash
   Right-click on test/ folder → Run Tests
   ```

2. **Using Command Line:**
   ```bash
   javac -cp test/:bin src/test/StudentTest.java
   java -cp bin:test org.junit.runner.JUnitCore StudentTest
   ```

### Manual Testing

The application includes built-in test data loader. You can:

1. **Test Student Operations:**
   - Add multiple students
   - Update student information
   - Search by ID
   - Delete and verify cascade

2. **Test Course Operations:**
   - Create 3-4 sample courses
   - Enroll students in multiple courses
   - Verify enrollment tracking

3. **Test Grade Operations:**
   - Record grades for enrolled students
   - Verify grade point calculation
   - Update grades and check recalculation
   - Test edge cases (0, 100, invalid values)

4. **Test Report Generation:**
   - Generate transcript and verify all courses appear
   - Verify GPA calculation accuracy
   - Export to CSV and check file format
   - Test with 0 courses, 1 course, multiple courses

### Edge Cases to Test
- ✓ Invalid marks (negative, >100)
- ✓ Student ID not found
- ✓ Course not found
- ✓ Duplicate enrollments
- ✓ Empty student list
- ✓ Marks update and GPA recalculation

---

## 📸 Screenshots

### 1. Main Menu
```
═════════════════════════════════════════════════════════
        STUDENT ACADEMIC MANAGEMENT SYSTEM
═════════════════════════════════════════════════════════
Main Menu:
1. Student Management
2. Course Management
3. Grade Management
4. View Transcripts
5. Generate Reports
6. Exit
Select an option: 
```

### 2. Student Registration
```
════ STUDENT MANAGEMENT ════
1.1 Add New Student
1.2 Update Student Information
1.3 Search Student
1.4 Delete Student
1.5 View All Students
1.6 Back to Main Menu

Enter Student Name: Alice Johnson
Enter Email: alice.johnson@uni.edu
Enter Phone: 9123456789

✓ Student registered successfully!
Student ID: STU0001
Name: Alice Johnson
Email: alice.johnson@uni.edu
```

### 3. Grade Recording
```
════ GRADE MANAGEMENT ════
Enter Student ID: STU0001
Enter Course Code: CS101
Enter Marks (0-100): 88

Processing grade...
✓ Grade recorded successfully!
Grade: B+ (3.5)
Updated Student GPA: 3.50
```

### 4. Transcript View
```
═══════════════════════════════════════════════════════
           ACADEMIC TRANSCRIPT - STU0001
═══════════════════════════════════════════════════════
Student: Alice Johnson

COURSES TAKEN:
─────────────────────────────────────────────────────
CS101  | Intro to Programming      | 88 | B+ | 3.50
CS102  | Data Structures           | 92 | A- | 3.75
MATH101| Calculus I                | 85 | B+ | 3.50
─────────────────────────────────────────────────────

Cumulative GPA: 3.58
Academic Standing: ✓ Good Standing
═══════════════════════════════════════════════════════
```

---

## 🤝 Contributing

This is an academic project. Feel free to:
- Report bugs
- Suggest improvements
- Enhance documentation
- Add new features

Please follow the existing code structure and naming conventions.

---

## 📝 Author

**Bhavithran S**  
Registration No: 24BCY10023  
Course: Programming in Java  
VIT University

---

## 📄 License

This project is created for educational purposes as part of the VIT Yarthi course evaluation.

---

## 🔗 Useful Links

- [Java Documentation](https://docs.oracle.com/javase/)
- [GitHub Help](https://help.github.com/)
- [UML Modeling Guide](https://en.wikipedia.org/wiki/Unified_Modeling_Language)

---

**Last Updated:** December 2024  
**Project Status:** ✅ Complete & Tested
