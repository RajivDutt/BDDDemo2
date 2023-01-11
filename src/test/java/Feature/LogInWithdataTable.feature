
Feature: User Login feature

  Scenario: User Login Scenario
    Given User is on login page of the application
    When User enters following username and password
      | user1 | pass1 |
      | user2 | pass2 |
      | user3 | pass3 |
    Then User should be able to log in