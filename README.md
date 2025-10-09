# ThreadEx - Spring Boot REST API Project

## 🔹 Project Overview
**ThreadEx** is a Spring Boot REST API project for managing makeup products.  
It demonstrates **CRUD operations**, service and repository layers, and clean API design.  
This project is designed to showcase hands-on skills in **Java, Spring Boot, REST APIs, and database integration**

## 🔹 Technologies Used
- **Java 21**
- **Spring Boot 3.x**
- **Maven**
- **H2 Database** (in-memory, can be replaced with MySQL)
- **REST API Development**
- **Postman** (for testing endpoints)

---

## 🔹 Features
- Create, Read, Update, Delete (CRUD) operations for makeup products
- Clear separation of concerns with **Controller → Service → Repository**
- RESTful API design
- Simple configuration with `application.properties`

---

## 🔹 REST API Endpoints

| HTTP Method | Endpoint                | Description                  |
|------------|------------------------|------------------------------|
| GET        | `/api/makeup`          | Retrieve all makeup products |
| GET        | `/api/makeup/{id}`     | Retrieve a product by ID     |
| POST       | `/api/makeup`          | Add a new product            |
| PUT        | `/api/makeup/{id}`     | Update a product by ID       |
| DELETE     | `/api/makeup/{id}`     | Delete a product by ID       |
