@B33G5-102
Feature: Default


	@B33G5-184
	Scenario Outline:  Verify user can log out and ends up in login page
		Given the user logged in as "<userType>"
		When user clicks the logout button
		Then user should be redirected to the login page
		Examples:
			| userType |
			| user     |
			| employee |


	@B33G5-185
	Scenario Outline: Verify user can not go to home page again by clicking step back button after logged out.
			Given the user logged in as "<userType>"
		    When user clicks the logout button
		    Then user should be redirected to the login page
		    When user click the browser back button
		    Then user should remain on the login page
		    And user should not see the home page content
		Examples:
						| userType |
						| user     |
						| employee |