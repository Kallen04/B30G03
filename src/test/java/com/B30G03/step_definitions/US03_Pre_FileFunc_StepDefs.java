package com.B30G03.step_definitions;

import com.B30G03.pages.BasePage;
import com.B30G03.pages.FilesPage_BD;
import com.B30G03.utilities.BrowserUtils;
import com.B30G03.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public class US03_Pre_FileFunc_StepDefs extends BasePage {


    @When("user click Files module")
    public void user_click_files_module() {
        clickOnModule("Files");
    }

    FilesPage_BD filesPageBd = new FilesPage_BD();

    @When("user click + icon")
    public void user_click_icon() {
        filesPageBd.plusIcon.click();
    }
    @When("user click Upload and Upload file")
    public void user_click_upload_and_upload_file() {
        String path = "/Users/bubpasawatdurand/Desktop/profilePic.jpeg";
        filesPageBd.uploadFileLink.sendKeys(path);
    }

    @Then("user should be able to see file photo {string} on the list")
    public void user_should_be_able_to_see_file_photo_on_the_list(String expectFileName) {

        BrowserUtils.waitForVisibility(filesPageBd.listOfFile.get(0) , 5);
        String actualFileName = "";
        for (WebElement each : filesPageBd.listOfFile) {
            if(each.getText().contains(expectFileName)){
                actualFileName = each.getText();
                Assert.assertTrue(actualFileName.contains(expectFileName));
                break;
            }
        }

    }



}
