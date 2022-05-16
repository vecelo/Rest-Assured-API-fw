package StepDefinitions;

import actions.Common_Actions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Collection;
import java.util.List;

import static org.junit.Assert.fail;

public class Tiki_Searchbar_Steps {

    WebDriver driver;
    Common_Actions common_actions;

    public Tiki_Searchbar_Steps(Common_Actions common_actions, Common_Steps abc){
        this.common_actions = common_actions;
        this.driver = abc.getDriver();
    }

    @When("User search for {string}")
    public void user_search_for(String sphamdon) {
        driver.findElement
                (By.xpath("//input[@class='FormSearch__Input-sc-1fwg3wo-2 gBxvSE']"))
                .sendKeys(sphamdon);
        driver.findElement(By.xpath("//button[contains(text(),'Tìm Ki')]"))
                .click();
    }

    @When("User search for {string} in {string} category")
    public void user_search_for_in_category(String spham, String categor) throws InterruptedException {
        driver.findElement(By.xpath("//input[@class='FormSearch__Input-sc-1fwg3wo-2 gBxvSE']")).sendKeys(spham);
        driver.findElement(By.xpath("//button[contains(text(),'Tìm Ki')]")).click();
        Thread.sleep(1000);
        List<WebElement> cat = driver.findElements(By.className("//div[@class='Sorter__Tabs-sc-1u1tc3w-3 dfCYMA']"));
        for(WebElement x : cat){
            if(x.getText().trim().equals(categor)){
                x.click();
                break;
            }
        }
    }


    @Then("User see greater than {int} product")
    public void user_see_greater_than_product(Integer countExpected) throws InterruptedException {
        List<WebElement> count = driver
                                .findElements
                                (By.xpath("//a[@class='product-item']"));
        if(count.size()< countExpected){
            fail("San pham ko tim thay");
        }
        Thread.sleep(1000);
    }

    @When("User click on {string}")
    public void user_click_on(String linka) throws InterruptedException {
        driver.findElement(By.partialLinkText(linka)).click();
        Thread.sleep(1000);
    }

    @Then("User validate the {string} and the title {string}")
    public void user_validate_the_and_the_title(String url, String title) {
        String actURL = common_actions.getURLhientai();
        String actTitle = driver.getTitle();
        if(!actURL.equals(url)){
            fail("url ko đúng");
        }
        if(actTitle.contains(title)){
            fail("Title ko đúng");
        }
    }
}
