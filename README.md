# Financial Instruments Platform Backend 📊

<p align="center">
  <img src="https://p7.hiclipart.com/preview/391/315/584/black-white-computer-icons-coin-money-coin-ico.jpg" alt="Financial Instruments Logo" width="200"/>
  <br>
  <em>Advanced Spring Boot backend for real-time financial instrument monitoring with integrated chat system</em>
</p>
## 📋 Overview

A Spring Boot application that implements real-time financial instrument data handling and chat functionality through WebSocket communication. The system features JWT authentication, RxJava for efficient data streaming, and LRU caching for optimized performance.

## 🌟 Key Implementations

### WebSocket Communication
- Real-time financial instrument data subscription system
- Live user chat functionality
- Bidirectional communication for instant updates
- Subscription-based data streaming

### Authentication & Authorization
- JWT-based authentication system
- Configurable token functionality
- Secure user authentication flow

### Data Handling
- RxJava implementation using Observer pattern
- Efficient financial data stream processing
- Integration with mock data service
- Real-time data transformation and delivery

### Performance Optimization
- LRU (Least Recently Used) cache implementation
- Optimized access to popular financial instruments
- Enhanced response times for frequently accessed data
- Reduced load on external data services

### Deployment & Infrastructure
- Containerized application using Docker
- Multi-service orchestration with Docker Compose
- Scalable microservices architecture
- Centralized service management

### API Documentation
- RESTful API implementation
- Comprehensive Swagger documentation
- Detailed endpoint specifications
- Authentication flow documentation

## 🛠️ Technology Stack

### Core Dependencies
```xml
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
        <version>3.3.1</version>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-websocket</artifactId>
        <version>3.3.1</version>
    </dependency>
    <dependency>
        <groupId>io.jsonwebtoken</groupId>
        <artifactId>jjwt-api</artifactId>
        <version>0.11.5</version>
    </dependency>
    <dependency>
        <groupId>io.reactivex.rxjava3</groupId>
        <artifactId>rxjava</artifactId>
        <version>3.1.8</version>
    </dependency>
    <dependency>
        <groupId>org.springdoc</groupId>
        <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
        <version>2.2.0</version>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-mongodb</artifactId>
    </dependency>
</dependencies>
```

## 🚀 Getting Started

### Prerequisites
- Java 17+
- Docker & Docker Compose
- MongoDB

### Installation

```bash
# Clone repository
git clone https://github.com/financial-instruments-platform/financial-instruments-platform-backend

# Build project
mvn clean install

# Run with Docker Compose
docker-compose up -d
```

## 📚 API Documentation

Access Swagger UI documentation:
```
https://financial-instruments-platform-backend.onrender.com/swagger-ui.html
```

## 🔗 Related Services
- Frontend Application
- Mock Data Service

---

## ⚠️ Important Note
> **First Request Delay**: Since this application is hosted on Render's free tier, the server enters a sleep state after 15 minutes of inactivity. When you make your first request, the server needs to wake up, which can take up to 30-60 seconds. Subsequent requests will work normally.

## 🔗 Related Services
- [Financial Instruments Frontend](https://github.com/financial-instruments-platform/financial-instruments-platform-frontend)
- [Mock Data Generation Service](https://github.com/financial-instruments-platform/mock-data-generation-service)

## 👥 Author

- **Konstantine Vashalomidze** - _Initial work_ - [GitHub](https://github.com/KonstantineVashalomidze)

---

<p align="center">
  Made with ❤️ by <a href="https://github.com/KonstantineVashalomidze">Konstantine Vashalomidze</a>
  <br>
  <sub>Part of the Financial Instruments Platform</sub>
</p>
