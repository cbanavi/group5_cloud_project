package com.group5_sprint2_cloud.pages;

import com.group5_sprint2_cloud.utilities.BrowserUtils;
import com.group5_sprint2_cloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TalkPage {

    public TalkPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //@B33G5-149
    @FindBy(xpath = "//li[@data-id='spreed']//*[@viewBox='0 0 20 20']")
public WebElement talkButton;

    @FindBy(xpath = "//button[@aria-label='Create a new group conversation']")
public WebElement conversationButton;

    @FindBy(xpath = "//input[@placeholder='Conversation name']")
    public WebElement conversationName;

@FindBy(xpath = "//div[@class='modal-container']//label[@for='checkbox']")
    public WebElement checkbox;

@FindBy(xpath = "//button[@class='navigation__button navigation__button-right primary']")
public WebElement primaryButton;

@FindBy(xpath = "//div[@class='set-contacts']//input[@placeholder='Search participants']")
public WebElement searchParticipantBar;

    public void createConversation(String groupName, List<String> participants) {
        conversationButton.click();
        BrowserUtils.waitFor(3);
        conversationName.sendKeys(groupName);
        checkbox.click();
        BrowserUtils.waitFor(3);
        primaryButton.click();
        BrowserUtils.waitFor(3);
        if (!participants.isEmpty()) {
            for (String participant : participants) {
                String formattedParticipant = participant.substring(0, 1).toUpperCase() + participant.substring(1);
                searchParticipantBar.sendKeys(formattedParticipant);
                BrowserUtils.waitFor(2);
                Driver.getDriver().findElement(By.xpath("//*[.='" + formattedParticipant + "']")).click();
                BrowserUtils.waitFor(3);
            }
            primaryButton.click();
            BrowserUtils.waitFor(3);
            primaryButton.click();
        }}

    public  void groupVerification (String groupName){
        BrowserUtils.verifyTitleContains(groupName);
    }


    //@B33G5-150

@FindBy(xpath = "//button[@aria-label='Settings for conversation \"BravoG5\"']")
    public WebElement threeDotMenu;
@FindBy(xpath = "//button[@class='action-button focusable']//*[.='Delete conversation']")
    public WebElement deleteConversation;
@FindBy(xpath = "//button[@class='primary']")
    public WebElement yesButton;



}
