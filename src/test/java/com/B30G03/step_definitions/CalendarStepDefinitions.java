package com.B30G03.step_definitions;

import com.B30G03.pages.CalendarPage;
import com.B30G03.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class CalendarStepDefinitions {

    CalendarPage calendarPage = new CalendarPage();
    @Given("user clicks calendar icon")
    public void user_clicks_calendar_icon() {
        calendarPage.calendarIcon.click();
    }
    @When("user clicks calendar view module")
    public void user_clicks_calendar_view_module() {
        calendarPage.calendarViewIcon.click();
    }
    @When("user clicks week icon")
    public void user_clicks_week_icon() {
        calendarPage.calendarWeekIcon.click();
    }
    @Then("user sees weekly calendar view")
    public void user_sees_weekly_calendar_view() {
        Assert.assertTrue(calendarPage.calendarWeekView.isDisplayed());
    }
    @When("user clicks month icon")
    public void user_clicks_month_icon() {
        calendarPage.calendarMonthIcon.click();
    }
    @Then("user sees monthly calendar view")
    public void user_sees_monthly_calendar_view() {
        Assert.assertTrue(calendarPage.calendarMonthView.isDisplayed());

    }
    @When("user clicks day icon")
    public void user_clicks_day_icon() {
        calendarPage.calendarDayIcon.click();
    }
    @Then("user sees daily calendar view")
    public void user_sees_daily_calendar_view() {
        Assert.assertTrue(calendarPage.calendarDayView.isDisplayed());
    }

    @When("user clicks New event button")
    public void user_clicks_new_event_button() {
        calendarPage.newEventButton.click();
    }
    @When("user fills event title name {string}")
    public void user_fills_event_title_name(String eventName) {
        calendarPage.eventTitleField.sendKeys(eventName);
    }
    @Then("user clicks save button")
    public void user_clicks_save_button() {
        calendarPage.eventSaveButton.click();
    }

    @Then("user verifies {string} event is displayed")
    public void userVerifiesEventIsDisplayed(String eventName) {

        Assert.assertTrue(calendarPage.calendarToday.getText().contains(eventName));
    }
}
