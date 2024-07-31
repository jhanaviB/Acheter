# E-commerce Microservices Backend

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
   Manages the product catalog, including product id, description, and price.

2. **Inventory Service**  
   Holds the product id and quantity.
   
3. **Order Service**  
   Manages placing order. For this it synchronously communicated with the Inventory service to check if the product is in stock and has sufficient quantity.
   After order is placed, it asynchronously communicates with the notification service to send a notiication for the same.

4. **Notification Service**  
   Kafka listener to consume notifcation message produced by OrderService.

6. **Discovery Server**  
   Provides service discovery capabilities, allowing microservices to locate each other dynamically. Implemented using **Spring Cloud Eureka**.

7. **API Gateway**  
   Acts as a single entry point for all client requests, routing them to the appropriate microservice. Implemented using **Spring Cloud Gateway**.

---

## Communication

- **Synchronous Communication**: Services communicate synchronously using **REST APIs**, enabling direct service-to-service communication.
- **Asynchronous Communication**: **RabbitMQ** and **Kafka** are used for asynchronous communication, facilitating event-driven architecture and message queuing for reliable data transfer.
