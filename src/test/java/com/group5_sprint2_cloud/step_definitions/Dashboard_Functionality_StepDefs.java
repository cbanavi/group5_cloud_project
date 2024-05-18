package com.group5_sprint2_cloud.step_definitions;

import com.group5_sprint2_cloud.pages.CustomizePage;
import com.group5_sprint2_cloud.pages.DashboardPage;
import com.group5_sprint2_cloud.pages.SetStatusPage;
import com.group5_sprint2_cloud.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;



public class Dashboard_Functionality_StepDefs {

    DashboardPage dashboardPage = new DashboardPage();
    SetStatusPage setStatusPage = new SetStatusPage();
    CustomizePage customizePage = new CustomizePage();

    @When("the user accesses the dashboard")
    public void the_user_accesses_the_dashboard() {
        BrowserUtils.verifyTitle("Dashboard - Symund - QA");
    }

    @Then("the user should see all modules")
    public void the_user_should_see_all_modules() {
        verifyDashboardModules();
    }

    @Then("the user's username should be displayed")
    public void the_user_s_username_should_be_displayed() {
        dashboardPage.userButton.click();
        BrowserUtils.sleep(1);
        Assert.assertTrue("User name is not displayed", dashboardPage.userName.isDisplayed());
    }

    @When("the user clicks on the Customize button")
    public void the_user_clicks_on_the_customize_button() {
        dashboardPage.customizeButton.click();
        BrowserUtils.sleep(1);
    }

    @When("selects a widget")
    public void selects_a_widget() {
        selectWidgets();
    }

    @Then("the selected widget should be displayed")
    public void the_selected_widget_should_be_displayed() {
        verifyWidgetsDisplayed();
        customizePage.closeButton.click();
    }

    @When("the user clicks on the Set Status button")
    public void the_user_clicks_on_the_set_status_button() {
        dashboardPage.setStatusButton.click();
    }

    @When("selects a status option")
    public void selects_a_status_option() {
        selectStatusOptions();
    }

    private void verifyDashboardModules() {
        Assert.assertTrue("Dashboard is displayed", dashboardPage.dashboard.isDisplayed());
        Assert.assertTrue("Files is displayed", dashboardPage.files.isDisplayed());
        Assert.assertTrue("Photos is displayed", dashboardPage.photos.isDisplayed());
        Assert.assertTrue("Activity is displayed", dashboardPage.activity.isDisplayed());
        Assert.assertTrue("Talk is displayed", dashboardPage.talk.isDisplayed());
        Assert.assertTrue("Mail is displayed", dashboardPage.mail.isDisplayed());
        Assert.assertTrue("Contact is displayed", dashboardPage.contact.isDisplayed());
        Assert.assertTrue("Circle is displayed", dashboardPage.circle.isDisplayed());
        Assert.assertTrue("Calendar is displayed", dashboardPage.calendar.isDisplayed());
        Assert.assertTrue("Notes is displayed", dashboardPage.notes.isDisplayed());
        Assert.assertTrue("Deck is displayed", dashboardPage.deck.isDisplayed());
        Assert.assertTrue("Tasks is displayed", dashboardPage.tasks.isDisplayed());
    }

    private void selectWidgets() {
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

    private void verifyWidgetsDisplayed() {
        Assert.assertTrue("Status widget is displayed", customizePage.status.isDisplayed());
        Assert.assertTrue("Weather widget is displayed", customizePage.weather.isDisplayed());
        Assert.assertTrue("Upcoming Cards widget is  displayed", customizePage.upcomingCards.isDisplayed());
        Assert.assertTrue("Recommended Files widget is displayed", customizePage.recommendedFiles.isDisplayed());
        Assert.assertTrue("Talk Mentions widget is  displayed", customizePage.talkMentions.isDisplayed());
        Assert.assertTrue("Upcoming Events widget is displayed", customizePage.upcomingEvents.isDisplayed());
        Assert.assertTrue("Recent Statues widget is displayed", customizePage.recentStatues.isDisplayed());
        Assert.assertTrue("Important Mail widget is displayed", customizePage.importantMail.isDisplayed());
        Assert.assertTrue("Unread Mail widget is displayed", customizePage.UnreadMail.isDisplayed());
        Assert.assertTrue("Notes widget is displayed", customizePage.notes.isDisplayed());
    }

    private void selectStatusOptions() {
        setStatusPage.away.click();
        setStatusPage.doNotDisturb.click();
        setStatusPage.invisible.click();
        BrowserUtils.sleep(1);
        setStatusPage.online.click();
        setStatusPage.closeButton.click();
    }
}
