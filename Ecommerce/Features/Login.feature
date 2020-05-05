@loginTest
Feature: Login test in oscommerce website

	Scenario: Test login with valid credentials

		Given 	Open browser and start application
		When 	Move mouse over my account button
		And 	Put valid email address in email address field
		And 	Put valid password in password field
		And 	Click ok button
		Then 	Validate login status by showing your name 
