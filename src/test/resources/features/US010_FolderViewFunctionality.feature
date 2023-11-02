@FolderViewFunctionality
Feature: Folder View Functionality

  User Story:
  As a user, I should be able to change folder view order by using Name/Size/Modified buttons.

  Scenario: Login as user
    When user enters the user information
    Then user should be able to login

  @FolderViewTitleVerify
  Scenario: Verify files page title
    When user click the files icon on top left page
    Then user can verify the file page title is "Files - Trycloud QA"

  @FolderViewNameIcon
  Scenario: Verify files and folders can order by ascending alphabetical order
    When user should verify "Name" icon displayed correctly
    And user click on the Name icon
    Then verify the all folders sorted by ascending alphabetical order
    Then verify the all files sorted by ascending alphabetical order

  @FolderViewSizeIcon
  Scenario: Verify files and folders can order by size
    When user should verify "Size" icon displayed correctly
    And user click on the Size icon
    Then verify the all files and folders sorted by size order

  @FolderViewModifiedIIcon
  Scenario: Verify files and folders can order by modified date order
    When user should verify "Modified" icon displayed correctly
    And user click on the Modified icon
    Then verify the all files sorted by modified date order

  @FolderViewSelectAll
  Scenario: Verify select all icon and see the total values
    When user check the select all checkbox
    And user should verify the all files selected
    And user should verify total folders and files counted
    Then user should verify total file size displayed


