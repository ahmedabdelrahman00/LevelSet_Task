# LevelSet_Task
 
🛠️ Features
✅ Page Object Model (POM) - Improves test maintainability
✅ TestNG Integration - Parallel execution, annotations, and assertions
✅ Explicit & Fluent Waits - Efficient element handling
✅ Custom Utility Methods - Reusable functions for common interactions
✅ Dynamic Locators - Robust element selection
✅ Parameterization with XML & Properties - Run tests dynamically
✅ CI/CD Ready - GitHub Actions integration for automated testing
⚙️ Prerequisites
Ensure you have the following installed:
🔹 Java 11+ → Download
🔹 Maven → Download
🔹 ChromeDriver → Download
🔹 Git → Download
🚀 Installation
1️⃣ Clone the repository:

sh
Copy
Edit
git clone https://github.com/your-username/SeleniumAutomation.git
cd SeleniumAutomation
2️⃣ Set up dependencies:

sh
Copy
Edit
mvn clean install
3️⃣ Update config.properties with correct values.
🔧 Configuration
Modify config/config.properties to customize settings:

properties
Copy
Edit
browser=chrome
base_url=https://www.levelset.com/
implicit_wait=10
explicit_wait=15
▶️ Running Tests
🔹 Run all tests:

sh
Copy
Edit
mvn test
🔹 Run a specific test:

sh
Copy
Edit
mvn -Dtest=Task1 test
🔹 Run tests in parallel (via TestNG XML):

sh
Copy
Edit
mvn test -DsuiteXmlFile=parallel-tests.xml
