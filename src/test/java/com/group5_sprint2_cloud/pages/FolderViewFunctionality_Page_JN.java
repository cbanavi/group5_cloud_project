package com.group5_sprint2_cloud.pages;

import com.group5_sprint2_cloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class FolderViewFunctionality_Page_JN {
    public FolderViewFunctionality_Page_JN() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//li[@data-id='files'])[1]")
    public WebElement filesIcon;

    @FindBy(xpath = "//*[@id=\"headerName-container\"]/a")
    public WebElement nameBtn;

    @FindBy(xpath = "(//table[@id='filestable']//tr//th//span[.='Size'])[1]")
    public WebElement sizeBtn;

    @FindBy(xpath = "(//a[@data-sort='mtime'])[1]")
    public WebElement modifyBtn;

    @FindBy(xpath = "(//table[@id='filestable']//tr//th//span[.='Name'])[1]")
    List<WebElement> nameRows;
    public boolean verifyAlphabeticalOrder() {

        List<String> sortedNames = new ArrayList<>();
        for (WebElement element : nameRows) {
            sortedNames.add(element.getText());
        }
        for (int i = 0; i < sortedNames.size() - 1; i++) {
            if (sortedNames.get(i).compareToIgnoreCase(sortedNames.get(i + 1)) > 0) {
                return false;
            }
        }
        return true;
    }

    @FindBy(xpath = "(//table[@id='filestable']//tr//th//span[.='Size'])[1]")
    List<WebElement> sizeRows;

    public boolean verifyAscendingOrder() {
        List<String> sortedSizes = new ArrayList<>();
        for (WebElement each : sizeRows) {
            sortedSizes.add(each.getText());
        }
        for (int i = 0; i < sortedSizes.size() - 1; i++) {
            if (sortedSizes.get(i).compareToIgnoreCase(sortedSizes.get(i + 1)) > 0) {
                return false;
            }
        }
        return true;
    }

    @FindBy(xpath = "(//table[@id='filestable']//tr//th//span[.='Modified'])[1]")
    List<WebElement> modifiedRows;

    public boolean verifyChronologicalOrder() {
        List<String > chronologicalOrder = new ArrayList<>();
        for (WebElement each : modifiedRows) {
            chronologicalOrder.add(each.getText());
        }
        for (int i = 0; i < chronologicalOrder.size() - 1; i++) {
            if (chronologicalOrder.get(i).compareToIgnoreCase(chronologicalOrder.get(i + 1)) > 0) {
                return false;
            }
        }
        return true;

    }

    @FindBy(xpath = "//label[@for='select_all_files']")
    public WebElement selectAll;

    @FindBy(xpath = "(//table[@id='filestable']//tr//span)[2]")
    public WebElement columnVerificationTitle;




}