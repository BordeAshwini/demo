#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#eg:-
#Login(Feature)
#1.Login with valid credentails(scenario)
#2.Login with invalid(scenario)
#3.Login with no credentail(scenario)

#Scenario: Business rule through list of steps with arguments.

#Step definition primary
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps

#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template


Feature: Login Test
To login check functionality 


  @tag1
  Scenario: Login to rediff
    Given User is on home page
    When User enter username and password
    And click on login button
    Then message is displayed




  #@tag2

  #Scenario Outline: Title of your scenario outline

  #  Given I want to write a step with <name>

   # When I check for the <value> in step

   # Then I verify the <status> in step




    #Examples: 

     # | name  | value | status  |

      #| name1 |     5 | success |

      #| name2 |     7 | Fail    |