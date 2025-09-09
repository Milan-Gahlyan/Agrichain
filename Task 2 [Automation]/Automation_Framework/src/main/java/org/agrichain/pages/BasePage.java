package org.agrichain.pages;

import org.agrichain.factory.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {

    protected WebDriverWait wait;

    public BasePage() {
        // Initializes the PageFactory for each page object that extends this class.
        PageFactory.initElements(DriverManager.getDriver(), this);
        this.wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
    }

    /**
     * A common method to wait for an element to be visible and then click it.
     * @param element The WebElement to click.
     */
    protected void waitAndClick(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        element.click();
    }

    /**
     * A common method to wait for an element to be visible and then send keys.
     * @param element The WebElement to type into.
     * @param text The text to send.
     */
    protected void waitAndSendKeys(WebElement element, String text) {
        wait.until(ExpectedConditions.visibilityOf(element));
        element.clear();
        element.sendKeys(text);
    }

    /**
     * A common method to get the text from a visible element.
     * @param element The WebElement to get text from.
     * @return The visible text of the element.
     */
    protected String getVisibleText(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        return element.getText();
    }
}
