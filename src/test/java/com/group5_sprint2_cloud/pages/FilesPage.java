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


    @FindBy(xpath = "//tr[@data-file='termih.txt']")
    public WebElement uploadedFile;

    @FindBy(xpath = "(//tbody[@id='fileList'])[1]")
    public WebElement fileList;


    @FindBy(xpath = "//a[@data-templatename='New folder']")
    public WebElement newFolderButton;

    @FindBy(xpath = "//input[@id='view12-input-folder']")
    public WebElement newFolderTextButton;

    @FindBy(xpath = "(//span[.='ATI2'])[1]")
    public WebElement uploadedNewFolder;

    @FindBy(xpath = "//tr[@data-file='termih.txt']/td[1]")
    public WebElement uploadedFileCheckBox;

    @FindBy(xpath = "(//span[@id='selectedActionsList'])[1]")
    public WebElement threeDots;

    @FindBy(css = ".menuitem.action.delete.permanent")
    public WebElement delete;

    @FindBy(xpath = "//*[@id=\"filestable\"]/tfoot/tr/td[2]/span")
    public WebElement fileSummary;

    @FindBy(xpath = "//*[@id=\"controls\"]/div[2]/a/span[1]")
    public WebElement actionsCreatableBtn;

    @FindBy(css = "#file_upload_start")
    public WebElement uploadBtn;

    @FindBy(xpath = "(//li/a[@aria-label='Files'])[1]")
    public WebElement filesBtn;













}