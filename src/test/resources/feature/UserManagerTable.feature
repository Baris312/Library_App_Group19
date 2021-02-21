
@wip
Feature: user management table feature


  Scenario: user management table columns names

    Given user is on the login page
    When Librarian enter "<librarianEmail>" and "<Password>"
    Then Librarians click on UserTitle  link
    Then the user should  see the following column names:
      | Actions   |
      | User ID   |
      | Full Name |
      | Email     |
      | Group     |
      | Status    |

