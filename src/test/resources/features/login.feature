@wip
Feature:

  Scenario Outline:
    Given the user logged in as "<userType>"
    Examples:
      | userType |
      | user     |
      | employee |