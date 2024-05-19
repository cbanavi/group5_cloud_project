package com.group5_sprint2_cloud.pages;

import com.group5_sprint2_cloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {


    public ContactPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//button[@id='new-contact-button'] )")
    public WebElement newContactButton;


    @FindBy(xpath = "(//input[@id='contact-org']  )")
    public WebElement firstName;

    @FindBy(xpath = "(//input[@id='contact-title']  )")
    public WebElement lastName;

    @FindBy(xpath = "(//div[@class=\"app-content-list-item active\"] )")
    public WebElement createdContact;

    @FindBy(xpath = "( //span[@title='All contacts'])")
    public WebElement allContactsButton;

    @FindBy(xpath = "( (//div[@class='app-navigation-entry__utils'])[1])")
    public WebElement totalContacts;


    @FindBy(xpath = " (//button[@class='icon action-item__menutoggle icon-picture-force-white'])")
    public WebElement uploadButton;

    @FindBy(xpath = " (//span[.='Choose from Files'])")
    public WebElement chooseFromFiles;

    @FindBy(xpath = " (//tr[@data-entryname='PROFILE-Photography-112.jpeg'])")
    public WebElement selectFile;

    @FindBy(xpath = " (//button[.='Choose'])")
    public WebElement chooseButton;


    @FindBy(xpath = " (//div[@class='action-item header-menu'])")
    public WebElement threeButton;

    @FindBy(xpath = " (//span[.='Delete'])[5]")
    public WebElement deleteButton;





}
