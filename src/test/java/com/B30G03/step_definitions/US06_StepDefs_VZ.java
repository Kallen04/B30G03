package com.B30G03.step_definitions;

import com.B30G03.pages.BasePage;
import com.B30G03.pages.TalkModulePage_VZ;
import com.B30G03.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US06_StepDefs_VZ extends BasePage {

    TalkModulePage_VZ talkModule = new TalkModulePage_VZ();

    @Given("user is on talk page module")
    public void user_is_on_talk_page_module() {
        clickOnModule("Talk");
        talkModule.TalkModuleButton.click();
    }

    @When("user clicks start a new conversation button")
    public void user_clicks_start_a_new_conversation_button() {

        talkModule.StartConversationButton.click();

    }

    String actualConversationName = "";


    @And("user names the conversation")
    public void user_names_the_conversation(String conversationName) {
        talkModule.ConversationNameBox.clear();
        talkModule.ConversationNameBox.sendKeys(conversationName);
        actualConversationName = conversationName;
    }

    @And("user clicks add participants button")
    public void user_clicks_add_participants_button() {

        talkModule.AddParticipantsButton.click();
    }

    @And("user adds any participant")
    public void user_adds_any_participant() {

        talkModule.SelectParticipant.click();
    }

    @And("user clicks create a new conversation button")
    public void user_clicks_create_a_new_conversation_button() {

    }

    @Then("user should see the new conversation in conversations list")
    public void user_should_see_the_new_conversation_in_conversations_list() {

    }

    // -------------- AC SCENARIO 2 -------------------

    @When("user clicks {int} dots icon next any conversation")
    public void user_clicks_dots_icon_next_any_conversation(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user clicks delete conversation button")
    public void user_clicks_delete_conversation_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user clicks yes button")
    public void user_clicks_yes_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("conversation should be deleted")
    public void conversation_should_be_deleted() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}