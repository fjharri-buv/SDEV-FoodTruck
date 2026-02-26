# Food Truck Order System Starter (Spring Boot)

This project is a **barebones starter** for students learning to build a REST API in Java with Spring Boot.

## What's already configured
- Spring Boot 3 + Java 17
- Web starter for building REST endpoints
- Validation starter for request validation annotations
- Spring Data JPA starter
- H2 in-memory database + H2 console
- Test starter with JUnit
- A starter `GET /hello` endpoint that returns `hello`

## What students should build
Students can now focus on:
- Creating entities
- Creating repositories
- Creating service classes
- Creating controllers/endpoints
- Implementing business logic and validation

## Run the project
```bash
mvn spring-boot:run
```

The API will run at `http://localhost:8080`.

Try the starter endpoint:
```bash
curl http://localhost:8080/hello
```

## H2 database console
- URL: `http://localhost:8080/h2-console`
- JDBC URL: `jdbc:h2:mem:foodtruck`
- Username: `sa`
- Password: *(empty)*

## Run tests
```bash
mvn test
```
