package com.B30G03.step_definitions;

import com.B30G03.pages.DashboardPage_KA;
import com.B30G03.utilities.BrowserUtils;
import com.B30G03.utilities.ConfigurationReader;
import com.B30G03.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class US01_DashboardModification_StepDef {

    DashboardPage_KA dashboardPage_ka = new DashboardPage_KA();

    @Then("user can see below modules")
    public void user_can_see_below_modules(List<String> allExpectedModules) {
        List<String> allActualModules = new ArrayList<>();
        for (WebElement eachModule : dashboardPage_ka.allActualModulesWE) {
            allActualModules.add(eachModule.getAttribute("aria-label"));
        }
        Assert.assertEquals(allExpectedModules, allActualModules);
    }


    @When("user clicks username icon")
    public void user_clicks_username_icon() {
        dashboardPage_ka.usernameIcon.click();
    }

    @Then("user should see {string} on top of the dropdown")
    public void user_should_see_on_top_of_the_dropdown(String username) {
        username = ConfigurationReader.getProperty("user_username");
        System.out.println("dashboardPage_ka.userName.getText() = " + dashboardPage_ka.userName.getText());
        Assert.assertEquals(username, dashboardPage_ka.userName.getText());
    }

    @When("user clicks customize button")
    public void user_clicks_customize_button() {
        dashboardPage_ka.customizeButton.click();

    }

    @When("user sees below widgets")
    public void user_sees_below_widgets(List<String> allExpectedWidgets) {
        List<String> allActualWidgets = new ArrayList<>();
        for (WebElement eachWidget : dashboardPage_ka.allActualWidgetsWE) {
            allActualWidgets.add(eachWidget.getText());
        }
        System.out.println("allActualWidgets = " + allActualWidgets);
        Assert.assertTrue(allExpectedWidgets.containsAll(allActualWidgets));
    }

    @Then("user should be able to select any widget")
    public void user_should_be_able_to_select_any_widget() {
        int numOfWidgets = dashboardPage_ka.allCheckboxes.size();
        for (int i = 0; i < numOfWidgets; i++) {
            if (dashboardPage_ka.allCheckboxes.get(i).isSelected()) {
                dashboardPage_ka.allActualWidgetsWE.get(i).click();
            }
            dashboardPage_ka.allActualWidgetsWE.get(i).click();
            Assert.assertTrue(dashboardPage_ka.allCheckboxes.get(i).isSelected());
        }
    }

    @When("user clicks set status option")
    public void user_clicks_set_status_option() {
        dashboardPage_ka.statusSelection.click();
    }

    @When("user should see below status options")
    public void user_should_see_below_status_options(List<String> allExpectedStatusOptions) {
        List<String> allActualStatusOptions = new ArrayList<>();
        for (WebElement eachStatusOption : dashboardPage_ka.allActualStatusOptionsWE) {
            allActualStatusOptions.add(eachStatusOption.getText());
        }
        System.out.println("allActualStatusOptions = " + allActualStatusOptions);

    }

    @Then("user should be able to select any option")
    public void user_should_be_able_to_select_any_option() {
        int numOfStatuses = dashboardPage_ka.allActualStatusOptionsWE.size();
        System.out.println("numOfStatuses = " + numOfStatuses);
        //dashboardPage_ka.allActualStatusOptionsWE.get(2).click();

        for (int i = 0; i < numOfStatuses; i++) {
            dashboardPage_ka.allActualStatusOptionsWE.get(i).click();
            //BrowserUtils.waitFor(1);
           WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(30));
           wait.until(ExpectedConditions.elementSelectionStateToBe(dashboardPage_ka.allRadioButtons.get(i),true));

            Assert.assertTrue(dashboardPage_ka.allRadioButtons.get(i).isSelected());

        }


    }
}




