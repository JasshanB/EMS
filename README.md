# Employee Management System (EMS)

A simple **Employee Management System** built in **Java** with **MySQL database** integration.  
This project demonstrates how to manage employees using **DAO pattern** and JDBC for database connectivity.

---

## 📂 Project Structure

EMS/
├── src/
│ ├── Main.java # Entry point of the application
│ ├── Employee.java # Employee model class
│ ├── EmployeeDAO.java # Data Access Object for CRUD operations
│ ├── DBConnection.java # Handles MySQL database connection
├── sql/
│ ├── schema.sql # SQL script to create employees table
├── .gitignore # Git ignore file (Java template)
├── README.md # Project documentation

---

## ⚙️ Features

1. Add new employees  
2. View all employees  
3. Update employee details  
4. Delete employee records  
5. Store employee data in **MySQL database**  

---

## 🛠️ Technologies Used

- **Java 17+**
- **MySQL** (Workbench or Server)
- **JDBC (Java Database Connectivity)**
- **DAO (Data Access Object) Pattern**
- **Git & GitHub** for version control

---

## ▶️ How to Run

1. Clone the repository:

git clone https://github.com/JasshanB/EMS.git

2. Import the project in your IDE (VS Code / IntelliJ / Eclipse).

3. Configure your MySQL username & password in DBConnection.java:

  private static final String URL = "jdbc:mysql://localhost:3306/emsdb";
  private static final String USER = "root";
  private static final String PASSWORD = "yourpassword";

4. Run the Main.java file.
