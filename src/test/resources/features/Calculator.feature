Feature: Calculator Operation

  Scenario: Add Two Numbers
    Given I have two numbers 10 and 6
    When I add them
    Then I get 16 as result

  Scenario: Subtract Two Numbers
    Given I have two numbers 10 and 6
    When I subtract them
    Then I get 4 as result
