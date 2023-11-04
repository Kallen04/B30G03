package com.B30G03.step_definitions;

import com.B30G03.pages.BasePage;
import com.B30G03.pages.FilesPage_BD;
import com.B30G03.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


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

    /**
     * This method still NOT working  *********
     */
    @When("user click Upload and Upload file")
    public void user_click_upload_and_upload_file() {
        //filesPageBd.uploadFileLink.click();

        String path = "/Users/bubpasawatdurand/Desktop/profilePic.jpeg";
      //  filesPageBd.uploadFileLink.sendKeys(path);

      //  BrowserUtils.waitFor(2);


    }

    /**
     *
     * this method waiting for Upload File done
     */
    @Then("user should be able to see file on the list")
    public void user_should_be_able_to_see_file_on_the_list() {

    }



}
