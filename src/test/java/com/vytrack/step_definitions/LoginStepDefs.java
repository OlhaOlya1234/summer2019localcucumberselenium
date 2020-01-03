package com.vytrack.step_definitions;

import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("Opening the login page");
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @When("the users enters the driver information")
    public void the_users_enters_the_driver_information() {
        System.out.println("enters the driver info");
        String dUsername = ConfigurationReader.get("driver_username");
        String dPassword = ConfigurationReader.get("driver_password");
        LoginPage loginPage = new LoginPage();
        loginPage.login(dUsername, dPassword);
    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        System.out.println("driver must be able to login");
        BrowserUtils.waitFor(2);
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("Dashboard", actualTitle);
    }

    @When("the users enters the sales manager information")
    public void the_users_enters_the_manager_information() {
        System.out.println("Enter the sales manager info");
        String SalesManagerUsername = ConfigurationReader.get("sales_manager_username");
        String SalesManagerPassword = ConfigurationReader.get("sales_manager_password");
        LoginPage loginPage = new LoginPage();
        loginPage.login(SalesManagerUsername, SalesManagerPassword);
    }

    @When("the users enters the store manager information")
    public void the_users_enters_the_store_manager_information() {
        System.out.println("Enter the store manager info");
        String StoreManagerUsername = ConfigurationReader.get("store_manager_username");
        String StoreManagerPassword = ConfigurationReader.get("store_manager_password");
        LoginPage loginPage = new LoginPage();
        loginPage.login(StoreManagerUsername, StoreManagerPassword);
    }

    @Given("a driver is logged in")
    public void aDriverIsLoggedIn() {
    }

    @When("the user goes to {string} {string}")
    public void theUserGoesTo(String arg0, String arg1) {
    }

    @Then("default page number should be {int}")
    public void defaultPageNumberShouldBe(int arg0) {
    }


}