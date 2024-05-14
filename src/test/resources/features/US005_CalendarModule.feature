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


  @B33G5-120
  Scenario Outline: Verify user can display weekly calendar view
    Given the user logged in as "<userType>"
    When user is on the Calendar page
    And user clicks to the dropdown
    And user select to Week option
    Then user should display weekly calendar view
    Examples:
      | userType |
      | user     |
      | employee |

  @B33G5-121
  Scenario Outline: Verify user can display monthly calendar view
    Given the user logged in as "<userType>"
    When user is on the Calendar page
    When user click to the dropdown
    And user select to Month option
    Then user should display monthly calendar view
    Examples:
      | userType |
      | user     |
      | employee |

  @B33G5-122
  Scenario Outline:Verify user can create a new event under the Calendar module and see it on the related day through the Monthly Calendar view
    Given the user logged in as "<userType>"
    When the user is on the Calendar page
    And the user creates a new event
    And the user enters the "sprint meeting"
    And the user selects the event start time
    And And the user selects the event end time
    And the user clicks the Save button
    Then user see the event on the related day through the Montly Calendar view
    Examples:
      | userType |
      | user     |
      | employee |
