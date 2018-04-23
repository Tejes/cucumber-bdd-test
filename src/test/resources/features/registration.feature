Feature: Test registration functionality

  Scenario: The user enters all parameters on the registration form
    Given I open the http://automationpractice.com page
    When I click on the Sign in button
    Then I redirect to the login page
    When I add "test1@hac.hu" into the email address input field on the create account module
	And click on the create account button
	Then I redirect to the registration page