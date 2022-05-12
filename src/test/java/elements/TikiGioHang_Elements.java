package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TikiGioHang_Elements {

    WebDriver driver;

    @FindBy(xpath = "") public WebElement Tikilogo;
    @FindBy(className = "cart-icon") public WebElement CartLogo;
    @FindBy(className = "login-with-email") public WebElement LoginEMailText;
    @FindBy(xpath = "//button[contains(text(),'Tìm Ki')]") public WebElement TimkiemBtn;
    @FindBy(xpath = "//input[@class='FormSearch__Input-sc-1fwg3wo-2 gBxvSE']") public WebElement TimkiemField;

    public TikiGioHang_Elements(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


}
