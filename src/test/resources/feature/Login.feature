


Feature: As a user ,I should be see home page


  Scenario Outline: user login verification
    Given user on login page
    When user enter "<userEmail>" and  "<Password>"
    Then user see  "<role>" and "<page>"

    Examples: user login and page on library
      | userEmail           | Password | role      | page     |
      | student102@library  | Aaf6GwsY | student   | Book     |
      | student103@library  | 7zWoKREA | student   | Book     |
      | student104@library  | 73ndoZd0 | student   | Book     |
      | librarian14@library | 87x8afWY | librarian | DshBoard |


