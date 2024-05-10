package com.group5_sprint2_cloud.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Edit_EnterProfileSettingsFunctionality_StepDefs_EI {

    LoginStepDefs loginStepDefs = new LoginStepDefs();
    @Given("User is logged In")
    public void userIsLoggedIn(String userType) {
        loginStepDefs.the_user_logged_in_as(userType);

    }

    @When("User navigates to Profile Settings page")
    public void user_navigates_to_profile_settings_page() {

    }

    @Then("User should see Full name, Email, and Phone Number")
    public void user_should_see_full_name_email_and_phone_number() {

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
