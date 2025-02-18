Feature: CreateLead functionality of Leaftaps

Scenario: CreateLead

Given Launch the browser
And Load the url
And Enter the username as 'Demosalesmanager'
And Enter the password as crmsfa
When Click on the Login button
Then It should navigate to the next page
When Click on CRMSFA link
And Click on Leads link
And Click on CreateLead link
And Enter the companyname
And Enter the firstname
And Enter the lastname
And Click on Create Lead button
Then Lead should be created