package StepDefinitions;

import managers.FileReaderManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.io.IOException;

public class Common_Steps {
    private WebDriver driver;

    @Before
    public void setUp() throws IOException {

        System.out.println("Global Before Hook Executed");
        System.setProperty("webdriver.gecko.driver", FileReaderManager
                .getInstance()
                .getConfigReader()
                .getDriverPath());
        driver = new FirefoxDriver();
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        Thread.sleep(1500);
        System.out.println("Global After Hook Executed");
    }

    public WebDriver getDriver(){
        return driver;
    }

}