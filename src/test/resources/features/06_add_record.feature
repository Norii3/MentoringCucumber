Feature: Add Record

  @AddRecord
  Scenario: Add Record Scenario
    Given user visits "https://claruswaysda.github.io/addRecordWebTable.html"
    When enter data
      | John  | 15 | Germany   |
      | Mary  | 25 | Canada    |
      | Tom   | 25 | UK        |
      | Kevin | 30 | USA       |
      | Bob   | 10 | Australia |
      | Hans  | 40 | Germany   |
      | Leo   | 15 | Germany   |
      | Max   | 25 | Canada    |
      | Kai   | 25 | UK        |
      | Ethan | 30 | USA       |
      | Noah  | 10 | Australia |
      | Liam  | 40 | Germany   |
      | Jack  | 15 | Germany   |
      | Luke  | 25 | Canada    |
      | Mia   | 25 | UK        |
      | Zoe   | 30 | USA       |
      | Lily  | 10 | Australia |
      | Chloe | 40 | Germany   |
      | Ella  | 15 | Germany   |
      | Anna  | 25 | Canada    |
      | Emma  | 25 | UK        |
      | Lea   | 10 | Australia |
    #Rest is homework
    Then assert added records
    Then close browser