package org.agrichain.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverFactory {

    public WebDriver createDriver(String browserName) {
        System.out.println("Initializing driver for browser: " + browserName);

        switch (browserName.toLowerCase().trim()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
            case "edge":
                WebDriverManager.edgedriver().setup();
                return new EdgeDriver();
            default:
                System.out.println("Invalid browser name provided: " + browserName + ". Defaulting to Chrome.");
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();
        }
    }
}
