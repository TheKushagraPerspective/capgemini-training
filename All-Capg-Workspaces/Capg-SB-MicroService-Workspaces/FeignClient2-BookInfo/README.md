# FeignClient2-BookInfo Microservice

## Overview

**FeignClient2-BookInfo** is a **Spring Boot microservice** responsible for managing **book information**.
This service communicates with another microservice called **BookDepo Service** using **Spring Cloud OpenFeign**.

The BookInfo service retrieves **depo information from the BookDepo service** and combines it with book details before returning the final response.

---

## Tech Stack

* Java 17+
* Spring Boot
* Spring Web
* Spring Cloud OpenFeign
* Maven

---

## Microservice Architecture

Client sends request to **BookInfo Service**, which internally calls **BookDepo Service** using Feign Client.

```
Client (Postman / Browser)
          │
          ▼
   BookInfo Service
   (Port: 8989)
          │
          │  Feign Client Call
          ▼
   BookDepo Service
   (Port: 8988)
```

---

## Project Structure

```
FeignClient2-BookInfo
│
├── client
│   └── BookDepoClient.java
│
├── model
│   ├── BookInfo.java
│   └── BookDepo.java
│
├── web
│   └── BookInfoController.java
│
└── FeignClient2BookInfoApplication.java
```

---

## Main Application Class

```
@EnableFeignClients(basePackages = "com.capg.microservice.client")
@SpringBootApplication
public class FeignClient2BookInfoApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignClient2BookInfoApplication.class, args);
    }
}
```

### Purpose

`@EnableFeignClients` enables Feign client scanning inside the specified package.

```
com.capg.microservice.client
```

Spring automatically generates the implementation of Feign interfaces at runtime.

---

## Feign Client

The **BookDepoClient** interface is responsible for calling the BookDepo microservice.

```
@FeignClient(name = "BookDepoClient", url = "${depo.service.url}")
public interface BookDepoClient {

    @GetMapping("/depo/{depoId}")
    public BookDepo getById(@PathVariable int depoId);

}
```

### Explanation

This Feign client automatically sends an HTTP request to:

```
GET http://localhost:8988/depo/{depoId}
```

and converts the JSON response into a `BookDepo` object.

---

## Model Classes

### BookInfo

Represents book details.

Fields:

```
bookId
bookName
bookAuthor
bookPrice
```

---

### BookDepo

Represents depo information.

Fields:

```
depoId
depoAddress
```

---

## Controller

```
@RestController
@RequestMapping("/book")
public class BookInfoController
```

### API Endpoint

```
GET /book/{bookId}
```

Example:

```
http://localhost:8989/book/1
```

### Internal Flow

1. BookInfoController receives the request.
2. A `BookInfo` object is created.
3. Feign Client calls **BookDepo Service**.
4. Depo details are fetched.
5. Book information and depo information are combined.
6. Final response is returned to the client.

---

## Example Response

```
{
  "Book Info": {
    "bookId": 1,
    "bookName": "Spring Boot",
    "bookAuthor": "John",
    "bookPrice": 500.0
  },
  "Book Depo": {
    "depoId": 101,
    "depoAddress": "Delhi Book Depot"
  }
}
```

---

## Application Properties

```
spring.application.name=FeignClient2-BookInfo
server.port=8989

# URL of BookDepo Service
depo.service.url=http://localhost:8988

# Feign configuration
feign.client.config.default.connectTimeout=3000
feign.client.config.default.readTimeout=5000
feign.client.config.default.loggerLevel=FULL
```

---

## How to Run the Project

### Step 1

Start **BookDepo Service** on port **8988**.

### Step 2

Run **FeignClient2-BookInfo** application.

### Step 3

Test the API using browser or Postman.

Example request:

```
http://localhost:8989/book/1
```

---

## Key Concept Used

### OpenFeign

OpenFeign is a **declarative HTTP client** that simplifies communication between microservices.

Instead of writing HTTP request logic manually, developers define **interfaces with annotations**, and Spring automatically generates the implementation.

Advantages:

* Less boilerplate code
* Easy microservice communication
* Automatic JSON serialization/deserialization
* Cleaner and more readable code

---

## Author

**Kushagra Varshney**
B.Tech Computer Science Engineering
Lovely Professional University
