package com.B30G03.pages;

import com.B30G03.step_definitions.US06_StepDefs_VZ;
import com.B30G03.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TalkModulePage_VZ {

    public TalkModulePage_VZ(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//a[@aria-label='Talk']")
    public WebElement TalkModuleButton;

    @FindBy (xpath = "//button[@aria-label='Create a new group conversation']")
    public WebElement StartConversationButton;

    @FindBy (className = "conversation-name")
    public WebElement ConversationNameBox;

    @FindBy (xpath = "//li[@class='participant-row isSearched']/..")
    public List<WebElement> ParticipantsList;

    @FindBy (xpath = "//button[contains(@class, 'button-right primary')]")
    public WebElement CreateConversationButton;

    @FindBy (xpath = "//ul[@class='app-navigation__list']//span[@class='acli__content__line-one__title']")
    public List<WebElement> ConversationList;

    @FindBy (xpath = "//ul[@class='app-navigation__list']//span[@class='acli__content__line-one__title']")
    public WebElement newConversation;

    @FindBy (xpath = "//button[@aria-label='Conversation settings']")
    public WebElement ThreeDotsButton;


    @FindBy (xpath = "//span[text()='Delete conversation']")
    public WebElement DeleteConversationButton;

    @FindBy (xpath = "//button[text()='Yes']")
    public WebElement YesButton;


    public WebElement selectParticipant(int index){

        return ParticipantsList.get(index);
    }

    public String getID (){

        return  newConversation.getAttribute("id");
    }






}
