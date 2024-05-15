package com.group5_sprint2_cloud.pages;

import com.group5_sprint2_cloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class TasksModuleFunctionality_Page_JN {
    public TasksModuleFunctionality_Page_JN() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@aria-label='Tasks'])[1]")
    public WebElement tasksBtn;

    @FindBy(xpath = "//a[contains(.,'Add List')]")
    public WebElement addList;

    @FindBy(id = "newListInput")
    public WebElement listInputBox;

    @FindBy(xpath = "//span[@title='To Do']")
    public WebElement toDoList;

    @FindBy(xpath = "(//ul//li/a[contains(.,'To Do')]/..//button)[3]")
    public WebElement trigger;

    @FindBy(xpath = "(//ul//li/a[contains(.,'Test')]/..//button)[3]")
    public WebElement triggerForTestBtn;

    @FindBy(xpath = "//button//span[.='Delete']")
    public WebElement deleteList;

    @FindBy(xpath = "(//ul//li/a[contains(.,'Test')]/span)")
    public WebElement testBtn;

    @FindBy(id = "target")
    public WebElement tasksInputBox;

    @FindBy(xpath = "(//div//div[@class='task-info']//span[contains(.,'Performance Testing')])")
    public WebElement testTasksInfo;

    @FindBy(xpath = "(//div//div[@class='task-info'])")
    public List<WebElement> allTasksInfo;

    public boolean verifyVisibilityOfTasks() {
        for (WebElement task : allTasksInfo) {
            if (!task.isDisplayed()) {
                return false;
            }
        }
        return true;
    }

    @FindBy(xpath = "(//div[@class='task-checkbox'])[1]")
    public WebElement checkbox;

    @FindBy(xpath = "//li[@collection-id='completed']//span")
    public WebElement completedTab;


    @FindBy(xpath = "//li//div//span[contains(.,'Completed today at')]")
    public WebElement taskStatus;


    @FindBy(xpath = "(//button[@class='inline task-star reactive no-nav']//span)[1]")
    public WebElement starBtn;

    @FindBy(id = "collection_starred")
    public WebElement importantTab;

    @FindBy(xpath = "(//div[@collectionid='starred']//span[contains(.,'Performance')])")
    public WebElement starredElement;

    @FindBy(xpath = "//li[@collection-id='current']//span")
    public WebElement currentTab;

    @FindBy(xpath = "//li[@collection-id='all']//span")
    public WebElement allTab;

    @FindBy(xpath = "//li[@collection-id='current']//div[@class='app-navigation-entry__counter']")
    public WebElement uncompletedTasksCount;
}
