**FastAutomation Test Suite**
Overview

This project is a Selenium WebDriver + TestNG automation framework for testing dynamic speed verification on a web page.
It uses the Page Object Model (POM) pattern to ensure reusable and maintainable code.

The main test, FastAutomationTest, continuously monitors the speed value and waits until it reaches the green zone before reporting the final speed.

**Features**

Dynamic monitoring of web page elements

Waits until conditions are met (succeeded class) using WebDriverWait

Implements Page Object Model (POM) for clean test structure

Real-time logging of speed value and units

Works with TestNG for structured test execution

Technologies Used

Java 19

Selenium WebDriver 4.35.0

TestNG 7.10.1

WebDriverManager 6.2.0

Maven for dependency management

**Project Structure**
FastAutomation/
├── src/
│   ├── main/
│   │   └── java/pages/FastAutomationPage.java
│   └── test/
│       └── java/tests/FastAutomationTest.java
├── pom.xml
└── README.md


pages/: Contains Page Object classes

tests/: Contains TestNG test classes

pom.xml: Maven project configuration

Setup Instructions

Clone the repository:

git clone <your-repo-url>


Navigate to the project directory:

cd FastAutomation


Install dependencies:

mvn clean install


Run tests:

mvn test

**Usage**

**FastAutomationPage contains methods to interact with page elements:**

getSpeedValue() → Returns current speed value

getSpeedUnits() → Returns speed units

getSpeedValueElement() → Returns the WebElement to access attributes

**FastAutomationTest:**

Continuously monitors the speed value

Waits for the "succeeded" class to indicate the green zone

Prints the current and final speed values 

**Notes**

Make sure ChromeDriver is compatible with your installed Chrome version (managed automatically by WebDriverManager).

The test loop uses Thread.sleep(500) to avoid CPU busy waiting.
