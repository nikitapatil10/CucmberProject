Feature: Create account of facebook31
As a user u need to open facebook home page and do the validations

Background: The lines of code runnign for all scenario32
Given User need to be on Facebook login page

Scenario: Validate first name field33
When User enters user first name
Then User checks first name is present
Then Close the browser

Scenario: Validate create user multiple fields34
When User enters user first name
And User enters user surname
Then User mobile field should be blank
Then Close the browser
