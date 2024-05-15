package com.group5_sprint2_cloud.pages;

import com.group5_sprint2_cloud.utilities.BrowserUtils;
import com.group5_sprint2_cloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FilesPage {

    public FilesPage() {

        PageFactory.initElements(Driver.getDriver(), this);


    }

    @FindBy(css = ".button.new")
    public WebElement addIcon;

    @FindBy(css = "body > div:nth-child(30) > div:nth-child(2) > div:nth-child(4) > table:nth-child(5) > tbody:nth-child(2) > tr:nth-child(4) > td:nth-child(2) > a:nth-child(1) > span:nth-child(2)")
    public WebElement uploadedFile;


    @FindBy(xpath = "//a[@data-templatename='New folder']")
    public WebElement newFolderButton;

    @FindBy(xpath = "//input[@id='view12-input-folder']")
    public WebElement newFolderTextButton;

    @FindBy(xpath = "(//span[.='ATI2'])[1]")
    public WebElement uploadedNewFolder;

    @FindBy(xpath = "(//span[.='termih'])[2]/../..//a[2]//span[1]")
    public WebElement threeDotsButton;

    @FindBy(xpath = "((//span[.='ATI2'])[2]/..//a[2]//span[1]")
    public WebElement threeDotsButtonFolder;

    @FindBy(xpath = "//span[.='Delete file']")
    public WebElement deleteButton;

    @FindBy(xpath = "//*[@id=\"rightClickMenu\"]/ul/li[6]/a/span[2]")
    public WebElement deleteButtonFolder;


    @FindBy(xpath = "//*[@id=\"filestable\"]/tfoot/tr/td[2]/span")
    public WebElement fileSummary;

    @FindBy(xpath = "//*[@id=\"controls\"]/div[2]/a/span[1]")
    public WebElement actionsCreatableBtn;

    @FindBy(css = "#file_upload_start")
    public WebElement uploadBtn;

    @FindBy(xpath = "(//li/a[@aria-label='Files'])[1]")
    public WebElement filesBtn;

    @FindBy(xpath = "(//*[@id=\"body-user\"]/div[9]/h2")
    public WebElement conflictMessage;

    @FindBy(xpath = "(//button[@class='cancel primary']")
    public WebElement conflictCancel;

    @FindBy(xpath = "//*[@id=\"oc-dialog-fileexists-content\"]/table/tbody/tr/th[2]/label")
    public WebElement conflictAlreadyExistCheckbox;

    @FindBy(xpath = "//*[@id=\"body-user\"]/div[9]/div[2]/button[2]")
    public WebElement conflictContinue;








}