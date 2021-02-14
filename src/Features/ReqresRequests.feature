Feature: Verify all reqres.in Requests for GEt, POST, PUT and Delete Operations

Scenario: Verify the page 2 User List Details by Get Request

Given  Set the Parameter to page as 2
When Perform Ger Operation to get the list of users
Then Verify the status code
And Verify the Response Header Content-Type
And Verify the Response Header content-encoding
And Verify the Response Body for Page is 2
