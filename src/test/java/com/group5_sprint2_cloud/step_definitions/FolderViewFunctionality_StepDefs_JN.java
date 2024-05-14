package com.group5_sprint2_cloud.step_definitions;

import com.group5_sprint2_cloud.pages.FolderViewFunctionality_Page_JN;
import com.group5_sprint2_cloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class FolderViewFunctionality_StepDefs_JN  {

    FolderViewFunctionality_Page_JN folderViewFunctionalityPage = new FolderViewFunctionality_Page_JN();
    LoginStepDefs loginStepDefs = new LoginStepDefs();


    @Given("User is logged In")
    public void userIsLoggedIn(String userType) {
        loginStepDefs.the_user_logged_in_as(userType);
    }

    @Then("User is on the Files page")
    public void userIsOnTheFilesPage() {
        folderViewFunctionalityPage.filesIcon.click();
        String actualURL = "https://qa.symund.com/index.php/apps/files/";
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), actualURL);
    }

    @When("User changes the folder view order by Name")
    public void user_changes_the_folder_view_order_by_name() {

        folderViewFunctionalityPage.nameBtn.click();
    }

    @Then("User verifies options are displayed in alphabetical order")
    public void user_verifies_options_are_displayed_in_alphabetical_order() {
        boolean isAlphabetical = folderViewFunctionalityPage.verifyAlphabeticalOrder();
        Assert.assertTrue("Options are not displayed in alphabetical order",isAlphabetical);
    }

    @When("User changes the folder view order by Size")
    public void user_changes_the_folder_view_order_by_size() {
    folderViewFunctionalityPage.sizeBtn.click();
    }

    @Then("User verifies options are displayed in ascending order of size")
    public void user_verifies_options_are_displayed_in_ascending_order_of_size() {
    boolean isAscending = folderViewFunctionalityPage.verifyAscendingOrder();
    Assert.assertTrue("Options are not displayed in ascending order",isAscending);
    }


    @When("User changes the folder view order by Modified")
    public void user_changes_the_folder_view_order_by_modified() {
    folderViewFunctionalityPage.modifyBtn.click();
    }

    @Then("User verifies options are displayed in chronological order of modification")
    public void user_verifies_options_are_displayed_in_chronological_order_of_modification() {
    boolean isChronological = folderViewFunctionalityPage.verifyChronologicalOrder();
        Assert.assertTrue("Options are not displayed in chronological order", isChronological);
    }



    @Given("User selects all options using the Select All checkbox")
    public void user_selects_all_options_using_the_checkbox() {
    folderViewFunctionalityPage.selectAll.click();
    }

    @Then("User verifies total values of all options are displayed on the first line")
    public void user_verifies_total_values_of_all_options_are_displayed_on_the_first_line() {
    Assert.assertTrue(folderViewFunctionalityPage.columnVerificationTitle.isDisplayed());
    }



}
