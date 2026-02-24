Feature: Verify registration functionality

  @UI
  Scenario: User should be able to register successfully
    Given I am on the registration page
    When I enter valid registration details
    And I submit the registration form