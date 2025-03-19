#!/bin/bash

echo "===================================="
echo "🚀 Selenium Automation Framework Setup"
echo "===================================="

echo "🛠️ Features:"
echo "✅ Page Object Model (POM) - Improves test maintainability"
echo "✅ TestNG Integration - Parallel execution, annotations, and assertions"
echo "✅ Explicit & Fluent Waits - Efficient element handling"
echo "✅ Custom Utility Methods - Reusable functions for common interactions"
echo "✅ Dynamic Locators - Robust element selection"
echo "✅ Parameterization with XML & Properties - Run tests dynamically"
echo "✅ CI/CD Ready - GitHub Actions integration for automated testing"
echo "------------------------------------"

echo "⚙️ Checking Prerequisites..."
echo "Ensure you have the following installed:"
echo "🔹 Java 11+ → https://www.oracle.com/java/"
echo "🔹 Maven → https://maven.apache.org/download.cgi"
echo "🔹 ChromeDriver → https://sites.google.com/chromium.org/driver/"
echo "🔹 Git → https://git-scm.com/downloads"
echo "------------------------------------"

echo "🚀 Cloning Repository..."
git clone https://github.com/your-username/SeleniumAutomation.git
cd SeleniumAutomation || exit

echo "🚀 Installing Dependencies..."
mvn clean install

echo "🔧 Updating Configuration..."
cat > config/config.properties <<EOL
browser=chrome
base_url=https://www.levelset.com/
implicit_wait=10
explicit_wait=15
EOL

echo "▶️ Running Tests..."
echo "🔹 To run all tests, execute: mvn test"
echo "🔹 To run a specific test, execute: mvn -Dtest=Task1 test"
echo "🔹 To run tests in parallel, execute: mvn test -DsuiteXmlFile=parallel-tests.xml"

echo "✅ Setup Complete!"
