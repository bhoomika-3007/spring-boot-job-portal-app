# Job Portal App

A full-stack Job Portal web application built from scratch using **Java Spring Boot** (backend), **MySQL** (database), and **HTML/CSS/JavaScript** (frontend).

---

## About the Project

This project was built to gain hands-on experience with Spring Boot REST APIs, relational databases, and connecting a frontend to a backend. The application allows users to browse job listings, search by keyword, and create new job posts.

---

## Tech Stack

| Layer | Technology |
|-------|-----------|
| Backend | Java, Spring Boot 4.x |
| Database | MySQL 8.0 |
| ORM | Spring Data JPA + Hibernate |
| Frontend | HTML5, CSS3, Vanilla JavaScript |
| API Testing | Postman, Swagger UI |
| Build Tool | Maven |

---

## Features

- **Browse Jobs** — View all available job listings on a clean, responsive page
- **Keyword Search** — Search across job title, description, and required technologies
- **Post a Job** — Create new job listings through a form
- **REST API** — Three well-structured endpoints tested via Postman
- **Auto Schema** — Hibernate automatically creates the database table from the Java entity class

---

## Project Structure

```
job-portal-app/
├── src/
│   ├── main/
│   │   ├── java/com/jobportal/
│   │   │   ├── model/
│   │   │   │   └── JobPost.java          # Entity class mapped to MySQL table
│   │   │   ├── repository/
│   │   │   │   └── JobPostRepository.java # JPA repository with custom keyword search
│   │   │   ├── controller/
│   │   │   │   └── JobPostController.java # REST API endpoints
│   │   │   └── JobPortalAppApplication.java
│   │   └── resources/
│   │       ├── static/
│   │       │   ├── index.html            # Landing page
│   │       │   ├── jobs.html             # Job listings + search
│   │       │   └── create.html           # Post a job form
│   │       └── application.properties
├── pom.xml
└── .gitignore
```

---

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/job-posts` | Retrieve all job posts |
| GET | `/job-posts/{keyword}` | Search jobs by keyword |
| POST | `/create-job-post` | Create a new job post |

### Sample POST Request Body

```json
{
  "profile": "Java Backend Developer",
  "description": "Looking for a Java developer with Spring Boot experience",
  "experience": 2,
  "technologies": "Java,Spring Boot,MySQL"
}
```

---

## How to Run Locally

### Prerequisites
- Java 17+
- MySQL 8.0
- Maven

### Steps

1. Clone the repository
   ```bash
   git clone https://github.com/bhoomika-3007/job-portal-app.git
   cd job-portal-app
   ```

2. Create a MySQL database
   ```sql
   CREATE DATABASE job_portal_db;
   ```

3. Update `application.properties` with your MySQL credentials
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/job_portal_db
   spring.datasource.username=root
   spring.datasource.password=YOUR_PASSWORD
   ```

4. Run the application
   ```bash
   mvnw spring-boot:run
   ```

5. Open browser and go to `http://localhost:8080`

---

## What I Learned

- Building REST APIs with Spring Boot and the `@RestController`, `@GetMapping`, `@PostMapping` annotations
- Using Spring Data JPA to interact with a relational database without writing raw SQL
- Writing custom JPQL queries with `@Query` for keyword-based search using `LIKE`
- How Hibernate auto-generates database schema from Java entity classes (`ddl-auto=update`)
- Dependency Injection with `@Autowired`
- Connecting a plain HTML/CSS/JavaScript frontend to a backend REST API using `fetch()`
- Testing APIs using Postman
- Using `.gitignore` and pushing a project to GitHub with meaningful commits

---

## Author

**Bhoomika**  
GitHub: [@bhoomika-3007](https://github.com/bhoomika-3007)

---

## Note

This project was built as a hands-on learning exercise to implement backend development concepts practically. The backend (Spring Boot, JPA, REST APIs) was fully developed and understood by me. The frontend was built using plain HTML/CSS/JS — no frameworks — to keep it simple and explainable.
