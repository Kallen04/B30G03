package com.B30G03.pages;

import com.B30G03.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FolderViewPage {

    public FolderViewPage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }


    @FindBy(id = "user")
    public WebElement userNameInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(xpath = "(//a[@aria-label='Files'])[1]")
    public WebElement fileIcon;

    @FindBy(xpath = "(//span[.='Name'])[1]")
    public WebElement nameIcon;

    @FindBy(xpath = "(//span[.='Size'])[1]")
    public WebElement sizeIcon;

    @FindBy(xpath = "(//span[.='Modified'])[1]")
    public WebElement modifiedIcon;

    @FindBy(id = "filestable")
    public WebElement filesTable;

    @FindBy(xpath = "//span[@class='innernametext']")
    public List<WebElement> filesAndFoldersName;

    @FindBy(xpath = "//tbody//tr")
    public List<WebElement> filesAndFoldersSize;

    @FindBy(xpath = "//tbody//tr")
    public List<WebElement> modifiedDate;

    @FindBy(xpath = "//label[@for='select_all_files']")
    public WebElement selectAllCheckBox;

    @FindBy(xpath = "//tbody//tr")
    public List<WebElement> allCheckBoxes;

    @FindBy(xpath = "//table[@class='list-container  has-controls multiselect']/thead/tr/th[2]/div/a/span[1]")
    public WebElement filesAndFoldersCount;

}
