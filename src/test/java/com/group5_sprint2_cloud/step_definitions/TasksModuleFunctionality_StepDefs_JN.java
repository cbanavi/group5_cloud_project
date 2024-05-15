package com.group5_sprint2_cloud.step_definitions;
import com.group5_sprint2_cloud.pages.TasksModuleFunctionality_Page_JN;
import com.group5_sprint2_cloud.utilities.BrowserUtils;
import com.group5_sprint2_cloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;


public class TasksModuleFunctionality_StepDefs_JN  {
    Actions actions = new Actions(Driver.getDriver());
    LoginStepDefs loginStepDefs = new LoginStepDefs();
    TasksModuleFunctionality_Page_JN tasksPage = new TasksModuleFunctionality_Page_JN();

    @Given("user is logged in as {string}")
    public void userIsLoggedInAs(String userType) {
        loginStepDefs.the_user_logged_in_as(userType);
    }

    @Given("user is on the Task Management Page")
    public void user_is_on_the_task_management_page() {
        tasksPage.tasksBtn.click();
    }

    @When("user creates a new list of tasks")
    public void user_creates_a_new_list_of_tasks() {
        BrowserUtils.waitForPageToLoad(5);
        tasksPage.addList.click();
        BrowserUtils.waitFor(3);
        tasksPage.listInputBox.sendKeys("To Do" + Keys.ENTER);
    }

    @Then("the new list should be visible in the task lists")
    public void the_new_list_should_be_visible_in_the_task_lists() {
        String expectedText = "To Do";
        Assert.assertEquals(expectedText, tasksPage.toDoList.getText());
        tasksPage.trigger.click();
        tasksPage.deleteList.click();
        BrowserUtils.waitFor(8);

    }


    @When("user selects a list and creates a new task")
    public void user_selects_a_list_and_creates_a_new_task() {
        tasksPage.addList.click();
        BrowserUtils.waitFor(3);
        tasksPage.listInputBox.sendKeys("Test" + Keys.ENTER);
        tasksPage.testBtn.click();
        tasksPage.tasksInputBox.sendKeys("Performance Testing" + Keys.ENTER);
        tasksPage.tasksInputBox.sendKeys("Performance Testing" + Keys.ENTER);
        tasksPage.tasksInputBox.sendKeys("Performance Testing" + Keys.ENTER);

    }


    @Then("the new task should be added to the task list")
    public void the_new_task_should_be_added_to_the_task_list() {
        BrowserUtils.waitFor(5);
        String expectedText = "Performance Testing";
        Assert.assertEquals(expectedText, tasksPage.testTasksInfo.getText());
    }


    @Given("there are existing tasks in the task list")
    public void there_are_existing_tasks_in_the_task_list() {
        tasksPage.testBtn.click();
        Assert.assertTrue(tasksPage.verifyVisibilityOfTasks());
    }

    @When("the user clicks on the checkbox near a task name")
    public void the_user_clicks_on_the_checkbox_near_a_task_name() {
        tasksPage.checkbox.click();
    }

    @Then("the task should be marked as completed")
    public void the_task_should_be_marked_as_completed() {
        BrowserUtils.waitFor(3);
        tasksPage.completedTab.click();
        BrowserUtils.waitFor(3);
        Assert.assertTrue(tasksPage.taskStatus.isDisplayed());

    }


    @When("the user clicks on the star icon next to a task")
    public void the_user_clicks_on_the_star_icon_next_to_a_task() {
        BrowserUtils.waitFor(3);
        tasksPage.starBtn.click();
    }

    @Then("the task should be marked as important")
    public void the_task_should_be_marked_as_important() {
        BrowserUtils.waitForVisibility(tasksPage.importantTab,1);
        tasksPage.importantTab.click();
        // Get the title of the task that should now be marked as important
        String importantTaskText = "Performance Testing";
        Assert.assertEquals(importantTaskText,tasksPage.starredElement.getText());
        tasksPage.testBtn.click();
        tasksPage.triggerForTestBtn.click();
        tasksPage.deleteList.click();
        BrowserUtils.waitFor(8);
    }


    @When("the user navigates to the Current tab")
    public void the_user_navigates_to_the_tab() {
        BrowserUtils.waitFor(3);
        tasksPage.currentTab.click();
    }

    @Then("the user should see the number of uncompleted tasks next to the tab")
    public void the_number_of_uncompleted_tasks_next_to_the_current_tab() {
       Assert.assertTrue(tasksPage.uncompletedTasksCount.isDisplayed());

    }


}









