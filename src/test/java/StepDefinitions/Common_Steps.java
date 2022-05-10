package StepDefinitions;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Common_Steps {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.out.println("Global Before Hook Executed");
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
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