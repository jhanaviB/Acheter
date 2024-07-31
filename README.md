# E-commerce Microservices Backend

This project implements an e-commerce platform using microservices architecture with **Java** and **Spring Boot**. It leverages several technologies to manage various aspects of the system, including **MySQL**, **MongoDB**, **Spring Keycloak**, **Spring Cloud Gateway**, **Grafana**, and **Prometheus**.

## Technologies Used

- **Java**
- **Spring Boot**
- **MySQL**
- **MongoDB**
- **Spring Keycloak**
- **Spring Cloud Gateway**
- **Grafana**
- **Prometheus**
- **RabbitMQ**
- **Kafka**

---

## Services

The backend is composed of several microservices, each handling a distinct part of the platform:

1. **Product Service**  
   Manages the product catalog, including product information, pricing, and availability.

2. **Order Service**  
   Handles order processing, payment integration, and order tracking.

3. **Notification Service**  
   Sends notifications to users for various events such as order confirmations, shipment tracking, and promotional messages.

4. **Inventory Service**  
   Manages stock levels, inventory updates, and supplier information.

5. **Discovery Server**  
   Provides service discovery capabilities, allowing microservices to locate each other dynamically. Implemented using **Spring Cloud Eureka**.

6. **API Gateway**  
   Acts as a single entry point for all client requests, routing them to the appropriate microservice. Implemented using **Spring Cloud Gateway**.

---

## Communication

- **Synchronous Communication**: Services communicate synchronously using **REST APIs**, enabling direct service-to-service communication.
- **Asynchronous Communication**: **RabbitMQ** and **Kafka** are used for asynchronous communication, facilitating event-driven architecture and message queuing for reliable data transfer.
