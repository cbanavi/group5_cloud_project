package com.group5_sprint2_cloud.pages;

import com.group5_sprint2_cloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

public class CalendarPage_Berna {

    //The constructor can be used to initialize these WebElements
    // using tools like PageFactory in Selenium.
    public CalendarPage_Berna(){

            PageFactory.initElements(Driver.getDriver(),this);
        }

        @FindBy(xpath = "(//div[@class='action-item'])[1]")
        public WebElement dropdown;




        public void selectOptionByIndex(int index) {
            String option = "//div[@class='popover__wrapper']//div[@class='open']//button["+index+"]";
            WebElement clickToOptionByIndex = Driver.getDriver().findElement(By.xpath(option));
           clickToOptionByIndex.click();




        }
}