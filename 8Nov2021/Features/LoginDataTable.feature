Feature: To check login with mutlpile data table

Scenario: Login Test
@tag1
  Scenario Outline:login
    Given user open rediff.com   
   And  enter  username and password 
  
   |  selenium2  |  selenium321|
   
   Then verify messages     