Feature: Test google Application

  Background: 
    Given Open Google Application

  Scenario: Test for Google home page title
    When Capture actual title of the application
    Then Title should be Google

  Scenario: Test for search feature with valid data
    When I enter valid keyword in google search as "Java"
    Then I should get result for Java
