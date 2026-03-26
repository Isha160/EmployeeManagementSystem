# Employee Management System

## 📌 Project Description
Employee Management System is a full-stack Java web application developed to manage employee records efficiently. The application allows an admin to perform basic CRUD (Create, Read, Update, Delete) operations on employee data using Java, JDBC, MySQL, JSP, and Servlets. The system follows a structured approach with proper database connectivity, form validation, and exception handling.

---

## ⚙️ Tech Stack
- Java (Core Java)
- JDBC
- MySQL
- JSP
- Servlets
- Apache Tomcat
- HTML & CSS (basic for UI)

---

## ✨ Features
- Admin Login Authentication (ID & Password)
- Add New Employee
- View All Employees
- Search Employee by ID
- Update Employee Details
- Delete Employee Record
- MySQL Database Connectivity using JDBC (5 Steps)
- Form Validation
- Exception Handling

---

## 👤 User Roles
### Admin
- Login using credentials
- Perform all CRUD operations on employee data

---

## 📁 Project Structure

Employee-Management-System  
│  
├── src  
│   ├── com.employee.controller  
│   │   ├── AddEmployeeServlet.java  
│   │   ├── UpdateEmployeeServlet.java  
│   │   ├── DeleteEmployeeServlet.java  
│   │   ├── SearchEmployeeServlet.java  
│   │   └── LoginServlet.java  
│   │  
│   ├── com.employee.dao  
│   │   └── EmployeeDAO.java  
│   │  
│   ├── com.employee.model  
│   │   └── Employee.java  
│   │  
│   └── com.employee.util  
│       └── DBConnection.java  
│  
├── WebContent  
│   ├── login.jsp  
│   ├── addEmployee.jsp  
│   ├── viewEmployee.jsp  
│   ├── updateEmployee.jsp  
│   └── error.jsp  
│  
└── README.md

---

## 🗄️ Database Details
**Database Name:** employee_db  

### Employee Table
sql
CREATE TABLE employee (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(100),
    emp_email VARCHAR(100),
    emp_department VARCHAR(50),
    emp_salary DOUBLE
);

CREATE TABLE admin (
    admin_id VARCHAR(50),
    admin_password VARCHAR(50)
);

---
## 🔌 JDBC Connectivity (5 Steps Used)

1. **Load and Register Driver**  
2. **Establish Connection**  
3. **Create Statement / PreparedStatement**  
4. **Execute Query**  
5. **Close Connection**

---

## ▶️ How to Run the Project

### ✅ Prerequisites
- JDK 8 or above  
- Apache Tomcat (9 or 10)  
- MySQL Server  
- Eclipse / IntelliJ IDEA  
- MySQL Connector JAR


### 🚀 Steps to Run
1. Clone or download the project from GitHub.  
2. Import the project into the IDE as a **Dynamic Web Project**.  
3. Configure **Apache Tomcat Server** in the IDE.  
4. Create the required database and tables in **MySQL**.  
5. Update database credentials in `DBConnection.java`.  
6. Add **MySQL Connector JAR** to the project build path.  
7. Run the project on the **Tomcat server**.  
8. Access the application in the browser:
http://localhost:8080/EmployeeManagementSystem/login.jsp
---

🔐 Sample Admin Credentials
Admin ID: admin
Password: admin123
---

## 📌 Conclusion

This project helped me gain hands-on experience in real-world Java web application development.  
It enhanced my understanding of **JDBC-based database connectivity**, **MVC architecture**, and **deployment of applications on the Apache Tomcat server**.
