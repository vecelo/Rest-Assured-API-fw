package actions;

import StepDefinitions.Common_Steps;
import org.openqa.selenium.WebDriver;

public class Common_Actions {

    private WebDriver driver;

    public Common_Actions(Common_Steps common_steps){
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
