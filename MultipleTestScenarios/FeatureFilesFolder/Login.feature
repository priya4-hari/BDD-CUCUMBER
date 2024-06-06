#Author: HARIPRIYA ANDAVAR
#Date 06 JUNE 2024

Feature: Validate Login Page
Scenario Outline: Validating a Login Page with valid username and Password

Given Launch Browser and an Application
When Click on sign in button
And Enter username <userName> and password <password>
And Click on Login button
And Validating Home page
Then Click on signout button

Examples:
	|userName|password|
	|j2ee|j2ee|
	|mani|wipro|
	|hari|wipro| 