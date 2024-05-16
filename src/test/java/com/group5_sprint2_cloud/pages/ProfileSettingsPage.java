package com.group5_sprint2_cloud.pages;

import com.group5_sprint2_cloud.utilities.BrowserUtils;
import com.group5_sprint2_cloud.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfileSettingsPage {

    public ProfileSettingsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "displayname")
    public WebElement userFullName;

    @FindBy(xpath = "//div[@id='settings']//span[@title]")
    public WebElement userName;

    @FindBy(id = "expand")
    public WebElement buttonExpandMenu;

    @FindBy(xpath = "//li[@data-id=\"settings\"]//a")
    public WebElement linkSettings;

    @FindBy(id = "email")
    public WebElement inputEmailField;

    @FindBy(id = "languageinput")
    public WebElement dropdownLanguage;

    public void goToProfileSettingPage() {
        buttonExpandMenu.click();
        BrowserUtils.sleep(2);

        if (linkSettings.isDisplayed()) {
            linkSettings.click();
            BrowserUtils.sleep(2);
        } else {
            // TODO trow error that linkSettings not displayed
        }
        String expectedUrl = "https://qa.symund.com/index.php/settings/user";
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), expectedUrl);
    }

}



