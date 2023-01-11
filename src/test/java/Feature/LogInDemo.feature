Feature: Test Login functionality

  Scenario Outline: Check login with valid credentials
    Given browser is open
    And User is on login pg
    When user enters <Username> and <password>
    And User clicks on login
    Then  user is navigated to the home page

    Examples:
      | username | password |
      | Amy      | 12345    |
      | Bob      | 12345    |