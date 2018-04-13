Feature: Test search functionality

  Scenario Outline: The user enters a search parameter on the Search text box and clicks search icon
    Given I open the http://automationpractice.com page
    When the user enters a <searchParameter>
    And the user clicks on the Search icon
    Then the user will be navigated to the <searchParameter> Search Results Page
    Then the elements in the list will reflects to the <searchParameter>

  Examples:
    | searchParameter |
    | Dress           |
