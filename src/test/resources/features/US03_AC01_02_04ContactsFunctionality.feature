@B30G3-173
Feature: Default

	Background:
		#@B30G3-175
		Given the user is on the login page
		When user enters the username "user_username" and password "user_password"
		Then user should be able to login
		#@B30G3-174
		When user click Contacts module
		Then user should be able to see Contact page
		

	
	@B30G3-169
	Scenario Outline:	US03 AC01 Verify User create a new contact
		When user click New contact
		Then user enter name and last name "<fullName>"
		And user enter Phone number "<phoneNum>"
		And user enter Email "<email>"
		And user enter Post Office box "<PObox>"
		And user enter address "<address>"
		And user enter Extended address "<extendAdd>"
		And user enter Postal code "<postal>"
		And user enter City "<city>"
		And user enter State "<state>"
		And user enter country "<country>"
		Then user should be able to see "<fullName>" on the list

		Examples:
			| fullName  | phoneNum   |     email      | PObox | address      | extendAdd | postal | city     | state    | country |
			| John Doel | 1234567890 | abcd@yahoo.com | 18456 | 123 King dr. |  3300     | 89999  | New York | New York | US      |
			| Dean Cave | 7775674534 | dean@gmail.com | 432   | 555 Queen dr.|  222      | 44221  | New York | New York | US      |


	
	@B30G3-170
	Scenario: US03 AC02 Verify user see all the contact as a list
		When user click all contacts
		And user see total number of list
		Then user should be able to see whole list matching with total number of the list	

	
	@B30G3-172
	Scenario: US03 AC04 Verify user can delete any selected contact
		When user click "John Doel" from list contact
		And user click three dots icon
		And user click Delete menu
		Then user should be able to see "No contact selected" on the page