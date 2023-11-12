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
import org.openqa.selenium.support.ui.Select;

public class US014_ProfileInfoSettingsFunctionality{

    ProfileInfoSettingsAP profileSettingsFunctionality = new ProfileInfoSettingsAP();

    @Given("User is on TryCloud Dashboard")
    public void userIsOnTryCloudDashboard() {
        BrowserUtils.verifyTitleContains("Dashboard - Trycloud QA");
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
        String username= profileSettingsFunctionality.Username.getText();
        String FullName=profileSettingsFunctionality.FullNameInputBox.getText();

        Assert.assertEquals(username,FullName);

    }

    @Given("user is on Profile Info Page")
    public void userIsOnProfileInfoPage() {
        profileSettingsFunctionality.ProfileInfoSettingsButton.click();
    }


    @When("user click on  email input box")
    public void userClickOnEmailInputBox() {
        profileSettingsFunctionality.emailInputBox.click();
    }

    @Then("user is able to enter proper email")
    public void userIsAbleToEnterProperEmail() {
        profileSettingsFunctionality.emailInputBox.sendKeys("andjela007@gmail.com");
    }

    @Given("Given User is on TryCloud Dashboard")
    public void givenUserIsOnTryCloudDashboard() {
        BrowserUtils.verifyTitleContains("Dashboard - Trycloud QA");
    }
    @When("user click and select Language")
    public void userClickAndSelectLanguage() {
        profileSettingsFunctionality.SelectLanguage.click();
    }

    @Then("the given language is changed")
    public void theGivenLanguageIsChanged() {

    }
}
