 
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

## 📂 Project Structure
WebineX/ 


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
