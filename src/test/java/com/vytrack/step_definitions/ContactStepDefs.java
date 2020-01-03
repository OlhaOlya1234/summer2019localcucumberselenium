package com.vytrack.step_definitions;

import com.vytrack.pages.DashboardPage;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ContactStepDefs {

    @Then("the user should be able to see following menu options")
    public void the_User_Should_Be_Able_To_See_Following_Menu_Options(List<String>list) {
        System.out.println("list.size()="+list.size());
        System.out.println(list);

        DashboardPage dashboardPage = new DashboardPage();
        List<String >actualList = new ArrayList<>();
        BrowserUtils.waitFor(2);
        for (WebElement option : dashboardPage.menuOptions){
            actualList.add(option.getText());
            // compare 2 lists
            Assert.assertEquals(list,actualList);
        }
    }

}
