package com.group5_sprint2_cloud.step_definitions;

import com.group5_sprint2_cloud.pages.BasePage;
import com.group5_sprint2_cloud.pages.SymundActivityPage_CB;
import com.group5_sprint2_cloud.utilities.BrowserUtils;
import com.group5_sprint2_cloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ActivityStepDefs_CB extends BasePage {

    SymundActivityPage_CB symundActivityPageCb = new SymundActivityPage_CB();

    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    @When("User clicks Activity module")
    public void user_clicks_activity_module() {
        navigateToModule("Activity");
    }

    @Then("User should see all listed activities under Activity module")
    public void userShouldSeeAllListedActivitiesUnderActivityModule(List<String> expectedActivities) {

        BrowserUtils.waitForTitleContains("Activity - Symund - QA");

        List<String> actualActivities = new ArrayList<>();

        for (WebElement eachActivityDropdown : symundActivityPageCb.allActivities) {
            if (!eachActivityDropdown.getText().equals("All activities")) {
                actualActivities.add(eachActivityDropdown.getText());
            }
        }


        Assert.assertEquals(expectedActivities, actualActivities);

    }

    @Then("User should see all items list ordered by newest to oldest")
    public void userShouldSeeAllItemsListOrderedByNewestToOldest() {

        List<String> actualActivityTimes = new ArrayList<>();

        for (WebElement eachActivity : symundActivityPageCb.descendingActivities) {
            actualActivityTimes.add(eachActivity.getAttribute("data-timestamp"));
        }

        List<String> expectedActivityTimes = new ArrayList<>(actualActivityTimes);

        actualActivityTimes.sort(Collections.reverseOrder());


        Assert.assertEquals(actualActivityTimes, expectedActivityTimes);


    }

    @Then("User should see {string} at the bottom of page")
    public void userShouldSeeAtTheBottomOfPage(String expectedMessage) {

        while (!symundActivityPageCb.messageAtBottomOfPage.isDisplayed()){
            new Actions(Driver.getDriver()).sendKeys(Keys.PAGE_DOWN).perform();
        }

        Assert.assertEquals(expectedMessage, symundActivityPageCb.messageAtBottomOfPage.getText());

    }
}