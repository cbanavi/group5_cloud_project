package com.group5_sprint2_cloud.step_definitions;

import com.group5_sprint2_cloud.pages.LoginPage;
import com.group5_sprint2_cloud.utilities.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
public class LoginStepDefs {


    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("Login to app in Before method");
    }

    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {
        //based on input enter that user information
        String username = null;
        String password = null;

        if(userType.equalsIgnoreCase("User")){
            username = ConfigurationReader.getProperty("usernameVC");
            password = ConfigurationReader.getProperty("password");
        }else if(userType.equalsIgnoreCase("Employee")){
            username = ConfigurationReader.getProperty("employeeVC");
            password = ConfigurationReader.getProperty("employee_password");
        }
        new LoginPage().login(username,password);
    }

    @Given("the user logged in with username as {string} and password as {string}")
    public void the_user_logged_in_with_username_as_and_password_as(String username, String password) {
      LoginPage loginPage=new LoginPage();
      loginPage.login(username,password);
    }



}
