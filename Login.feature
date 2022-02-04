#Feature: Leaftaps login functionality
#@Functional
#Scenario Outline: TC001_Login to application - Positive
#Given Enter username as <userName>
#And Enter password as <password>
#When Click on Login button
#Then Homepage should be displayed
#Examples:
#|userName|password|
#|'DemoSalesManager'|'crmsfa'|
#|'DemoCSR'|'crmsfa'|
#@Smoke
#Scenario: TC002_Login to application - Negative
#Given Enter username as 'Demosalesmanager'
#And Enter password as 'crmsfa'
#When Click on Login button
#Then Homepage should be displayed

#Scenario: TC003_Login to application - Negative

#Given Enter username as 'Demosalesmanager12'
#And Enter password as 'crmsfa'
#When Click on Login button
#Then Error message should be displayed