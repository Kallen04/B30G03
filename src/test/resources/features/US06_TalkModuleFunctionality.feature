Feature: Default

  Background:
		#@B30G3-175
    Given the user is on the login page
    When user enters the username "user_username" and password "user_password"
    Then user should be able to login

    @B30G3-155

    Scenario: US06AC01TC01 Verify User can create a new conversation by adding any selected participant
      Given user is on talk page module
      When user clicks start a new conversation button
      And user names the conversation
      And user clicks add participants button
      And user adds any participant
      And user clicks create a new conversation button
      Then user should see the new conversation in conversations list

      @B30G3-155
      Scenario: US06AC02TC01 Verify User can delete a conversation
        Given user is on talk page module
        When user clicks 3 dots icon next any conversation
        And user clicks delete conversation button
        And user clicks yes button
        Then conversation should be deleted

