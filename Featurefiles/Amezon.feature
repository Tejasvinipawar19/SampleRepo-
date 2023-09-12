@All
Feature: Test Amazon appilication

  Background: 
    Given Open amazon application
@HomePage
  Scenario: Test for amazon home page title
    When User capture title for amazon home page
    Then Title should match with amazon home page
@BestSellers
  Scenario: Test for BestSellers page title
    When User open Best sellers page
    When User capture best sellers title
    Then Title should match with best sellers page
@Mobiles
  Scenario: Test for mobile page title
    When User open mobiles page
    When User capture mobiles page title
    Then Title should match with mobiles page
