package com.B30G03.step_definitions;

import com.B30G03.pages.FolderViewPage;
import com.B30G03.utilities.BrowserUtils;
import com.B30G03.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.asm.Advice;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.Key;
import java.time.Duration;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class US010_StepDefs {

    FolderViewPage folderViewPage = new FolderViewPage();

    //@Background

    @When("user click on the file icon on top left")
    public void user_click_on_the_file_icon_on_top_left() {

        folderViewPage.fileIcon.click();

    }

    @Then("user can verify the file page title is {string}")
    public void user_can_verify_the_file_page_title_is(String expectedTitle) {

        BrowserUtils.verifyTitle(expectedTitle);

    }


    //@FolderViewNameIcon
    @Given("user at the File page")
    public void user_at_the_file_page() {

        System.out.println("Done by before method");

    }

    @When("user able to see the files and folders table")
    public void user_able_to_see_the_files_and_folders_table() {

        folderViewPage.filesTable.isDisplayed();

    }

    @Then("user is able to see folder view order changed after clicking the Name icon")
    public void user_is_able_to_see_folder_view_order_changed_after_clicking_the_name_icon() {

        // Create 2 list for table element
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        // Get each elements name from table and store it into list1
        for (WebElement getEachElements : folderViewPage.filesAndFoldersName) {

            list1.add(getEachElements.getText());

        }

        // Click on WebElement Name to sort the all files and folders name
        folderViewPage.nameIcon.click();

        // After all files and folders sorted, get the names and store it into list2
        for (WebElement getEachElements : folderViewPage.filesAndFoldersName) {

            list2.add(getEachElements.getText());

        }

        // Reverse list1
        Collections.reverse(list1);

        // Compare list1 and list2 is equal --> all files and folders name are sorted
        Assert.assertEquals(list1, list2);

    }


    //@FolderViewSizeIcon

    @Then("user is able to see folder view order changed after clicking the Size icon")
    public void user_is_able_to_see_folder_view_order_changed_after_clicking_the_size_icon() {



    }


    //@FolderViewModifiedIIcon

    @Then("user is able to see folder view order changed after clicking the Modified icon")
    public void user_is_able_to_see_folder_view_order_changed_after_clicking_the_modified_icon() {




    }


    //@FolderViewSelectAll


    @When("user check the select all checkbox")
    public void user_check_the_select_all_checkbox() {

    }
    @Then("user should all the files selected")
    public void user_should_all_the_files_selected() {

    }
    @Then("user should see total folders and files counted")
    public void user_should_see_total_folders_and_files_counted() {

    }
    @Then("user should see total file size displayed")
    public void user_should_see_total_file_size_displayed() {

    }


}
