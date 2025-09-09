package org.agrichain.stepdefinitions;

import org.agrichain.config.ConfigReader;
import org.agrichain.factory.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.Properties;

public class Hooks {

    private ConfigReader configReader;
    private Properties prop;

    @Before
    public void launchBrowser() {
        configReader = new ConfigReader();
        prop = configReader.init_prop();
        String browserName = prop.getProperty("browser");
        DriverManager.setDriver(browserName);
        DriverManager.getDriver().manage().window().maximize();
    }

    @After(order = 0)
    public void quitBrowser() {
        DriverManager.quitDriver();
    }

    @After(order = 1)
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            // Take screenshot on failure and attach it to the report
            String screenshotName = scenario.getName().replaceAll("\\s", "_");
            byte[] sourcePath = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(sourcePath, "image/png", screenshotName);
        }
    }
}

