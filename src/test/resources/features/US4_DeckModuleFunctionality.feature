@B30G3-168
Feature: Default
  #Deck module functionality
  #User Story: As a user, I should be able to manage my works
  #by creating a new board/list/card and modifying them under Deck Module.


  Background:
    Given the user is on the login page
    When user enters the user information
    Then user should be able to login
    Then User clicks on Deck module
    Then User goes to deck page
    Then User clicks on hamburger button

  @B30G3-164
  Scenario: US04AC01TC01 Verify user should be able to create a new board.
    When User clicks on add board feature
    Then User types "board name" clicks enter and see under All Boards

  @B30G3-165
  Scenario: US04AC02TC01 Verify users should be able to create a list of card/task under any board.
    When User clicks on board name
    And User clicks on plus icon
    And User types "new list" and hits enter
    Then User should be able to see "new list" on the page


  @B30G3-166
  Scenario: US04AC03TC01 Verify users should be able to add a new card/task on any list on the current board.
    When User clicks on board name
    And User click on plus icon under board name
    And User types "card name" in tab and hits enter
    Then User should see new "card name" feature on page


  @B30G3-167
  Scenario: US04 AC04TC01 Verify users should be able to assign any card/task to themselves
    When User clicks on board name
    And User clicks on ellipsis button
    Then User clicks on Assign to me feature
    Then User should see name on board



