package com.group5_sprint2_cloud.step_definitions;

import com.group5_sprint2_cloud.pages.BasePage;
import com.group5_sprint2_cloud.pages.SymundActivityPage_CB;
import com.group5_sprint2_cloud.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ActivityStepDefs_CB extends BasePage {

    SymundActivityPage_CB symundActivityPageCb = new SymundActivityPage_CB();

    @When("User clicks Activity module")
    public void user_clicks_activity_module() {
        navigateToModule("Calendar");

    }

    @Then("User should see all listed activities under Activity module")
    public void userShouldSeeAllListedActivitiesUnderActivityModule(List<String> expectedActivities) {

        BrowserUtils.waitForTitleContains("Activity - Symund - QA");


    }

    @Then("User should see all items list ordered by newest to oldest")
    public void userShouldSeeAllItemsListOrderedByNewestToOldest() {
    }

    @Then("User should see {string} at the bottom of page")
    public void userShouldSeeAtTheBottomOfPage(String arg0) {
    }
}
