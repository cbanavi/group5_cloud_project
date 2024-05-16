package com.group5_sprint2_cloud.step_definitions;

import com.group5_sprint2_cloud.pages.TalkPage;
import com.group5_sprint2_cloud.utilities.BrowserUtils;
import com.group5_sprint2_cloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import java.util.Arrays;

public class TalkStepDefs {

    TalkPage talkPage = new TalkPage();


    @Given("user is on the Talk page")
    public void userIsOnTheTalkPage() {
talkPage.talkButton.click();
    }
    @When("user should be able to add new participant")
    public void user_should_be_able_to_add_new_participant() {
    }
    @When("user should be able to create new conversation")
    public void user_should_be_able_to_create_new_conversation() {
        talkPage.createConversation("BravoG5", Arrays.asList("user99"));
    }
    @Then("user should be able to see the newly created conversation in the list")
    public void user_should_be_able_to_see_the_newly_created_conversation_in_the_list() {
talkPage.groupVerification("BravoG5");
    }




    @When("user should be able to delete a converstaion by clicking on three dot menu")
    public void userShouldBeAbleToDeleteAConverstaionByClickingOnThreeDotMenu() {
talkPage.threeDotMenu.click();
BrowserUtils.waitFor(2);
talkPage.deleteConversation.click();
talkPage.yesButton.click();
BrowserUtils.waitFor(3);
        Driver.getDriver().navigate().refresh();
    }

    @Then("user should not be able to see the conversation in the list")
    public void userShouldNotBeAbleToSeeTheConversationInTheList() {
        Driver.getDriver().navigate().refresh();
        BrowserUtils.waitFor(5);
        BrowserUtils.verifyElementNotDisplayed(By.xpath("//*[contains(text(), 'BravoG5')]"));
    }
}
