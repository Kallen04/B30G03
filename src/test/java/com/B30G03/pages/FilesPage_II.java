package com.B30G03.pages;

import com.B30G03.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FilesPage_II extends BasePage{


    public FilesPage_II(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//span[@class='icon icon-add']")
    public WebElement plusIcon;
    @FindBy(xpath = "//input[@type='file']")
    public WebElement uploadFileLink;

    @FindBy(xpath ="//a[@data-templatename='New folder']")
    public WebElement clickfolder;

    @FindBy(id = "view13-input-folder")
    public WebElement type;


    //======================================

    @FindBy(xpath = "//a[.='Deleted files']")
    public WebElement deletedFilesTab;



    @FindBy(xpath = "//td[@class='filename ui-draggable ui-draggable-handle']")
    public WebElement checkFileList;



    @FindBy(xpath = "(//tbody[@id='fileList'])[12]//tr")
    public List<WebElement> deletedFileList;

    ////*[@id="filestable"]/tfoot/tr/td[2]/span/span[1]

    //

    @FindBy(xpath = "(//table[@id='filestable']//tbody)[12]/tr/td/a/span/a[2]")
    public List<WebElement> threeDotsButton;



    @FindBy(xpath = "(//span[.='Delete permanently'])[2]")
    public WebElement deletePermanently;






    @FindBy(xpath = "//tbody[@id=\"fileList\"]/tr")
    public List<WebElement> totalcount;




    public WebElement selectFileToDeleteXPath(int index) {
        return threeDotsButton.get(index);
    }




}

