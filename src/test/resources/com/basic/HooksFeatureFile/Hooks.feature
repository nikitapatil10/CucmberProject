Feature: Create account of facebook24
As a user u need to open facebook home page and do the validations

Scenario: Validate first name field25
Given User need to be on Facebook login page
When User enters user "Neena" first name
Then User checks first "Neena" name is present


Scenario: Validate create user multiple fields26
Given User need to be on Facebook login page
When User enters user "Neena" first name 
And User enters user "Mhatre" surname
Then User checks user Surname "Mhatre" is present 
Then User mobile field should be blank

