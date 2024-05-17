package com.group5_sprint2_cloud.pages;


import com.group5_sprint2_cloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




    public class CustomizePage {


        public CustomizePage() {

            PageFactory.initElements(Driver.getDriver(), this);

        }



        @FindBy(xpath = "//label[@for='status-checkbox-status']")
        public WebElement status;


        @FindBy (xpath = "//label[@for ='status-checkbox-weather']")
        public WebElement weather;

        @FindBy (xpath = "//label[@for='panel-checkbox-deck']")
        public WebElement upcomingCards;

        @FindBy (xpath = "//label[@for='panel-checkbox-recommendations']")
        public WebElement recommendedFiles;

        @FindBy (xpath = "//label[@for ='panel-checkbox-spreed']")
        public WebElement talkMentions;

        @FindBy (xpath = "//label[@for ='panel-checkbox-user_status']")
        public WebElement upcomingEvents;


        @FindBy (xpath = "(//label[@for='panel-checkbox-user_status'])[1]")
        public WebElement recentStatues;


        @FindBy (xpath = "//label[@for ='panel-checkbox-mail']")
        public WebElement importantMail;

        @FindBy (xpath = "//label[@for='panel-checkbox-mail-unread']")
        public WebElement UnreadMail;

        @FindBy(xpath = "//label[@for='panel-checkbox-notes']")
        public WebElement notes;

        @FindBy(xpath = "//button[@class='action-item action-item--single header-close icon-close undefined undefined has-tooltip']")
        public WebElement closeButton;



    }

