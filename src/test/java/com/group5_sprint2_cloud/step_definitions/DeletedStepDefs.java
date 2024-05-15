package com.group5_sprint2_cloud.step_definitions;

import com.group5_sprint2_cloud.pages.DeletedPage;
import com.group5_sprint2_cloud.utilities.BrowserUtils;
import com.group5_sprint2_cloud.utilities.DeletedUtilsPS;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeletedStepDefs {
DeletedPage deletedPage=new DeletedPage();

    @Given("user is on the Deleted File Tab")
    public void user_is_on_the_deleted_file_tab() {
        deletedPage.filesButton.click();
        deletedPage.deletedFilesButton.click();
        BrowserUtils.waitFor(2);
    }
    @When("user chooses to order deleted files by time")
    public void user_chooses_to_order_deleted_files_by_time() {

    }
    @Then("user can order the all deleted files by newest to oldest or vice versa")
    public void user_can_order_the_all_deleted_files_by_newest_to_oldest_or_vice_versa() {
        deletedPage.orderVerification();
    }


    @When("user should be able  to select the Delete permanently")
    public void userShouldBeAbleToSelectTheDeletePermanently() {
        deletedPage.deleteFilesPermanently("test1");
    }

    @Then("the permanently deleted file should be removed from the trash list")
    public void thePermanentlyDeletedFileShouldBeRemovedFromTheTrashList() {
        DeletedUtilsPS.deletedfileVerificationForDeletedPage("test1");
    }


    @When("user should be able to select the Restore")
    public void userShouldBeAbleToSelectTheRestore() {
deletedPage.restoreFiles("test2");
    }


    @Then("User can see it again under the All Files tab")
    public void userCanSeeItAgainUnderTheAllFilesTab() {
        deletedPage.filesButton.click();
        BrowserUtils.waitFor(3);
        DeletedUtilsPS.restoredfileVerificationForfilesPage("test2");
    }
}
