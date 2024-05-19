@eren
Feature: As a user, I should be able to upload a file, move or delete any selected file under the Files module.

  Scenario Outline: User can upload a file
    Given the user logged in as "<userType>"
    When User clicks on Files module
    And User clicks on + button to add file
    Then User selects the file to upload
    And User can see the file on the list
    Examples:
      | userType |
      | user     |
      | employee |

  Scenario Outline: User can create a new folder
    Given the user logged in as "<userType>"
    When User clicks on Files module
    And User clicks on + button to add folder
    And User clicks on new folder
    Then User name the new folder and add it to the list
    And User can see the folder on the list
    Examples:
      | userType |
      | user     |
      | employee |

  Scenario Outline: User can delete an Item from the Three Dots Menu
    Given the user logged in as "<userType>"
    When User clicks on Files module
    And User clicks three dots and click delete the file
    And User can confirm the file is deleted
    Examples:
      | userType |
      | user     |
      | employee |

  Scenario Outline: User can view Total Number of Files and Folders
    Given the user logged in as "<userType>"
    When User clicks on Files module
    And User should see the total number of files and folders under the list
    Examples:
      | userType |
      | user     |
      | employee |
