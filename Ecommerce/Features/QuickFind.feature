@QuickFind
Feature: QuickFind Functionality test.

	Scenario: Customer Can Find A Product by searching from Quick Find Functionality.
		
		Given User on Homepage 
		When user Move mouse over Quick Find section
		And User can write product name in Quick Find field.
		And User click Quick Find 
		Then User should see searched product in next page.