@cp01 @reg
Feature: Home page should be running

  Background:
    Given user is on the home page

  @cp01-1 @smoke
  Scenario: verify all the links under the ul tag are displayed and enabled
    Then user should see exactly 50 links in the ul tag
    And each link should be displayed and clickable
