package com.group5_sprint2_cloud.step_definitions;

import com.group5_sprint2_cloud.pages.BasePage;
import com.group5_sprint2_cloud.pages.Edit_EnterProfileSettingsFunctionality_Page_EI;
import com.group5_sprint2_cloud.utilities.BrowserUtils;
import com.group5_sprint2_cloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


import java.util.List;

public class Edit_EnterProfileSettingsFunctionality_StepDefs_EI extends BasePage {

    Edit_EnterProfileSettingsFunctionality_Page_EI profileSettingsFunctionalityPageEi
            = new Edit_EnterProfileSettingsFunctionality_Page_EI();

    LoginStepDefs loginStepDefs = new LoginStepDefs();

    @Given("User is logged In")
    public void userIsLoggedIn(String userType) {
        loginStepDefs.the_user_logged_in_as(userType);
        BrowserUtils.sleep(5);
    }

    @When("User navigates to Profile Settings page")
    public void user_navigates_to_profile_settings_page() {
        profileSettingsFunctionalityPageEi.userProfileBtn.click();
        profileSettingsFunctionalityPageEi.profileSettingsBtn.click();
        String actualURL = "https://qa.symund.com/index.php/settings/user";
        Assert.assertEquals(actualURL, Driver.getDriver().getCurrentUrl());
    }


    @Then("User should see Full name, Email, and Phone Number")
    public void user_should_see_full_name_email_and_phone_number(List<String> expectedLists) {
        BrowserUtils.waitForTitleContains("Settings - Symund - QA");
        BrowserUtils.verifyElementDisplayed(profileSettingsFunctionalityPageEi.fullName);
        BrowserUtils.verifyElementDisplayed(profileSettingsFunctionalityPageEi.email);
        BrowserUtils.verifyElementDisplayed(profileSettingsFunctionalityPageEi.phoneNumber);
    }

    @When("Name in Settings field should match Full Name input box for {string}")
    public void name_in_settings_field_should_match_full_name_input_box_for(String userType) {
        profileSettingsFunctionalityPageEi.userProfileBtn.click();

        String expectedName = getUserExpectedName(userType);
        WebElement actualElement = userType.equals("user") ? profileSettingsFunctionalityPageEi.userName
                : profileSettingsFunctionalityPageEi.employeeName;

        BrowserUtils.waitFor(5);
        String actualName = actualElement.getAttribute("title");

        Assert.assertEquals("Expected and actual names do not match", expectedName, actualName);
    }

    private String getUserExpectedName(String userType) {
        if ("user".equals(userType)) {
            return "User200";
        } else if ("employee".equals(userType)) {
            return "Employee200";
        } else {
            throw new IllegalArgumentException("Unsupported user type: " + userType);
        }
    }

    @When("User enters phone number into Phone Number input box")
    public void user_enters_numbers_into_phone_number_input_box() {
        profileSettingsFunctionalityPageEi.phoneNumberInputBox.click();
        BrowserUtils.sleep(3);
        profileSettingsFunctionalityPageEi.phoneNumberInputBox.clear();
        String phoneNumber = "15634526512";

        profileSettingsFunctionalityPageEi.phoneNumberInputBox.sendKeys(phoneNumber+ Keys.ENTER);
        BrowserUtils.sleep(5);
    }

    @Then("User should only be able to enter numbers not characters")
    public void user_should_not_be_able_to_enter_characters() {

        Assert.assertTrue(profileSettingsFunctionalityPageEi.popUpMessage.getText().contains("Unable to set invalid phone number"));

    }
}