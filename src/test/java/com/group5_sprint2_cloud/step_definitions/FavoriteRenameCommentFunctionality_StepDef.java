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

public class FavoriteRenameCommentFunctionality_StepDef extends BasePage {
    addToFavoritesRenameCommentPage_Alex addToFavoritesRenameCommentPageAlex
            = new addToFavoritesRenameCommentPage_Alex();
    LoginPage loginPage = new LoginPage();
    Actions actions = new Actions(Driver.getDriver());


    @Given("user loged in as {string}")
    public void user_loged_in_as(String user) {
        loginPage.login("User14", "Userpass123");
    }

    @And("user navigates to Files")
    public void userNavigatesToFiles() {
        navigateToModule("Files");
    }

    @Then("user is adding all the files to favorites and verifies it")
    public void userIsAddingAllTheFilesToFavoritesAndVerifiesIt() {
        for (WebElement eachFile : addToFavoritesRenameCommentPageAlex.filesToBeAddedToFav) {
            if (eachFile.isDisplayed()) {
                BrowserUtils.sleep(3);
                for (WebElement each : addToFavoritesRenameCommentPageAlex.threeDotsMenu) {
                    each.click();
                    BrowserUtils.sleep(3);
                    addToFavoritesRenameCommentPageAlex.addToFavotites.click();


                }

            } else {
                return;
            }
Assert.assertTrue(eachFile.);
        }
    }

    @And("user renames existing menues")
    public void userRenamesExistingMenues() {
        //addToFavoritesRenameCommentPageAlex.renameInput.sendKeys("new name" + Keys.ENTER);
        for (WebElement each : addToFavoritesRenameCommentPageAlex.threeDotsMenu) {
            each.click();
            for (WebElement each1 : addToFavoritesRenameCommentPageAlex.renameInput) {
                each1.sendKeys("new name" + Keys.ENTER);
            }
        }


    }

}



