package com.group5_sprint2_cloud.step_definitions;

import com.group5_sprint2_cloud.pages.ProfileSettingsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ProfileStepDefs {

    ProfileSettingsPage profileSettingsPage = new ProfileSettingsPage();
    String userProperEmail = "admin@example.com";

    @When("user click to the menu button")
    public void user_click_to_the_avatar() {
        // Write code here that turns the phrase above into concrete actions
        profileSettingsPage.buttonExpandMenu.click();
    }

    @When("user click to the Settings")
    public void user_click_to_the_settings() {
        // Write code here that turns the phrase above into concrete actions
        profileSettingsPage.linkSettings.click();
    }

    @Then("user should see the same name and username")
    public void user_should_see_the_same_name_and_username() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(profileSettingsPage.userFullName.getAttribute("value"), profileSettingsPage.userName.getAttribute("title"));
    }

    @When("the user is on the Settings page")
    public void the_user_is_on_the_settings_page() {
        // Write code here that turns the phrase above into concrete actions
        profileSettingsPage.goToProfileSettingPage();

    }

    @When("the user enters a proper email address to email input box")
    public void the_user_enters_a_proper_email_address_to_email_input_box() {
        // Write code here that turns the phrase above into concrete actions
        profileSettingsPage.inputEmailField.clear();
        profileSettingsPage.inputEmailField.sendKeys(userProperEmail);
    }

    @Then("the email field should display user's proper address")
    public void the_email_field_should_display_user_s_proper_address() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(profileSettingsPage.inputEmailField.getAttribute("value"), userProperEmail);
    }

    @And("the user selects a language {string}")
    public void the_user_selects_a_language(String string) {
        // Write code here that turns the phrase above into concrete actions
        profileSettingsPage.selectLanguageByValue(string);
        Assert.assertEquals(profileSettingsPage.getSelectedLanguageValue(), string);
    }

    @Then("the language field should display {string}")
    public void the_language_field_should_display(String string) {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(profileSettingsPage.getSelectedLanguageText(), string);
    }
}
