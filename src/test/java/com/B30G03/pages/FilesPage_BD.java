package com.B30G03.pages;

import com.B30G03.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilesPage_BD {

    public FilesPage_BD(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='icon icon-add']")
    public WebElement plusIcon;

    @FindBy(xpath = "(//span[@class='displayname'])[1]")
    public WebElement uploadFileLink;

}
