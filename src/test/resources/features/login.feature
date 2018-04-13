Feature: Test login functionality

  Scenario Outline: Login with correct username and password
    Given I open the http://automationpractice.com page
    When I click on the Sign in button
    Then I redirect to the login page
    When I fill in the <user> and <password> credentials
    And click on the submit button
    Then the account title should be <accountTitle>

    Examples:
      | user                    | password | accountTitle             |
      | epamuser.test@gmail.com | usertest | Welcome to your account. |


  Scenario Outline: Try to login with wrong username and password
    Given I open the http://automationpractice.com page
    When I click on the Sign in button
    Then I redirect to the login page
    When I fill in the <user> and <password> credentials
    And click on the submit button
    Then the error message should be <errorMessage>

    Examples:
      | user                    | password | errorMessage           |
      | epamuser.test@gmail.com | usertes  | Authentication failed. |






