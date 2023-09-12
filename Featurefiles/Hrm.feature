Feature: Test orangehrm application

  Scenario Outline: Test data driven for hrm login feature
    Given Open hrm application
    When User enter set of "<username>" and set of "<password>"
    When User click on login button
    Then as per data validation user should be able to login

    Examples: 
      | username | password |
      | Admin    | admin123 |
      | Pooja    | test123  |
      | Admin    | admin123 |
