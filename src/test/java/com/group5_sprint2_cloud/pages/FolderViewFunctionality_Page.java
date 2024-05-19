package com.group5_sprint2_cloud.pages;

import com.group5_sprint2_cloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FolderViewFunctionality_Page {
    public FolderViewFunctionality_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//li[@data-id='files'])[1]")
    public WebElement filesIcon;

    @FindBy(xpath = "(//a[@data-sort='name'])[1]")
    public WebElement nameBtn;

    @FindBy(xpath = "(//a[@data-sort='size'])[1]")
    public WebElement sizeBtn;

    @FindBy(xpath = "(//a[@data-sort='mtime'])[1]")
    public WebElement modifyBtn;

    @FindBy(id = "select_all_files")
    public WebElement selectAll;

}
