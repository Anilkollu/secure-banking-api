# 💰 Secure Banking API Suite
A secure, modular banking API system built using Java, Spring Boot, and Spring Security. It simulates core banking features like account management, fund transfers, transaction history, and role-based access.

**Key Features**
- ✅ JWT-based user authentication & authorization
- 👤 User & Admin roles with access control
- 🏦 Create, update, delete bank accounts
- 🔁 Fund transfer between accounts
- 📜 Transaction history with filtering by date and type
- 📄 Export statements to PDF or CSV
- 🌐 Swagger/OpenAPI integrated for API documentation
- 🐳 Docker support for containerization


**Tech Stack**

| Layer              | Technology                          |
|-------------------|--------------------------------|
| Language           | Java 17+                        |
| Framework          | Spring Boot, Spring Security   |
| Database           | MySQL / PostgreSQL             |
| ORM                | Spring Data JPA                |
| Authentication     | JWT Token-Based                |
| API Docs           | Swagger / OpenAPI              |
| Deployment         | Docker, Docker Compose         |
| Development Tools  | IntelliJ IDEA, GitHub Desktop  |

**Project Structure**
```text
secure-banking-api/
├── src/
│   ├── main/
│   │   ├── java/
│   │   └── resources/
│   ├── test/
├── Dockerfile
├── docker-compose.yml
├── README.md
├── pom.xml
└── .gitignore



**API Endpoints (To Be Implemented)**

| Endpoint              | Method | Access     | Description                  |
|-----------------------|--------|------------|------------------------------|
| /api/auth/register    | POST   | Public     | Register new user            |
| /api/auth/login       | POST   | Public     | Login and get JWT token      |
| /api/accounts         | GET    | User/Admin | Get account details          |
| /api/transfer         | POST   | User       | Transfer funds               |
| /api/transactions     | GET    | User       | View transaction history     |
| /api/export/pdf       | GET    | User       | Export statements to PDF     |
| /api/export/csv       | GET    | User       | Export statements to CSV     |


**👤 Author**

**Anil Kollu**  
[GitHub Profile](https://github.com/Anilkollu)


## 📃 License

This project is licensed under the MIT License.


