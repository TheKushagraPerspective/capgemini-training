# FeignClient2-BookDepo Microservice

## Overview

**FeignClient2-BookDepo** is a **Spring Boot microservice** responsible for managing **book depo information**.

This service exposes REST APIs that provide **depo details** such as depo ID and depo address.
It is designed to be consumed by other microservices, such as the **BookInfo Service**, using **Spring Cloud OpenFeign**.

---

## Tech Stack

* Java 17+
* Spring Boot
* Spring Web
* Maven

---

## Microservice Architecture

This service acts as the **data provider service**.

```id="5x0yzq"
Client / Other Microservice
        │
        ▼
   BookDepo Service
   (Port: 8988)
```

In the overall system:

```id="3c7tfo"
Client
  │
  ▼
BookInfo Service
  │
  │ Feign Client Call
  ▼
BookDepo Service
```

---

## Project Structure

```id="y0r1d1"
FeignClient2-BookDepo
│
├── model
│   └── BookDepo.java
│
├── web
│   └── BookDepoController.java
│
└── FeignClient2BookDepoApplication.java
```

---

## Main Application Class

```id="mvr1rh"
@SpringBootApplication
public class FeignClient2BookDepoApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignClient2BookDepoApplication.class, args);
        System.out.println("Book Depo Server Started...");
    }
}
```

This class is responsible for starting the **Spring Boot application**.

---

## Model Class

### BookDepo

Represents depo information.

Fields:

```id="ny5hqb"
depoId
depoAddress
```

Example class:

```id="4uepht"
public class BookDepo {

    private int depoId;
    private String depoAddress;

    public BookDepo() {}

    public BookDepo(int depoId, String depoAddress) {
        this.depoId = depoId;
        this.depoAddress = depoAddress;
    }

    // getters and setters
}
```

---

## Controller

```id="v3w6pf"
@RestController
@RequestMapping("/depo")
public class BookDepoController
```

This controller exposes REST APIs to provide depo information.

---

## API Endpoint

### Get Depo Details

```id="pnlskt"
GET /depo/{depoId}
```

Example request:

```id="2zbv2c"
http://localhost:8988/depo/101
```

Example response:

```id="yw9v8i"
{
  "depoId": 101,
  "depoAddress": "Delhi Book Depot"
}
```

---

## Internal Flow

1. Client sends request to **BookDepo Service**.
2. Controller receives the request.
3. Depo data is created or fetched.
4. Response is returned as JSON.

---

## Application Properties

```id="t0vjxb"
spring.application.name=FeignClient2-BookDepo
server.port=8988
```

Explanation:

* **spring.application.name** – Name of the microservice
* **server.port** – Port on which the service runs

---

## How to Run the Project

### Step 1

Run the **FeignClient2-BookDepoApplication**.

### Step 2

Ensure the application starts successfully on:

```id="30q8ol"
http://localhost:8988
```

### Step 3

Test the API using a browser or Postman.

Example:

```id="fgxtk7"
http://localhost:8988/depo/101
```

---

## Role in the Microservice System

This service provides **depo data** which is consumed by other services such as:

```id="h3xkve"
BookInfo Service
```

using **Spring Cloud OpenFeign**.

---

## Author

**Kushagra Varshney**
B.Tech Computer Science Engineering
Lovely Professional University
