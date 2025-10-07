Feature: Multiple negative feature

  @negativeLogin
  Scenario Outline: Multiple negative test cases
    Given user visits "https://claruswaysda.github.io/signIn.html"
    When user enters username "<username>"
    And user enters password "<password>"
    And user click login button
    Then close browser

Examples:
| username | password |
|          |          |
| admin    |          |
|          | 123      |
| Admin    | 123      |
| admin    | a123     |
| Admin    | ad123    |
| Adm@n    | 123      |
| admin    | 1 2 3    |