@B30G3-212
Feature: Default

  Background: User is already in the log in page
    Given the user is on the login page
    When user enters the employee information
    Then user should be able to login


  @B30G3-210
  Scenario: As a user, I should be able to see Daily-Weekly-Monthly calendar view
    Given user clicks calendar icon
    When user clicks calendar view module
    When user clicks week icon
    Then user sees weekly calendar view
    When user clicks month icon
    Then user sees monthly calendar view
    When user clicks day icon
    Then user sees daily calendar view


  @B30G3-211
  Scenario Outline: As a user, I can create a new event under the Calendar module
    Given user clicks calendar icon
    When user clicks New event button
    When user fills event title name "<actualTitle>"
    Then user clicks save button
    When user clicks calendar view module
    When user clicks month icon
    Then user verifies "<expectedTitle>" event is displayed

    Examples:
      | actualTitle    | expectedTitle  |
      | Orhan schedule | Orhan schedule |