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

| Layer              | Tech                           |
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

**Getting Started**

**Prerequisites**

- Java 17+
- Maven
- Docker (optional, for containerization)
- GitHub Desktop (for repo sync)
- MySQL or PostgreSQL (Neon.tech for cloud DB)

**Running the Project**

```bash
# Clone the repository
git clone https://github.com/YOUR_USERNAME/secure-banking-api.git

# Navigate into project folder
cd secure-banking-api

# Build & run
./mvnw spring-boot:run
