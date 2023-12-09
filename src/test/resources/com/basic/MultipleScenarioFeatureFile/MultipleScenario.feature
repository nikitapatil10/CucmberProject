Feature: Create account of facebook15
As a user u need to open facebook home page and do the validations

Scenario: Validate first name field16
Given User need to be on Facebook login page
When User enters user first name
Then User checks first name is present
Then Close the browser

Scenario: Validate create user multiple fields17
Given User need to be on Facebook login page
When User enters user first name
And User enters user surname
Then Close the browser
