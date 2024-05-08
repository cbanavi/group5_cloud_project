@B33G5-117
Feature: As a user, I should be able to see listed items under the Activity module.

	
	@B33G5-114
	Scenario Outline: Symund View All Listed Activities
		Given the user logged in as "<userType>"
		    When User clicks Activity module
			Then User should see all listed activities under Activity module
		    Examples:
		      | userType |
		      | user     |
		      | employee |	

	
	@B33G5-115
	Scenario Outline: Symund View All Activity Items Descending Order
		Given the user logged in as "<userType>"
		    When User clicks Activity module
			Then User should see all items list ordered by newest to oldest
		    Examples:
		      | userType |
		      | user     |
		      | employee |	

	
	@B33G5-116
	Scenario Outline: Symund View End of Page Message
		Given the user logged in as "<userType>"
		    When User clicks Activity module
			Then User should see "No more events to load" at the bottom of page
		    Examples:
		      | userType |
		      | user     |
		      | employee |