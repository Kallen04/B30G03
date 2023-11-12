Feature: Default

	Background:
		#@B30G3-175
		  Given the user is on the login page
		  When user enters the user information
		  Then user should be able to login
		

	
	@B30G3-186
	Scenario: US09AC01 Search file and contacts functionality
		Given User is on the File Module
		When User click on the magnifying glass icon 
		And User type "newFile"in the search input field
		Then User should see "newFile" that matches the search
		When User click on file that matches the search
		Then User should see matching "newFile" details in Files Module