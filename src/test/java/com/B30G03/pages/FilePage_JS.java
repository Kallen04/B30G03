package com.B30G03.pages;

import com.B30G03.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilePage_JS {

    public FilePage_JS(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//h2[@class='app-sidebar-header__maintitle']")
    public WebElement fileHeader;






    @FindBy(xpath = "//a[@aria-label='Files']")
    public WebElement fileModuleIcon;
    @FindBy(xpath = "//h3[@class='unified-search__result-line-one']/span/strong")
    public WebElement matchingSearchResult;



}
