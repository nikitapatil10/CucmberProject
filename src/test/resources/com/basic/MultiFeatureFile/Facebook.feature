Feature: Create account of facebook20
As a user u need to open facebook home page and do the validations

Scenario: Validate first name field21
Given User need to be on Facebook login page
When User enters user first name
Then User checks first name is present
Then Close the browser

#Scenario: Validate create user multiple fields
#Given User need to be on Facebook login page
#When User enters user first name
#And User enters user surname
#Then User checks first name is present
#But User mobile field should be blank
#Then Close the browser
