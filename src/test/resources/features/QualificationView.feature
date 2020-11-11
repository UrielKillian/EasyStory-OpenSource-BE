Feature: Visualize Qualification

  Scenario: Qualifications found
    Given i am a user in the qualification view
    When i make a get request to "api/posts/1/qualifications"
    Then i should receive a status code 200