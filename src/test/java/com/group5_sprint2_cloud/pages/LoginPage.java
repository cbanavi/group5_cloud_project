package com.group5_sprint2_cloud.pages;


import com.group5_sprint2_cloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "user")

    public WebElement userName;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(id = "submit-form")
    public WebElement submit;

    public void login(String username, String password) {
        userName.sendKeys(username);
        passwordInput.sendKeys(password);
        submit.click();

    }
 /*
     public void loginNoProperties(String username, String password) {
     userName.sendKeys(username);
     passwordInput.sendKeys(password);
     submit.click();
     }

     //If you're logging in with User username, it will come to this method and pull the "USER_USERNAME" from your system

     public void userLoginWithEnv() {
     String usernameEnv = System.getenv("USER_USERNAME");
     String passwordEnv = System.getenv("USER_PASSWORD");

     loginNoProperties(usernameEnv, passwordEnv);

     }

     //If you're logging in with Employee username, it will come to this method and pull the "EMPLOYEE_USERNAME" from your system

     public void employeeLoginWithEnv() {
     String usernameEnv = System.getenv("EMPLOYEE_USERNAME");
     String passwordEnv = System.getenv("EMPLOYEE_PASSWORD");

     loginNoProperties(usernameEnv, passwordEnv);

     }
*/

  
}