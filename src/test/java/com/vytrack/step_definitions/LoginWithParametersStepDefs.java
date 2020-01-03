package com.vytrack.step_definitions;

import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginWithParametersStepDefs {
    @Given("a driver is logged in ")
    public void a_driver_is_logged_in(){

    }
    @When("user logs in using {string} and {string}")
    public void user_logs_in_using_and(String username, String password) {
        System.out.println("string = " + username);
        System.out.println("string2 = " + password);
        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);
    }

    @Then("the title should contain {string}")
    public void the_title_should_contain(String title) {
        System.out.println("title = " + title);
        BrowserUtils.waitFor(3);
//        String actualTitle = Driver.get().getTitle();
//        Assert.assertEquals(title,actualTitle);
        Assert.assertTrue(Driver.get().getTitle().contains(title));


    }
}