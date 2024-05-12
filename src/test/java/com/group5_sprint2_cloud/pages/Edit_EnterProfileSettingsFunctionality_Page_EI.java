package com.group5_sprint2_cloud.pages;

import com.group5_sprint2_cloud.step_definitions.Edit_EnterProfileSettingsFunctionality_StepDefs_EI;
import com.group5_sprint2_cloud.utilities.BrowserUtils;
import com.group5_sprint2_cloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Edit_EnterProfileSettingsFunctionality_Page_EI {


    public Edit_EnterProfileSettingsFunctionality_Page_EI(){

        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//nav[@id='expanddiv']")
    public WebElement userProfileBtn;

    @FindBy (xpath = "//li[@data-id='settings']")
    public WebElement profileSettingsBtn;

    @FindBy(xpath = "//label[@for='displayname']")
    public WebElement fullName;

    @FindBy(xpath = "//label[@for='email']")
    public WebElement email;

    @FindBy(xpath = "//label[@for='phone']")
    public WebElement phoneNumber;



}
