package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "features",
        glue = {"StepDefinitions"},
        dryRun = false,
        plugin = {"pretty", "html:target/baocao.html"},
//        name = {"DELETE"},
//        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/baocao.html"},
        tags = "@TK01"
        )
public class TestRunner {
        }
