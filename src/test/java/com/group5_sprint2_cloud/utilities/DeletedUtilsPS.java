package com.group5_sprint2_cloud.utilities;

import com.group5_sprint2_cloud.pages.DeletedPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.Assert.fail;

public class DeletedUtilsPS {

    public static List<WebElement> columnPrinter(String xpath) {
        List<WebElement> contents = Driver.getDriver().findElements(By.xpath(xpath));
        if (contents.isEmpty()) {
            fail("No content found on the page");
        }

        for (WebElement element : contents) {
            System.out.println(element.getText());
        }

        return contents;
    }

    public static void deletedfileVerificationForDeletedPage(String fileName){
        BrowserUtils.verifyElementNotDisplayed(By.xpath("//span[@data-original-title='"+fileName+"']"));
    }

    public static void restoredfileVerificationForfilesPage(String fileName){
        BrowserUtils.verifyElementDisplayed(By.xpath("//*[@data-file='"+fileName+"']"));
    }

}
