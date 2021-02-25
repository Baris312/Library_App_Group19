
@wip1
 Feature: As a student I should be able to search books


   Background: User is already in login page
     Given user is on the login page

     Scenario Outline: As a student I should be able to search books with different categories
       When user enter "<userEmail>" and "<Password>"
       When student click on Book Categories
       Then user sees All options
       |ALL|
     |Action and Adventure|
     |Anthology           |
     |Classic             |
     |Comic and Graphic Novel|
     |Crime and Detective    |
     |Drama                  |
     |Fable                  |
     |Fairy Tale             |
     |Fan-Fiction            |
     |Fantasy                |
     |Historical Fiction     |
     |Horror                 |
     |Science Fiction        |
     |Biography/Autobiography|
     |Humor                  |
     |Romance                |
     |Short Story            |
     | Essay                 |
     |Memoir                 |
     |Poetry                 |


       Examples: user login info
         | userEmail          | Password |
         | student102@library | Aaf6GwsY |
