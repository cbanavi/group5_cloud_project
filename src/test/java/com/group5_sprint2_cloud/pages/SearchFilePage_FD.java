package com.group5_sprint2_cloud.pages;

import com.group5_sprint2_cloud.utilities.BrowserUtils;
import com.group5_sprint2_cloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchFilePage_FD {

    public SearchFilePage_FD() {
        PageFactory.initElements(Driver.getDriver(), this);
        BrowserUtils.waitForPageToLoad(3);

    }

    @FindBy(id = "unified-search")
    public WebElement searchButton;

    @FindBy(xpath = "//input[@class='unified-search__form-input']")
    public WebElement searchInput;

    @FindBy(xpath = "//ul[@class='unified-search__results unified-search__results-files']")
    public WebElement searchResults;

    @FindBy(xpath = "(//strong[.='Notes'])[2]")
    public WebElement notes;

    @FindBy(id = "app-sidebar-vue")
    public WebElement SidebarTabs;


    @FindBy(xpath = "(//a[@aria-label='Talk'])[1]")
    public WebElement Talk;

    @FindBy(id = "nextcloud")
    public WebElement appIcon;


    @FindBy(id = "app-dashboard")
    public WebElement Dashboard;

}














