# Project

![alt text](https://github.com/floromer/FlockItEjercicio/blob/master/image.png?raw=true)

This project enables a single valid user to login and get the latitude and longitude of a province in Argentina searching by name.

## Technologies

Java 11, Maven, Spring Boot, Swagger, Log4J, Mockito, Jackson, HSQLDB, SpringData Jpa, Crypto

## Steps to Run the application 

1. Clone repository to local machine
2. Run `mvn spring-boot:run` on terminal

## How to test the application

To check the API Documentation and how to test the endpoints refer to the URL: [Swagger](http://localhost:8080/swagger-ui/)

Login Credentials
```
{
    "username": "FlockIt",
    "password": "EnriqueButty240"
}
```

## DataBase

When the application runs it creates an in memory database with the single valid user and its encrypted password

## Logs

All logs are stored in flockit.log file using log4j 