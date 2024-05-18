package com.group5_sprint2_cloud.step_definitions;

import com.group5_sprint2_cloud.pages.ContactPage;
import com.group5_sprint2_cloud.pages.DashboardPage;
import com.group5_sprint2_cloud.pages.LoginPage;
import com.group5_sprint2_cloud.utilities.BrowserUtils;
import com.group5_sprint2_cloud.utilities.ConfigurationReader;
import com.group5_sprint2_cloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Contact_Management {
   /* LoginPage loginPage = new LoginPage();
    String employee = ConfigurationReader.getProperty("employee");
    String password = ConfigurationReader.getProperty("employee_password");

    */
   DashboardPage dashboardPage = new DashboardPage();
    ContactPage contactPage = new ContactPage();


    @Given("the user is on the contact management page")
    public void the_user_is_on_the_contact_management_page() {

        dashboardPage.contact.click();


    }
    @When("the user adds a new contact with name {string} and lastname {string}")
    public void the_user_adds_a_new_contact_with_name_and_lastname(String string, String string2) {
        contactPage.newContactButton.click();
        contactPage.firstName.sendKeys("Medi");
        BrowserUtils.sleep(3);
        contactPage.lastName.sendKeys("Doe");





    }
    @Then("the new contact should appear on the all contact list")
    public void the_new_contact_should_appear_on_the_all_contact_list() {

        Assert.assertTrue(contactPage.createdContact.isDisplayed());
    }






    @Then("the user should see all contacts listed")
    public void the_user_should_see_all_contacts_listed() {
        contactPage.allContactsButton.click();
        Assert.assertTrue(contactPage.createdContact.isDisplayed());


    }
    @Then("the total number of contacts should be displayed")
    public void the_total_number_of_contacts_should_be_displayed() {
        BrowserUtils.sleep(3);
        Assert.assertTrue(contactPage.totalContacts.isDisplayed());


    }



    @When("the user selects a contact {string}")
    public void the_user_selects_a_contact(String string) {
        contactPage.createdContact.click();
        BrowserUtils.sleep(3);

    }
    @When("the user changes the profile picture by choosing a file")
    public void the_user_changes_the_profile_picture_by_choosing_a_file() {
        contactPage.uploadButton.click();
        BrowserUtils.sleep(3);
        contactPage.chooseFromFiles.click();


       contactPage.selectFile.click();
       contactPage.chooseButton.click();


    }


    @When("the user selects a contact to delete")
    public void the_user_selects_a_contact_to_delete() {
        contactPage.createdContact.click();

        contactPage.threeButton.click();
        BrowserUtils.sleep(3);
        contactPage.deleteButton.click();
        BrowserUtils.sleep(3);

    }

}
