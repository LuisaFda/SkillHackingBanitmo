Feature: Interest rate converter
  as a user of the bancolombia group
  I need to use the interest rate converter
  To validate financial decision making

  Scenario: Successful
    Given the user is on the main page
    When he enters the nominal to effective rate data
      | interest | periodicity | capitalization |
      | 20       | Semestral   | Mensual        |
    Then will validate that the value of the result is reflected