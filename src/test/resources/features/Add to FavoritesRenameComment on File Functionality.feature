Feature:

	#_*User Story:*_
	#
	#As an user i should be able to add to Favorites on File Functionality.
	#
	# 
	#
	#_*AC1:*_
	#
	# _**_ User can add any file to favorites from its own three dots menu.
	#
	# 
	@B33G5-103
	Scenario: Add any file to favorites
		Given user loged in as "usertype"
		When user clicks the Files module
		And user clicks three dots menu of all files
		And user slects Add to favorites option
		When user clicks on Favorites module
		Then previously aded file should be dispayed
		Examples:
		  | userType |
		  | user     |
		  | employee |


	@B33G5-130
	Scenario : User can rename any file from its own three dots menu
		Given user loged in as "usertype"
		When user clicks the Files module
		And user clicks three dots menu of all files
		And user slects Rename option
		And user types new name of the file and hits enter
		Then user verifys folders name
		Examples:
			| userType |
			| user     |
			| employee |

	@B33G5-131
	Scenario: user can comment on File Functionality
		Given user loged in as "usertype"
		When user clicks the Files module
		And user clicks three dots menu of all files
		And user clicks Details
		And user clicks on Coments
		And user wites his coments and clicks enter
		Then user verifys his coment is displayed
		Examples:
			| userType |
			| user     |
			| employee |