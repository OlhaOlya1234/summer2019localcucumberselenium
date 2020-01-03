package com.vytrack.step_definitions;
import com.vytrack.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class NavigationMenuStepDefintions {
    @When("the user goes to Fleet, Vehicles")
    public void the_user_goes_to_Fleet_Vehicles() {
        System.out.println("opening Fleet, Vehicles");
    }

    @Then("the url should be https:\\/\\/qa{int}.vytrack.com\\/entity\\/Extend_Entity_Carreservation")
    public void the_url_should_be_https_qa_vytrack_com_entity_Extend_Entity_Carreservation(Integer int1) {
        System.out.println("Verifying url for vehicles");
    }



    @When("the user goes to Marketing, Campaigns")
    public void the_user_goes_to_Marketing_Campaigns() {
        System.out.println("Opening Marketing, Campaigns");
    }

    @Then("the url should be https:\\/\\/qa{int}.vytrack.com\\/campaign\\/")
    public void the_url_should_be_https_qa_vytrack_com_campaign(Integer int1) {
        System.out.println("Verifying url for campaigns");
    }

    @When("the user goes to Activities, Calendar Events")
    public void the_user_goes_to_Activities_Calendar_Events() {
        System.out.println("Opening Activities, Calendar events");
    }

    @Then("the url should be https:\\/\\/qa{int}.vytrack.com\\/calendar\\/event")
    public void the_url_should_be_https_qa_vytrack_com_calendar_event(Integer int1) {
        System.out.println("Verifying url for calendar events");
    }

    @When("the user logs in using following credentials")
    public void the_user_logs_in_using_following_credentials(Map<String,String> userData) {
        System.out.println(userData);
        System.out.println("Firstname:"+userData.get("Firstname"));
        System.out.println("Lastname:"+userData.get("lname"));
        System.out.println("Username"+userData.get("username"));
        System.out.println("Password"+userData.get("password"));

        LoginPage loginPage = new LoginPage();
        loginPage.login(userData.get("username"), userData.get("password"));

    }
    // @And("the user enters the sales manager information")




}
