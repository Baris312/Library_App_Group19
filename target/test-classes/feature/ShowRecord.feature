
Feature: Show record functionality



  Scenario: verify default record count

    Given user is on the login page
    When Librarian enter "<librarianEmail>" and "<Password>"
    Then Librarians click on UserTitle  link
    Then show records default value should be 10
    Then show records count options

      | 5   |
      | 10  |
      | 15  |
      | 50  |
      | 100 |
      | 200 |
      | 500 |