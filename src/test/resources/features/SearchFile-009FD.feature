@B33G5-153
Feature: Search for a file and view its details

  @B33G5-144
  Scenario Outline: Search functionality

    Given the user logged in as "<userType>"
    When the user clicks the search button
    And the user enters "notes" into the search box
    Then the user should see a list of files matching the search query
    Then the user should click on the "Notes"
    Then the user should see a side page displaying details of the file

    Examples:
      | userType |
      | user     |
      | employee |


  @B33G5-145
  Scenario Outline: Search functionality, Dashboard
  Navigate to Dashboard from any page

    Given the user logged in as "<userType>"
    When the user clicks on "Talk"
    And the user clicks on the app icon at the top left corner of the page
    Then the user should be landed on the Dashboard page

    Examples:
      | userType |
      | user     |
      | employee |
#