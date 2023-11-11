package com.B30G03.step_definitions;

import com.B30G03.pages.BasePage;
import com.B30G03.pages.FilesPage_II;
import com.B30G03.utilities.BrowserUtils;
import com.B30G03.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class US02_FileStepDef extends BasePage {

    FilesPage_II filespage = new FilesPage_II();
    List<String> beforeDeleting = new ArrayList<>();



    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));



    @Given("the user is on the Files module")
    public void the_user_is_on_the_files_module() {

        clickMenuByText("Files");
        filespage.plusIcon.click();


    }

    @Then("user should be able to see Files page")
    public void user_should_be_able_to_see_Files_page() {
        BrowserUtils.verifyTitle("Files - Trycloud QA");
    }


    @When("the user clicks on the {string} button")
    public void theUserClicksOnTheButton(String arg0) {

        filespage.plusIcon.click();



    }

    @Then("selects a file to upload")
    public void selectsAFileToUpload() {
        String path ="/Users/inciigin/Desktop/funny stafff.txt";

        filespage.uploadFileLink.sendKeys(path);

        BrowserUtils.sleep(2);



    }



    @And("the uploaded file should be visible in the file list")
    public void theUploadedFileShouldBeVisibleInTheFileList() {

       filespage.checkFileList.isDisplayed();
    }




    @When("the user clicks on the {string} option.")
    public void theUserClicksOnTheOption(String NewFolder) {

        BrowserUtils.doubleClick(filespage.clickfolder);
        BrowserUtils.sleep(2);

    }

    @And("enters a folder name.")
    public void entersAFolderName() {

        filespage.type.sendKeys("TestByIn"+ Keys.ENTER);
    }

    @And("click arrow sign , right next to the text box.")
    public void clickArrowSignRightNextToTheTextBox() {


    }


    @Then("a new folder with the specified name should be created.")
    public void aNewFolderWithTheSpecifiedNameShouldBeCreated() {


    }

    @And("the new folder should be visible in the file list.")
    public void theNewFolderShouldBeVisibleInTheFileList() {

        filespage.checkFileList.isDisplayed();
    }


    //========================================================


    @Given("the user is on the Files modules")
    public void theUserIsOnTheFilesModules() {
        clickMenuByText("Files");

        filespage.deletedFilesTab.click();

    }

    @And("there is at least one item in the file list")
    public void thereIsAtLeastOneItemInTheFileList() {


    }


    @When("the user selects an item and clicks on the three dots menu")
    public void theUserSelectsAnItemAndClicksOnTheThreeDotsMenu() {



        for (WebElement each : filespage.deletedFileList) {
            beforeDeleting.add(each.getText());
        }
        filespage.selectFileToDeleteXPath(0).click();

    }



    @And("chooses the {string} option")
    public void choosesTheOption(String arg0) {

        filespage.deletePermanently.click();

    }


    @Then("the selected item should be deleted")
    public void theSelectedItemShouldBeDeleted() {


        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("(//tbody[@id=\"fileList\"])[12]//tr"), filespage.deletedFileList.size() - 1));

        List<String> afterDeleting = new ArrayList<>();
        for (WebElement each : filespage.deletedFileList) {
            afterDeleting.add(each.getText());
        }

        Assert.assertNotEquals(beforeDeleting, afterDeleting);
    }



    @And("it should no longer appear in the file list")
    public void itShouldNoLongerAppearInTheFileList() {




    }




    //====================================================



    @Given("the user is on the Files module page")
    public void theUserIsOnTheFilesModulePage() {

        clickMenuByText("Files");

        filespage.deletedFilesTab.click();
    }

    @And("there are multiple files and folders in the file list")
    public void thereAreMultipleFilesAndFoldersInTheFileList() {


    }



    @Then("an accurate count of files and folders should be displayed")
    public void anAccurateCountOfFilesAndFoldersShouldBeDisplayed() {

        List<WebElement> document = Driver.getDriver().findElements(By.xpath("//tbody[@id=\"fileList\"]/tr"));
        int dokumentCount = document.size();
        System.out.println("Number of document on the page: " + dokumentCount);


        if (dokumentCount > 5) {
            System.out.println("There are more than 5 document on the page.");
        } else {
            System.out.println("There are not more than 5 document on the page.");
        }




    }
















    @And("the count should update in real-time as items are added or deleted")
    public void theCountShouldUpdateInRealTimeAsItemsAreAddedOrDeleted() {
    }
}







