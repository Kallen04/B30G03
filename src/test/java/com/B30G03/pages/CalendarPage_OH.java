package com.B30G03.pages;

import com.B30G03.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CalendarPage_OH {

    public CalendarPage_OH() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[contains (@href,'calendar')])[1]")
    public WebElement calendarIcon;

    @FindBy(xpath = "//button[contains (@class,'icon-view')]")
    public WebElement calendarViewIcon;

    @FindBy(xpath = "//button/span[text()='Day']")
    public WebElement calendarDayIcon;

    @FindBy(xpath = "//button/span[text()='Week']")
    public WebElement calendarWeekIcon;

    @FindBy(xpath = "//button/span[text()='Month']")
    public WebElement calendarMonthIcon;

    @FindBy(xpath = "//div[contains(@class,'Month-view')]")
    public WebElement calendarMonthView;

    @FindBy(xpath = "//div[contains(@class,'Day-view')]")
    public WebElement calendarDayView;

    @FindBy(xpath = "//div[contains(@class,'Week-view')]")
    public WebElement calendarWeekView;

    @FindBy(xpath = "//button[contains(text(),'New event')]")
    public WebElement newEventButton;

    @FindBy(xpath = "//input[@placeholder='Event title']")
    public WebElement eventTitleField;

    @FindBy(xpath = "//button[contains(text(),'Save')]")
    public WebElement eventSaveButton;

    public List<WebElement> todayDateCalendarList(String date){
        List<WebElement> list = Driver.getDriver().findElements(By.xpath("//td[@data-date='"+ date+"']//div[@class='fc-event-title']"));
        return list;

    }




}
