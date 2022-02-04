Feature: Duplicate Lead functionality
@Functional
Scenario: To validate the Duplicate Lead functionality

When Click on 'Leads' link
And Click 'Find Leads' Link
When Click 'Phone' tab
And Give PhoneNumber '99'
And Click 'Find Leads' button
And Click first lead
Then Go to 'View Lead' page
When Click 'Duplicate Lead' link
Then Go to Duplicate Lead page for verification