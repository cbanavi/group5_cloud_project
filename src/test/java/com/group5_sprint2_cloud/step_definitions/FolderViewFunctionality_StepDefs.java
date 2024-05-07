package com.group5_sprint2_cloud.step_definitions;

import com.group5_sprint2_cloud.pages.FolderViewFunctionality_Page;
import com.group5_sprint2_cloud.pages.LoginPage;
import com.group5_sprint2_cloud.utilities.BrowserUtils;
import com.group5_sprint2_cloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.net.URL;

public class FolderViewFunctionality_StepDefs {

    FolderViewFunctionality_Page folderViewFunctionalityPage = new FolderViewFunctionality_Page();
    LoginStepDefs loginStepDefs = new LoginStepDefs();


    @Given("User is logged In")
    public void userIsLoggedIn() {
        loginStepDefs.the_user_logged_in_with_username_as_and_password_as("User5", "Userpass123");
        BrowserUtils.sleep(5);
    }

    @Then("User is on the Files page")
    public void userIsOnTheFilesPage() {
        String actualURL = "https://qa.symund.com/index.php/apps/files/?dir=/&fileid=59687";
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), actualURL);
    }

    @When("User changes the folder view order by Name")
    public void user_changes_the_folder_view_order_by_name() {

    }

    @Then("User verifies options are displayed in alphabetical order")
    public void user_verifies_options_are_displayed_in_alphabetical_order() {

    }

    @When("User changes the folder view order by Size")
    public void user_changes_the_folder_view_order_by_size() {

    }

    @Then("User verifies options are displayed in ascending order of size")
    public void user_verifies_options_are_displayed_in_ascending_order_of_size() {

    }


    @When("User changes the folder view order by Modified")
    public void user_changes_the_folder_view_order_by_modified() {

    }
    @Then("User verifies options are displayed in chronological order of modification")
    public void user_verifies_options_are_displayed_in_chronological_order_of_modification() {

    }


    @Given("User is viewing all created options with multiple folder or files")
    public void user_is_viewing_all_created_options_with_multiple_folder_or_files() {

    }

    @When("User selects all options using the {string} checkbox")
    public void user_selects_all_options_using_the_checkbox(String string) {

    }

    @Then("User verifies total values of all options are displayed on the first line")
    public void user_verifies_total_values_of_all_options_are_displayed_on_the_first_line() {

    }


}
