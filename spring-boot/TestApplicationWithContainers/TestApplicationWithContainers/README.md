# Test Application with Testcontainers

This is a demo application that demonstrates the use of Testcontainers with a Spring Boot application. The application
includes configuration to start Testcontainers for integration testing purposes.

## Prerequisites

1. **Java Development Kit (JDK)**: Ensure you have JDK version 17 installed.
2. **Docker**: Docker must be installed and running on your machine as Testcontainers will use Docker to run the
   containers.

## Project Structure

- **`ApplicationWithTestContainersTestApplication.java`**: Main Spring Boot application class for the test.
- **`TestApplicationWithContainersApplication.java`**: Entry point for the Spring Boot application with Testcontainers
  configuration.
- **`TestcontainersConfiguration.java`**: Configuration class for setting up Testcontainers.
- **`pom.xml`**: Maven configuration file for dependencies and build setup.

## Getting Started

## Configuration Details

### Test Application Entry Point

Located in `TestApplicationWithContainersApplication.java`:

```java
package examples.spring_boot.test_application;

import org.springframework.boot.SpringApplication;

public class TestApplicationWithContainersApplication {

    public static void main(String[] args) {
        SpringApplication.from(ApplicationWithTestContainersTestApplication::main).with(TestcontainersConfiguration.class).run(args);
    }
}
```

### Testcontainers Configuration

The configuration required for Testcontainers is specified in the `TestcontainersConfiguration.java` file.

### Dependencies

Make sure the following dependencies are included in the `pom.xml`:

```xml

<dependencies>
    <!-- Spring Boot Dependencies -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>
    <!-- Testcontainers Dependencies -->
    <dependency>
        <groupId>org.testcontainers</groupId>
        <artifactId>testcontainers</artifactId>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>org.testcontainers</groupId>
        <artifactId>junit-jupiter</artifactId>
        <scope>test</scope>
    </dependency>
    <!-- Additional dependencies as needed -->
</dependencies>
```

## Configuration Details

### Test Application Entry Point

Located in `TestApplicationWithContainersApplication.java`:

```java
package examples.spring_boot.test_application;

import org.springframework.boot.SpringApplication;

public class TestApplicationWithContainersApplication {

    public static void main(String[] args) {
        SpringApplication.from(ApplicationWithTestContainersTestApplication::main).with(TestcontainersConfiguration.class).run(args);
    }
}
```

### Running the Application

**Run the Application in IntelliJ IDEA:**

- Open `TestApplicationWithContainersApplication.java`.
- Right-click on the file and select `Run 'TestApplicationWithContainersApplication.main()'`.

### Accessing the Application

After running the application, you can access the test endpoint by navigating to: http://localhost:<port>/hello

## Acknowledgements

- [Testcontainers](https://www.testcontainers.org/)
- [Spring Boot](https://spring.io/projects/spring-boot)

This project serves as a simple demonstration of setting up a Spring Boot application with Testcontainers for
integration testing.