# Selenium Test Automation Project

## Overview
This project is an automated test framework using Selenium WebDriver with TestNG. It follows the **Page Object Model (POM)** design pattern to enhance maintainability and reusability.

## Project Structure
```
|-- src/
|   |-- Abstract/               # Contains the abstract class for reusable methods
|   |-- P1/                     # Contains the test cases
|   |-- pom1/                   # Contains Page Object Model classes
|-- pom.xml                      # Maven dependencies
|-- README.md                    # Project documentation
```

## Prerequisites
- **Java 8+** installed
- **Maven** installed and configured
- **Chrome WebDriver** (Ensure compatibility with Chrome browser version)

## Installation & Setup
1. Clone this repository:
   ```sh
   git clone https://github.com/ahmedabdelrahman00/LevelSet_Task
   cd your-repo
   ```
2. Install dependencies:
   ```sh
   mvn clean install
   ```
3. Update the **ChromeDriver** path if required.

## Test Execution
- Run tests using Maven:
  ```sh
  mvn test
  ```
- Run a specific test using TestNG:
  ```sh
  mvn -Dtest=Task1 test
  ```

## Key Features
- **POM (Page Object Model)** to enhance test structure
- **Dynamic Locators** for better flexibility
- **TestNG Annotations** for efficient test management
- **Pre and Post Validations** to ensure stability

## File Descriptions
### 1. `Task1.java`
- Contains test cases to validate:
  - The count of free documents (expected: 2)
  - The names of the free documents
  - The count and names of documents priced between `$30-$60`

### 2. `Document_pom.java`
- Defines page elements and actions related to the **Document** page.
- Implements **dynamic locators** for flexibility.
- Provides methods to interact with UI elements.

### 3. `Home_pom.java`
- Implements methods for navigating to the homepage.
- Includes visibility validation for UI elements.

### 4. `Abstract_pom.java`
- Contains generic utility methods:
  - **Click Actions**
  - **Waiting for elements**
  - **Checking element visibility**
  - **Fetching text from elements**

## Customization
- Modify **dynamic locators** in `Document_pom.java` for enhanced adaptability.
- Update `getPriceLocator()` to customize price filtering criteria.


