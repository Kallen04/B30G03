package com.B30G03.step_definitions;

import com.B30G03.pages.LoginPage;
import com.B30G03.utilities.BrowserUtils;
import com.B30G03.utilities.ConfigurationReader;
import com.B30G03.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();


    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
      //  System.out.println("Login url is entered in Hooks");;
    }


    @When("user enters the user information")
    public void userEntersTheUserInformation() {
        loginPage.login(ConfigurationReader.getProperty("user_username"), ConfigurationReader.getProperty("user_password"));

    }

    @Then("user should be able to login")
    public void userShouldBeAbleToLogin() {
        BrowserUtils.verifyTitle("Dashboard - Trycloud QA");

    }

    @When("user enters the employee information")
    public void userEntersTheEmployeeInformation() {
        loginPage.login(ConfigurationReader.getProperty("employee_username"), ConfigurationReader.getProperty("employee_password"));
    }

}
