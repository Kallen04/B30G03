package com.B30G03.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TalkModulePage_VZ extends BasePage{

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




}
