package com.group5_sprint2_cloud.pages;

import com.group5_sprint2_cloud.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ProfileSettingsPage {

    public ProfileSettingsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="displayname")
    public WebElement userFullName;

    @FindBy(xpath = "//div[@id='settings']//span[@title]/@title")
    public WebElement userName;

    @FindBy(id="expand")
    public WebElement buttonExpandMenu;

    @FindBy(xpath = "//li[@data-id=\"settings\"]//a")
    public WebElement linkSettings;

    @FindBy(id="email")
    public WebElement inputEmailField;

    @FindBy(id="languageinput")
    public WebElement dropdownLanguage;

    public void goToProfileSettingPage() {
        buttonExpandMenu.click();
        if (linkSettings.isDisplayed()) {
            linkSettings.click();
        } else {
            // TODO trow error that linkSettings not displayed
        }
        String expectedUrl = "https://qa.symund.com/index.php/settings/user";
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),expectedUrl);
    }

}



