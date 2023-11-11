package com.B30G03.step_definitions;

import com.B30G03.pages.DashboardPage_JS;
import com.B30G03.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US09_DashboardNavigation_stepDef {

DashboardPage_JS dashboardPageJs=new DashboardPage_JS();

    @When("User click App icon")
    public void user_click_app_icon() {
dashboardPageJs.logoIcon.click();
    }

    @Then("user is on the Dashboard page")
    public void user_is_on_the_dashboard_page() {
        BrowserUtils.verifyTitleContains("Dashboard - Trycloud QA");
    }
}
