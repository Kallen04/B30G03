package com.B30G03.step_definitions;

import com.B30G03.pages.FolderViewPage;
import com.B30G03.utilities.BrowserUtils;
import com.B30G03.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class US010_StepDefs {

    // Creating page object
    FolderViewPage folderViewPage = new FolderViewPage();

    //@Background
    @When("user click on the file icon on top left")
    public void user_click_on_the_file_icon_on_top_left() {

        // Click the file icon on top left
        folderViewPage.fileIcon.click();

    }

    @Then("user can verify the file page title is {string}")
    public void user_can_verify_the_file_page_title_is(String expectedTitle) {

        // Verify the title of file and folder page
        BrowserUtils.verifyTitle(expectedTitle);

    }


    //@FolderViewNameIcon
    @Given("user at the File page")
    public void user_at_the_file_page() {

        // this function is done by before method
        System.out.println("Done by before method");

    }

    @When("user click on the Name icon")
    public void user_click_on_the_name_icon() {

        // User click on the Name icon
        folderViewPage.nameIcon.click();

    }

    @Then("user is able to see folder view order changed")
    public void user_is_able_to_see_folder_view_order_changed_after_clicking_the_name_icon() {

        // Create 2 list for table element
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();


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
    @When("user click on the Size icon")
    public void user_click_on_the_size_icon() {

        // User click on the Size icon
        folderViewPage.sizeIcon.click();

    }

    @Then("user is able to see folder view order changed after clicking the Size icon")
    public void user_is_able_to_see_folder_view_order_changed_after_clicking_the_size_icon() {

        // Create 2 list for table element
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        // Get each elements name from table and store it into list1
        for (WebElement eachElement : folderViewPage.filesAndFoldersSize) {

            // Get eachElement's data-size attribute then cast string to integer using parseInt(), then put it in the list
            list1.add(Integer.parseInt(eachElement.getAttribute("data-size")));

        }

        // Click on Size icon to sort the all files and folders by size
        folderViewPage.sizeIcon.click();

        // After all files and folders sorted, get the size and store it into list2
        for (WebElement eachElement : folderViewPage.filesAndFoldersSize) {

            // Get eachElement's data-size attribute then cast string to integer using parseInt(), then put it in the list
            list2.add(Integer.parseInt(eachElement.getAttribute("data-size")));

        }

        // Reverse list1
        Collections.reverse(list1);

        // Compare list1 and list2 is equal --> all files and folders name are sorted
        Assert.assertEquals(list1, list2);

    }


    //@FolderViewModifiedIIcon
    @When("user click on the Modified icon")
    public void user_click_on_the_modified_icon() {

        // User click on the Modified icon
        folderViewPage.modifiedIcon.click();
    }

    @Then("user is able to see folder view order changed after clicking the Modified icon")
    public void user_is_able_to_see_folder_view_order_changed_after_clicking_the_modified_icon() {

        // Create 2 list for table element
        List<Long> list1 = new ArrayList<>();
        List<Long> list2 = new ArrayList<>();

        // Get each element's modified date from table and store it into list1
        for (WebElement eachElement : folderViewPage.modifiedDate) {

            // Get eachElement's data-size attribute then cast string to long using parseLong(), then put it in the list
            list1.add(Long.parseLong(eachElement.getAttribute("data-mtime")));

        }

        // Click on Modified icon to sort the all files and folders by date
        folderViewPage.modifiedIcon.click();

        // After all files and folders sorted, get the dates and store it into list2
        for (WebElement eachElement : folderViewPage.modifiedDate) {

            // Get eachElement's data-size attribute then cast string to long using parseLong(), then put it in the list
            list2.add(Long.parseLong(eachElement.getAttribute("data-mtime")));

        }

        // Reverse list1
        Collections.reverse(list1);

        // Compare list1 and list2 is equal --> all files and folders name are sorted
        Assert.assertEquals(list1, list2);

    }


    //@FolderViewSelectAll
    @When("user check the select all checkbox")
    public void user_check_the_select_all_checkbox() {

        // User click on select all check box
        folderViewPage.selectAllCheckBox.click();

    }
    @Then("user should see all the folders and files are selected")
    public void user_should_all_the_files_selected() {

        // Iterate all the elements.
        for (WebElement eachCheckBox : folderViewPage.allCheckBoxes) {

            // Check if all the checkboxes are selected (isSelected() method didn't work)
            Assert.assertTrue(eachCheckBox.getAttribute("class").equals("ui-droppable selected") || eachCheckBox.getAttribute("class").equals("selected"));

        }

    }
    @Then("user should see total folders and files counted when they select the checkbox")
    public void user_should_see_total_folders_and_files_counted() {

        // Create two int object for count the files and folders.
        int i = 0;
        int j = 0;

        // Iterate all the table elements
        for (WebElement eachCheckBox : folderViewPage.allCheckBoxes) {

            // If the file or folder is selected
            if(eachCheckBox.getAttribute("class").equals("ui-droppable selected") || eachCheckBox.getAttribute("class").equals("selected")){

                // And if the data-type is folder, "i" is count for folder
                if(eachCheckBox.getAttribute("data-type").equals("dir")){

                    i++;

                // If the data-type is file, "j" is count for file
                }else if(eachCheckBox.getAttribute("data-type").equals("file")){

                    j++;

                }

            }

        }

        // Assert the actual text is matched with expected text
        Assert.assertEquals(folderViewPage.filesAndFoldersCount.getText(),i + " folders and " + j + " files");

    }

}
