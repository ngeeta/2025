Feature: Learning Module functionality

  Scenario: 
    Given user must be on linked in login page
    When click on sign in
    And user enters valid username and password
    And user clicks on sign in button
    Then the user is navigated to Homepage of linkedin
    Given user clicks on grids
    When user clicks on learning module