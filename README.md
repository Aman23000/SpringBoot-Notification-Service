# SpringBoot Notification Service

A Spring Boot microservice that coordinates real-time delivery notifications between retail shops and freelance drivers, using the **Observer** and **Factory** design patterns.

[![Java](https://img.shields.io/badge/Java-11+-ED8B00?style=flat&logo=java)](https://adoptium.net/)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-2.x-6DB33F?style=flat&logo=springboot)](https://spring.io/projects/spring-boot)
[![Maven](https://img.shields.io/badge/Maven-3.6+-C71A36?style=flat&logo=apachemaven)](https://maven.apache.org/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

## Overview

Shops create delivery requests that are broadcast to all subscribed drivers. The service is built around two patterns:

- **Observer Pattern** — `Shop` (subject) notifies registered `Driver` observers whenever a new delivery request is raised, decoupling the broadcaster from its listeners.
- **Factory Pattern** — `NotificationServiceFactory` instantiates the correct notification channel (Email, SMS) at runtime, keeping notification logic extensible without modifying existing code.

## Architecture

```
Shop (Observable)
 └── notifies → Driver[] (Observers)
                     └── via NotificationService (Email | SMS)
                              └── created by NotificationServiceFactory
```

## Key Design Decisions

| Concern | Solution |
|---|---|
| New driver types | Implement `Observer` interface — no changes to `Shop` |
| New notification channels | Add a factory branch — no changes to drivers |
| Persistence | Spring Data JPA with service-discovery-ready REST layer |
| API documentation | Swagger / OpenAPI |

## Prerequisites

- Java 11+
- Maven 3.6+

## Build & Run

```bash
mvn clean package
mvn spring-boot:run
```

API available at `http://localhost:8080`. Swagger UI at `http://localhost:8080/swagger-ui.html`.

## Run Tests

```bash
mvn test
```