package com.group5_sprint2_cloud.pages;

import com.group5_sprint2_cloud.utilities.BrowserUtils;
import com.group5_sprint2_cloud.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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
    private WebElement languageDropdownElement;

    public void goToProfileSettingPage() {
        buttonExpandMenu.click();
        BrowserUtils.sleep(1);
        if (linkSettings.isDisplayed()) {
            linkSettings.click();
        } else {
            throw new AssertionError("Settings link is not displayed"); // Throw an error if not visible
        }
        String expectedUrl = "https://qa.symund.com/index.php/settings/user";
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), expectedUrl);
    }

    // Method to get the currently selected language value
    public String getSelectedLanguageValue() {
        Select select = new Select(languageDropdownElement); // Create Select object
        WebElement selectedOption = select.getFirstSelectedOption();
        return selectedOption.getAttribute("value");
    }

    // Method to get the currently selected language text (e.g., "Español (España)")
    public String getSelectedLanguageText() {
        Select select = new Select(languageDropdownElement); // Create Select object
        WebElement selectedOption = select.getFirstSelectedOption();
        return selectedOption.getText();
    }

    // Method to select a language by its value attribute
    public void selectLanguageByValue(String language) {
        Select select = new Select(languageDropdownElement); // Create Select object
        select.selectByValue(language);
    }
}



