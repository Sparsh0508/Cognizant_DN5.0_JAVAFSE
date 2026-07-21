# 🚀 Cognizant Digital Nurture 5.0 – Java Full Stack Engineering

[![Java](https://img.shields.io/badge/Java-17%2F25-ED8B00?style=flat&logo=openjdk&logoColor=white)](https://openjdk.org/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x%20%7C%204.1-6DB33F?style=flat&logo=spring&logoColor=white)](https://spring.io/projects/spring-boot)
[![React](https://img.shields.io/badge/React-19-61DAFB?style=flat&logo=react&logoColor=black)](https://reactjs.org/)
[![Maven](https://img.shields.io/badge/Maven-Build-C71A36?style=flat&logo=apachemaven&logoColor=white)](https://maven.apache.org/)
[![JUnit 5](https://img.shields.io/badge/JUnit-5-25A162?style=flat&logo=junit5&logoColor=white)](https://junit.org/junit5/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

> A structured learning repository containing all assignments, hands-on exercises, and mini-projects completed during the **Cognizant Digital Nurture 5.0 – Java Full Stack Engineering** training program.

---

## 📖 About the Program

The **Cognizant Digital Nurture 5.0 (DN 5.0)** program is a comprehensive full-stack engineering curriculum designed to build industry-ready software engineers. It covers the entire stack — from Core Java fundamentals and data structures through Spring Boot backends, JPA/Hibernate persistence, microservices architecture, and a ReactJS frontend.

---

## ✅ Features

- **Core Java Mastery** — 35 standalone programs covering syntax, OOP, Collections, Streams, Lambdas, Records, JDBC, Modules, Networking, and Modern Java (Pattern Matching, Switch Expressions)
- **Data Structures & Algorithms** — 7 real-world scenario exercises (inventory search, e-commerce search, sorting, employee management, task manager, library system, financial forecasting)
- **Design Patterns** — 10 classic GoF patterns implemented in Java (Singleton, Factory, Builder, Adapter, Decorator, Proxy, Observer, Strategy, Command, MVC) plus SOLID/Dependency Injection
- **PL/SQL Programming** — 7 exercises covering Control Structures, Error Handling, Stored Procedures, Functions, Triggers, Cursors, and Packages with a schema and sample data
- **TDD with JUnit & Mockito** — Unit testing using JUnit 5, Mockito mocking, SLF4J logging, basic and advanced test scenarios
- **Spring Core & Maven (Library Management)** — Spring Boot REST API with AOP logging, Spring Data JPA, H2 in-memory database
- **Spring Data JPA & Hibernate (Employee Management)** — Full CRUD REST API with derived queries, JPQL `@Query`, named queries, pagination, sorting, projections, and JPA Auditing
- **Microservices (Account & Loan)** — Two independent Spring Boot microservices with REST controllers
- **ReactJS Frontend** — 10 hands-on React applications covering components, props, state, events, hooks, and real-world mini apps (Blog, Cricket Scorecard, Office Space Rental, Ticket Booking, etc.)

---

## 🛠 Tech Stack

| Category | Technologies |
|---|---|
| **Language** | Java 17, Java 25 |
| **Backend Framework** | Spring Boot 3.3.x, Spring Boot 4.1.0 |
| **Spring Modules** | Spring Core (IoC/DI), Spring AOP, Spring MVC (Web), Spring Data JPA |
| **ORM / Persistence** | Hibernate, Jakarta Persistence (JPA), Spring Data JPA |
| **Database** | H2 (in-memory, dev), Oracle (PL/SQL exercises) |
| **Build Tools** | Apache Maven, Gradle (Kotlin/Groovy DSL) |
| **Testing** | JUnit 5 (Jupiter), Mockito 5.x, Spring Boot Test |
| **Logging** | SLF4J |
| **Frontend** | React 19, Create React App (react-scripts 5), JavaScript (ES6+) |
| **Frontend Testing** | React Testing Library, Jest |
| **Code Quality** | Lombok (`@Getter`, `@Setter`, `@NoArgsConstructor`, etc.) |
| **Version Control** | Git, GitHub |
| **IDE Support** | IntelliJ IDEA, VS Code |

---

## 📂 Project Structure

```
Digital_Nurture_5.0_JAVAFSE/
│
├── README.md
├── .gitignore
│
└── Java_FSE/
    ├── Week_1/
    │   ├── Core_JAVA/
    │   ├── Data_Structures_And_Algorithms/
    │   ├── Design_Patterns_And_Principles/
    │   ├── PL_SQL_Programming/
    │   ├── TDD_using_javen/
    │   └── TDD_using_javen_Mockito/
    │
    ├── Week_2/
    │   └── Spring_Core_And_Maven/
    │
    ├── Week_3/
    │   └── Spring_Data_JPA_And_Hibernate/
    │
    ├── Week_4/
    │   └── Microservices/
    │
    └── Week_5/
        └── ReactJS/
```

### Prerequisites

| Tool | Version | Purpose |
|---|---|---|
| JDK | 17+ | Core Java, Spring Boot modules |
| Maven | 3.9+ | Build tool for Spring Boot Maven modules |
| Gradle | 8.x | Build tool for EmployeeManagementSystem |
| Node.js | 18+ | ReactJS frontend apps |
| npm | 9+ | Package manager for React apps |
| Oracle DB | Any | PL/SQL exercises only |

### 1. Clone the Repository

```bash
git clone https://github.com/Sparsh0508/Cognizant_DN5.0_JAVAFSE.git
cd Cognizant_DN5.0_JAVAFSE
```

### 2. Backend – Spring Boot (Maven)

```bash
# Week 2 – Library Management
cd Java_FSE/Week_2/Spring_Core_And_Maven/LibraryManagement
mvn clean install

# Week 4 – Account Microservice
cd Java_FSE/Week_4/Microservices/Account
./mvnw clean install
```

### 3. Backend – Spring Boot (Gradle)

```bash
# Week 3 – Employee Management System
cd Java_FSE/Week_3/Spring_Data_JPA_And_Hibernate/EmployeeManagementSystem
./gradlew build
```

### 4. Frontend – ReactJS

```bash
# Navigate to any React app, e.g.:
cd Java_FSE/Week_5/ReactJS/ReactJS-1/myfirstreact
npm install
```

### 5. Standalone Java Programs (Core Java / DSA / Design Patterns)

Each subfolder is a self-contained Java project. Open in IntelliJ IDEA or VS Code and run `Main.java` directly, or compile manually:

```bash
cd Java_FSE/Week_1/Core_JAVA/01_Hello_World_Program
javac src/*.java -d out
java -cp out Main
```

---

## 🔧 Configuration

### Spring Boot Applications

Spring Boot apps use **H2 in-memory database** by default — no external database setup is required for Week 2 and Week 3 projects.

The H2 console (if enabled) is typically available at:
```
http://localhost:8080/h2-console
```

Typical `application.properties` settings (auto-configured by Spring Boot):
```properties
# H2 In-Memory Database
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driver-class-name=org.h2.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### PL/SQL Exercises (Oracle)

The PL/SQL exercises require an Oracle Database instance. Use the provided SQL files:

```sql
-- Step 1: Create schema (tables)
@Java_FSE/Week_1/PL_SQL_Programming/Schema.sql

-- Step 2: Insert sample data
@Java_FSE/Week_1/PL_SQL_Programming/SampleData.sql

-- Step 3: Run individual exercise scripts
@Java_FSE/Week_1/PL_SQL_Programming/PLSQL_Exercise1_Control_Structures/...
```

### Microservices Ports

Each microservice runs as an independent Spring Boot application. Ensure ports do not conflict:

| Service | Default Port |
|---|---|
| Account Microservice | `8080` |
| Loan Microservice | `8080` |

> **Note:** To run both simultaneously, configure different ports in each service's `application.properties`:
> ```properties
> server.port=8081
> ```

## 🤝 Contributing

This is a personal learning repository, but feedback and suggestions are welcome.

1. **Fork** the repository
2. **Create** a feature branch: `git checkout -b feature/your-improvement`
3. **Commit** your changes: `git commit -m "Add: brief description"`
4. **Push** to your branch: `git push origin feature/your-improvement`
5. **Open** a Pull Request

Please ensure:
- Code follows standard Java naming conventions (camelCase for methods, PascalCase for classes)
- Each exercise or project remains self-contained in its own directory
- No build artifacts (`.class`, `target/`, `build/`, `node_modules/`) are committed

---

## 📜 License

This project is licensed under the **MIT License** — you are free to use, copy, modify, merge, publish, and distribute the content for educational purposes.

---

## 👨‍💻 Author

**Sparsh Agarwal**  
Java Full Stack Engineering Trainee — Cognizant Digital Nurture 5.0

- 🐙 GitHub: [@Sparsh0508](https://github.com/Sparsh0508)

---

> ⭐ If this repository helped you, consider giving it a star!
