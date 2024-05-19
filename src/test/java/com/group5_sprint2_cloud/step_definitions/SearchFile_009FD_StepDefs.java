package com.group5_sprint2_cloud.step_definitions;

import com.group5_sprint2_cloud.pages.BasePage;
import com.group5_sprint2_cloud.pages.SearchFilePage_FD;
import com.group5_sprint2_cloud.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class SearchFile_009FD_StepDefs extends BasePage {

    SearchFilePage_FD searchFilePage = new SearchFilePage_FD();

    @When("the user clicks the search button")
    public void searchButton() {
        searchFilePage.searchButton.click();

    }

    @When("the user enters {string} into the search box")
    public void typingIntoTheSearchBar(String string) {
        searchFilePage.searchInput.sendKeys("notes" + Keys.ENTER);
        BrowserUtils.waitForPageToLoad(3);

    }

    @Then("the user should see a list of files matching the search query")
    public void listOfFiles() {
        BrowserUtils.waitFor(3);
        searchFilePage.searchResults.isDisplayed();

    }

    @Then("the user should click on the {string}")
    public void click_on_the(String fileName) {
        searchFilePage.notes.click();
        BrowserUtils.waitForPageToLoad(3);

    }

    @Then("the user should see a side page displaying details of the file")
    public void sidePage_displaying_details_of_the_file() {

        searchFilePage.SidebarTabs.isDisplayed();
    }

    @When("the user clicks on {string}")
    public void clickOn(String string) {
        searchFilePage.Talk.click();

    }

    @When("the user clicks on the app icon at the top left corner of the page")
    public void clickOnTheAppIcon() {
        searchFilePage.appIcon.click();

    }

    @Then("the user should be landed on the Dashboard page")
    public void dashboardPage() {

        Assert.assertTrue(searchFilePage.Dashboard.isDisplayed());

    }

}



