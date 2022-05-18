package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import managers.WebDriverManager;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class Common_Steps {
    private WebDriver driver;
    WebDriverManager webManager;

    @Before
    public void setUp() throws IOException {

        System.out.println("Global Before Hook Executed");
//        System.setProperty("webdriver.gecko.driver", FileReaderManager
//                .getInstance()
//                .getConfigReader()
//                .getDriverPath());
//        driver = new FirefoxDriver();

        webManager = new WebDriverManager();
        driver = webManager.getDriver();
    }



    @After
    public void tearDown() throws Exception {
        webManager.closeDriver();
        Thread.sleep(1500);
        System.out.println("Global After Hook Executed");
    }

    public WebDriver getDriver(){
        return driver;
    }

}