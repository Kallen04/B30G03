package com.B30G03.pages;

import com.B30G03.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeckPage_MN {
    public DeckPage_MN() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@aria-expanded='false']")
    public WebElement hamburgerButton;
    @FindBy(xpath = "//span[@title='Add board']")
    public WebElement addBoardButton;
    @FindBy(xpath = "(//input[@type='text'])[1]")
    public WebElement newBoard;

    @FindBy(xpath = "//ul[@class='app-navigation-entry__children']")
    public WebElement allBoard;

    @FindBy(id = "stack-add")
    public WebElement plusButton;


    @FindBy(id= "new-stack-input-main")
    public WebElement newListNameTab;

    @FindBy(xpath = "//h3[@data-original-title='null']")
    public WebElement listName;

    @FindBy(xpath = "//div[@class='card-upper']")
    public WebElement cardName;

    @FindBy(xpath = "//h2[@class='app-sidebar-header__maintitle']")
    public WebElement cardName2;

    @FindBy(xpath = "(//button[@test-attr='1'])[20]")
    public WebElement ellipsisButton;

    @FindBy(xpath = "(//span[@class='action-button__text'])[6]")
    public WebElement assignToMeFeature;

    @FindBy(xpath= "//div[@class='stack__header']//button[@data-original-title='null']")
    public WebElement addCard;

    @FindBy(id = "new-stack-input-main")
    public WebElement newCardTab;

    @FindBy(xpath = "//div[@class='avatar-list']/div/div")
    public WebElement nameDisplayedOnBoard;
}
