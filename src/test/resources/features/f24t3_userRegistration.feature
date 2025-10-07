Feature: Register Multiple Users

  @RegisterUsers
  Scenario Outline: Register multiple users with different data
    Given user visits "https://claruswaysda.github.io/form.html"
    When user enters ssn "<ssn>"
    When user enters First name "<firstname>"
    And user enters Last name "<lastname>"
    And user enters address "<address>"
    And user enters phone number "<phoneNumber>"
    And user enters Username "<username>"
    And user enters email "<email>"
    And user enters Password "<password>"
    And user enters New Password Confirmation "<passwordConfirmation>"
    And user click Register button
    Then verify each registration is successful
    And close browser

    Examples:
      | ssn         | firstname | lastname | address                            | phoneNumber      | username    | email                    | password     | passwordConfirmation |
      | 123-45-6789 | James     | Smith    | 123 Oak Avenue, Boston,  MA        | +1-617-555-0145  | james_smith | james.smith@example.com  | MyPass123    | MyPass123            |
      | 987-65-4321 | Maria     | Garcia   | 456 Elm Street, Miami,  FL         | +1-305-555-0189  | maria_g     | maria.garcia@example.com | Secure456    | Secure456            |
      | 456-78-9123 | David     | Johnson  | 789 Pine Road, Chicago, IL         | +1-312-555-0155  | david_j     | d.johnson@example.com    | DavidPass789 | DavidPass789         |
      | 234-56-7890 | Sarah     | Chen     | 321 Maple Drive, San Francisco, CA | +1-415-555-0167  | sarah_chen  | s.chen@example.com       | ChenPass123$ | ChenPass123$         |
      | 789-12-3456 | Luca      | Rossi    | 654 Via Roma, Milan, Italy         | +39-02-1234-5678 | luca_rossi  | l.rossi@example.com      | RossiPass456 | RossiPass456         |