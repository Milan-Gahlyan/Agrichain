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
├── pom.xml # Maven dependencies & build config <br>
└── src <br>
├── main <br>
│ └── java <br>
│ └── com.agrichain.qa <br>
│ ├── config <br>
│ │ └── ConfigReader.java # Reads properties (browser, URL, etc.) <br>
│ ├── factory <br>
│ │ ├── DriverFactory.java # WebDriver factory <br>
│ │ └── DriverManager.java # Driver lifecycle mgmt <br>
│ ├── pages <br>
│ │ ├── BasePage.java # Common methods for all pages <br>
│ │ ├── InputPage.java # Home page (input & submit) <br>
│ │ └── ResultPage.java # Results page (output display) <br>
│ └── util <br>
│ └── LongestSubstringLogic.java # Core logic implementation <br>
└── test <br>
├── java <br>
│ └── com.agrichain.qa <br>
│ ├── runner <br>
│ │ └── TestRunner.java # Cucumber test runner <br>
│ └── stepdefinitions <br>
│ ├── Hooks.java # Setup & teardown <br>
│ └── StepDefinitions.java # Step definitions mapping <br>
└── resources <br>
├── config <br>
│ └── config.properties # Config (URL, browser, timeouts) <br>
└── features <br>
└── Agrichain.feature #                                                                                         BDD feature file
