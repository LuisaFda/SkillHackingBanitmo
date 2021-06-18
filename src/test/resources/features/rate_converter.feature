Feature: Interest rate converter
  as a user of the bancolombia group
  I need to use the interest rate converter
  To validate financial decision making

  Scenario Outline: Successful
    Given the user is on the main page
    When he enters the nominal to effective rate data
      | interest   | periodicity   | capitalization   |
      | <interest> | <periodicity> | <capitalization> |

    Then will validate that the value of the result is <result>

    Examples:
      | interest | periodicity   | capitalization | result |
      | 20       | Semestral     | Anual          | 9.54   |
      | 50       | Cuatrimestral | Bimensual      | 17.36  |