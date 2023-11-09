@B30G3-194
Feature: Default

  Background:
		#@B30G3-175
    Given the user is on the login page
    When user enters the user information
    Then user should be able to login


  @B30G3-190
  Scenario: Check/Change Profile Settings US014AC01TC01
    Given User is on TryCloud Dashboard
    When user click on User Profile
    Then user click to Settings
    Then Username is same as full name




  @B30G3-191
  Scenario: Enter E-mail US014AC02TC02
    Given Given User is on TryCloud Dashboard
    When user click on User Profile
    Then user click to Settings
    When user click on  email input box
    Then user is able to enter proper email


  @B30G3-193
  Scenario: Change language US014AC03TC03
    Given User is on TryCloud Dashboard
    When user click on User Profile
    Then user click to Settings
    When user click and select Language
    Then the given language is changed