# Selenium-Test-Automation

# Selenium Test Automation Framework

## Overview

This project is a Selenium Test Automation Framework developed using Java, Selenium WebDriver, TestNG, and Maven. It follows the Page Object Model (POM) design pattern with reusable utility classes, explicit waits, external configuration, Extent Reports, and GitHub Actions for Continuous Integration.

---

## Technologies Used

- Java 21
- Selenium WebDriver 4
- TestNG
- Maven
- Page Object Model (POM)
- WebDriverManager
- Extent Reports
- Apache Commons IO
- Java Faker
- Git
- GitHub
- GitHub Actions

---

## Project Structure

```
Selenium-Test-Automation
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── Framework
│   │   │       ├── Elements
│   │   │       ├── Utility
│   │   │       └── Reporting
│   │   └── resources
│   │       ├── config.properties
│   │       └── testdata.properties
│   │
│   └── test
│       └── java
│           └── Framework
│               ├── Base
│               └── TestCases
│
├── TestSuites
│   ├── smoke.xml
│   └── regression.xml
│
├── Reports
├── Screenshots
├── .github
│   └── workflows
│       └── selenium.yml
│
├── pom.xml
└── README.md
```

---

## Framework Features

- Page Object Model (POM)
- Explicit Waits
- Driver Factory
- Config Reader
- Test Data Reader
- Checkout Flow Utility
- Smoke Test Suite
- Regression Test Suite
- Extent Reports
- Screenshot on Failure
- GitHub Actions CI

---

## Automated Test Scenarios

- User Registration
- User Login
- Invalid Login
- Product Search
- Product Filters
- Product Details
- Add To Cart
- Remove From Cart
- Multiple Products Cart
- Checkout
- Billing Address
- Payment
- Complete Checkout
- Empty Cart Validation
- Cart Count Validation
- Product Stock Validation
- Logout Validation

**Total Automated Test Cases:** 25

---

## Test Suites

### Smoke Suite

Runs critical test cases for quick verification.

```
smoke.xml
```

### Regression Suite

Runs the complete automation suite.

```
regression.xml
```

---

## Reports

The framework generates:

- Extent HTML Reports
- Screenshots for Failed Test Cases

Reports are generated inside:

```
Reports/
```

---

## Continuous Integration

GitHub Actions is configured to:

- Build the project
- Execute TestNG suite
- Generate execution logs

Workflow file:

```
.github/workflows/selenium.yml
```

---

## How to Execute

### Run Smoke Suite

```
smoke.xml
```

### Run Regression Suite

```
regression.xml
```

### Maven

```
mvn clean test
```

---

## Author

**Velpuri Gopi**

Java | Selenium | TestNG | Maven | Automation Testing