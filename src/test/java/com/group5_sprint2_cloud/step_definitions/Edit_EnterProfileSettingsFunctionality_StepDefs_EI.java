package com.group5_sprint2_cloud.step_definitions;

import com.group5_sprint2_cloud.pages.Edit_EnterProfileSettingsFunctionality_Page_EI;
import com.group5_sprint2_cloud.utilities.BrowserUtils;
import com.group5_sprint2_cloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Edit_EnterProfileSettingsFunctionality_StepDefs_EI
        extends Edit_EnterProfileSettingsFunctionality_Page_EI{

    Edit_EnterProfileSettingsFunctionality_Page_EI editEnterProfileSettingsFunctionalityPageEi
            = new Edit_EnterProfileSettingsFunctionality_Page_EI();

    LoginStepDefs loginStepDefs = new LoginStepDefs();
    @Given("User is logged In")
    public void userIsLoggedIn(String userType) {
        loginStepDefs.the_user_logged_in_as(userType);
        BrowserUtils.sleep(5);
    }

@When("User navigates to Profile Settings page")
public void user_navigates_to_profile_settings_page() {
    String actualURL = "https://qa.symund.com/index.php/settings/user";
    Assert.assertEquals(actualURL, Driver.getDriver().getCurrentUrl());
}



    @Then("User should see Full name, Email, and Phone Number")
    public void user_should_see_full_name_email_and_phone_number() {
//        Assert.assertTrue("Full name is not displayed", editEnterProfileSettingsFunctionalityPageEi.isFullNameDisplayed());
//        Assert.assertTrue("Email is not displayed", editEnterProfileSettingsFunctionalityPageEi.isEmailDisplayed());
//        Assert.assertTrue("Phone number is not displayed", editEnterProfileSettingsFunctionalityPageEi.isPhoneNumberDisplayed());

    Edit_EnterProfileSettingsFunctionality_Page_EI page = new Edit_EnterProfileSettingsFunctionality_Page_EI();
    BrowserUtils.verifyElementDisplayed(page.fullName);
    BrowserUtils.verifyElementDisplayed(page.email);
    BrowserUtils.verifyElementDisplayed(page.phoneNumber);

//        BrowserUtils.verifyElementDisplayed(Edit_EnterProfileSettingsFunctionality_Page_EI.fullName);
//        BrowserUtils.verifyElementDisplayed(Edit_EnterProfileSettingsFunctionality_Page_EI.email);
//        BrowserUtils.verifyElementDisplayed(Edit_EnterProfileSettingsFunctionality_Page_EI.phoneNumber);

    }

    @Then("Name in Settings field should match Full Name input box")
    public void name_in_settings_field_should_match_full_name_input_box() {

    }

    @When("User enters characters into Phone Number input box")
    public void user_enters_characters_into_phone_number_input_box() {

    }

    @Then("User should not be able to enter characters")
    public void user_should_not_be_able_to_enter_characters() {

    }
}
