package com.group5_sprint2_cloud.pages;

import com.group5_sprint2_cloud.utilities.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class NotesModuleFunctionality_Page_JN extends BasePage {
    public NotesModuleFunctionality_Page_JN() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "(//li[@data-id='notes'])[1]")
    public WebElement notesBtn;

    @FindBy(xpath = "//button[@id='notes_new_note']")
    public WebElement createNewNote;

    @FindBy(xpath = "(//textarea)[2]")
    public WebElement textarea;

    @FindBy(xpath = "//ul[@class='app-navigation__list']//li[3]//span")
    public WebElement lastNote;

    @FindBy(xpath = "//*[@id=\"app-navigation-vue\"]/ul/li[3]/div/div/div/div/button")
    public WebElement trigger;

    @FindBy(xpath = "(//div[@class='trigger'])[3]/button")
    public WebElement triggerFavorites;

    @FindBy(xpath = "//span[.='Add to favorites']")
    public WebElement addToFavorites;

    @FindBy(xpath = "//span[.='Delete note']")
    public WebElement deleteNote;

    @FindBy(xpath = "//button[.='Undo Delete']")
    public WebElement deletionConfirmation;

    @FindBy(xpath = "//button/p[text()='Remove from favorites']")
    public WebElement removeFromFavorites;

    @FindBy(xpath = "//span[.='Details']")
    public WebElement getDetails;

    @FindBy(xpath = "//span[@class='action-buttons']")
    public WebElement detailActionBtn;

    @FindBy(xpath = "//p[@class='app-sidebar-header__subtitle']")
    public WebElement detailsVerification;


}
