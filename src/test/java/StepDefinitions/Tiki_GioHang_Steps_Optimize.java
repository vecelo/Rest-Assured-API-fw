package StepDefinitions;

import actions.Common_Actions;
import actions.TikiGioHang_Actions;
import dataProvider.ConfigFileReader;
import elements.TikiGioHang_Elements;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import managers.FileReaderManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

import static org.junit.Assert.fail;

public class Tiki_GioHang_Steps_Optimize {
    Common_Actions common_actions;
    TikiGioHang_Actions tikiGioHang_actions;

    public Tiki_GioHang_Steps_Optimize(Common_Actions common_actions,
                                       TikiGioHang_Actions tikiGioHang_actions) throws IOException {
        this.common_actions = common_actions;
        this.tikiGioHang_actions = tikiGioHang_actions;
    }

    @Given("User on Tiki homepage")
    public void user_on_tiki_homepage() throws Exception {
        common_actions.gotoURL(FileReaderManager
                .getInstance()
                .getConfigReader()
                .getApplicationUrl());
    }


    @When("User click on Cart Logo")
    public void user_click_on_cart_logo() throws InterruptedException {
        tikiGioHang_actions.clickCartIcon();
        Thread.sleep(1000);
    }

    @Then("User is navigated to Login form")
    public void user_is_navigated_to_Login_form() throws InterruptedException {
        String expectTxt = "Đăng nhập bằng email";
        String actualTxt = tikiGioHang_actions.verifyLoginWEmail();
        if (!expectTxt.equals(actualTxt)) {
            fail("Element does not available");
        }
    }

    @Then("User is navigated to test form")
    public void user_is_navigated_to_test_form() {
        String expectURL = "https://tiki.vn/checkout/cart?src=header_cart";
        String actualURL = common_actions.getURLhientai();
        if (!expectURL.equals(actualURL)) {
            fail("Page does not available");
        }
    }
}
