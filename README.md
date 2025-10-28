# Employee Management App

A simple Java web application for managing employee records, including user authentication, employee CRUD operations, and a web-based interface.

## Project Structure

```
EmployeeManagementApp/
│
├── build/
│   └── classes/                # Compiled Java classes
│       └── com/flm/
│           ├── Employee.class
│           ├── User.class
│           ├── dao/
│           ├── servlet/
│           └── util/
│
├── src/
│   └── main/
│       ├── java/
│       │   └── com/flm/
│       │       ├── Employee.java
│       │       ├── User.java
│       │       ├── dao/
│       │       │   ├── EmployeeDao.java
│       │       │   └── UserDao.java
│       │       ├── servlet/
│       │       │   ├── AddEmployee.java
│       │       │   ├── Delete_employee.java
│       │       │   ├── EmployeeServlet.java
│       │       │   ├── LoginServlet.java
│       │       │   ├── Signupservlet.java
│       │       │   └── UpdateServlet.java
│       │       └── util/
│       │           ├── Constant.java
│       │           └── Operations.java
│       └── webapp/
│           ├── index.html
│           ├── AddEmployee.jsp
│           ├── Employee.jsp
│           ├── Signup.jsp
│           ├── Update_Employee.jsp
│           ├── META-INF/
│           │   └── MANIFEST.MF
│           └── WEB-INF/
│               └── lib/
│                   └── mysql-connector-j-8.3.0.jar
│
└── README.md
```

## Features

- **User Authentication:** Login and signup functionality for users.
- **Employee Management:** Add, view, update, and delete employee records.
- **JSP-based UI:** Web interface for all operations.
- **Database Integration:** Uses MySQL for data storage (JDBC).

## Main Components

### Java Classes

- `Employee.java` / `User.java`: Model classes for employee and user data.
- `dao/EmployeeDao.java` / `dao/UserDao.java`: Data access objects for database operations. Contains user defined functions
- `servlet/`: Java servlets for handling HTTP requests (login, signup, CRUD).
- `util/Constant.java` / `util/Operations.java`: Utility classes for constants and DB operations. Constants are nothing but sql queries.

### JSP & HTML

- `index.html`: Landing page with login form.
- `Signup.jsp`: User registration form.
- `Employee.jsp`: Displays employee list and links to add/update/delete.
- `AddEmployee.jsp`: Form to add a new employee.
- `Update_Employee.jsp`: Form to update employee details.

### Libraries

- `mysql-connector-j-8.3.0.jar`: MySQL JDBC driver (in `WEB-INF/lib`).

## How to Run

1. **Database Setup:**
	- Create a MySQL database and required tables for users and employees.
	- Update DB connection details in `Constant.java` or `Operations.java`.

2. **Build the Project:**
	- Compile Java files and ensure all dependencies are in `WEB-INF/lib`.

3. **Deploy:**
	- Deploy the `webapp` directory to a servlet container (e.g., Apache Tomcat).

4. **Access the App:**
	- Open `index.html` in your browser to start.

## Notes

- Make sure your MySQL server is running and accessible.
- The app uses JSP and Servlets (Jakarta EE).
- All sensitive data (like DB credentials) should be secured in production.