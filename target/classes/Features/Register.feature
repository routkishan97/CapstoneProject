#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
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
@tag3Register  
Scenario: sign up
Given user is on Signup page 
And user enter "<kishan@gmail.com >" in the Email id input
And user enter "<kkkkk>" in the Password input
And user enter "<kkkkk>" in the Confirm Password input
And user enter a "<kishan>" in the Name input
And user enter "<India>" in the Address input
And user agree enter "<BBSR>" in the City input
And user click the "Signup" button
Then user should able to click on "Login to continue checking flights" button 

Examples:
| username         | password | loginstatus | expPage |
| kishan@gmail.com | kkkkk    | LoginPass   | FlyAway.home |
