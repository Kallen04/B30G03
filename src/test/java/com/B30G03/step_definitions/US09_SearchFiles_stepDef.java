package com.B30G03.step_definitions;

import com.B30G03.pages.BasePage;
import com.B30G03.pages.DashboardPage_JS;
import com.B30G03.pages.FilePage_JS;
import com.B30G03.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US09_SearchFiles_stepDef extends BasePage {
    FilePage_JS filePageJs=new FilePage_JS();
DashboardPage_JS dashboardPageJs=new DashboardPage_JS();
    @Given("User is on the File Module")
    public void user_is_on_the_file_module() {
       clickOnModule("Files");
    }
    @When("User click on the magnifying glass icon")
    public void user_click_on_the_magnifying_glass_icon() {
        dashboardPageJs.searchButton.click();
    }
    @And("User type {string}in the search input field")
    public void userTypeInTheSearchInputField(String fileName) {
        dashboardPageJs.searchBox.sendKeys(fileName);
    }

    @Then("User should see {string} that matches the search")
    public void userShouldSeeThatMatchesTheSearch(String fileName) {
        Assert.assertTrue(filePageJs.matchingSearchResult.isDisplayed());
        String actualMatchingSearchResult=filePageJs.matchingSearchResult.getText();
        Assert.assertTrue(actualMatchingSearchResult.contains(fileName));
    }


    @When("User click on file that matches the search")
    public void user_click_on_file_that_matches_the_search() {
       filePageJs.matchingSearchResult.click();
    }


    @Then("User should see matching {string} details in Files Module")
    public void userShouldSeeMatchingDetailsInFilesModule(String fileName) {
        List<WebElement> allFiles= Driver.getDriver().findElements(By.xpath("//span[@class='innernametext']"));

        for (WebElement each : allFiles) {


            if(each.getText().equals(fileName)){
                Assert.assertEquals(fileName,each.getText());
            }
        }

        Assert.assertTrue(filePageJs.fileHeader.isDisplayed());


    }



}
