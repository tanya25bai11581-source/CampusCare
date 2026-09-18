````markdown
# CampusCare – Student Health Management System

## Overview

CampusCare is a console-based Java application designed to manage basic student health-related information in a simple and organized way.

The project demonstrates core Programming in Java concepts including Object-Oriented Programming, ArrayList collections, exception handling, file handling, and multithreading.

## Features

### 1. Student Management
- Add student details
- View student records

### 2. Appointment Management
- Book appointments
- View appointments

### 3. Health Records
- Add health records
- View health records

### Additional Features
- Console-based menu system
- Exception handling for invalid main-menu input
- Background appointment reminder task using multithreading
- Modular class-based design
- File handling classes for data storage/export functionality

## Technologies Used

- Java
- Object-Oriented Programming
- ArrayList
- Exception Handling
- File I/O
- Multithreading
- Git & GitHub

## Project Structure

```text
CampusCare/
├── src/
│   ├── Main.java
│   ├── Student.java
│   ├── StudentManager.java
│   ├── Appointment.java
│   ├── AppointmentManager.java
│   ├── HealthRecord.java
│   ├── HealthRecordManager.java
│   ├── FileManager.java
│   ├── DataExporter.java
│   └── ReminderTask.java
├── data/
├── docs/
├── README.md
└── statement.md
````

## How to Run

Open the `src` directory in the terminal.

Compile all Java files:

```bash
javac *.java
```

Run the application:

```bash
java Main
```

## Main Modules

1. Student Management
2. Appointment Management
3. Health Records

## Testing

The application was tested by compiling all Java source files and running the main program through the console.

The following operations were tested:

* Adding and viewing student details
* Booking and viewing appointments
* Adding and viewing health records
* Main-menu input validation
* Background reminder task execution
* Successful compilation of all Java source files

## Non-Functional Features

* **Usability:** Simple console-based menu system
* **Reliability:** Exception handling for invalid input
* **Maintainability:** Separate classes for different modules
* **Resource Efficiency:** Lightweight console-based implementation

## Future Enhancements

* Persistent database storage
* Graphical user interface
* Student login and authentication
* Appointment cancellation and rescheduling
* Advanced health analytics
* Improved input validation

## Author
Tanya Kakkar 25BAI11581
Programming in Java Project – CampusCare

