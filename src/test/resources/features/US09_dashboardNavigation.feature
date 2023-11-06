Feature: Default

	Background:
		#@B30G3-174
		Given the user is on the login page
		When user enters the user information
		Then user should be able to login
		When user click Contacts module
		Then user should be able to see Contact page
		

	
	@B30G3-188
	Scenario: US09AC02 Dashboard page navigation
		When User click App icon
		Then user is on the Dashboard page