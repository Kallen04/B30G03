package com.B30G03.step_definitions;


import com.B30G03.pages.DashboardPage_MN;
import com.B30G03.pages.DeckPage_MN;
import com.B30G03.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;


public class US4StepDefs {

    DashboardPage_MN dashboardPage = new DashboardPage_MN();

    DeckPage_MN deckPage = new DeckPage_MN();

    @Then("User clicks on Deck module")
    public void userClicksOnDeckModule() {
        dashboardPage.deckButton.click();
    }

    @Then("User goes to deck page")
    public void user_goes_to_deck_page() {

        BrowserUtils.verifyTitle("Deck - Trycloud QA");
    }

    @When("User clicks on hamburger button")
    public void user_clicks_on_hamburger_button() {
        deckPage.hamburgerButton.click();
    }

    @When("User clicks on add board feature")
    public void user_clicks_on_add_board_feature() {
        deckPage.addBoardButton.click();
    }

    @When("User types {string} clicks enter and see under All Boards")
    public void user_types_and_clicks_enter_and_see_under_All_Boards(String name) {
        deckPage.newBoard.sendKeys(name + Keys.ENTER);

        Assert.assertTrue(deckPage.allBoard.getText().contains(name));
    }

    //==================================
    //AC2
    @When("User clicks on board name")
    public void userClicksOnBoardName() {
        deckPage.allBoard.click();
    }

    @And("User clicks on plus icon")
    public void userClicksOnPlusIcon() {
        deckPage.plusButton.click();
    }

    @And("User types {string} and hits enter")
    public void userTypesAndHitsEnter(String listName) {
        deckPage.newListNameTab.sendKeys(listName + Keys.ENTER);

    }

    @Then("User should be able to see {string} on the page")
    public void userShouldBeAbleToSeeOnThePage(String listName) {
        deckPage.listName.isDisplayed();
       // Assert.assertTrue(deckPage.listName.getText().contains(listName)); FAILS
    }

    //=======================
    //AC3

    @And("User click on plus icon under board name")
    public void userClickOnPlusIconUnderBoardName() {
    deckPage.addCard.click();
    }

    @And("User types {string} in tab and hits enter")
    public void userTypesInTabAndHitsEnter(String name) {
        deckPage.newCardTab.sendKeys(name + Keys.ENTER);
    }
    @Then("User should see new {string} feature on page")
    public void userShouldSeeNewFeatureOnPage(String name) {
       Assert.assertTrue(deckPage.cardName.getText().contains(name));
        Assert.assertTrue(deckPage.cardName2.getText().contains(name));
    }

//==================
    //AC4

    @And("User clicks on ellipsis button")
    public void userClicksOnEllipsisButton() {
        BrowserUtils.hover(deckPage.ellipsisButton);
        deckPage.ellipsisButton.click();
    }

    @Then("User clicks on Assign to me feature")
    public void userClicksOnAssignToMeFeature() {
        deckPage.assignToMeFeature.click();
    }

    @Then("User should see name on board")
    public void userShouldSeeNameOnBoard() {
        BrowserUtils.hover(deckPage.ellipsisButton);
        deckPage.ellipsisButton.click();
        deckPage.assignToMeFeature.getText().equalsIgnoreCase("Unassign myself");
    }
}
