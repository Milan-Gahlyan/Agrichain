# SDET Assignment

This repository contains my submission for the SDET assignment provided as part of the recruitment process.  
It includes solutions to both **Problem 1 (Coding)** and **Problem 2 (Testing + Automation)**.  

---

## 📌 Problem 1: Coding

**Task:**  
Write a program to find the length of the longest substring without repeating characters.  

**Example:**  
- Input: `"abcabcbb"` → Output: `3` (`"abc"`)  
- Input: `"bbbbb"` → Output: `1` (`"b"`)  

**Solution:**  
- Implemented in **Python** & **Java**.  
- Used the **sliding window technique** with a hash set for efficient O(n) time complexity.  

---

## 📌 Problem 2: Testing & Automation

### ✅ I have added Excel sheet of Test Cases in the Task 2 folder

## 📌 Automation Script

- Implemented **BDD Framework** using **Selenium**.  
- Assumed locators for home page input, submit button, and result text field.  

**Framework Structure:**

agrichain-automation/
├── pom.xml # Maven dependencies & build config
└── src
├── main
│ └── java
│ └── com.agrichain.qa
│ ├── config
│ │ └── ConfigReader.java # Reads properties (browser, URL, etc.)
│ ├── factory
│ │ ├── DriverFactory.java # WebDriver factory
│ │ └── DriverManager.java # Driver lifecycle mgmt
│ ├── pages
│ │ ├── BasePage.java # Common methods for all pages
│ │ ├── InputPage.java # Home page (input & submit)
│ │ └── ResultPage.java # Results page (output display)
│ └── util
│ └── LongestSubstringLogic.java # Core logic implementation
└── test
├── java
│ └── com.agrichain.qa
│ ├── runner
│ │ └── TestRunner.java # Cucumber test runner
│ └── stepdefinitions
│ ├── Hooks.java # Setup & teardown
│ └── StepDefinitions.java # Step definitions mapping
└── resources
├── config
│ └── config.properties # Config (URL, browser, timeouts)
└── features
└── Agrichain.feature # BDD feature file
