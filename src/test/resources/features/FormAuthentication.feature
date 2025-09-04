@cp04 @reg
Feature: Form authentication login test

  Background:
    Given user is on the home page
    And user clicked the "Form Authentication" link

  @cp04-1 @smoke
  Scenario: verify that user can login successfully with the valid credentials
    When user enters valid username in the username field
    And user enters valid password in the password field
    And user clicks the Login button
    Then user logs in successfully
