package com.group5_sprint2_cloud.step_definitions;

import com.group5_sprint2_cloud.pages.BasePage;
import com.group5_sprint2_cloud.pages.LoginPage;
import com.group5_sprint2_cloud.pages.addToFavoritesRenameCommentPage_Alex;
import com.group5_sprint2_cloud.utilities.BrowserUtils;
import com.group5_sprint2_cloud.utilities.Driver;
import dev.failsafe.internal.util.DelegatingScheduler;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.asm.Advice;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class FavoriteRenameCommentFunctionality_StepDef extends BasePage {
    addToFavoritesRenameCommentPage_Alex addToFavoritesRenameCommentPageAlex
            = new addToFavoritesRenameCommentPage_Alex();
    LoginPage loginPage = new LoginPage();
    Actions actions = new Actions(Driver.getDriver());


    @Given("user logged in as {string}")
    public void user_loged_in_as(String user) {
        loginPage.login("User14", "Userpass123");
    }

    @When("user navigates to Files")
    public void userNavigatesToFiles() {
        navigateToModule("Files");
    }

    @And("user sellects random file and clicks on three dots menu")
    public void userSellectsRandomFileAndClicksOnThreeDotsMenu() {
        Random rand = new Random();
        int randomIndex = rand.nextInt(addToFavoritesRenameCommentPageAlex.threeDotsMenu.size());
        WebElement randomFile = addToFavoritesRenameCommentPageAlex.threeDotsMenu.get(randomIndex);
        BrowserUtils.sleep(3);
        randomFile.click();

    }


    @Then("user is adding file to favorites and verifies it")
    public void userIsAddingFileToFavoritesAndVerifiesIt() {
        BrowserUtils.sleep(3);
        String actualText = "Remove from favorites";
        if (!addToFavoritesRenameCommentPageAlex.addToFavotites.getText().equals(actualText)) {
            addToFavoritesRenameCommentPageAlex.addToFavotites.click();
            Assert.assertTrue(addToFavoritesRenameCommentPageAlex.isStarred.isDisplayed());
        }else {
            Assert.assertTrue(addToFavoritesRenameCommentPageAlex.isStarred.isDisplayed());
        }

        }

        @And("user renames existing menues")
        public void userRenamesExistingMenues () {
        Random rand = new Random();
            int randomIndex = rand.nextInt(addToFavoritesRenameCommentPageAlex.threeDotsMenu.size());
            WebElement randomFile = addToFavoritesRenameCommentPageAlex.threeDotsMenu.get(randomIndex);
            BrowserUtils.sleep(3);
            randomFile.click();

        }
    @And("user click Rename")
    public void userClickRename() {
        addToFavoritesRenameCommentPageAlex.rename.click();
        addToFavoritesRenameCommentPageAlex.rename.clear();
        addToFavoritesRenameCommentPageAlex.rename.sendKeys("new name" + Keys.ENTER);
        Actions.moveToElement( element ).perform;
                [8:12 PM]
        Then actions.click(element).perform;


    }


    @And("user clicks Details then Commend")
    public void userClicksDetailsThenCommend() {
        addToFavoritesRenameCommentPageAlex.details.click();
        BrowserUtils.sleep(3);
        addToFavoritesRenameCommentPageAlex.comments.click();

    }

    @Then("user adds his comment and verifies its displayed")
    public void userAddsHisCommentAndVerifiesItsDisplayed() {
        BrowserUtils.sleep(3);
        String newComment = "new comment to be aded";
        addToFavoritesRenameCommentPageAlex.commentInput.sendKeys(newComment);
        addToFavoritesRenameCommentPageAlex.commentSubmit.click();
        BrowserUtils.sleep(3);
        Assert.assertTrue(addToFavoritesRenameCommentPageAlex.commentMessage.isDisplayed());

    }





}



