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

public class CalendarPage_Berna {

    //The constructor can be used to initialize these WebElements
    // using tools like PageFactory in Selenium.
    public CalendarPage_Berna() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//div[@class='action-item'])[1]")
    public WebElement dropdown;

    @FindBy(xpath = "//input[@placeholder='Event title']")
    public WebElement enterEventTitle;


    @FindBy(xpath = "(//div[@class='new-event-today-view-section']//button)[1]")
    public WebElement newEventButton;


    @FindBy(xpath = "(//div[@class='property-title-time-picker__time-pickers']//input)[1]")
    public WebElement startBox;

    @FindBy(xpath = "(//div[@class='property-title-time-picker__time-pickers']//input)[2]")
    public WebElement endBox;

    @FindBy(xpath = "//button[@class='primary']")
    public WebElement saveButton;


    @FindBy(xpath = "(//a[@class='app-navigation-entry-link'])[1]")
    public WebElement personalOption;





    public void selectOptionByIndex(int index) {
        String option = "(//div[@class='popover__wrapper']//div[@class='open']//button)[" + index + "]";
        WebElement clickToOptionByIndex = Driver.getDriver().findElement(By.xpath(option));
        clickToOptionByIndex.click();


    }

    public boolean isDisplayedByText(String expectedURL) {

        String actualURL = Driver.getDriver().getCurrentUrl();

        boolean isDisplayed = actualURL.contains(expectedURL);
        Assert.assertTrue("Daily calendar view is not displayed", isDisplayed);

        return isDisplayed;
    }

    public void selectTheDay(int year, int month, int day) {

        String date = "//div[@class='mx-calendar mx-calendar-panel-date']//tr[@class='mx-date-row']//td[@title='\"+year+\"-\"+month+\"-\"+day+\"']";

        WebElement todayDate = Driver.getDriver().findElement(By.xpath(date));
        todayDate.click();


    }

    public WebElement verifyEvent(String meetingName){
        return Driver.getDriver().findElement(By.xpath("//div[@class='fc-event-title-container'][.='"+meetingName+"']"));
    }
}



