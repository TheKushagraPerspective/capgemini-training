# Customer Service

## Overview

Customer Service is a **Spring Boot microservice** responsible for handling customer-related operations.
It registers with **Eureka Server** and can be accessed through the **Gateway Service**.

---

## Tech Stack

* Java 17
* Spring Boot
* Spring Cloud Eureka Client
* REST API

---

## Project Setup

### 1. Create Spring Boot Project

Dependencies required:

* Spring Web
* Eureka Discovery Client

---

### 2. Main Application Class

```java
@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

}
```

---

### 3. Configuration (`application.yml`)

Location:

```
src/main/resources
```

```yaml
spring:
  application:
    name: CUSTOMER-SERVICE

server:
  port: 9002

eureka:
  client:
    service-url:
      defaultZone: http://localhost:8761/eureka/
```

---

### 4. Sample Controller

```java
@RestController
@RequestMapping("/customer")
public class CustomerController {

    @GetMapping
    public String getCustomerDetails() {
        return "Customer Service Running";
    }

}
```

---

## Running the Service

1. Start **Eureka Server**
2. Run **Customer Service**

---

## Verify Service Registration

Open:

```
http://localhost:8761
```

Check if:

```
CUSTOMER-SERVICE
```

is registered.

---

## Test API

### Direct Access

```
http://localhost:9002/customer
```

### Through Gateway

```
http://localhost:8989/customer
```
