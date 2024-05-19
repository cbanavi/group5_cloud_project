package com.group5_sprint2_cloud.pages;

import com.group5_sprint2_cloud.utilities.BrowserUtils;
import com.group5_sprint2_cloud.utilities.DeckUtilsPS;
import com.group5_sprint2_cloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DeckPage {
    public DeckPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
//@B33G5-191
@FindBy(xpath = "//nav[@role='navigation']//li[@data-id='deck']")
    public WebElement deckButtonSmall;

    @FindBy(xpath = "//ul[@id='appmenu']//li[@data-id='deck']")
    public WebElement deckButtonBig;


    @FindBy(xpath = "//span[@title='Add board']")
    public WebElement addBoardButton;

    @FindBy(xpath = "//div[@class=\"app-navigation app-navigation--close\"]")
    public WebElement closedMenuElement;

    @FindBy(xpath = "//div[@class=\"app-navigation app-navigation--close\"]//a[@aria-controls='app-navigation-vue']")
    public WebElement threeLineMenu;

    @FindBy(xpath = "//input[@placeholder='Board name']")
    public WebElement boardNameBar;

    public void boardVerification (String boardName){
        BrowserUtils.verifyElementDisplayed(By.xpath("//*[@title='"+boardName+"']"));
    }
//@B33G5-192
    public void chooseBoard (String boardName){
        Driver.getDriver().findElement(By.xpath("//*[@title='"+boardName+"']")).click();
    }

    @FindBy(xpath = "//div[@id='stack-add']//button[@rel='noreferrer noopener']")
    public WebElement addListButton;

    @FindBy(xpath="//input[@placeholder='List name']")
    public WebElement listNameBar;

    public void listVerification (String listName){
        BrowserUtils.verifyElementDisplayed(By.xpath("//h3[contains(text(), '"+listName+"')]"));
    }
//@B33G5-193
    @FindBy(xpath = "//div[@class='stack__header']//button[@data-original-title='null']")
    public WebElement addCardButton;

    @FindBy(xpath = "//input[@placeholder='Card name']")
    public WebElement cardNameBar;

    @FindBy(xpath = "//aside//*[contains(text(), 'charlie')]")
    public WebElement cardVerificationAside;

    @FindBy(xpath="//span[contains(text(), 'charlie')]")
    public WebElement cardVerificationMain;

    //@B33G5-194

    @FindBy(xpath = "//div[@class='badges']//div[@class='action-item']//div[@placement='bottom']//button")
    public WebElement threeDotsButtonCard;

@FindBy(xpath = "//*[contains(text(), 'Assign to me')]")
    public WebElement assignToMeButton;

//@FindBy(xpath = "//img[@src='/index.php/avatar/User7/32?v=0']")
//public WebElement assignedCardIcon;
//
//@FindBy(xpath = "//div[@id='expand']//img[@src='/index.php/avatar/User7/32?v=0']")
//public WebElement profileIcon;

    public void iconVerification(List<String> users){
        for (String user : users) {
            String xpath = "//img[@src='/index.php/avatar/" + user + "/32?v=0']";
            BrowserUtils.waitFor(5);
            List<WebElement> icons = Driver.getDriver().findElements(By.xpath(xpath));
            if(icons.size() >= 2) {
                String srcFirstIcon = icons.get(0).getAttribute("src");
                BrowserUtils.waitFor(5);
                boolean allMatch = icons.stream().allMatch(icon -> icon.getAttribute("src").equals(srcFirstIcon));
                BrowserUtils.waitFor(5);
                if(allMatch) {
                    System.out.println("All icons for user " + user + " are the same.");
                } else {
                    System.out.println("Not all icons for user " + user + " are the same.");
                }
            } else {
                System.out.println("Less than two icons found for user " + user + "; cannot verify if they are the same.");
            }
        }
    }

    }


