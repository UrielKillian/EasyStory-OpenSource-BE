Feature: Subscription Assignation


  Scenario: Subscription Failed
    Given i am a user in the application
    When i send a post request to "api/users/2/subscriptions/3"
    Then the status code should be a bad 400