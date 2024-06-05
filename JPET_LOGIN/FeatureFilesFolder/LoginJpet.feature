#Author: Haripriya Andavar
#Date  : 05 JUNE 2024
Feature: Validate Login page
Scenario Outline: Validating a successful login page with valid username and password
Given Launch Browser and an application
When Click on signin Button
And Enter the username <userName>
And Enter the password <password>
And Click on Login button
And validating Home page
Then Click on signout button
Examples:
	|userName|password|
	|j2ee	 	 |j2ee		|