package com.group5_sprint2_cloud.step_definitions;

import com.group5_sprint2_cloud.pages.BasePage;
import com.group5_sprint2_cloud.pages.LoginPage;
import com.group5_sprint2_cloud.pages.AddToFavoritesRenameCommentPage_Alex;
import com.group5_sprint2_cloud.utilities.BrowserUtils;
import com.group5_sprint2_cloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Random;

public class FavoriteRenameCommentFunctionality_StepDef extends BasePage {
    AddToFavoritesRenameCommentPage_Alex AddToFavoritesRenameCommentPageAlex
            = new AddToFavoritesRenameCommentPage_Alex();

    @When("user navigates to Files")
    public void userNavigatesToFiles() {
        navigateToModule("Files");
    }

    @And("user sellects random file and clicks on three dots menu")
    public void userSellectsRandomFileAndClicksOnThreeDotsMenu() {
        Random rand = new Random();
        int randomIndex = rand.nextInt(AddToFavoritesRenameCommentPageAlex.threeDotsMenu.size());
        WebElement randomFile = AddToFavoritesRenameCommentPageAlex.threeDotsMenu.get(randomIndex);
        randomFile.click();

    }

    @Then("user is adding file to favorites and verifies it")
    public void userIsAddingFileToFavoritesAndVerifiesIt() {
        String actualText = "Remove from favorites";
        if (!AddToFavoritesRenameCommentPageAlex.addToFavotites.getText().equals(actualText)) {
            AddToFavoritesRenameCommentPageAlex.addToFavotites.click();
        } else {
            Assert.assertTrue(AddToFavoritesRenameCommentPageAlex.isStarred.isDisplayed());
        }
    }

    @And("user clicks on three dots menu of first file")
    public void userClicksOnThreeDotsMenuOfFirstFile() {
        AddToFavoritesRenameCommentPageAlex.firstFileThreeDotsMenu.click();
    }

    @And("user click Rename")
    public void userClickRename() {
        AddToFavoritesRenameCommentPageAlex.rename.click();
        new Actions(Driver.getDriver()).sendKeys("new name" + Keys.ENTER).perform();
    }

    @Then("user verifys folders name")
    public void userVerifysFoldersName() {
        Assert.assertEquals("new name", AddToFavoritesRenameCommentPageAlex.firstFile.getText());
    }


    @And("user clicks Details then Commend")
    public void userClicksDetailsThenCommend() {
        AddToFavoritesRenameCommentPageAlex.details.click();
        AddToFavoritesRenameCommentPageAlex.comments.click();

    }

    @Then("user adds his comment and verifies its displayed")
    public void userAddsHisCommentAndVerifiesItsDisplayed() {
        String newComment = "new comment to be aded";
        AddToFavoritesRenameCommentPageAlex.commentInput.sendKeys(newComment);
        AddToFavoritesRenameCommentPageAlex.commentSubmit.click();
        Assert.assertTrue(AddToFavoritesRenameCommentPageAlex.commentMessage.isDisplayed());

    }

}




