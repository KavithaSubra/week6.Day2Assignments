Feature: DeleteLead functionality
@Smoke
Scenario: To validate the Delete Lead functionality

When Click on 'Leads' link
And Click 'Find Leads' Link
When Click 'Phone' tab
And Give PhoneNumber '99'
And Click 'Find Leads' button
And Click first lead
Then Go to 'View Lead' page
When Click 'Delete' link
Then Go to View Lead page for verification