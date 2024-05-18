@B33G5-113
Feature: Folder View Functionality
  User Story:
  As a user, I should be able to change
  folder view order by using Name/Size/Modified buttons


  @B33G5-109
  Scenario Outline: User can change folder view order by Name
    Given the user logged in as "<userType>"
    Then User is on the Files page
    When User changes the folder view order by Name
    Then User verifies options are displayed in alphabetical order
    Examples:
      | userType |
      | user     |
      | employee |


  @B33G5-110
  Scenario Outline: User can change folder view order by Size.
    Given the user logged in as "<userType>"
    Then User is on the Files page
    When User changes the folder view order by Size
    Then User verifies options are displayed in ascending order of size
    Examples:
      | userType |
      | user     |
      | employee |


  @B33G5-111
  Scenario Outline: User can change folder view order by Modified
    Given the user logged in as "<userType>"
    Then User is on the Files page
    When User changes the folder view order by Modified
    Then User verifies options are displayed in chronological order of modification
    Examples:
      | userType |
      | user     |
      | employee |


  @B33G5-112
  Scenario Outline: User can select all the files at once and see the total values of all files in the first line when clicked on the “select all” checkbox at the left top corner of the list
    Given the user logged in as "<userType>"
    Then User is on the Files page
    Given User selects all options using the Select All checkbox
    Then User verifies total values of all options are displayed on the first line
    Examples:
      | userType |
      | user     |
      | employee |