Feature: OrangeHRM application login test

Scenario: orange HRM login test 
	Given web browser is initialized 
	When user enters correct username and password
	Then user should be successfully login to HRM home page
	