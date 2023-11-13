package com.B30G03.step_definitions;

import com.B30G03.pages.BasePage;
import com.B30G03.pages.TalkModulePage_VZ;
import com.B30G03.utilities.BrowserUtils;
import com.B30G03.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class US06_StepDefs_VZ extends BasePage {

    TalkModulePage_VZ talkModule = new TalkModulePage_VZ();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));

    String expectedConversationName;

    String actualID;


    @Given("user is on talk page module")
    public void user_is_on_talk_page_module() {
        clickOnModule("Talk");
        talkModule.TalkModuleButton.click();
    }

    @When("user clicks start a new conversation button")
    public void user_clicks_start_a_new_conversation_button() {

        talkModule.StartConversationButton.click();

    }



    @And("user names the conversation {string}")
    public void user_names_the_conversation(String conversationName) {
        talkModule.ConversationNameBox.clear();
        talkModule.ConversationNameBox.sendKeys(conversationName);
        expectedConversationName = conversationName;
    }

    @And("user presses enter")
    public void user_presses_enter() {

        talkModule.ConversationNameBox.sendKeys(Keys.ENTER);
    }

    @And("user adds any participant")
    public void user_adds_any_participant() {

       talkModule.selectParticipant(0).click();

    }

    @And("user clicks create a new conversation button")
    public void user_clicks_create_a_new_conversation_button() {

        talkModule.CreateConversationButton.click();


    }


    @Then("user should see the new conversation in conversations list")
    public void userShouldSeeTheNewConversationInConversationsList() {

        actualID = talkModule.getID();

        //Waits until conversations list reloads on page
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//ul[@class='app-navigation__list']//span[@class='acli__content__line-one__title']"), talkModule.ConversationList.size()+1));

        //Creates an empty List of Strings to user for assertion
        List<String> conversationNameList = new ArrayList<>();

        //Converts web elements from web element list into String conversation names and stores them inside the empty list
        for (WebElement element : talkModule.ConversationList) {
            conversationNameList.add(element.getText());
        }

        //Checks if our final list contains the conversation name that was newly created earlier in the code
        Assert.assertTrue(conversationNameList.contains(expectedConversationName));


    }


    // -------------- AC SCENARIO 2 -------------------

    @When("user clicks three dots icon next any conversation")
    public void user_clicks_three_dots_icon_next_any_conversation() {

        talkModule.ThreeDotsButton.click();

    }


    @When("user clicks delete conversation button")
    public void user_clicks_delete_conversation_button() {
        talkModule.DeleteConversationButton.click();

    }

    @When("user clicks yes button")
    public void user_clicks_yes_button() {
        talkModule.YesButton.click();

    }



    @Then("conversation should be deleted")
    public void conversation_should_be_deleted() {

        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//ul[@class='app-navigation__list']//span[@class='acli__content__line-one__title']"), talkModule.ConversationList.size()-1));


        List<String> conversationIDList = new ArrayList<>();


        for (WebElement element : talkModule.ConversationList) {
            conversationIDList.add(element.getAttribute("id"));
        }


        Assert.assertFalse(conversationIDList.contains(actualID));




    }



}