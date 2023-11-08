@FolderViewFunctionality
Feature: Folder View Functionality

  User Story:
  As a user, I should be able to change folder view order by using Name/Size/Modified buttons.


  Background: User login and go to the file page
    Given the user is on the login page
    When user enters the user information
    And user should be able to login
    And user click on the file icon on top left
    Then user can verify the file page title is "Files - Trycloud QA"

  @FolderViewNameIcon
  Scenario: User change folder view order by name
    Given user at the File page
    When user able to see the files and folders table
    Then user is able to see folder view order changed after clicking the Name icon

  @FolderViewSizeIcon
  Scenario: User change folder view order by Size
    Given user at the File page
    When user able to see the files and folders table
    Then user is able to see folder view order changed after clicking the Size icon

  @FolderViewModifiedIIcon
  Scenario: User change folder view order by Modified date
    Given user at the File page
    When user able to see the files and folders table
    Then user is able to see folder view order changed after clicking the Modified icon

  @FolderViewSelectAll
  Scenario: User can select all the files at once and see the total values of all files in
  the first line when clicked on the “select all” checkbox at the left top corner of the list
    Given user at the File page
    When user check the select all checkbox
    Then user should see all the files selected
    And user should see total folders and files counted
    And user should see total file size displayed


