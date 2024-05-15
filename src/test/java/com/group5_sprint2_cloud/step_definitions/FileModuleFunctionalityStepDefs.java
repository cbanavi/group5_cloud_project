package com.group5_sprint2_cloud.step_definitions;

import com.group5_sprint2_cloud.pages.DashboardPage;
import com.group5_sprint2_cloud.pages.FilesPage;
import com.group5_sprint2_cloud.pages.LoginPage;
import com.group5_sprint2_cloud.utilities.BrowserUtils;
import com.group5_sprint2_cloud.utilities.ConfigurationReader;
import com.group5_sprint2_cloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


import java.io.File;
import java.security.Key;

public class FileModuleFunctionalityStepDefs {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    FilesPage filesPage = new FilesPage();
    String employee = ConfigurationReader.getProperty("employee");
    String employeePassword = ConfigurationReader.getProperty("employee_password");


    String username = ConfigurationReader.getProperty("username");
    String usernamePassword = ConfigurationReader.getProperty("password");


    @Given("User should login")
    public void user_should_login() {

        loginPage.login(username, usernamePassword);

    }
    @When("User clicks on Files module")
    public void user_clicks_on_files_module() {

        filesPage.filesBtn.click();



    }
    @When("User clicks on + button to add file")
    public void user_clicks_on_button_to_add_file() {

        BrowserUtils.sleep(5);

        filesPage.actionsCreatableBtn.click();



    }




    @Then("User selects the file to upload")
    public void user_selects_the_file_to_upload() {



            BrowserUtils.sleep(5);


            String projectPath = System.getProperty("user.dir");
            String pathOfFile = projectPath + "\\src\\test\\resources\\uploadedFiles\\termih.txt";





            try {
                File fileToUpload = new File(pathOfFile);
                if (fileToUpload.exists()) {
                    filesPage.uploadBtn.sendKeys(pathOfFile);
                } else {
                    System.out.println("File not found: " + pathOfFile);
                }
            } catch (Exception e) {
                System.out.println("An error occurred during file upload: " + e.getMessage());
            }





    }
    @Then("User can see the file on the list")
    public void user_can_see_the_file_on_the_list() {



        BrowserUtils.verifyElementDisplayed(filesPage.uploadedFile);


    }

    @When("User clicks on + button to add folder")
    public void user_clicks_on_button_to_add_folder() {

        filesPage.actionsCreatableBtn.click();


    }
    @When("User clicks on new folder")
    public void user_clicks_on_new_folder() {

        filesPage.newFolderButton.click();

    }
    @Then("User name the new folder and add it to the list")
    public void user_name_the_new_folder_and_add_it_to_the_list() {

        filesPage.newFolderTextButton.sendKeys("ATI2"+Keys.ENTER);

    }
    @Then("User can see the folder on the list")
    public void user_can_see_the_folder_on_the_list() {

        BrowserUtils.verifyElementDisplayed(filesPage.uploadedNewFolder);


    }

    @When("User clicks three dots and click delete the file")
    public void user_clicks_three_dots_and_click_delete_the_file() {

        filesPage.threeDotsButton.click();
        BrowserUtils.sleep(3);
        filesPage.deleteButton.click();

    }
    @When("User can confirm the file is deleted")
    public void user_can_confirm_the_file_is_deleted() {


        BrowserUtils.verifyElementDisplayed(filesPage.uploadedFile);




    }

    @When("User should see the total number of files and folders under the list")
    public void user_should_see_the_total_number_of_files_and_folders_under_the_list() {

      BrowserUtils.sleep(5);

      BrowserUtils.verifyElementDisplayed(filesPage.fileSummary);

      System.out.println(filesPage.fileSummary.getText());



    }

}
