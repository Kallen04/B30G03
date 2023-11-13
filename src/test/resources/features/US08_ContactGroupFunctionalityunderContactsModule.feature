@B30G3-209
Feature: Default

	Background:
		#@B30G3-175
		  Given the user is on the login page
		  When user enters the user information
		  Then user should be able to login

		#@B30G3-174
		When user click Contacts module
		Then user should be able to see Contact page
		

	@B30G3-201
	Scenario: US08AC1 Verify user can create a new group under Contacts Module

		     When user click New group plus sign
		     And user types New group name "Cinema" and click enter
			 Then user should be able to see "Cinema" on the info menu	


	@B30G3-202
	Scenario: US08AC2 Verify User can see all the available groups name through the group’s dropdown menu existing in the contact’s own info menu.

				   When user click group dropdown menu
				   Then user should see the dropdown list is matching with the contact info menu	


	@B30G3-203
	Scenario: US08AC3 User can add a new property as “Anniversary” to the contact’s info page from the “Add new property” dropdown menu.

				    When user click Add new property window
				    And user click "Anniversary" property from the drop down menu
		            Then user should see newly created property name displayed
