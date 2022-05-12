package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "features",
        glue = {"StepDefinitions"},
        dryRun = true,
        plugin = {"pretty", "html:report.html"},
        tags = "@TK01"
//      name = {"DELETE"}
        )
public class TestRunner {
}
