Feature: Create a new User
  As a client
  I want to create a new user
  So that i can use the app

  Scenario: The user was created successfully
    Given i am a client and entered the correct data
    When i make a user request to "/api/users"
    Then the response result received should be 200

  Scenario: The user could not be created
    Given i am a client and entered the incorrect data
    When i make a user request to "/api/users"
    Then the response result received should be a bad 400