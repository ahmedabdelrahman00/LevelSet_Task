# 🚀 Selenium LevelSet Task

## 📌 Overview
This project is an automated test framework using **Selenium WebDriver** with **TestNG**. It follows the **Page Object Model (POM)** design pattern to improve maintainability and reusability.

## 📂 Project Structure
```
|-- src/
|   |-- Abstract/               # 🔄 Contains the abstract class for reusable methods
|   |-- P1/                     # 📝 Contains the test cases
|   |-- pom1/                   # 📄 Contains Page Object Model classes
|-- pom.xml                      # 📦 Maven dependencies
|-- README.md                    # 📘 Project documentation
```

## ⚙️ Prerequisites
✔ **Java 8+** installed  
✔ **Maven** installed and configured  
✔ **Chrome WebDriver** (Ensure compatibility with your Chrome browser version)  

## 🛠️ Installation & Setup
1️⃣ Clone this repository:
   ```sh
   git clone https://github.com/ahmedabdelrahman00/LevelSet_Task
   cd LevelSet_Task

   ```
2️⃣ Install dependencies:
   ```sh
   mvn clean install
   ```
3️⃣ Update the **ChromeDriver** path if required.

## ▶️ Test Execution
- Run all tests using Maven:
  ```sh
  mvn test
  ```
- Run a specific test using TestNG:
  ```sh
  mvn -Dtest=Task1 test
  ```

## ✨ Key Features
✅ **Page Object Model (POM)** for a well-structured test framework  
✅ **Dynamic Locators** for flexible element selection  
✅ **TestNG Annotations** for efficient test management  
✅ **Pre and Post Validations** to ensure test stability  

## 📜 File Descriptions
### 📌 `Task1.java`
📌 Contains test cases to validate:
- ✅ The count of free documents (expected: **2**)
- ✅ The names of the free documents
- ✅ The count and names of documents priced between **$30-$60**

### 📌 `Document_pom.java`
📌 Defines page elements and actions related to the **Document** page.  
📌 Implements **dynamic locators** for better flexibility.  
📌 Provides methods to interact with UI elements.

### 📌 `Home_pom.java`
📌 Implements methods for navigating to the homepage.  
📌 Includes visibility validation for UI elements.

### 📌 `Abstract_pom.java`
📌 Contains generic utility methods:
- 🖱️ **Click Actions**
- ⏳ **Waiting for elements**
- 👀 **Checking element visibility**
- 📋 **Fetching text from elements**

## 🔧 Customization
🛠️ Modify **dynamic locators** in `Document_pom.java` for enhanced adaptability.  
🛠️ Update `getPriceLocator()` to customize price filtering criteria.  

📌 For any improvements or modifications, feel free to contribute! 🚀
