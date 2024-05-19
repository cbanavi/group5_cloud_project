package com.group5_sprint2_cloud.step_definitions;

import com.group5_sprint2_cloud.pages.DeckPage;
import com.group5_sprint2_cloud.utilities.BrowserUtils;
import com.group5_sprint2_cloud.utilities.DeckUtilsPS;
import com.group5_sprint2_cloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;

public class DeckStepDefs {

    DeckPage deckPage = new DeckPage();

//@B33G5-191
    @Given("User is on the deck page")
    public void user_is_on_the_deck_page() {
        WebElement deckButton = DeckUtilsPS.findElementByTwoElements(deckPage.deckButtonSmall, deckPage.deckButtonBig);
        deckButton.click();
        BrowserUtils.waitFor(3);
    }
    @When("user should be able to click on AddBoard button")
    public void user_should_be_able_to_click_on_add_board_button() {
if(deckPage.closedMenuElement.isDisplayed()){
    deckPage.threeLineMenu.click();
    deckPage.addBoardButton.click();
    BrowserUtils.waitFor(3);
}else {
    deckPage.addBoardButton.click();
    BrowserUtils.waitFor(3);
}
    }
    @When("user should be able to enter the desired name there")
    public void user_should_be_able_to_enter_the_desired_name_there() {
        deckPage.boardNameBar.sendKeys("Group5" + Keys.ENTER);
        BrowserUtils.waitFor(3);
    }
    @Then("user should be able to see the newly created board under all Board tab")
    public void user_should_be_able_to_see_the_newly_created_board_under_all_board_tab() {
deckPage.boardVerification("Group5");
    }

    //@B33G5-192
    @When("user should be able to choose any board by clicking on the name")
    public void userShouldBeAbleToChooseAnyBoardByClickingOnTheName() {
        if(deckPage.closedMenuElement.isDisplayed()){
            deckPage.threeLineMenu.click();
            deckPage.addBoardButton.click();
            deckPage.chooseBoard("Group5");
            BrowserUtils.waitFor(3);
        }else {
            deckPage.addBoardButton.click();
            deckPage.chooseBoard("Group5");
            BrowserUtils.waitFor(3);
        }
    }

    @And("user should be able to click on the Add List button")
    public void userShouldBeAbleToClickOnTheAddListButton() {
        deckPage.addListButton.click();
        BrowserUtils.waitFor(3);
    }

    @And("user should be able to write their desired name and click enter or click on the arrow")
    public void userShouldBeAbleToWriteTheirDesiredNameAndClickEnterOrClickOnTheArrow() {
deckPage.listNameBar.sendKeys("bravo" + Keys.ENTER);
        BrowserUtils.waitFor(3);

    }

    @Then("user should be able to the new list under the chosen board name")
    public void userShouldBeAbleToTheNewListUnderTheChosenBoardName() {
        WebElement bravo = Driver.getDriver().findElement(By.xpath("//h3[contains(text(), 'bravo')]"));
        BrowserUtils.waitFor(3);
        Assert.assertTrue(bravo.isDisplayed());
    }



//@B33G5-193
    @When("user should be able to click on add card button")
    public void userShouldBeAbleToClickOnAddCardButton() {
        if(deckPage.closedMenuElement.isDisplayed()){
            deckPage.threeLineMenu.click();
            deckPage.chooseBoard("Group5");
            deckPage.addCardButton.click();

        }else {
            deckPage.chooseBoard("Group5");
            deckPage.addCardButton.click();
        }
    }

    @And("user should be able to add the new name and click on arrow or click on enter")
    public void userShouldBeAbleToAddTheNewNameAndClickOnArrowOrClickOnEnter() {
        deckPage.cardNameBar.sendKeys("charlie" + Keys.ENTER);
    }

    @Then("user should be able to see the card under the chosen list")
    public void userShouldBeAbleToSeeTheCardUnderTheChosenList() {
        BrowserUtils.waitFor(3);
        BrowserUtils.verifyElementDisplayed(By.xpath("//span[contains(text(), 'charlie')]"));
        BrowserUtils.waitFor(3);
    }

    @And("on the right side of the window")
    public void onTheRightSideOfTheWindow() {
       BrowserUtils.waitFor(3);
        BrowserUtils.verifyElementDisplayed(deckPage.cardVerificationAside);
        BrowserUtils.waitFor(3);
    }



    @When("user should be able to click on three dots menu")
    public void userShouldBeAbleToClickOnThreeDotsMenu() {
        BrowserUtils.waitFor(3);
        if(deckPage.closedMenuElement.isDisplayed()){
            deckPage.threeLineMenu.click();
            deckPage.chooseBoard("Group5");
            deckPage.threeDotsButtonCard.click();
            BrowserUtils.waitFor(3);

        }else {
            deckPage.chooseBoard("Group5");
            deckPage.threeDotsButtonCard.click();
            BrowserUtils.waitFor(3);
        }
    }

    @And("user should be able to click on assign to me")
    public void userShouldBeAbleToClickOnAssignToMe() {

        deckPage.assignToMeButton.click();
        BrowserUtils.waitFor(3);
    }

    @Then("user should be able to see their profile icon displayed beside three dots same as profile icon.")
    public void userShouldBeAbleToSeeTheirProfileIconDisplayedBesideThreeDotsSameAsProfileIcon() {
        BrowserUtils.waitFor(3);
        List<String> users = Arrays.asList("User4", "Employee4");
        deckPage.iconVerification(users);
        BrowserUtils.waitFor(3);

    }
}
