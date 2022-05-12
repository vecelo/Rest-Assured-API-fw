package actions;

import StepDefinitions.Common_Steps;
import elements.TikiGioHang_Elements;
import org.openqa.selenium.WebDriver;

public class TikiGioHang_Actions {

    private WebDriver driver;
    TikiGioHang_Elements tikiGioHang_elements;

    public TikiGioHang_Actions(Common_Steps abd){
        this.driver = abd.getDriver();
        tikiGioHang_elements = new TikiGioHang_Elements(driver);
    }

    public void clickCartIcon(){
        tikiGioHang_elements.CartLogo.click();
    }

    public String verifyLoginWEmail(){
        return tikiGioHang_elements.LoginEMailText.getText();
    }
}
