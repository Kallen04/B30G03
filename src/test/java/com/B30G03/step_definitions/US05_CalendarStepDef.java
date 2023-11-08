package com.B30G03.step_definitions;

import com.B30G03.pages.CalendarPage_OH;
import com.B30G03.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;


public class US05_CalendarStepDef {

    CalendarPage_OH calendarPageOH = new CalendarPage_OH();
    @Given("user clicks calendar icon")
    public void user_clicks_calendar_icon() {
        calendarPageOH.calendarIcon.click();
    }
    @When("user clicks calendar view module")
    public void user_clicks_calendar_view_module() {
        calendarPageOH.calendarViewIcon.click();
    }
    @When("user clicks week icon")
    public void user_clicks_week_icon() {
        calendarPageOH.calendarWeekIcon.click();
    }
    @Then("user sees weekly calendar view")
    public void user_sees_weekly_calendar_view() {
        Assert.assertTrue(calendarPageOH.calendarWeekView.isDisplayed());
    }
    @When("user clicks month icon")
    public void user_clicks_month_icon() {
        calendarPageOH.calendarMonthIcon.click();
    }
    @Then("user sees monthly calendar view")
    public void user_sees_monthly_calendar_view() {
        Assert.assertTrue(calendarPageOH.calendarMonthView.isDisplayed());

    }
    @When("user clicks day icon")
    public void user_clicks_day_icon() {
        calendarPageOH.calendarDayIcon.click();
    }
    @Then("user sees daily calendar view")
    public void user_sees_daily_calendar_view() {
        Assert.assertTrue(calendarPageOH.calendarDayView.isDisplayed());
    }

    @When("user clicks New event button")
    public void user_clicks_new_event_button() {
        calendarPageOH.newEventButton.click();
    }
    @When("user fills event title name {string}")
    public void user_fills_event_title_name(String eventName) {
        calendarPageOH.eventTitleField.sendKeys(eventName);
    }
    @Then("user clicks save button")
    public void user_clicks_save_button() {
        calendarPageOH.eventSaveButton.click();
    }

    @Then("user verifies {string} event is displayed")
    public void userVerifiesEventIsDisplayed(String eventName) {
        List<String> calendarTodayString = new ArrayList<>();
        for (WebElement each : calendarPageOH.todayDateCalendarList("2023-11-07")) {
            calendarTodayString.add(each.getText());
        }

        Assert.assertTrue(calendarTodayString.contains(eventName));

    }


}
