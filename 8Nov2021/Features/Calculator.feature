Feature: Division

 @div1
  Scenario Outline: Divide number one and number two 
    Given calc  application is opened 
    When  user enter 4000 and 200   
    Then I verify the outcome "<status>" 

    Examples: 
     | status  |
      | 20 |
      