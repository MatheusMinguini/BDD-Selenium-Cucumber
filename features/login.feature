  Feature: The Login Page
    As a costumer
    I want to login to the application
    So that I can view my account balance

  Scenario: The user should be able to login with valid credentials
    Given the user is on the login page
    When  the user enters valid credentials
    Then  the user should be able to view its account balance

