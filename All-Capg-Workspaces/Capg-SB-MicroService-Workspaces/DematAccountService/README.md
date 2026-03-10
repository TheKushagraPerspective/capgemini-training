# Demat Account Service

## Overview

Demat Account Service is a **Spring Boot microservice** responsible for managing demat or trading account related operations.
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
public class DematAccountServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DematAccountServiceApplication.class, args);
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
    name: DEMATACCOUNT-SERVICE

server:
  port: 9003

eureka:
  client:
    service-url:
      defaultZone: http://localhost:8761/eureka/
```

---

### 4. Sample Controller

```java
@RestController
@RequestMapping("/demat")
public class DematController {

    @GetMapping
    public String getDematAccountDetails() {
        return "Demat Account Service Running";
    }

}
```

---

## Running the Service

1. Start **Eureka Server**
2. Run **Demat Account Service**

---

## Verify Service Registration

Open:

```
http://localhost:8761
```

You should see:

```
DEMATACCOUNT-SERVICE
```

registered.

---

## Test API

### Direct Access

```
http://localhost:9003/demat
```

### Through Gateway

```
http://localhost:8989/demat
```
