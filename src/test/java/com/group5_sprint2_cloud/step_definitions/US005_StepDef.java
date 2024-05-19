package com.group5_sprint2_cloud.step_definitions;

import com.group5_sprint2_cloud.pages.BasePage;
import com.group5_sprint2_cloud.pages.CalendarPage_Berna;
import com.group5_sprint2_cloud.pages.LoginPage;
import com.group5_sprint2_cloud.utilities.BrowserUtils;
import com.group5_sprint2_cloud.utilities.ConfigurationReader;
import com.group5_sprint2_cloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.checkerframework.checker.units.qual.A;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.lang.module.Configuration;

public class US005_StepDef extends BasePage {

    String eventName;
    Actions actions = new Actions(Driver.getDriver());
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


// Get the current URL
        String currentUrl = Driver.getDriver().getCurrentUrl();

        // Define the expected URL  that indicates the daily calendar view
        String expectedUrl = "/timeGridDay";

        // Check if the current URL contains the expected URL fragment
        boolean isDailyCalendarViewDisplayed = currentUrl.contains(expectedUrl);

        // Assert that the daily calendar view is displayed
        Assert.assertTrue("Daily calendar view is not displayed", isDailyCalendarViewDisplayed);
    }



    @When("user is on the Calendar page")
    public void userIsOnTheCalendarPage() {
        navigateToModule("Calendar");
    }

    @And("user clicks to the dropdown")
    public void userClicksToTheDropdown() {
        calendarPage.dropdown.click();

    }

    @And("user select to Week option")
    public void userSelectToWeekOption() {
        calendarPage.selectOptionByIndex(2);

    }

    @Then("user should display weekly calendar view")
    public void userShouldDisplayWeeklyCalendarView() {
        calendarPage.isDisplayedByText("Week");

    }

    @And("user select to Month option")
    public void userSelectToMonthOption() {
        calendarPage.selectOptionByIndex(3);
    }

    @Then("user should display monthly calendar view")
    public void userShouldDisplayMonthlyCalendarView() {

        String actualURL= Driver.getDriver().getCurrentUrl();
        String expectedURL = "GridMonth/";

        Assert.assertTrue(actualURL.contains(expectedURL));
    }

//    @Given("the user is logged in as {string}")
//    public void theUserIsLoggedInAs(String userType) {
//        if (userType.equalsIgnoreCase("User")) {
//            new LoginPage().userLoginWithEnv();
//        } else if (userType.equalsIgnoreCase("Employee")) {
//            new LoginPage().employeeLoginWithEnv();
//        }
//
//    }

    @When("the user is on the Calendar page")
    public void theUserIsOnTheCalendarPage() {
        navigateToModule("Calendar");
    }

    @And("the user creates a new event")
    public void theUserCreatesANewEvent() {
        calendarPage.newEventButton.click();

    }

    @And("the user enters the {string}")
    public void theUserEntersThe(String eventName) {
        this.eventName=eventName;
        BrowserUtils.sleep(5);
        calendarPage.enterEventTitle.sendKeys(eventName);
    }


    @And("the user selects the event start time")
    public void theUserSelectsTheEventStartTime() {
//        calendarPage.startDateAndTime.click();
//        BrowserUtils.waitFor(5);
//        calendarPage.startDate.click();

        actions.moveToElement(calendarPage.startBox).perform();
        actions.click(calendarPage.startBox).perform();




    }

    @And("And the user selects the event end time")
    public void andTheUserSelectsTheEventEndTime() {
//        calendarPage.endBox.click();
//        BrowserUtils.waitFor(5);
//        calendarPage.endDate.click();

        actions.moveToElement(calendarPage.endBox).perform();
        actions.click(calendarPage.endBox).perform();


    }

    @And("the user clicks the Save button")
    public void theUserClicksTheSaveButton() {
        calendarPage.saveButton.click();
    }

    @Then("user see the event on the related day through the Montly Calendar view")
    public void userSeeTheEventOnTheRelatedDayThroughTheMontlyCalendarView() {
        calendarPage.personalOption.click();

        BrowserUtils.waitFor(3);

      //  Assert.assertTrue(calendarPage.verifyEvent(eventName).isDisplayed());





    }


}



