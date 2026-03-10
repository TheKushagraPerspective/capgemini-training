# Loan Service

## Overview

Loan Service is a **Spring Boot microservice** responsible for handling loan-related operations.
It registers itself with the **Eureka Server** and can be accessed directly or through the **Gateway Service**.

---

## Tech Stack

* Java 17
* Spring Boot
* Spring Cloud Eureka Client
* REST API

---

## Project Setup

### 1. Create Spring Boot Project

Create a Spring Boot starter project with the following dependencies:

* Spring Web
* Eureka Discovery Client

---

### 2. Main Application Class

```java
@SpringBootApplication
public class LoanServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoanServiceApplication.class, args);
    }

}
```

---

### 3. Configuration (`application.yml`)

Place this file in:

```
src/main/resources
```

```yaml
spring:
  application:
    name: LOAN-SERVICE

server:
  port: 9001

eureka:
  client:
    service-url:
      defaultZone: http://localhost:8761/eureka/
```

---

### 4. Sample Controller

```java
@RestController
@RequestMapping("/loan")
public class LoanController {

    @GetMapping
    public String getLoanDetails() {
        return "Loan Service Running";
    }

}
```

---

## Running the Service

1. Start **Eureka Server**
2. Run **Loan Service**

---

## Verify Service Registration

Open the Eureka dashboard:

```
http://localhost:8761
```

You should see:

```
LOAN-SERVICE
```

---

## Test API

### Direct Access

```
http://localhost:9001/loan
```

### Through Gateway

```
http://localhost:8989/loan
```
