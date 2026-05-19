# 🚀 API Gateway Simulation System

<div align="center">

![Spring Boot](https://img.shields.io/badge/SpringBoot-Backend-success?style=for-the-badge&logo=springboot)
![React](https://img.shields.io/badge/React-Frontend-blue?style=for-the-badge&logo=react)
![MySQL](https://img.shields.io/badge/MySQL-Database-orange?style=for-the-badge&logo=mysql)
![Java](https://img.shields.io/badge/Java-21-red?style=for-the-badge&logo=openjdk)

### 🔥 Professional Full Stack API Gateway Management System

A modern full-stack application built using **Spring Boot**, **React.js**, and **MySQL** that simulates an API Gateway with secure REST APIs, CRUD operations, API key authentication, request logging, and a responsive professional dashboard UI.

</div>

---

# ✨ Features

✅ User Management System  
✅ Product Management System  
✅ Order Management System  
✅ API Gateway Simulation  
✅ API Key Authentication  
✅ Request Logging  
✅ Secure REST APIs  
✅ Full CRUD Operations  
✅ Professional Dashboard UI  
✅ Responsive Design  
✅ Real-time Database Integration  
✅ Modern Attractive Frontend  

---

# 🛠️ Tech Stack

## 🔹 Backend
- Java 21
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- REST APIs

## 🔹 Frontend
- React.js
- Axios
- CSS3
- Responsive UI

---

# 📂 Project Structure

```bash
API-GATEWAY-SIMULATION-SYSTEM
│
├── api-gateway-frontend
│   ├── src
│   ├── public
│   └── package.json
│
├── src/main/java
├── src/main/resources
├── pom.xml
└── README.md
```

---

# 🔐 API Security

This project uses custom API Key Authentication.

## Header Example

```http
X-API-KEY: 12345
```

---

# ⚙️ Backend Setup

## 1️⃣ Clone Repository

```bash
git clone https://github.com/gauresh2211/API-GATEWAY-SIMULATION-SYSTEM.git
```

## 2️⃣ Open Project

```bash
cd api-gateway-simulation-system
```

## 3️⃣ Run Backend

```bash
mvn spring-boot:run
```

✅ Backend Running On:

```bash
http://localhost:8080
```

---

# 💻 Frontend Setup

## 1️⃣ Open Frontend Folder

```bash
cd api-gateway-frontend
```

## 2️⃣ Install Dependencies

```bash
npm install
```

## 3️⃣ Start React App

```bash
npm start
```

✅ Frontend Running On:

```bash
http://localhost:3000
```

---

# 🗄️ Database Setup

## Create MySQL Database

```sql
CREATE DATABASE api_gateway_db;
```

## Configure application.properties

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/api_gateway_db
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

# 📡 API Endpoints

## 👤 Users API

```http
GET    /api/users
POST   /api/users
PUT    /api/users/{id}
DELETE /api/users/{id}
```

---

## 📦 Products API

```http
GET    /api/products
POST   /api/products
PUT    /api/products/{id}
DELETE /api/products/{id}
```

---

## 🛒 Orders API

```http
GET    /api/orders
POST   /api/orders
PUT    /api/orders/{id}
DELETE /api/orders/{id}
```

---

# 🧪 Sample JSON Data

## 👤 User

```json
{
  "name": "Rahul Sharma",
  "email": "rahul@gmail.com",
  "role": "ADMIN"
}
```

---

## 📦 Product

```json
{
  "productName": "iPhone 16",
  "price": 85000
}
```

---

## 🛒 Order

```json
{
  "orderName": "Laptop Order",
  "price": 65000
}
```

---

# 🎯 Future Enhancements

🚀 JWT Authentication  
🚀 Docker Deployment  
🚀 API Rate Limiting  
🚀 Cloud Deployment  
🚀 Admin Analytics Dashboard  
🚀 Microservices Architecture  

---

# 👨‍💻 Author

## Gauresh Badgujar

🎓 MCA Graduate  
💻 Full Stack Java Developer  

### 🔗 GitHub
https://github.com/gauresh2211

---

# ⭐ Support

If you like this project, give it a ⭐ on GitHub!

---

# 📜 License

This project is developed for educational and learning purposes.

<div align="center">

### 💙 Built with Spring Boot + React.js

</div>
