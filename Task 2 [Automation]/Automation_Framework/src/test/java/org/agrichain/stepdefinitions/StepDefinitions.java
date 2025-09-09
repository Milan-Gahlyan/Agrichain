package org.agrichain.stepdefinitions;

import org.agrichain.config.ConfigReader;
import org.agrichain.factory.DriverManager;
import org.agrichain.pages.InputPage;
import org.agrichain.pages.ResultPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Properties;

public class StepDefinitions {

    private final InputPage inputPage = new InputPage();
    private final ResultPage resultPage = new ResultPage();
    private final ConfigReader configReader = new ConfigReader();
    private final Properties prop = configReader.init_prop();
    private final String baseUrl = prop.getProperty("baseUrl");
    private final WebDriver driver = DriverManager.getDriver();


    @Given("I am on the Agrichain input page")
    public void i_am_on_the_agrichain_input_page() {
        driver.get(baseUrl + "/input");
    }

    @When("I enter the string {string}")
    public void i_enter_the_string(String inputString) {
        inputPage.enterString(inputString);
    }

    @When("I click the submit button")
    public void i_click_the_submit_button() {
        inputPage.clickSubmit();
    }

    @Then("the output on the result page should be {int}")
    public void the_output_on_the_result_page_should_be(Integer expectedOutput) {
        int actualOutput = resultPage.getOutput();
        Assert.assertEquals(actualOutput, expectedOutput.intValue(), "The output displayed on the website is incorrect.");
    }

    @Then("I should see the placeholder text {string} in the input field")
    public void i_should_see_the_placeholder_text_in_the_input_field(String expectedPlaceholder) {
        String actualPlaceholder = inputPage.getPlaceholderText();
        Assert.assertEquals(actualPlaceholder, expectedPlaceholder, "The input field's placeholder text is incorrect or missing.");
    }

    @Given("I am on the result page")
    public void i_am_on_the_result_page() {
        // This step asserts context before performing an action on the result page.
        Assert.assertTrue(driver.getCurrentUrl().contains("/result"), "Verification failed: Not on the result page as expected.");
    }

    @When("I click the \\\"Back to Home\\\" button")
    public void i_click_the_back_to_home_button() {
        resultPage.clickBackToHome();
    }

    @Then("I should be redirected back to the input page")
    public void i_should_be_redirected_back_to_the_input_page() {
        String expectedUrl = baseUrl + "/input";
        Assert.assertTrue(driver.getCurrentUrl().contains(expectedUrl), "Navigation failed: Did not redirect to the input page.");
    }
}

