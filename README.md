# 💼 Job Portal App - Java Spring Boot with REST APIs, ReactJS, MongoDB

## 📌 Project Overview
**Job Portal App** is a simple full-stack web application designed to help users browse job listings and create new job posts. It is built using **Java Spring Boot** for the backend, **ReactJS** for the frontend, and **MongoDB** for data persistence.

This project demonstrates how to create a modular and scalable application using a modern technology stack, implementing essential CRUD operations with pagination and keyword-based searching.

---

## 👥 Team Contribution

This project was developed as a collaborative academic project.

- I was responsible for designing and implementing the backend using Spring Boot.
- My work included REST API development, database integration with MongoDB, and implementing search functionality.
- The frontend (ReactJS) and UI components were handled by other team members.

---

## 🚀 Features

- 🔍 **Job Feed Page**: View all available job posts fetched from a local MongoDB database.
- 🔎 **Search Functionality**: Filter job posts based on keywords like `Java`, `Python`, etc.
- 📄 **Pagination**: Display 6 jobs per page with clickable page numbers for easy navigation.
- 📝 **Create Job Post**: Submit new job listings through a form and store them in MongoDB.

---

## 🛠️ Tech Stack

### Backend
- [Java Spring Boot](https://start.spring.io/)
- Spring Web (REST APIs)
- Spring Data MongoDB
- Swagger-UI
- Maven

### Frontend
- [ReactJS](https://reactjs.org/)
- Axios for HTTP requests
- React Router for navigation
- TailwindCSS for styling

### Database
- [MongoDB](https://www.mongodb.com/) (running locally)


---

## 🏗️ Project Structure
### 🔙 Backend (Spring Boot)

```
job-portal-backend/
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.backend.jobportal.spring_boot_job_portal_app
│   │   │       ├── controller
│   │   │       ├── interfaces
│   │   │       ├── model
│   │   │       └── SpringBootJobPortalAppApplication.java
│   │   └── resources
│   │       ├── application.properties
│   │       ├── static/
│   │       └── templates/
│   └── test
│       └── java
│           └── com.backend.jobportal.spring_boot_job_portal_app
├── .env
└── pom.xml

```

### 🌐 Frontend (ReactJS)

```
job-portal-frontend/
 ├── public/
 ├── src/
 │   ├── api/
 │   ├── components/
 │   ├── pages/
 │   ├── App.jsx
 │   └── main.jsx 
 ├── package.json

```

---

## 🔧 Installation & Setup

### 📌 Prerequisites
Ensure you have the following installed:
- **Java 17+**
- **Node.js & npm**
- **MongoDB installed locally or access to MongoDB Atlas**

### 🔽 Backend Setup

The Spring Boot app will start at **[http://localhost:8080](http://localhost:8080)**


#### 🧪 Configure Environment

Edit `application.properties`:

```properties
spring.application.name=spring-boot-job-portal-app
spring.data.mongodb.uri=mongodb://localhost:27017/job_portal_db
spring.data.mongodb.database=job_portal_db
```

### 🌐 Frontend Setup

```bash
cd frontend
npm install
npm run dev
```

The React app will start at **[http://localhost:5173](http://localhost:5173)**

---

## 📘 API Documentation

Once the application is running, Swagger UI can be accessed at:

```
http://localhost:8080/swagger-ui.html
```

It includes all endpoints, models, and schemas.

---

## 🧪 Testing

Run unit and integration tests using:

```bash
# Maven
mvn test

# Gradle
./gradlew test
```

---

## 📜 API Endpoints

### GET `/job-posts`
### GET `/job-posts/{text}`

* Fetch all jobs with optional keyword filtering and pagination.
* Supports query parameters:

  * `keyword`: Search term
  * `page`: Page number (starting from 1)
  * `limit`: Number of jobs per page (default: 6)

### POST `/create-job-post`

* Create a new job post
* Accepts JSON payload:

```json
{
  "profile": "Java Spring Boot Developer",
  "desc": "We are hiring Java Spring Boot developers!",
  "exp": 2,
  "techs": ["Java", "Spring Boot"]
}
```

## 🔮 Future Improvements

* Add authentication (JWT-based)
* Enable role-based access (Job Seeker vs Employer)
* Add job details page
* Improve form validation and error handling
* Deploy on cloud (Render, vercel, or Heroku)

---

## 🤝 Contributing

Contributions are welcome! Please open an issue first to discuss what you would like to change.

1. Fork the project
2. Create your feature branch (`git checkout -b feature/NewFeature`)
3. Commit your changes (`git commit -m 'Add some new Features'`)
4. Push to the branch (`git push origin feature/NewFeature`)
5. Open a Pull Request


---

## 🎉 Acknowledgments
- Inspired by Job Portal platforms.
- Thanks to the **Java Spring Boot Community** for extensive documentation and support.

#### Happy coding! 🚀
