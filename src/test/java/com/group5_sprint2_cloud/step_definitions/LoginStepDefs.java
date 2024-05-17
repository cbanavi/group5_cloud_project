package com.group5_sprint2_cloud.step_definitions;

import com.group5_sprint2_cloud.pages.LoginPage;

import com.group5_sprint2_cloud.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginStepDefs {

    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {


/*
           This is for general login

*/
            String username = null;
            String password = null;

        if(userType.equalsIgnoreCase("User")){
            username = ConfigurationReader.getProperty("general_username");
            password = ConfigurationReader.getProperty("password");
        }else if(userType.equalsIgnoreCase("Employee")){
            username = ConfigurationReader.getProperty("general_employee_username");
            password = ConfigurationReader.getProperty("employee_password");
        }
        new LoginPage().login(username,password);


        //This is for System login
        if(userType.equalsIgnoreCase("User")){
            new LoginPage().userLoginWithEnv();
        }else if(userType.equalsIgnoreCase("Employee")){
            new LoginPage().employeeLoginWithEnv();
        }


    }

}