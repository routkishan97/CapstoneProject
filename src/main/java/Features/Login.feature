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

(Comments)
#userple Feature Definition Template
@tag
Feature: Title of your feature
I want to use this template for my feature file

@tag1Login
Scenario: user is able to login successfully with valid details
Given user is on the login page
When user enters "user@something.com" and "password"
And user clicks on Login
Then user should be able to Login successfully
And user should navigate to "Fly Away - Dashboard"

@tagLogin
Scenario Outline: user is login with various data set
Given user is on the login page
When user enters "<username>" and "<password>"
And user clicks on Login
Then user should be able to validate "<loginstatus>"
And user should be navigated to "<expPage>"

Examples: 
  | username              | password | loginstatus     |    expPage         |
  | user@something.com     | pwd      | LoginPass       |    FlyAway.home    |
  | user@somewrong.com     | pwd      | LoginFail       |    FlyAway.login   |
  | user@something.com     | pwd2     | LoginFail       |    FlyAway.login   |