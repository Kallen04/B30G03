package com.B30G03.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FolderViewPage {


    @FindBy(xpath = "(//a[@aria-label='Files'])[1]")
    public WebElement fileIcon;

    @FindBy(xpath = "(//span[.='Name'])[1]")
    public WebElement nameIcon;

    @FindBy(xpath = "(//span[.='Size'])[1]")
    public WebElement sizeIcon;

    @FindBy(xpath = "(//span[.='Modified'])[1]")
    public WebElement modifiedIcon;

}
