@B33G5-123
Feature: Calendar Module Functionality


  @B33G5-119
  Scenario Outline:
    Given the user logged in as "<userType>"
    When user click to Calendar module
    And  user click to the dropdown
    And the user select Day option
    Then user should display daily calendar view
    Examples:
      | userType |
      | user     |
      | employee |

