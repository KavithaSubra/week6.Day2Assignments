Feature: EditLead functionality
@Regression
Scenario: To validate the Edit Lead functionality

When Click on 'Leads' link
And Click 'Find Leads' Link
When Click 'Phone' tab
And Give PhoneNumber '99'
And Click 'Find Leads' button
And Click first lead
Then Go to 'View Lead' page
When Click 'Edit' Link
And Update companyname as 'ABC'
Then Click submit button