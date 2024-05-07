package com.group5_sprint2_cloud.pages;


import com.group5_sprint2_cloud.utilities.BrowserUtils;
import com.group5_sprint2_cloud.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="user")
    public WebElement userName;

    @FindBy(id="password")
    public WebElement passwordInput;

    @FindBy(id ="submit-form")
    public WebElement submit;


    public void login(String username, String password) {
        userName.sendKeys(username);
        passwordInput.sendKeys(password);
        submit.click();
        // verification that we logged

        //String actualUrl = "https://qa.symund.com/index.php/apps/dashboard/";

       // BrowserUtils.sleep(30);
       // Assert.assertEquals(Driver.getDriver().getCurrentUrl(),actualUrl);
    }

}
