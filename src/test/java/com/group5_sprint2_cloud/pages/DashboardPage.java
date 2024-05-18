package com.group5_sprint2_cloud.pages;


import com.group5_sprint2_cloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



    public class DashboardPage {

        public DashboardPage() {

        PageFactory.initElements(Driver.getDriver(), this);


    }

    @FindBy (xpath = "(//a[@class='active'])[1]")
    public WebElement dashboard;


    @FindBy(xpath = "((//li/a[@aria-label='Files'])[1]")
    public WebElement filesBtn;

    @FindBy (xpath = "(//a[@href='/index.php/apps/files/'])[1]")
    public WebElement files;


    @FindBy (xpath = "(//a[@href='/index.php/apps/photos/'])[1]")
    public WebElement photos;


    @FindBy (xpath = "(//a[@href='/index.php/apps/photos/'])[1]")
    public WebElement photos;


    @FindBy (xpath = "(//a[@aria-label='Activity'])[1]")
    public WebElement activity;

    @FindBy (xpath = "(//a[@href='/index.php/apps/mail/'])[1]")
    public WebElement mail;

    @FindBy (xpath = "(//a[@href='/index.php/apps/contacts/'])[1]")
    public WebElement contact;

    @FindBy (xpath = "(//a[@href='/index.php/apps/circles/'])[1]")
    public WebElement circle;

    @FindBy (xpath = "(//a[@href='/index.php/apps/calendar/'])[1]")
    public WebElement calendar;

    @FindBy (xpath = "(//a[@href='/index.php/apps/notes/'])[1]")
    public WebElement notes;

    @FindBy (xpath = "(//a[@href='/index.php/apps/deck/'])[1]")
    public WebElement deck;

    @FindBy (xpath = "(//a[@href='/index.php/apps/tasks/'])[1]")
    public WebElement tasks;


    @FindBy (xpath = "//div[@id='settings']")
    public WebElement userButton;


    @FindBy (xpath = "//span[@class='user-status-menu-item__header']")
    public WebElement userName;


    @FindBy (xpath = "//span[@class='user-status-menu-item__header']")
    public WebElement userName;


    @FindBy (xpath = "//a[@class ='edit-panels icon-rename']")
    public WebElement customizeButton;


    @FindBy (xpath = "//button[@class= 'user-status-menu-item__toggle user-status-menu-item__toggle--inline']")
    public WebElement setStatusButton;


    @FindBy (xpath = "//button[@class='user-status-menu-item__toggle user-status-menu-item__toggle--inline']")
    public WebElement setStatusButton;

    @FindBy(xpath = "(//a[@aria-label='Talk'])[1]")
    public WebElement talk;




}