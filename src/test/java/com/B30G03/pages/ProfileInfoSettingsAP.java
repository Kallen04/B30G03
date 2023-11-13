package com.B30G03.pages;

import com.B30G03.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfileInfoSettingsAP {

    public ProfileInfoSettingsAP() {
        PageFactory.initElements(Driver.getDriver(), this);


    }

    @FindBy(xpath = "//*[@id='expand']/div[1]/img")
    public WebElement ProfileInfoSettingsButton;


    @FindBy(xpath = "//*[@id='expanddiv']/ul/li[2]/a")
    public WebElement Settings;

    @FindBy(xpath="//*[@id='expanddiv']/ul/li[1]/div/span")
    public WebElement Username;

    @FindBy (xpath = "//*[@id='displayname']")
    public WebElement FullNameInputBox;

    @FindBy (xpath = "//*[@id=\"email\"]")
    public WebElement emailInputBox;

    @FindBy (xpath = "//*[@id=\"localeinput\"]")
    public WebElement SelectLanguage;

    @FindBy( xpath = "//*[@id=\"localeinput\"]/option[187]")
    public WebElement SpanishLanguage;

}