Feature: As a user, I should able to see my borrowing books.

  @wip
  Scenario Outline: borrowing books table columns names

    Given user is on the login page
    When user enter "<userEmail>" and "<Password>"
    When the user click Borrowing Books module
    Then the user shoulde see the following column names:
      | Action              |
      | Book Name           |
      | Borrowed Date       |
      | Planned Return Date |
      | Return Date         |
      | Is Returned ?       |



    Examples: user login info
      | userEmail          | Password |
      | student102@library | Aaf6GwsY |

