# JUnit Testing Repository

## Overview
This repository contains various JUnit test cases demonstrating different testing techniques, including basic assertions, setup/teardown methods, exception handling, and performance testing.

## Features
- **Basic Unit Testing**: Tests for string manipulation methods using `assertEquals` and `assertFalse`.
- **Setup and Teardown**: Uses `@BeforeAll`, `@BeforeEach`, `@AfterEach`, and `@AfterAll` for test initialization and cleanup.
- **Exception Testing**: Validates that specific methods throw expected exceptions.
- **Performance Testing**: Ensures that sorting operations complete within a specified time limit.

## Project Structure
```
JUnit/
│── src/
│   ├── main/
│   │   └── java/
│   │       └── org/example/
│   │           └── StringHelper.java  # Utility class for string operations
│   └── test/
│       └── java/
│           ├── StringHelperTest.java  # Unit tests for StringHelper
│           ├── BeforeAfterTest.java   # Demonstrates JUnit lifecycle annotations
│           ├── ArraysCompareTest.java # Tests array comparison assertions
│── pom.xml  # Maven configuration file
│── README.md  # Project documentation

```

## Dependencies
This project uses JUnit 5 for writing and executing test cases. Ensure the following dependency is included in your `pom.xml`:

```xml
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-api</artifactId>
    <version>5.8.0</version>
    <scope>test</scope>
</dependency>
```

## Running Tests
To execute the test cases, use the following Maven command:

```sh
mvn test
```

## Key Learnings
- **Annotations in JUnit 5:**
  - `@Test`: Marks a method as a test case.
  - `@BeforeAll` and `@AfterAll`: Executes setup and teardown once per test class (must be static).
  - `@BeforeEach` and `@AfterEach`: Runs before and after each test method.
- **Assertions:**
  - `assertEquals(expected, actual)`: Compares expected and actual values.
  - `assertFalse(condition)`: Ensures the given condition is false.
  - `assertArrayEquals(expectedArray, actualArray)`: Compares array contents (not just references).
- **Exception Handling:**
  - JUnit 5 uses `assertThrows(Exception.class, () -> methodCall())` instead of `@Test(expected = Exception.class)` from JUnit 4.

## Contributing
Feel free to contribute by adding more test cases or improving the existing ones!

## License
This project is open-source and available for use and modification.

