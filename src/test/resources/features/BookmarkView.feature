Feature: Visualize Bookmark

  Scenario: Bookmarks found
    Given i am a user in the bookmark view
    When i make a get request to "api/users/2/bookmarks"
    Then i should receive a status code 200
