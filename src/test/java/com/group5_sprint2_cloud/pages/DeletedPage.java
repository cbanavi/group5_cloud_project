package com.group5_sprint2_cloud.pages;

import com.group5_sprint2_cloud.utilities.BrowserUtils;
import com.group5_sprint2_cloud.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeletedPage {
    public DeletedPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
//  @B33G5-105
@FindBy(xpath = "//li[@data-id='files']")
    public WebElement filesButton;

@FindBy(xpath = "//li[@data-id='trashbin']//a")
public WebElement deletedFilesButton;

    @FindBy(xpath = "//a//*[.='Deleted']")
    public WebElement deletedButtonModifier;
    @FindBy(xpath = "//div[@id=\"app-content-trashbin\"]/table/tbody/tr[1]/td[2]//span[@class='nametext extra-data']//span[@class='innernametext']")
    public WebElement deletedFirstLineName;
    @FindBy(xpath = "//tbody/tr[1]/td[2]//span[@class='innernametext']")
    public WebElement firstLineName;

    public void orderVerification(){
        DeletedPage deletedPage = new DeletedPage();
        String firstFileName = deletedPage.firstLineName.getText();
        int deletedFilesSize;

        BrowserUtils.waitFor(3);
        deletedPage.deletedButtonModifier.click();
        deletedPage.deletedButtonModifier.click();
        BrowserUtils.waitFor(2);
        String deletedFirstLineFile = deletedPage.deletedFirstLineName.getText();

        System.out.println("firstFileName = " + firstFileName);
        System.out.println("deletedFirstLineFile = " + deletedFirstLineFile);
        Assert.assertNotEquals(firstFileName,deletedFirstLineFile);
    }

//  @B33G5-142

    @FindBy(xpath = "//a[@data-action='Delete']")
    public WebElement deleteButton;
public void deleteFilesPermanently(String fileName){
   Driver.getDriver().findElement(By.xpath("//tr[@data-path='"+fileName+"']//a[@class='action action-menu permanent']")).click();
   BrowserUtils.waitFor(2);
   deleteButton.click();
   BrowserUtils.waitFor(2);
}

//  @B33G5-143

public void restoreFiles(String fileName){
    Driver.getDriver().findElement(By.xpath("//tr[@data-path='"+fileName+"']//a[@class='action action-restore permanent']")).click();
    BrowserUtils.waitFor(2);
}


}
