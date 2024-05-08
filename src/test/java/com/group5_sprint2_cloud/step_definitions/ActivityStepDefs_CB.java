package com.group5_sprint2_cloud.step_definitions;

import com.group5_sprint2_cloud.pages.BasePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ActivityStepDefs_CB extends BasePage {

    @When("User clicks Activity module")
    public void user_clicks_activity_module() {
        navigateToModule("Activity");
    }

    @Then("User should see all listed activities under Activity module")
    public void userShouldSeeAllListedActivitiesUnderActivityModule() {
    }

    @Then("User should see all items list ordered by newest to oldest")
    public void userShouldSeeAllItemsListOrderedByNewestToOldest() {
    }

    @Then("User should see {string} at the bottom of page")
    public void userShouldSeeAtTheBottomOfPage(String arg0) {
    }
}
