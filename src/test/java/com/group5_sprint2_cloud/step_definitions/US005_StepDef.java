package com.group5_sprint2_cloud.step_definitions;

import com.group5_sprint2_cloud.pages.BasePage;
import com.group5_sprint2_cloud.pages.CalendarPage_Berna;
import com.group5_sprint2_cloud.utilities.ConfigurationReader;
import com.group5_sprint2_cloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.lang.module.Configuration;

public class US005_StepDef extends BasePage {

   // @Given("user is on the dashboard page")
   // public void user_is_on_the_dashboard_page() {


  //  }

    @When("user click to Calendar module")
    public void userClickToCalendarModule() {
        navigateToModule("Calendar");


    }


    CalendarPage_Berna calendarPage = new CalendarPage_Berna();

    @And("user click to the dropdown")
    public void userClickToTheDropdown() {
        calendarPage.dropdown.click();


    }

    @And("the user select Day option")
    public void theUserSelectDayOption() {

        calendarPage.selectOptionByIndex(1);
    }


    @Then("user should display daily calendar view")
    public void user_should_display_daily_calendar_view() {
// verify that the daily calendar view is displayed

// Get the current URL
        String currentUrl = Driver.getDriver().getCurrentUrl();

        // Define the expected URL  that indicates the daily calendar view
        String expectedUrl = "/timeGridDay";

        // Check if the current URL contains the expected URL fragment
        boolean isDailyCalendarViewDisplayed = currentUrl.contains(expectedUrl);

        // Assert that the daily calendar view is displayed
        Assert.assertTrue("Daily calendar view is not displayed", isDailyCalendarViewDisplayed);
    }


}



