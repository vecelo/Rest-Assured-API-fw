package testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"features"},
        glue = {"StepDefinitions"},
//        plugin = {"pretty" , "html:Report1"},
        plugin = {"pretty" , "json:Report2"},
        dryRun = false,
//      strict = true strict da remove / deprecated tu 2021
//        monochrome = false
//        tags = "@T2",
        name = {"GET"}
        )
public class TestRunner {
}
