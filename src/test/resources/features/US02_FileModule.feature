@B30G3-186
Feature: Default

	Background:
		#@B30G3-175
		  Given the user is on the login page
		  When user enters the user information
		  Then user should be able to login

		

	
	@B30G3-181
	Scenario: US02AC01TC01  File Upload
		    Given the user is on the Files module
		    When the user clicks on the "Upload" button
		    Then selects a file to upload
		    And the uploaded file should be visible in the file list	

	
	@B30G3-182
	Scenario: US02AC02TC02 Creating a New Folder
		Given the user is on the Files module
		When the user clicks on the "New Folder" option.
		And enters a folder name.
		And click arrow sign , right next to the text box. 
		Then a new folder with the specified name should be created.
		And the new folder should be visible in the file list.	

	
	@B30G3-183
	Scenario: US02AC03TC03 Deleting an Item
		Given the user is on the Files modules
		And there is at least one item in the file list
		When the user selects an item and clicks on the three dots menu
		And chooses the "Delete folder" option
		Then the selected item should be deleted
		And it should no longer appear in the file list	

	
	@wip
	Scenario: US02AC04TC04 Total Files and Folders Count
		Given the user is on the Files module page
		And there are multiple files and folders in the file list
		Then an accurate count of files and folders should be displayed
		And the count should update in real-time as items are added or deleted