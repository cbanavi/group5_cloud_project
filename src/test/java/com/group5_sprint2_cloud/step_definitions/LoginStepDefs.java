package com.group5_sprint2_cloud.step_definitions;

import com.group5_sprint2_cloud.pages.LoginPage;
import com.group5_sprint2_cloud.utilities.ConfigurationReader;
import com.group5_sprint2_cloud.utilities.Driver;
import io.cucumber.java.en.Given;
public class LoginStepDefs {
    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {

        if(userType.equalsIgnoreCase("User")){
            new LoginPage().userLoginWithEnv();
        }else if(userType.equalsIgnoreCase("Employee")){
            new LoginPage().employeeLoginWithEnv();
        }



    }

}






