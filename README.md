# 🌐 WebineX - Webinar Management REST API

WebineX is a **Spring Boot-based RESTful API** designed to manage webinars efficiently.  
It provides endpoints for handling hosts, participants, invitations, registrations, analytics, and more - forming the backend foundation for any webinar management system.

---

## 🚀 Features

- 🧑‍💼 **Host Management** – Create and manage webinar hosts  
- 🎥 **Webinar Management** – Schedule, update, and cancel webinars  
- 👥 **Participant Management** – Register and manage attendees  
- ✉️ **Invitation System** – Send and track webinar invitations  
- 📊 **Analytics** – View reports and insights about webinars  
- 🔐 **Authentication** – Token or session-based login (extendable)  
- 🌍 **RESTful Endpoints** – Designed for easy frontend integration  

---

## 🏗️ Tech Stack

| Layer | Technology |
|:------|:------------|
| Backend Framework | **Spring Boot (3.x)** |
| Language | **Java 17+** |
| Build Tool | **Maven** |
| Database | **MySQL** |
| API Docs | **Swagger UI** |
| Security | **Spring Security** |

---

## 📘 API Endpoints

### **1. Users & Authentication**

| Method | Endpoint | Description |
|:-------|:----------|:-------------|
| **POST** | `/api/users` | Create a new user |
| **GET** | `/api/users` | Get all users |
| **GET** | `/api/users/{id}` | Get a user by ID |
| **PUT** | `/api/users/{id}` | Update a user by ID |
| **DELETE** | `/api/users/{id}` | Delete a user by ID |

---

### **2. Webinar Management**

| Method | Endpoint | Description |
|:-------|:----------|:-------------|
| **POST** | `/api/webinars` | Create a new webinar |
| **GET** | `/api/webinars` | Get all webinars |
| **GET** | `/api/webinars/{id}` | Get a webinar by ID |
| **PUT** | `/api/webinars/{id}` | Update a webinar by ID |
| **DELETE** | `/api/webinars/{id}` | Delete a webinar by ID |
| **GET** | `/api/webinars/upcoming` | Get upcoming webinars |
| **GET** | `/api/webinars/search?keyword=ANY_WORDS` | Search webinars by keyword |
| **GET** | `/api/webinars/host/{hostId}` | Get webinars by host ID |

---

### **3. Registration**

| Method | Endpoint | Description |
|:-------|:----------|:-------------|
| **POST** | `/api/registrations` | Register a user for a webinar |
| **GET** | `/api/registrations/webinar/{webinarId}` | Get registrations by webinar ID |
| **GET** | `/api/registrations/user/{userId}` | Get registrations by user ID |
| **GET** | `/api/registrations/{id}` | Get registration by ID |
| **DELETE** | `/api/registrations/{id}` | Delete a registration |
| **GET** | `/api/registrations/check?webinarId=NO&userId=NO` | Check if a user is registered for a webinar |

---

### **4. Invitation**

| Method | Endpoint | Description |
|:-------|:----------|:-------------|
| **POST** | `/api/invitations` | Send an invitation |
| **GET** | `/api/invitations/webinar/{webinarId}` | Get invitations by webinar ID |
| **GET** | `/api/invitations/{id}` | Get an invitation by ID |
| **PUT** | `/api/invitations/{id}` | Update an invitation |

---

### **5. Analytics**

| Method | Endpoint | Description |
|:-------|:----------|:-------------|
| **POST** | `/api/analytics` | Create a new analytics record |
| **GET** | `/api/analytics/{id}` | Get analytics data by ID |

---

## 📂 Project Structure
WebineX/ <br/>
│── src/main/java/com/fintrack/ <br/>
│ ├── controller/ # Controllers  <br/>
│ ├── model/ # JPA Entities <br/>
│ ├── repository/ # JPA Repositories <br/>
│ ├── service/ # Business logic <br/>
│ └── WebineXApplication.java <br/>
│ <br/>
│── src/main/resources/ <br/>
│ ├── templates/ # templates file <br/>
│ └── application.properties <br/>
│ <br/>
│── pom.xml # Maven dependencies <br/>
│── README.md # Documentation <br/>


---

## ⚙️ Setup Instructions

### 1️⃣ Prerequisites
Make sure you have the following installed:
- **Java 17+**
- **Maven 3+**
- **MySQL** (or use in-memory H2)

### 2️⃣ Clone the Repository
```bash
git clone https://github.com/Warrior-Gosai/WebineX.git
cd WebineX
```

### 3️⃣ Configure the Database

Edit your application.properties file:

```bash
spring.datasource.url=jdbc:mysql://localhost:3306/webinex_db
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### 4️⃣ Build and Run the Application
```bash
mvn spring-boot:run
```

Application will start at:
👉 http://localhost:8080


---

## 🧩 API Documentation

Once running, access Swagger UI at:
👉 http://localhost:8080/swagger-ui/index.html

---

## 🧠 Future Enhancements
- Frontend Development
- Email Notifications & Reminders
- File Upload for Webinar Materials
- WebSocket for Real-time Updates
- Advanced Filtering & Pagination

---

## 🤝 Contributing

Contributions are welcome!
If you’d like to improve WebineX, feel free to fork the repo and submit a pull request.

---

## 🧾 License

This project is open-source and available under the MIT License.

---

## 📧 Contact

Developer: Kartik Gosai
<br>
GitHub: https://github.com/Warrior-Gosai
