Feature: Calendar page scenario

  Background: User is already in the log in page
    Given the user is on the login page
    When user enters the employee information
    Then user should be able to login

  @wip
  Scenario: User able to see calendar options
    Given user clicks calendar icon
    When user clicks calendar view module
    When user clicks week icon
    Then user sees weekly calendar view
    When user clicks month icon
    Then user sees monthly calendar view
    When user clicks day icon
    Then user sees daily calendar view


    @wip
  Scenario: User able to create new event
    Given user clicks calendar icon
    When user clicks New event button
    When user fills event title name "Orhan schedule"
    Then user clicks save button
    When user clicks calendar view module
    When user clicks month icon
    Then user verifies "Orhan schedule" event is displayed



