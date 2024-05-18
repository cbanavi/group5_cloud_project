package com.group5_sprint2_cloud.pages;

import com.group5_sprint2_cloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SymundActivityPage_CB {

    public SymundActivityPage_CB() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@id='app-navigation']//li")
    public List<WebElement> allActivities;

    @FindBy(xpath = "//span[@data-timestamp]")
    public List<WebElement> descendingActivities;

    @FindBy(xpath = "//div[@id='no_more_activities']")
    public WebElement messageAtBottomOfPage;

}
