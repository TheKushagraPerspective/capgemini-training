# Gateway Service – Setup and Testing Guide

## 1. Create Spring Boot Starter Project

Create a **Spring Boot project** with the following dependencies:

* Spring Web
* Eureka Discovery Client
* Spring Cloud Gateway

---

## 2. Configure Gateway Service

Create the main class:

```java
@SpringBootApplication
public class GatewayServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayServiceApplication.class, args);
    }

}
```

> Note: In recent Spring Cloud versions, `@EnableEurekaClient` is optional because Eureka is auto-configured when the dependency is present.

---

## 3. Place `application.yml`

Place the `application.yml` file inside:

```
src/main/resources
```

Example configuration:

```yaml
spring:
  application:
    name: GATEWAY-SERVICE

  cloud:
    gateway:
      routes:
        - id: employee-service
          uri: lb://EMPLOYEE-SERVICE
          predicates:
            - Path=/employee/**

        - id: help-service
          uri: lb://HELP-SERVICE
          predicates:
            - Path=/help/**

        - id: admin-service
          uri: lb://ADMIN-SERVICE
          predicates:
            - Path=/admin/**

        - id: loan-service
          uri: lb://LOAN-SERVICE
          predicates:
            - Path=/loan/**

        - id: customer-service
          uri: lb://CUSTOMER-SERVICE
          predicates:
            - Path=/customer/**

        - id: demataccount-service
          uri: lb://DEMATACCOUNT-SERVICE
          predicates:
            - Path=/demat/**

eureka:
  client:
    register-with-eureka: true
    fetch-registry: true
    service-url:
      defaultZone: http://localhost:8761/eureka/

  instance:
    hostname: localhost

server:
  port: 8989
```

---

## 4. Optional Configuration

If the **application name or port is not read correctly from `application.yml`**, add them in `application.properties`:

```
spring.application.name=GATEWAY-SERVICE
server.port=8989
```

---

## 5. Run the Application

Run services in this order:

1. Eureka Server
2. Employee Service
3. Admin Service
4. Help Service
5. Loan Service
6. Customer Service
7. Demat Account Service
8. Gateway Service

---

## 6. Verify Gateway Service

Check using browser or Postman:

```
http://localhost:8989
```

---

## 7. Verify Eureka Registration

Open Eureka Dashboard:

```
http://localhost:8761
```

Ensure the following services are registered:

* GATEWAY-SERVICE
* EMPLOYEE-SERVICE
* ADMIN-SERVICE
* HELP-SERVICE
* LOAN-SERVICE
* CUSTOMER-SERVICE
* DEMATACCOUNT-SERVICE

---

# Testing APIs Through Gateway (Postman)

## 1. Employee Service

Get all employees

```
http://localhost:8989/employee/getallemp
```

Get employee by ID

```
http://localhost:8989/employee/getemp/101
```

Add employee

```
http://localhost:8989/employee/addemp
```

Send **JSON body** in Postman.

---

## 2. Admin Service

```
http://localhost:8989/admin
```

---

## 3. Help Service

```
http://localhost:8989/help
```

---

## 4. Loan Service

```
http://localhost:8989/loan
```

---

## 5. Customer Service

```
http://localhost:8989/customer
```

---

## 6. Demat Account Service

```
http://localhost:8989/demat
```

---

# General Issues

### 1. Application Name Format

Spring application names should **not contain `_`**.

Incorrect:

```
EMPLOYEE_SERVICE
```

Correct:

```
EMPLOYEE-SERVICE
```

---

### 2. YAML Case Sensitivity

In `application.yml`:

```
Path=/loan/**
```

`Path` must start with **capital P**.

---

### 3. Eureka Must Run First

Always start **Eureka Server before other services**, otherwise services will not register.

---
