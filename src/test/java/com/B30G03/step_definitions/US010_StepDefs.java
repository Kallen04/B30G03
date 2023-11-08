package com.B30G03.step_definitions;

import com.B30G03.pages.FolderViewPage;
import com.B30G03.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
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

        // First click for preparation
        folderViewPage.nameIcon.click();

        // Get each elements name from table and store it into list1
        for (WebElement eachElements : folderViewPage.filesAndFoldersName) {

            list1.add(eachElements.getText());

        }

        // Click on WebElement Name to sort the all files and folders name
        folderViewPage.nameIcon.click();

        // After all files and folders sorted, get the names and store it into list2
        for (WebElement eachElements : folderViewPage.filesAndFoldersName) {

            list2.add(eachElements.getText());

        }

        // Reverse list1
        Collections.reverse(list1);

        // Compare list1 and list2 is equal --> all files and folders name are sorted
        Assert.assertEquals(list1, list2);

    }


    //@FolderViewSizeIcon

    @Then("user is able to see folder view order changed after clicking the Size icon")
    public void user_is_able_to_see_folder_view_order_changed_after_clicking_the_size_icon() {

        // Create 2 list for table element
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        // First click for preparation
        folderViewPage.sizeIcon.click();

        // Get each elements name from table and store it into list1
        for (WebElement eachElement : folderViewPage.filesAndFoldersSize) {

            // Get eachElement's data-size attribute then cast string to integer using parseInt(), then put it in the list
            list1.add(Integer.parseInt(eachElement.getAttribute("data-size")));

        }

        System.out.println(list1);

        // Click on Size icon to sort the all files and folders name
        folderViewPage.sizeIcon.click();

        // After all files and folders sorted, get the names and store it into list2
        for (WebElement eachElement : folderViewPage.filesAndFoldersSize) {

            // Get eachElement's data-size attribute then cast string to integer using parseInt(), then put it in the list
            list2.add(Integer.parseInt(eachElement.getAttribute("data-size")));

        }

        System.out.println(list2);

        // Reverse list1
        Collections.reverse(list1);

        System.out.println(list1);

        // Compare list1 and list2 is equal --> all files and folders name are sorted
        Assert.assertEquals(list1, list2);


    }


    //@FolderViewModifiedIIcon

    @Then("user is able to see folder view order changed after clicking the Modified icon")
    public void user_is_able_to_see_folder_view_order_changed_after_clicking_the_modified_icon() {

        // Create 2 list for table element
        List<Long> list1 = new ArrayList<>();
        List<Long> list2 = new ArrayList<>();

        // First click for preparation
        folderViewPage.modifiedIcon.click();

        // Get each elements name from table and store it into list1
        for (WebElement eachElement : folderViewPage.modifiedDate) {

            // Get eachElement's data-size attribute then cast string to integer using parseInt(), then put it in the list
            list1.add(Long.parseLong(eachElement.getAttribute("data-mtime")));

        }

        System.out.println(list1);

        // Click on Size icon to sort the all files and folders name
        folderViewPage.modifiedIcon.click();

        // After all files and folders sorted, get the names and store it into list2
        for (WebElement eachElement : folderViewPage.modifiedDate) {

            // Get eachElement's data-size attribute then cast string to integer using parseInt(), then put it in the list
            list2.add(Long.parseLong(eachElement.getAttribute("data-mtime")));

        }

        System.out.println(list2);

        // Reverse list1
        Collections.reverse(list1);

        System.out.println(list1);

        // Compare list1 and list2 is equal --> all files and folders name are sorted
        Assert.assertEquals(list1, list2);

    }


    //@FolderViewSelectAll

    @When("user check the select all checkbox")
    public void user_check_the_select_all_checkbox() {

        folderViewPage.selectAllCheckBox.click();

    }
    @Then("user should see all the files selected")
    public void user_should_all_the_files_selected() {

        for (WebElement eachCheckBox : folderViewPage.allCheckBoxes) {

            eachCheckBox.isSelected();
            System.out.println(eachCheckBox.isSelected());

        }



    }
    @Then("user should see total folders and files counted")
    public void user_should_see_total_folders_and_files_counted() {

    }
    @Then("user should see total file size displayed")
    public void user_should_see_total_file_size_displayed() {

    }


}
