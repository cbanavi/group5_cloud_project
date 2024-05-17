package com.group5_sprint2_cloud.step_definitions;

import com.group5_sprint2_cloud.pages.LoginPage;
import com.group5_sprint2_cloud.utilities.ConfigurationReader;
import com.group5_sprint2_cloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {
    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {
        //based on input enter that user information
        String username = null;
        String password = null;

        if (userType.equalsIgnoreCase("User")) {
            username = ConfigurationReader.getProperty("general_username");
            password = ConfigurationReader.getProperty("password");
        } else if (userType.equalsIgnoreCase("Employee")) {
            username = ConfigurationReader.getProperty("general_employee_username");
            password = ConfigurationReader.getProperty("employee_password");
        }

        new LoginPage().login(username, password);

    }


}






