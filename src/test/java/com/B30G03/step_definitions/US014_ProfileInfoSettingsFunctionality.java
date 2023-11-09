package com.B30G03.step_definitions;

import com.B30G03.pages.BasePage;
import com.B30G03.pages.LoginPage;
import com.B30G03.pages.ProfileInfoSettingsAP;
import com.B30G03.utilities.BrowserUtils;
import com.B30G03.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US014_ProfileInfoSettingsFunctionality extends BasePage {

    ProfileInfoSettingsAP profileSettingsFunctionality = new ProfileInfoSettingsAP();

    @Given("User is on TryCloud Dashboard")
    public void userIsOnTryCloudDashboard() {
        BrowserUtils.verifyTitleContains("dashboard");
        Assert.assertEquals(Driver.getDriver().getTitle(), "dashboard");
    }

    @When("user click on User Profile")
    public void userClickOnUserProfile() {

        profileSettingsFunctionality.ProfileInfoSettingsButton.click();
    }


    @Then("user click to Settings")
    public void userClickToSettings() {

        profileSettingsFunctionality.Settings.click();
    }

    @Then("Username is same as full name")
    public void usernameIsSameAsFullName() {
    }

    @When("user is on  email input box")
    public void userIsOnEmailInputBox() {
    }

    @Given("user is on Profile Info Page")
    public void userIsOnProfileInfoPage() {
    }

    @When("user click and select Language")
    public void userClickAndSelectLanguage() {
    }

    @Then("the given language is changed")
    public void theGivenLanguageIsChanged() {
    }

    @Then("user is available to enter proper email")
    public void userIsAvailableToEnterProperEmail() {
    }

    @Then("user is able to enter proper email")
    public void userIsAbleToEnterProperEmail() {
    }

    @Given("Given User is on TryCloud Dashboard")
    public void givenUserIsOnTryCloudDashboard() {

    }

    @When("user click on  email input box")
    public void userClickOnEmailInputBox() {
    }
}
