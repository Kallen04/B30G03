package com.B30G03.pages;

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

    @FindBy  (xpath="//button[text()='Add participants']")
    public WebElement AddParticipantsButton;

    @FindBy (xpath = "//li[@class='participant-row isSearched']")
    public WebElement SelectParticipant;

    @FindBy (xpath = "//button[text()='Create conversation']")
    public WebElement CreateConversationButton;

    @FindBy (className = "conversations")
    public List<WebElement> ConversationList;

    @FindBy (xpath = "//button[@aria-label='Conversation settings']")
    public WebElement ConversationSettingsButton;

    @FindBy (xpath = "//span[text()='Delete conversation']")
    public WebElement DeleteConversationButton;

    @FindBy (xpath = "//button[text()='Yes']")
    public WebElement YesButton;




}
