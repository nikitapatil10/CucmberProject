Feature: Create account of facebook29
As a user u need to open facebook home page and do the validations

Scenario Outline: Validate create user multiple fields30
Given User need to be on Facebook login page
When User enters user "<user>" first name
And User enters user "<surname>" surname
Then Close the browser
Examples:
	| user | surname |
	| Tom  | Jerry   |
	| Mini | Mouse   |
	| Ria  | Mia     |