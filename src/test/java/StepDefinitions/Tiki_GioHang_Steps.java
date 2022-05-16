//package StepDefinitions;
//
//import io.cucumber.java.Before;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.jruby.RubyProcess;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.ui.ExpectedCondition;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import static org.junit.Assert.fail;
//
//public class Tiki_GioHang_Steps {
//     WebDriver driver;
//
//    public Tiki_GioHang_Steps(Common_Steps abc){
//        this.driver = abc.getDriver();
//    }
//
//    @Given("User on Tiki homepage")
//    public void user_on_tiki_homepage() throws Exception {
//        driver.get("https://tiki.vn/");
//        System.out.println("Tiki homepage");
//    }
//
//    @When("User click on Cart Logo")
//    public void user_click_on_cart_logo() throws InterruptedException {
//        driver.findElement(By.className("cart-icon")).click();
//        Thread.sleep(1000);
//    }
//
//    @Then("User is navigated to Login form")
//    public void user_is_navigated_to_Login_form() throws InterruptedException {
//        String expectTxt = "Đăng nhập bằng email";
//        String actualTxt = driver.findElement(By.className("login-with-email")).getText();
//        if (!expectTxt.equals(actualTxt)){
//            fail("Element does not available");
//        }
//    }
//
//    @Then("User is navigated to test form")
//    public void user_is_navigated_to_test_form() {
//        String expectURL = "https://tiki.vn/checkout/cart?src=header_cart";
//        String actualURL = driver.getCurrentUrl();
//        if (!expectURL.equals(actualURL)){
//            fail("Page does not available");
//        }
//    }
//}
