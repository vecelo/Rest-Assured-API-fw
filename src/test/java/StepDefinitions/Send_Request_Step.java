package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class Send_Request_Step {
    @Given("User co address")
    public void user_co_address() {
        System.out.print("I got request\n");
    }

    @When("User gui request den endpoint")
    public void user_gui_request_den_endpoint() {
        System.out.print("I sent request\n");
    }

    @Then("User nhan duoc ket qua")
    public void user_nhan_duoc_ket_qua() {
        System.out.print("I got response\n");
    }
}