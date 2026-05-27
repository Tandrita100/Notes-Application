# 📖 Notes Application REST API

A backend RESTful CRUD application developed using Spring Boot, Spring Data JPA, Hibernate, and MySQL for managing notes.

---

## 🚀 Features

- Add new note
- Get all notes
- Get note by ID
- Update note
- Delete note
- Search notes by title
- Filter notes by category
- Get important notes
- REST API based backend application
- MySQL database integration using JPA/Hibernate

---

## 🛠️ Technologies Used

- Java 21
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Postman
- Git & GitHub

---

## 📂 Project Structure

Controller  
↓  
Service  
↓  
Repository  
↓  
Database

---

## 📌 API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/notes` | Add new note |
| GET | `/notes` | Get all notes |
| GET | `/notes/{id}` | Get note by ID |
| PUT | `/notes/{id}` | Update note |
| DELETE | `/notes/{id}` | Delete note |
| GET | `/notes/search?title=value` | Search notes by title |
| GET | `/notes/category?category=value` | Filter notes by category |
| GET | `/notes/important` | Get important notes |

---

## 🧾 Sample JSON

```json
{
  "title": "Spring Boot Revision",
  "content": "Practice JPA and REST APIs",
  "category": "Study",
  "important": true,
  "createdDate": "2026-05-25"
}
```

---

## ⚙️ How To Run The Project

1. Clone the repository

```bash
git clone https://github.com/your-username/Notes-Application.git
```

2. Open project in IntelliJ IDEA

3. Configure MySQL in `application.properties`

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/notes_db
spring.datasource.username=your_username
spring.datasource.password=your_password
```

4. Run the application

5. Test APIs using Postman

---

## 📚 Concepts Practiced

- REST APIs
- Layered Architecture
- Dependency Injection
- Spring Boot Annotations
- JPA Repository
- Hibernate ORM
- Query Methods
- CRUD Operations
- Request Handling
- JSON Mapping

---

## 🔮 Future Improvements

- Better exception handling
- ResponseEntity usage
- Pagination

---

## 👩‍💻 Author

Developed by Tandrita Baidya
