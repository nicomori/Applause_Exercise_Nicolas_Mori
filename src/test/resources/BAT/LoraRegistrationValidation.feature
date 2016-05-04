Feature: Lora Registration Form Field Validation BAT

Scenario: REG-1 Proper error message displayed for new user registration with blank first name 
	Given I open the Lora App and navigate to the create new user page
	When I click on the First Name field and Tab to the next field
	Then I should see the First Name Error Message
	