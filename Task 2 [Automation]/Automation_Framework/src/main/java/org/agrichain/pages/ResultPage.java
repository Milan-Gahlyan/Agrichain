package org.agrichain.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultPage extends BasePage {

    @FindBy(xpath = "//h1[contains(text(), 'Output is:')]/following-sibling::p | //p[preceding-sibling::h1[contains(text(), 'Output is:')]]") // Example locators
    private WebElement outputText;

    @FindBy(xpath = "//button[text()='Back to Home']")
    private WebElement backToHomeButton;

    /**
     * Gets the result number from the output text.
     * It parses "Output is: 3" to return just "3".
     *
     * @return The integer result.
     */
    public int getOutput() {
        String fullText = getVisibleText(outputText);
        try {
            return Integer.parseInt(fullText.trim());
        } catch (NumberFormatException e) {
            System.err.println("Could not parse number from output text: " + fullText);
            return -1; // Return an invalid value on error
        }
    }

    public void clickBackToHome() {
        waitAndClick(backToHomeButton);
    }
}
