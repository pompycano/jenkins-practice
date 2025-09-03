@cp02 @reg
Feature: The A/B Testing should be running

  Background:
    Given user is on the home page
    And user clicked the "A/B Testing" link

  @cp02-1
  Scenario: verify that the A/B testing link redirects user to the correct page
    Then the url should end with "/abtest"
    And user should see page title as "No A/B Test"

  @cp02-2
  Scenario: verify that the header text and paragraph text on the A/B testing page are displayed
    Then user should see header text of A/B testing page
    And user should see paragraph text of A/B testing page



