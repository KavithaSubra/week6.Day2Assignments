Feature: TC_001-To validate Create Lead functionality

@Smoke @Regression
Scenario Outline:

Given Enter username as 'DemoCSR'
And Enter password as 'crmsfa'
When Click on Login button
Then Homepage should be displayed
When Click on 'CRM/SFA' link
Then 'My Home' page should be displayed
When Click on 'Leads' link 
Then 'My Leads' page should be displayed
When Click on 'Create Lead' link
Then 'Create Lead' page should be displayed
Given Enter companyname as <compName>, Forename as <foreName>, Surname as <surName>, Source as <sourceName>, MarketingCampaign as <markCampaign>
When Click on Create Lead button
Then View Lead page should be displayed

Examples:

|compName|foreName|surName|sourceName|markCampaign|
|'TestLeaf'|'Kavitha'|'Subramanian'|'Employee'|'Automobile'|
#|'TestLeaf'|'Kavitha'|'Subramanian'|'Partner'|'Road and Track'|
#|'TEST'|'Kavi'|'S'|'Website'|'Car and Driver'|