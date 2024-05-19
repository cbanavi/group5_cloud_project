package com.group5_sprint2_cloud.pages;




import com.group5_sprint2_cloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



    public class SetStatusPage {

        public SetStatusPage() {

            PageFactory.initElements(Driver.getDriver(), this);

        }

        @FindBy(xpath = "//label[@for='user-status-online-status-online']")
        public WebElement online;

        

        @FindBy(xpath = "//label[@for='user-status-online-status-away']")
        public WebElement away;


        @FindBy(xpath = "//label[@for='user-status-online-status-dnd']")
        public WebElement doNotDisturb;


        @FindBy(xpath = "//label[@for='user-status-online-status-invisible']")
        public WebElement invisible;

        @FindBy(xpath = "//button[@class='action-item action-item--single header-close icon-close undefined undefined has-tooltip']")
        public WebElement closeButton;









    }


