Feature: verify Login functionality

  @UI
  Scenario: verify login with valid credentials

    Given user is on the login page
    When user enters valid username and password
    Then user should be logged in successfully