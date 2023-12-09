Feature: Create account of facebook11
As a user u need to open facebook home page and do the validations

Scenario: Validate first name field10
Given User need to be on Facebook login page
When User enters user "Neena" first name
Then User checks first "Neena" name is present
Then Close the browser

Scenario: Validate create user multiple fields12
Given User need to be on Facebook login page
When User enters user "Neena" first name 
And User enters user "Mhatre" surname
Then User checks user Surname "Mhatre" is present 
Then User mobile field should be blank
Then Close the browser
