@PRG5-567
Feature: Default

	#*User Story*: 013 Edit/Enter Profile Settings Functionality
	#*A.C.1*: User can see at least following titles inside “Personal Info” under Profile Settings page;     => Full name/Email/Phone Number
	@PRG5-564
	Scenario Outline: Verify Display of Personal Information Titles
		Given the user logged in as "<userType>"
		    When User navigates to Profile Settings page
		    Then User should see Full name, Email, and Phone Number
		      |Full name    |
		      |Email        |
		      |Phone number |
		    Examples:
		      | userType |
		      | user     |
		      | employee |	

	#*User Story*: Edit/Enter Profile Settings Functionality
	#*A.C. 2*: Name of the user in the Settings field should be the same with Full Name input box
	@PRG5-565
	Scenario Outline: Verify User Name In Settings Field Matches Full Name Input Box
		Given the user logged in as "<userType>"
		    When User navigates to Profile Settings page
		    And Name in Settings field should match Full Name input box for "<userType>"
		
		    Examples:
		      | userType |
		      | user     |
		      | employee |	

	#*User Story*: Edit/Enter Profile Settings Functionality
	#*A.C. 3*: User cannot pass any characters except numbers into the "Phone Number" input box.
	@PRG5-566
	Scenario Outline: Verify Only Numbers Allowed in Phone Number Input Box
		Given the user logged in as "<userType>"
		    When User navigates to Profile Settings page
		    When User enters phone number into Phone Number input box
		    Then User should only be able to enter numbers not characters
		    Examples:
		      | userType |
		      | user     |
		      | employee |