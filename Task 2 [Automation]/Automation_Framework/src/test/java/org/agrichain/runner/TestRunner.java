package org.agrichain.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"org.agrichain.stepdefinitions"},
        plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty.html",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "rerun:target/rerun.txt"
        },
        tags = "not @wip", // Runs all scenarios that are not tagged with @wip (work in progress)
        monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {

    /**
     * This method enables scenarios to be run in parallel.
     * TestNG will run each scenario in its own thread.
     */
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}

