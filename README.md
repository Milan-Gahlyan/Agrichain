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
├── pom.xml
└── src
    ├── main
    │   └── java
    │       └── com
    │           └── agrichain
    │               └── qa
    │                   ├── config
    │                   │   └── ConfigReader.java
    │                   ├── factory
    │                   │   ├── DriverFactory.java
    │                   │   └── DriverManager.java
    │                   ├── pages
    │                   │   ├── BasePage.java
    │                   │   ├── InputPage.java
    │                   │   └── ResultPage.java
    │                   └── util
    │                       └── LongestSubstringLogic.java
    └── test
        ├── java
        │   └── com
        │       └── agrichain
        │           └── qa
        │               ├── runner
        │               │   └── TestRunner.java
        │               └── stepdefinitions
        │                   ├── Hooks.java
        │                   └── StepDefinitions.java
        └── resources
            ├── config
            │   └── config.properties
            └── features
                └── Agrichain.feature
