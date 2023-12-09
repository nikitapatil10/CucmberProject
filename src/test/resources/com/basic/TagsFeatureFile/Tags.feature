@Important
Feature: Create account of facebook6
As a user u need to open facebook home page and do the validations

@Regression
Scenario: Validate create user multiple fields1
Given User need to be on Facebook login page
When User enters user "Neena" first name 
And User enters user "Mhatre" surname
Then User checks user Surname "Mhatre" is present 
Then User mobile field should be blank
Then Close the browser

@SmokeTest
Scenario: Validate create user multiple fields2
Given User need to be on Facebook login page
When User enters user "Neena" first name 
And User enters user "Mhatre" surname
Then User checks user Surname "Mhatre" is present 
Then User mobile field should be blank
Then Close the browser

Scenario: Validate create user multiple fields3
Given User need to be on Facebook login page
When User enters user "Neena" first name 
And User enters user "Mhatre" surname
Then User checks user Surname "Mhatre" is present 
Then User mobile field should be blank
Then Close the browser

@smoke
Scenario: Validate create user multiple fields4
Given User need to be on Facebook login page
When User enters user "Neena" first name 
And User enters user "Mhatre" surname
Then User checks user Surname "Mhatre" is present 
Then User mobile field should be blank
Then Close the browser

@smoke @Regression
Scenario: Validate create user multiple fields5
Given User need to be on Facebook login page
When User enters user "Neena" first name 
And User enters user "Mhatre" surname
Then User checks user Surname "Mhatre" is present 
Then User mobile field should be blank
Then Close the browser
