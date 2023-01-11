Feature: Login Action
  Scenario Outline: Successful Login with valid credentials
    Given User is on home page
    When User navigates to the home page
    And User enters "<username>" and "<password>"
    Then Message displayed Login successful
    Examples:
      | username                | password     |  |  |
      | standard_user           | secret_sauce |  |  |
      | locked_out_user         | secret_sauce |  |  |
      | problem_user            | secret_sauce |  |  |
      | performance_glitch_user | secret_sauce |  |  |