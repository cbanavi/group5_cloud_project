package com.group5_sprint2_cloud.step_definitions;


import com.group5_sprint2_cloud.pages.CustomizePage;
import com.group5_sprint2_cloud.pages.DashboardPage;
import com.group5_sprint2_cloud.pages.LoginPage;
import com.group5_sprint2_cloud.pages.SetStatusPage;
import com.group5_sprint2_cloud.utilities.BrowserUtils;
import com.group5_sprint2_cloud.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

    public class Dashboard_Functionality_StepDefs {


        LoginPage loginPage = new LoginPage();
        DashboardPage dashboardPage = new DashboardPage();
        SetStatusPage setStatusPage = new SetStatusPage();
        CustomizePage customizePage = new CustomizePage();

        String username = ConfigurationReader.getProperty("username");
        String password = ConfigurationReader.getProperty("password");
        String employer =ConfigurationReader.getProperty("employee");
        String employee_password = ConfigurationReader.getProperty("employee_password");

        @Given("the user is logged in")
        public void the_user_logged_in_as() {

        loginPage.login(employer, employee_password);


        }

        @When("the user accesses the dashboard")
        public void the_user_accesses_the_dashboard() {

            BrowserUtils.verifyTitle("Dashboard - Symund - QA");

        }

        @Then("the user should see all modules")
        public void the_user_should_see_all_modules() {

            BrowserUtils.verifyElementDisplayed(dashboardPage.dashboard);
            BrowserUtils.verifyElementDisplayed(dashboardPage.files);
            BrowserUtils.verifyElementDisplayed(dashboardPage.photos);
            BrowserUtils.verifyElementDisplayed(dashboardPage.activity);
            BrowserUtils.verifyElementDisplayed(dashboardPage.talk);
            BrowserUtils.verifyElementDisplayed(dashboardPage.mail);
            BrowserUtils.verifyElementDisplayed(dashboardPage.contact);
            BrowserUtils.verifyElementDisplayed(dashboardPage.circle);
            BrowserUtils.verifyElementDisplayed(dashboardPage.calendar);
            BrowserUtils.verifyElementDisplayed(dashboardPage.notes);
            BrowserUtils.verifyElementDisplayed(dashboardPage.deck);
            BrowserUtils.verifyElementDisplayed(dashboardPage.tasks);


        }

        @Then("the user's username should be displayed")
        public void the_user_s_username_should_be_displayed() {


            dashboardPage.userButton.click();
            BrowserUtils.sleep(3);
            BrowserUtils.verifyElementDisplayed(dashboardPage.userName);

        }


        @When("the user clicks on the Customize button")
        public void the_user_clicks_on_the_customize_button() {

            dashboardPage.customizeButton.click();
            BrowserUtils.sleep(3);

        }

        @When("selects a widget")
        public void selects_a_widget() {


            if (!customizePage.status.isSelected()) {
                customizePage.status.click();
            } else {
                System.out.println("done");
            }


            customizePage.weather.click();
            customizePage.upcomingCards.click();
            customizePage.recommendedFiles.click();
            customizePage.talkMentions.click();
            customizePage.upcomingEvents.click();
            customizePage.recentStatues.click();
            customizePage.importantMail.click();
            customizePage.UnreadMail.click();
            customizePage.notes.click();




        }

        @Then("the selected widget should be displayed")
        public void the_selected_widget_should_be_displayed() {

            BrowserUtils.verifyElementDisplayed(customizePage.status);
            BrowserUtils.verifyElementDisplayed(customizePage.weather);
            BrowserUtils.verifyElementDisplayed(customizePage.upcomingCards);
            BrowserUtils.verifyElementDisplayed(customizePage.recommendedFiles);
            BrowserUtils.verifyElementDisplayed(customizePage.talkMentions);
            BrowserUtils.verifyElementDisplayed(customizePage.upcomingEvents);
            BrowserUtils.verifyElementDisplayed(customizePage.recentStatues);
            BrowserUtils.verifyElementDisplayed(customizePage.importantMail);
            BrowserUtils.verifyElementDisplayed(customizePage.UnreadMail);
            BrowserUtils.verifyElementDisplayed(customizePage.notes);

            customizePage.closeButton.click();


        }


        @When("the user clicks on the Set Status button")
        public void the_user_clicks_on_the_set_status_button() {


            dashboardPage.customizeButton.click();

            if (!customizePage.status.isSelected()) {
                customizePage.status.click();
            } else {
                System.out.println("done");
            }

            customizePage.closeButton.click();

            BrowserUtils.waitForClickablility(dashboardPage.setStatusButton, 5);


            dashboardPage.setStatusButton.click();

        }

        @When("selects a status option")
        public void selects_a_status_option() {

            setStatusPage.away.click();
            setStatusPage.doNotDisturb.click();
            setStatusPage.invisible.click();
            BrowserUtils.sleep(1);
            setStatusPage.online.click();
            setStatusPage.closeButton.click();

        }
    }




