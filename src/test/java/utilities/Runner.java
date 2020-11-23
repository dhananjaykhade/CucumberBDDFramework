package utilities;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features = ".//Features/Login.feature",
                 glue = "stepDefinition",
                 plugin = {"pretty", "html:test-output"},
                 dryRun = false, 
                 monochrome = true)
public class Runner {

}
