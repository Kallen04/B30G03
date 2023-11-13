package com.B30G03.pages;

import com.B30G03.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class ContactGroupFuncPage_AS {
    public ContactGroupFuncPage_AS() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(xpath = "//input[@class='action-input__input focusable']")
    public WebElement newBoxTextEntry;

    @FindBy(xpath = "//div[@class='app-navigation-entry-icon']/following-sibling::span")
    public List<WebElement> infoMenu;

    @FindBy(xpath = "//*[@id=\"app-content-wrapper\"]/div[2]/section/div[3]/div/div[2]/div[2]/input")
    public WebElement groupDropdownMenu;




    @FindBy(xpath = "//span[@class='app-navigation-entry__title']")
    public List <WebElement> listGroupLEFT;

    @FindBy(xpath = "//div[@class='app-content-list-item-line-one']")
    public List<WebElement> contactlist;





    @FindBy(xpath = "//*[@id=\"app-content-wrapper\"]/div[2]/section/div[4]/div/div[2]/div[2]/input")
    public WebElement addPropertyWindow;

    @FindBy(xpath = "(//ul[@class='multiselect__content']/li/span/div[@data-v-f855c4b8])")
    public List <WebElement> allPropertyOptions;

    @FindBy(xpath = "//div[@class='property__value mx-datepicker']")
    public WebElement addedProperty;



}
