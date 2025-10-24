# SprintBoot-Microservices

> A multi-module Spring Boot microservices demo with service discovery, API gateway, messaging, and example microservices.

---

## About
This repository contains multiple Spring Boot services demonstrating a small microservices architecture using Spring Cloud and messaging. It includes a Eureka service registry, an API gateway, messaging modules, and a few example services (customer, fraud, notification, etc.). A `docker-compose.yml` is included to start the full stack quickly.

## Modules (at a glance)
- `eureka-server` — Service registry (Eureka).
- `apigw` — API Gateway / reverse proxy for routing to services.
- `amqp` — Messaging configuration / rabbitmq integration (if present).
- `clients` — API clients or shared client code (if present).
- `customer` — Example microservice (customer domain).
- `fraud` — Example microservice for fraud detection.
- `notification` — Notification microservice (email/SMS placeholder).
- Other supporting modules and configuration files (check repository tree).

## Prerequisites
- Docker & Docker Compose (recommended)
- Java 11+ (if running services locally)
- Maven (if building locally)

## Quick start (Docker Compose)
From the repository root run:

```bash
docker-compose up -d
```

This command will start all services defined in `docker-compose.yml`. After startup you can check service availability (common defaults used in demos):
- Eureka dashboard: `http://localhost:8761`
- API Gateway: `http://localhost:8080` (proxy to backend services)

To stop and remove containers:
```bash
docker-compose down
```

## Run modules locally (alternative)
To run services individually (for development):

```bash
# Start Eureka
cd eureka-server
./mvnw spring-boot:run

# In other terminals run services
cd ../customer
./mvnw spring-boot:run

cd ../fraud
./mvnw spring-boot:run

# and so on...
```

> Check each module's `application.yml`/`application.properties` for ports and service registration settings.

## Useful Maven commands
- Build all modules: `./mvnw clean install -DskipTests`
- Run tests for a module: `./mvnw -pl <module> test`
