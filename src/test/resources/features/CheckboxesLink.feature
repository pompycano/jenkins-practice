@cp03 @reg
Feature: The Checkboxes should be running

  Background:
    Given user is on the home page
    And user clicked the "Checkboxes" link

  @cp03-1
  Scenario: verify that both checkboxes are visible and enabled
    Then user should see the first checkbox
    And user should see the second checkbox
    And the first checkbox should be enabled
    And the second checkbox should be enabled

  @cp03-2
  Scenario: verify that first checkbox is unchecked and second checkbox is checked by default
    Then the first checkbox should be unchecked
    And the second checkbox should be checked
