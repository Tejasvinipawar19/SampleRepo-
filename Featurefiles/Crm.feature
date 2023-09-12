Feature: Test CRM application

  Scenario: Test CRM login with valid data
    Given Open CRM application
    When User Enter valid email "test@gmail.com" and valid password "test123"
    When User click on submit button
    Then User should be able to login
