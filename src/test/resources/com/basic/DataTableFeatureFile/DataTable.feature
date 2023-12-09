Feature: Create account of facebook27
As a user u need to open facebook home page and do the validations

Scenario: Validate create user multiple fields28
Given User need to be on Facebook login page
When User enters data from data Table
	| UserName | Surname | MobileNo |
	| Tom      | Jerry   | 876777   |
	| Mini     | Mouse   | 986778   |
Then Close the browser
