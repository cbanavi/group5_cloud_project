package com.group5_sprint2_cloud.step_definitions;

import com.group5_sprint2_cloud.pages.LogoutPage;
import com.group5_sprint2_cloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LogoutStepDefs {
    LogoutPage logout = new LogoutPage();

    @When("user clicks the logout button")
    public void user_clicks_the_button() {
        //first clicking on expand button
        logout.expandButton.click();
        //click on logout button
        logout.logoutButton.click();
    }

    @Then("user should be redirected to the login page")
    public void user_should_be_redirected_to_the_login_page() {
        //Confirm user is on login page
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("login"));
    }

    @When("user click the browser back button")
    public void user_click_the_browser_back_button() {
        Driver.getDriver().navigate().back();
    }

    @Then("user should remain on the login page")
    public void user_should_remain_on_the_login_page() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("login"));
    }

    @Then("user should not see the home page content")
    public void user_should_not_see_the_home_page_content() {
        Assert.assertFalse(Driver.getDriver().getCurrentUrl().contains("Dashboard"));
    }

}
