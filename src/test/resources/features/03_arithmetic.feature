Feature:  Simple arithmetic operations application

  @Addition @positive
  Scenario: Addition of two positive numbers
    Given user is on the arithmetic page
    When user enter nine
    And user enter plus
    And user enter three
    And uesr enter equals
    Then the result should be twelve

  @Subtraction @negative
  Scenario: Subtraction resulting in a negative number
    Given user is on the arithmetic page
    When user enter three
    And user enter minus
    And user enter nine
    And uesr enter equals
    Then the result should be negative six

  @Division @smoke
  Scenario: Division by zero (error case)
    Given user is on the arithmetic page
    When user enter three
    And user enter divide
    And user enter zero
    And uesr enter equals
    Then the result it error case