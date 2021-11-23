Feature: Testing hooks
@tag1
Scenario: This scenario to test login

Given open  application
And try  to login
Then vaildate outcome 


@smoke
Scenario: This scenario to test forgot password

Given rediffmail is open
And click on forgot password
Then validate title of webpage

