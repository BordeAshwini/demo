Feature: Passing data from table

 @smoke
  Scenario Outline: Login with multiple values
    Given application is opened user enter "<name>"
    And  user enter "<password>"
    And user click on login button
    Then I verify the "<status>" 

    Examples: 
      | name  | password | status  |
      | Selenium1 |    test1 | Fail |
      | selenium2 |     test2 | Fail    |