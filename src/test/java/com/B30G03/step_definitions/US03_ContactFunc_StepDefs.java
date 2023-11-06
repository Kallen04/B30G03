package com.B30G03.step_definitions;

import com.B30G03.pages.BasePage;
import com.B30G03.pages.ContactPage_BD;
import com.B30G03.utilities.BrowserUtils;
import com.B30G03.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US03_ContactFunc_StepDefs extends BasePage {


    @When("user click Contacts module")
    public void user_click_contacts_module() {
        clickOnModule("Contacts");
    }

    @Then("user should be able to see Contact page")
    public void user_should_be_able_to_see_contact_page() {
        BrowserUtils.verifyTitle("Contacts - Trycloud QA");
    }

    //----- US03 AC01

    ContactPage_BD contactPage = new ContactPage_BD();

    @When("user click New contact")
    public void user_click_new_contact() {
        contactPage.newContactBtn.click();
    }

    String actualNameAdd = "";

    @Then("user enter name and last name {string}")
    public void user_enter_name_and_last_name(String fullName) {
        contactPage.contactFullNameInput.clear();
        contactPage.contactFullNameInput.sendKeys(fullName);
        actualNameAdd = fullName;
    }

    @Then("user enter Phone number {string}")
    public void user_enter_phone_number(String phoneNumber) {
        contactPage.phoneInput.sendKeys(phoneNumber);
    }

    @Then("user enter Email {string}")
    public void user_enter_email(String email) {
        contactPage.emailInput.sendKeys(email);
    }

    @Then("user enter Post Office box {string}")
    public void user_enter_post_office_box(String poBox) {
        contactPage.poBoxInput.sendKeys(poBox);
    }

    @Then("user enter address {string}")
    public void user_enter_address(String address) {
        contactPage.addressInput.sendKeys(address);
    }

    @Then("user enter Extended address {string}")
    public void user_enter_extended_address(String extendAddress) {
        contactPage.extendAddressInput.sendKeys(extendAddress);
    }

    @Then("user enter Postal code {string}")
    public void user_enter_postal_code(String postal) {
        contactPage.postalInput.sendKeys(postal);
    }

    @Then("user enter City {string}")
    public void user_enter_city(String city) {
        contactPage.cityInput.sendKeys(city);
    }

    @Then("user enter State {string}")
    public void user_enter_state(String state) {
        contactPage.stateInput.sendKeys(state);
    }

    @Then("user enter country {string}")
    public void user_enter_country(String country) {
        contactPage.countryInput.sendKeys(country);
    }

    @Then("user should be able to see {string} on the list")
    public void user_should_be_able_to_see_on_the_list(String expectName) {
        String actualName = "";
       // System.out.println("actualNameAdd = " + actualNameAdd);
        for (WebElement each : contactPage.contactlist) {
            //System.out.println("each.getText() = " + each.getText());
            if(each.getText().equals(actualNameAdd)){
                actualName = each.getText();
                break;
            }
            //System.out.println("actualName = " + actualName);
        }
        Assert.assertEquals(expectName, actualName);
    }

    // -----------US03 AC02 -------------------

    @When("user click all contacts")
    public void user_click_all_contacts() {
        contactPage.allContactLink.click();
    }
    @When("user see total number of list")
    public void user_see_total_number_of_list() {
        Assert.assertTrue(contactPage.totalContactNumber.isDisplayed());

    }
    @Then("user should be able to see whole list matching with total number of the list")
    public void user_should_be_able_to_see_whole_list_matching_with_total_number_of_the_list() {
        Assert.assertEquals(
                contactPage.totalContactNumber.getText(),
                Integer.toString(contactPage.contactlist.size())
        );
    }

    // -----------US03 AC03 -------------------


    @When("user click photo icon")
    public void user_click_photo_icon() {
        contactPage.photoIcon.click();
    }

    @When("user click Choose from Files")
    public void user_click_choose_from_files() {
        contactPage.chooseFromFileLink.click();
    }

    @And("user choose file name {string} file")
    public void userChooseFileNameFile(String fileName) {

        WebElement photoFile = Driver.getDriver().findElement(By.xpath("//tr[@data-entryname='" + fileName +"']"));
        photoFile.click();
        contactPage.chooseButton.click();

    }

    @Then("user should be able to see photo on profile")
    public void user_should_be_able_to_see_photo_on_profile() {
        Assert.assertTrue(contactPage.profilePhoto.isEnabled());
    }


    // -----------US03 AC04 -------------------

    @When("user click {string} from list contact")
    public void user_click_from_list_contact(String expectNameDelete) {

        for (WebElement each : contactPage.contactlist) {
            if (each.getText().equals(expectNameDelete)){
                each.click();
                break;
            }
        }
    }


    @When("user click three dots icon")
    public void user_click_three_dots_icon() {
        contactPage.threeDotsIcon.get(contactPage.threeDotsIcon.size()-1).click();
    }

    @When("user click Delete menu")
    public void user_click_delete_menu() {
       contactPage.deleteLink.click();
    }

    @Then("user should be able to see {string} on the page")
    public void user_should_be_able_to_on_the_page(String expectText) {

        String actualText = contactPage.textAfterDelete.getText();
        Assert.assertEquals(expectText,actualText);

    }



}
