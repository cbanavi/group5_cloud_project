package com.group5_sprint2_cloud.step_definitions;

import com.group5_sprint2_cloud.pages.NotesModuleFunctionality_Page_JN;
import com.group5_sprint2_cloud.utilities.BrowserUtils;
import com.group5_sprint2_cloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;


public class NotesModuleFunctionality_StepDefs_JN {
    Actions actions = new Actions(Driver.getDriver());
    LoginStepDefs loginStepDefs = new LoginStepDefs();
    NotesModuleFunctionality_Page_JN notesPage = new NotesModuleFunctionality_Page_JN();


    @Given("the user is logged in as {string}")
    public void the_user_is_logged_in_as(String userType) {
        loginStepDefs.the_user_logged_in_as(userType);
    }

    @Given("the user is on the Notes page")
    public void the_user_is_on_the_notes_page() {
        notesPage.notesBtn.click();
        String expectedUrl = "https://qa.symund.com/index.php/apps/notes/";
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), expectedUrl);
    }

    @When("the user creates a new note")
    public void the_user_creates_a_new_note() {
        notesPage.createNewNote.click();
        notesPage.textarea.sendKeys("Family" + Keys.ENTER);
        BrowserUtils.sleep(5);

    }

    @Then("the user verifies note successfully created")
    public void the_user_verifies_note_successfully_created() {
        String expectedText = "Family";
        Assert.assertEquals(expectedText, notesPage.lastNote.getAttribute("title"));
        BrowserUtils.sleep(5);
        actions.moveToElement(notesPage.trigger).perform();
        actions.click(notesPage.trigger).perform();
        actions.moveToElement(notesPage.deleteNote).perform();
        actions.click(notesPage.deleteNote).perform();
    }


    @When("the user adds the note to favorites")
    public void the_user_adds_the_note_to_favorites() {
        notesPage.createNewNote.click();
        notesPage.textarea.sendKeys("Big O" + Keys.ENTER);
        BrowserUtils.sleep(5);
        actions.moveToElement(notesPage.trigger).perform();
        actions.click(notesPage.trigger).perform();
        actions.moveToElement(notesPage.addToFavorites).perform();
        actions.click(notesPage.addToFavorites).perform();
        actions.moveByOffset(10, 10).perform();
    }

    @Then("the user verifies the note is added to the favorites")
    public void the_user_verifies_the_note_is_added_to_the_favorites() {

        actions.moveToElement(notesPage.triggerFavorites).perform();
        actions.click(notesPage.triggerFavorites).perform();
        BrowserUtils.sleep(5);
        actions.moveToElement(notesPage.removeFromFavorites).perform();
        //verification: if we are able to see remove from favorites then it's been added to favorites section
        Assert.assertTrue(notesPage.removeFromFavorites.isDisplayed());
        actions.click(notesPage.removeFromFavorites).perform();
        actions.moveToElement(notesPage.trigger).perform();
        actions.click(notesPage.trigger).perform();
        actions.moveToElement(notesPage.deleteNote).perform();
        actions.click(notesPage.deleteNote).perform();

    }


    @Given("the user is on the Note Details Section")
    public void the_user_is_on_the_Note_Details_Section() {
        actions.moveToElement(notesPage.detailActionBtn).perform();
        actions.click(notesPage.detailActionBtn).perform();
    }

    @When("the user clicks on the Details option")
    public void the_user_clicks_on_the_details_option() {
        actions.moveToElement(notesPage.getDetails).perform();
        actions.click(notesPage.getDetails).perform();
        BrowserUtils.sleep(5);

    }

    @Then("the user verifies the number of words and letters in the note")
    public void the_user_verifies_the_number_of_words_and_letters_in_the_note() {
        String expectedText = "1 word, 7 characters";
        String actualText = notesPage.detailsVerification.getText();
        Assert.assertEquals(expectedText, actualText);
    }


    @When("the user deletes the note")
    public void the_user_deletes_the_note() {
        actions.moveToElement(notesPage.trigger).perform();
        actions.click(notesPage.trigger).perform();
        actions.moveToElement(notesPage.deleteNote).perform();
        actions.click(notesPage.deleteNote).perform();

    }

    @Then("the note should be successfully deleted")
    public void the_note_should_be_successfully_deleted() {
        Assert.assertTrue(notesPage.deletionConfirmation.isDisplayed());
    }

    @Then("the user verifies successful deletion of the note")
    public void the_user_verifies_successful_deletion_of_the_note() {

    }

}
