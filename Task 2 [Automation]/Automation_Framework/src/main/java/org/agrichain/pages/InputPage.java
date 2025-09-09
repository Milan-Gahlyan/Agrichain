package org.agrichain.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InputPage extends BasePage {

    @FindBy(css = "input[placeholder='Enter String Input...']")
    private WebElement stringInputField;

    @FindBy(xpath = "//button[text()='Submit']")
    private WebElement submitButton;

    public String getPlaceholderText(){
        return stringInputField.getText();
    }


    public void enterString(String input) {
        if (input == null || input.equalsIgnoreCase("(empty)")) {
            waitAndSendKeys(stringInputField, "");
        } else {
            waitAndSendKeys(stringInputField, input);
        }
    }

    public void clickSubmit() {
        waitAndClick(submitButton);
    }
}
