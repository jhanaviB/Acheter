## Acheter

Acheter is an e-commerce backend built with Java and Spring Boot, following a microservices architecture.
It demonstrates service decomposition, asynchronous messaging with RabbitMQ and Kafka, and orchestration with Docker.

### Tech Stack

- **Java**: Programming language
- **Spring Boot**: Framework for building microservices
- **RabbitMQ**: Asynchronous messaging (queue-based)
- **Kafka**: Asynchronous messaging  (stream-based)
- **REST APIs**: Synchronous communication
- **Docker**: Containerization 
- **MongoDB**: NoSQL Database 

### Services

- **Product**: Manages product information.
- **Order**: Handles order creation and management.
- **Notification**: Sends order-related notifications.
- **Inventory**: Manages stock levels and inventory.
- **Discovery Server**: Provides service discovery and load balancing.
- **API Gateway**: Handles routing and aggregation of API requests.

⚙️ Getting Started
1. Clone the repository
   ```
    git clone https://github.com/jhanaviB/Acheter.git
    cd Acheter
   ```
   
2. Start dependencies with Docker

Make sure you have Docker and Docker Compose installed.

  ```
  
  docker-compose up -d
  ```
3. Run the product, inventory, order and notification services

  ```
  mvn clean package -DskipTests
  docker build -t ecommerce/product-service:latest .
  ```

The services should be up and running!

### API Endpoints

Product Service → /api/products

Order Service → /api/orders

Inventory Service → /api/inventory

Notification Service → /api/notifications

All requests should be made via the API Gateway (http://localhost:8080).

###✨ Features
## 🖥️ Core Technologies

Java 17+ – Modern language features and performance improvements.

Spring Boot – Rapid development of production-ready microservices.

Spring Cloud – Tools for distributed systems (config, discovery, routing, etc.).

## 🧩 Microservices

Product Service – Manage product catalog, categories, and details.

Order Service – Handles order placement, status tracking, and history.

Inventory Service – Real-time stock tracking and availability.

Notification Service – Sends email/SMS/other alerts on order updates.

API Gateway – Central entry point, request routing, and response aggregation.

Discovery Server (Eureka/Consul) – Service registry for automatic discovery and scaling.

## ⚡ Communication

REST APIs – Synchronous communication between services.

RabbitMQ – Asynchronous event-driven communication (lightweight messaging).

Kafka – High-throughput, distributed, event streaming platform.

##🔒 Security

Keycloak Integration – Identity and Access Management (IAM) with:

Single Sign-On (SSO)

Role-Based Access Control (RBAC)

Token-based authentication (JWT, OAuth2, OpenID Connect)

##📊 Observability

Prometheus – Metrics collection from services.

Grafana – Real-time dashboards and monitoring.

Spring Boot Actuator – Health checks, metrics, and application insights.

Centralized Logging – Configurable to push logs to ELK stack or Splunk.

###⚙️ Deployment & Scalability

Docker – Containerization of services for consistent environments.

Docker Compose / Kubernetes-ready – Orchestration support for microservices.

Automatic Load Balancing – Client-side load balancing with Spring Cloud LoadBalancer or Ribbon.

Horizontal Scaling – Scale services independently based on demand.

###🛠️ Developer Productivity

Config Server – Centralized configuration management.

Circuit Breaker / Resilience4j – Fault tolerance and fallback handling.

API Documentation (Swagger / OpenAPI) – Easy testing and exploration of endpoints.

Test Automation (JUnit, Mockito) – Unit and integration testing.
