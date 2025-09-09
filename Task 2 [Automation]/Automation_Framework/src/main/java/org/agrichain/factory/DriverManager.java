package org.agrichain.factory;

import org.openqa.selenium.WebDriver;

public class DriverManager {

    private static final ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
    private static final DriverFactory driverFactory = new DriverFactory();

    public static synchronized void setDriver(String browser) {
        if (tlDriver.get() == null) {
            tlDriver.set(driverFactory.createDriver(browser));
        }
    }

    public static synchronized WebDriver getDriver() {
        return tlDriver.get();
    }

    public static void quitDriver() {
        WebDriver driver = tlDriver.get();
        if (driver != null) {
            driver.quit();
            tlDriver.remove();
        }
    }
}
