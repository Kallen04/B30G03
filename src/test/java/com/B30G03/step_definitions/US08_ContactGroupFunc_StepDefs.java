package com.B30G03.step_definitions;

import com.B30G03.pages.BasePage;
import com.B30G03.pages.ContactGroupFuncPage_AS;
import com.B30G03.utilities.BrowserUtils;
import com.B30G03.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US08_ContactGroupFunc_StepDefs extends BasePage {


    ContactGroupFuncPage_AS contactModule = new ContactGroupFuncPage_AS();

    // AC

    @When("user click New group plus sign")
    public void userClickNewGroupPlusSign() {
        // contactModule.newGroupPlusSign.click();
        contactModule.infoMenu.get(contactModule.infoMenu.size() - 1).click();
    }

    String actualNewGroupName = "";

    @And("user types New group name {string} and click enter")
    public void userTypesNewGroupNameAndClickEnter(String newGroupName) {
        contactModule.newBoxTextEntry.sendKeys(newGroupName + Keys.ENTER);
        actualNewGroupName = newGroupName;
    }


    @Then("user should be able to see {string} on the info menu")
    public void userShouldBeAbleToSeeOnTheInfoMenu(String expectNewGroupName) {
        String actualName = "";

        for (WebElement each : contactModule.infoMenu) {
            if (each.getText().equals(actualNewGroupName)) {
                actualName = each.getText();
                break;
            }
        }
        Assert.assertEquals(expectNewGroupName, actualName);
    }


    // AC_2

    @When("user click group dropdown menu")
    public void userClickGroupDropdownMenu() {
        contactModule.groupDropdownMenu.click();
    }


    @Then("user should see the dropdown list is matching with the contact info menu")
    public void userShouldSeeTheDropdownListIsMatchingWithTheContactInfoMenu() {



        contactModule.listGroupLEFT.remove(0);
        contactModule.listGroupLEFT.remove(0);
        contactModule.listGroupLEFT.remove(contactModule.listGroupLEFT.size()-1);

        contactModule.contactlist.get(1).click();

        List<String> listGroupNameLeft = BrowserUtils.getElementsText(contactModule.listGroupLEFT);

        List<String> listGroupNameRight = new ArrayList <>(); // -for store list from the right

        String text = "";
        for (WebElement each : contactModule.listGroupLEFT) {
            text = Driver.getDriver().findElement(By.xpath("//span[.='"+each.getText()+"']")).getText();
            listGroupNameRight.add(text);
            System.out.println("text = " + text);

        }
        Assert.assertEquals(listGroupNameLeft,listGroupNameRight);
    }


    // AC_3



    @When("user click Add new property window")
    public void userClickAddNewPropertyWindow() {
        contactModule.addPropertyWindow.click();
    }

    @And("user click {string} property from the drop down menu")
    public void userClickPropertyFromTheDropDownMenu(String anniversary) {
        int numOfProp = contactModule.allPropertyOptions.size();
        for (int i = 0; i < numOfProp; i++) {
            if (contactModule.allPropertyOptions.get(i).getAttribute("title").equals(anniversary)) {
                contactModule.allPropertyOptions.get(i).click();
                numOfProp--;
            }

        }
    }

    @Then("user should see newly created property name displayed")
    public void userShouldSeeNewlyCreatedPropertyNameDisplayed() {
        Assert.assertTrue(contactModule.addedProperty.isDisplayed());
    }
}
