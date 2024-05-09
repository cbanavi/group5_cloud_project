package com.group5_sprint2_cloud.pages;

import com.group5_sprint2_cloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SymundActivityPage_CB {

    public SymundActivityPage_CB() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@data-navigation='self']")
    public List<WebElement> byYouActivity;

    @FindBy(xpath = "//a[@data-navigation='by']")
    public List<WebElement> byOthersActivity;

    @FindBy(xpath = "//a[@data-navigation='circles']")
    public List<WebElement> circlesActivity;

    @FindBy(xpath = "//a[@data-navigation='files_favorites']")
    public List<WebElement> favoritesActivity;

    @FindBy(xpath = "//a[@data-navigation='files']")
    public List<WebElement> fileChangesActivity;

    @FindBy(xpath = "//a[@data-navigation='files_sharing']")
    public List<WebElement> fileSharesActivity;

    @FindBy(xpath = "//a[@data-navigation='calendar']")
    public List<WebElement> calendarActivity;

    @FindBy(xpath = "//a[@data-navigation='calendar_todo']")
    public List<WebElement> todosActivity;

    @FindBy(xpath = "//a[@data-navigation='comments']")
    public List<WebElement> commentsActivity;

    @FindBy(xpath = "//a[@data-navigation='deck']")
    public List<WebElement> deckActivity;

}
