package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Tiki_SearchTable_Steps {

    WebDriver driver;

    public Tiki_SearchTable_Steps(Common_Steps abc){
        this.driver = abc.getDriver();
    }

    @When("User search with many criteria")
    public void user_search_with_many_criteria(DataTable dataTable) throws InterruptedException {
        driver.findElement(By.xpath("//input[@class='FormSearch__Input-sc-1fwg3wo-2 gBxvSE']"))
                .sendKeys(dataTable.cell(1,0));
        List<WebElement> dichvu = driver.findElements(By.xpath("//div[@class='style__StyledServiceFilter-sc-1ezog7z-0 fupwIK']/child:node"));
        for(WebElement x : dichvu){
            if(x.getText().trim().equals(dataTable.cell(1,1))){
                x.click();
                System.out.println(x.getText());
            }
        }
        Thread.sleep(2000);
    }
}
