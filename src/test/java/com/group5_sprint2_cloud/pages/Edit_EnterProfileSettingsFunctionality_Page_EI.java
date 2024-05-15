package com.group5_sprint2_cloud.pages;

import com.group5_sprint2_cloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Edit_EnterProfileSettingsFunctionality_Page_EI {


    public Edit_EnterProfileSettingsFunctionality_Page_EI() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@id='expand']")
    public WebElement userProfileBtn;

    @FindBy(xpath = "//li[@data-id='settings']")
    public WebElement profileSettingsBtn;

    @FindBy(xpath = "//label[@for='displayname']")
    public WebElement fullName;

    @FindBy(xpath = "//label[@for='email']")
    public WebElement email;

    @FindBy(xpath = "//label[@for='phone']")
    public WebElement phoneNumber;

    @FindBy(xpath = "//input[@type='tel']")
    public WebElement phoneNumberInputBox;

    @FindBy(xpath = "//*[@id=\"body-settings\"]/div[1]/text()")
    public WebElement popUpMessage;

    @FindBy(xpath = "//div//span[@title='User200']")
    public WebElement userName;

    @FindBy(xpath = "//div//span[@title='Employee200']")
    public WebElement employeeName;
}
