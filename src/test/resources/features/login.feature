@wip
Feature: Users should be able to login

 # Background: User is already in the log in page
  #  Given the user is on the login page


  Scenario Outline: Verify login with different user types
    Given the user logged in as "<userType>"
    #Given the user logged in with username as "User1" and password as "Userpass123"
    #And the user logged in with username as "Employee" and password as "Employee123"
    Examples:
      | userType |
      | user     |
      | employee |


