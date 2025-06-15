# 🔐 LockedMe.com – Capstone Project One
## 🎯 Objective

The goal of this project is to develop a **command-line based prototype** for a digital file repository system (LockedMe.com). The application enables users to **view**, **add**, **delete**, and **search** files within a designated root directory. This prototype serves as an MVP for stakeholders to evaluate before full-scale development.

---

## ✅ Functional Requirements

### 1. Welcome Screen
- Displays the application name and developer details.
- Shows the main menu with 3 options:
  1. List current file names in ascending order.
  2. Access business-level operations.
  3. Exit the application.

### 2. List Files
- Displays all files in the root directory in lexicographical (ascending) order.
- Handles empty directory cases.

### 3. Business-Level Operations
- **Add a File** (case-insensitive): Allows users to add a new file.
- **Delete a File** (case-sensitive): Removes a user-specified file; returns “File Not Found” if missing.
- **Search a File** (case-sensitive): Searches for a user-specified file; returns success or not found.
- **Return to Main Menu**: Navigates back to the welcome screen without exiting.

### 4. Exit
- Allows the user to gracefully terminate the application.

---

## ❌ Non-Functional Requirements

- The application must handle **invalid inputs gracefully** without crashing.
- All operations should provide clear **user feedback**.
- Use of efficient **sorting (Collections.sort)** and **search algorithms**.
- File operations must handle **I/O exceptions** securely.
- The application should be **modular and easy to maintain**.

---

## 🔁 Flow of the Application

```text
START
 |
 v
Display Welcome Screen
 |
 +--> Option 1: Show all files (Ascending)
 |
 +--> Option 2: Business Operations
 |     |
 |     +--> Add file
 |     +--> Delete file
 |     +--> Search file
 |     +--> Return to Main Menu
 |
 +--> Option 3: Exit Application
 |
END
