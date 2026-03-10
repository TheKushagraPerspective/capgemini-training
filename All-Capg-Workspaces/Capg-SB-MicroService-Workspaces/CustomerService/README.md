# Customer Service

## Overview

Customer Service is a **Spring Boot Microservice** responsible for managing customer information.

This service performs **CRUD operations** on customer data using **JPA with EntityManager** and connects to a **MySQL database**.

The service registers itself with the **Eureka Server** and can be accessed through the **API Gateway**.

---

## Tech Stack

- Java 17  
- Spring Boot 3  
- Spring Cloud Eureka Client  
- Spring Data JPA  
- Hibernate  
- MySQL  
- REST API  

---

## Project Structure

```
CustomerService
│
├── controller
│     └── CustomerServiceController.java
│
├── service
│     └── CustomerService.java
│
├── dao
│     └── CustomerDAO.java
│
├── entity
│     └── Customer.java
│
└── CustomerServiceApplication.java
```

---

## Entity

Customer entity represents customer details stored in the database.

```java
@Entity
@Table(name = "customer")
public class Customer {

    @Id
    private int id;

    private String name;
    private String email;
    private long phone;

}
```

---

## DAO Layer

The DAO layer uses **EntityManager** to perform database operations.

```java
@Repository
@Transactional
public class CustomerDAO {

    @PersistenceContext
    private EntityManager em;

    public Customer save(Customer customer) {
        return em.merge(customer);
    }

    public List<Customer> findAll() {
        return em.createQuery("FROM Customer", Customer.class).getResultList();
    }

    public Customer findById(int id) {
        return em.find(Customer.class, id);
    }

    public boolean deleteById(int id) {
        Customer customer = em.find(Customer.class, id);
        if(customer != null) {
            em.remove(customer);
            return true;
        }
        else {
            return false;
        }
    }
}
```

---

## Controller

Base URL

```
/customer
```

Example controller:

```java
@RestController
@RequestMapping("/customer")
public class CustomerServiceController {

    @GetMapping("/getall")
    public List<Customer> getAllCustomer() {
        return service.getAllCustomer();
    }

}
```

---

## Configuration

### application.properties

```
spring.application.name=CUSTOMER-SERVICE
server.port=9002

eureka.instance.prefer-ip-address=true
eureka.client.serviceUrl.defaultZone=http://localhost:8761/eureka

spring.datasource.url=jdbc:mysql://localhost:3306/capgdb1
spring.datasource.username=root
spring.datasource.password=*****

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## Running the Service

### Step 1

Start **Eureka Server**

```
http://localhost:8761
```

---

### Step 2

Run **CustomerServiceApplication**

The service will start on

```
http://localhost:9002
```

---

## API Endpoints

### Get All Customers

```
GET
http://localhost:9002/customer/getall
```

---

### Get Customer by ID

```
GET
http://localhost:9002/customer/{id}
```

Example

```
http://localhost:9002/customer/1
```

---

### Add Customer

```
POST
http://localhost:9002/customer/add
```

JSON Body

```json
{
"id":1,
"name":"Kushagra",
"email":"kushagra@gmail.com",
"phone":9876543210
}
```

---

### Delete Customer

```
DELETE
http://localhost:9002/customer/delete/{id}
```

Example

```
http://localhost:9002/customer/delete/1
```

---

## Access Through Gateway

If the **Gateway Service** is running:

```
http://localhost:8989/customer/**
```

Example

```
http://localhost:8989/customer/getall
```

---

## Service Registration

Open Eureka Dashboard:

```
http://localhost:8761
```

You should see:

```
CUSTOMER-SERVICE
```

---

## Database

Database used:

```
MySQL
```

Database name:

```
capgdb1
```

Table created automatically:

```
customer
```

---