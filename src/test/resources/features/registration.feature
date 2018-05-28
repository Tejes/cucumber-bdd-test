Feature: Test registration functionality

  Scenario: The user enters all parameters on the registration form
    Given I open the http://automationpractice.com page
    When I click on the Sign in button
    Then I redirect to the login page
    When I add "jfk@example.com" into the email address input field on the create account module
	And click on the create account button
	Then I redirect to the registration page
	When I enter "John Fitzgerald" into the first name field
	And I enter "Kennedy" into the last name field
	And I enter "asdasd" into the password field
	And I enter "1600 Pennsylvania Ave NW" into the address field
	And I enter "Washington, DC" into the city field
	And I choose "Washington" from the states select
	And I enter "20500" into the postcode field
	And I choose "United States" from the countries select
	And I enter "123456789" into the mobile phone field
#	And I click the submit button