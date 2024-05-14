package com.group5_sprint2_cloud.step_definitions;

import com.group5_sprint2_cloud.pages.LoginPage;

import io.cucumber.java.en.Given;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginStepDefs {

    private static final Logger log = LoggerFactory.getLogger(LoginStepDefs.class);



    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {

        if (userType.equalsIgnoreCase("User")) {
            new LoginPage().userLoginWithEnv();
        } else if (userType.equalsIgnoreCase("Employee")) {
            new LoginPage().employeeLoginWithEnv();
        }
    }



}






