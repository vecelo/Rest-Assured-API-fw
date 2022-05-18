package actions;

import StepDefinitions.Common_Steps;
import dataProvider.ConfigFileReader;
import managers.WebDriverManager;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class Common_Actions {

    private final WebDriver driver;
    ConfigFileReader configFileReader;

    public Common_Actions(Common_Steps common_steps) throws IOException {
        this.driver = common_steps.getDriver();
    }

    public void gotoURL(String url){
        driver.get(url);
    }

    public String getURLhientai(){
        return driver.getCurrentUrl();
    }

    public String getTitlehientai(){
        return driver.getTitle();
    }

    public void quitWebDriver(){
        driver.quit();
    }
}
