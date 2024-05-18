package com.group5_sprint2_cloud.step_definitions;

import com.group5_sprint2_cloud.pages.ProfileSettingsPage;
import com.group5_sprint2_cloud.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ProfileStepDefs {

    ProfileSettingsPage profileSettingsPage = new ProfileSettingsPage();
    String userProperEmail = "admin@example.com";

    @When("user click to the menu button")
    public void user_click_to_the_avatar() {
        profileSettingsPage.buttonExpandMenu.click();
    }

    @When("user click to the Settings")
    public void user_click_to_the_settings() {
        profileSettingsPage.linkSettings.click();
    }

    @Then("user should see the same name and username")
    public void user_should_see_the_same_name_and_username() {
        Assert.assertEquals(profileSettingsPage.userFullName.getAttribute("value"), profileSettingsPage.userName.getAttribute("title"));
    }

    @When("the user is on the Settings page")
    public void the_user_is_on_the_settings_page() {
        profileSettingsPage.goToProfileSettingPage();

    }

    @When("the user enters a proper email address to email input box")
    public void the_user_enters_a_proper_email_address_to_email_input_box() {
        profileSettingsPage.inputEmailField.clear();
        profileSettingsPage.inputEmailField.sendKeys(userProperEmail);
    }

    @Then("the email field should display user's proper address")
    public void the_email_field_should_display_user_s_proper_address() {
        Assert.assertEquals(profileSettingsPage.inputEmailField.getAttribute("value"), userProperEmail);
    }

    @And("the user selects a language {string}")
    public void the_user_selects_a_language(String string) {
        profileSettingsPage.selectLanguageByValue(string);
        Assert.assertEquals(profileSettingsPage.getSelectedLanguageValue(), string);
    }

    @Then("the language field should display {string}")
    public void the_language_field_should_display(String string) {
        Assert.assertEquals(profileSettingsPage.getSelectedLanguageText(), string);
    }

    @Then("the user should see titles: {string}, {string}, {string}")
    public void the_user_should_see_titles(String string, String string2, String string3) {
        // "Full name", "Email", "Phone Number"
        Assert.assertEquals(string, profileSettingsPage.getFullNameLabelText());
        Assert.assertEquals(string2, profileSettingsPage.getEmailLabelText());
        Assert.assertEquals(string3, profileSettingsPage.getPhoneNumberLabelText());
    }

    @When("the user enters {string} into the Phone Number input field")
    public void i_enter_into_the_input_field(String string) {
        // the user enters "abc123" into the "Phone Number" input field
        profileSettingsPage.inputPhoneField.clear();
        profileSettingsPage.inputPhoneField.sendKeys(string);
        BrowserUtils.sleep(1);
    }

    @Then("the input should be rejected")
    public void the_input_should_be_rejected() {
        Assert.assertNotNull(profileSettingsPage.inputPhoneField.getAttribute("value"));
    }
}
