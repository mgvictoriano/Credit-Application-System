# Credit Application System

## Description

The Credit Application System is a sample project demonstrating a credit control system. It provides a service to manage credit-related operations and offers RESTful endpoints for interacting with the system. The codebase is written in Kotlin.

## Technologies

- **Programming Language**: Kotlin
- **Framework**: Spring Boot
- **Database**: H2 Database
- **Build System**: Gradle

## Prerequisites

Before you get started, make sure you have the following prerequisites:

- Java 17 or later
- Gradle (Gradle Wrapper is included)

## Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/credit-application-system.git

## Usage

You can interact with the system through the following endpoints:

- /api/credit - Endpoints related to credits.
- /api/customer - Endpoints related to customers.

## Dependencies
The project's dependencies are managed using Gradle and can be found in the build.gradle.kts file:

```bash
dependencies {
    implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
    implementation 'org.springframework.boot:spring-boot-starter-validation'
    implementation 'org.springframework.boot:spring-boot-starter-web'
    implementation 'com.fasterxml.jackson.module:jackson-module-kotlin'
    implementation 'org.flywaydb:flyway-core'
    implementation 'org.jetbrains.kotlin:kotlin-reflect'
    runtimeOnly 'com.h2database:h2'
    testImplementation 'org.springframework.boot:spring-boot-starter-test'
} 
```

## Authors
Michelle Gaia Victoriano
